package Models.Artifacts;

public class ArtifactGenerator {
    public static Artifact generateArtifact(String enemyType){
        switch(enemyType){
            case "Bat":
                return new Artifact("Bat Wings","Armor", 10);
            case "DarkFairy":
                return new Artifact("Fairy Dust","Helm", 10);
            case "Dragon":
                return new Artifact("Dragon Slayer Sword","Weapon", 10);
            case "Goblin":
                return new Artifact("Goblin Potion","Helm", 10);
            case "Rock Giant":
                return new Artifact("Stone Shield","Armor", 10);
            case "Skeleton":
                return new Artifact("Bone Skull","Armor", 10);
            case "Troll":
                return new Artifact("Troll's Club","Weapon", 10);
            default:
                return (null);
        }
    }
}
