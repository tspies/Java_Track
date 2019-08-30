package Models.Artifacts;

public class ArtifactGenerator {
    public static Artifact generateArtifact(String enemyType){
        switch(enemyType){
            case "Bat":
                return new Artifact("Bat Wings","Armor", 2);
            case "Dark Fairy":
                return new Artifact("Fairy Dust","Helm", 15);
            case "Dragon":
                return new Artifact("Dragon Slayer Sword","Weapon", 20);
            case "Cave Goblin":
                return new Artifact("Goblin Potion","Helm", 60);
            case "Rock Giant":
                return new Artifact("Stone Shield","Armor", 5);
            case "Skeleton":
                return new Artifact("Bone Skull","Armor", 2);
            case "Troll":
                return new Artifact("Troll's Club","Weapon", 5);
            default:
                return (null);
        }
    }
}
