import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.HashMap;
import java.util.Map;

public class Router {
    Router() throws IOException {
        final AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open();
        InetSocketAddress hostAddress = new InetSocketAddress("127.0.0.1", 5000);
        serverChannel.bind(hostAddress);

        while (true){
            serverChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
                @Override
                public void completed(AsynchronousSocketChannel result, Object attachment){
                    if (serverChannel.isOpen()){
                        serverChannel.accept(null, this);
                    }
                    AsynchronousSocketChannel clientChannel = result;
                    if ((clientChannel != null) && (clientChannel.isOpen())){
                        ReadWriteHandler handler = new ReadWriteHandler();
                        ByteBuffer buff = ByteBuffer.allocate(32);

                        Map<String, Object> readInfo = new HashMap<>();
                        readInfo.put("action", "read");
                        readInfo.put("buffer", buff);

                        clientChannel.read(buff, readInfo, handler);
                    }
                }

                @Override
                public void failed(Throwable exc, Object attachment) {

                }
            });
        }
    }
}
