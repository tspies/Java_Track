package Models.Artifacts;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

@Getter
@Setter
public abstract class BaseArtifact implements Artifact {
    public int _effect;
    public String _type;


}
