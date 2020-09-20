import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Broker {
    public static void main(String[] args){
        try(AsynchronousServerSocketChannel server = AsynchronousServerSocketChannel.open()){
            server.bind(new InetSocketAddress("127.0.0.1", 5000));
            Future<AsynchronousSocketChannel> acceptCon = server.accept();
            AsynchronousSocketChannel client = acceptCon.get(10, TimeUnit.SECONDS);

            if ((client != null) && (client.isOpen())){
                ByteBuffer buff = ByteBuffer.allocate(1024);
                Future<Integer> readvalue = client.read(buff);
                System.out.println("Recieved from client: " + new String(buff.array()).trim());
                readvalue.get();
                buff.flip();
                String str = "Im fine. Thank You!";
                Future<Integer> writevalue = client.write(ByteBuffer.wrap(str.getBytes()));
                System.out.println("Writing back to client: " + str);
                writevalue.get();
                buff.clear();
            }
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
