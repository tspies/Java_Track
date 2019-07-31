package Models.Artifacts;

import lombok.Getter;
import lombok.Setter;

public abstract class BaseArtifact implements Artifact {
    @Setter
    @Getter
    public int _effect;
    @Setter
    @Getter
    public String _type;

}
