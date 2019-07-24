package Models.Artifacts;

public class ArtifactGenerator {
    public Artifact generateArtifact(String enemyType){
        switch(enemyType){
            case "Bat":
                return new BatWingsArtifact();
            case "DarkFairy":
                return new FairyDustArtifact();
            case "Dragon":
                return new DragonSlayerSwordArtifact();
            case "Goblin":
                return new GoblinPotionArtifact();
            case "Rock Giant":
                return new StoneShieldArtifact();
            case "Skeleton":
                return new BoneSkullArtifact();
            case "Troll":
                return new TrollClubArtifact();
            default:
                return (null);
        }
    }
}
