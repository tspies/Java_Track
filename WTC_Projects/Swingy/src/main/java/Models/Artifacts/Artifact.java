package Models.Artifacts;


public class Artifact extends BaseArtifact{
    public Artifact(String name, String type, int effect){
        set_name(name);
       set_effect(effect);
       set_type(type);
    }
}
