package Controllers.Parsing;

public class ClassParse {
    public static String[] heros = {"mage", "rogue", "warrior"};
    public static boolean checkClass(String heroClass){
        for (String s: heros){
            if (s.equals(heroClass))
                return true;
        }
        return false;
    }
}
