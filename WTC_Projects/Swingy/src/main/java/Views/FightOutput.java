package Views;

import Models.Enemies.*;
import Models.Heros.Hero;

public class FightOutput {
    public static void loadFightScreen(Hero player, Villan enemy){
        printFightSplash();
        printFightStats(player, enemy);
    }
    public static void encounterOutput(Villan enemy){
        switch(enemy.get_name()){
            case "Bat":
                printBat();
                break;
            case "Dark Fairy":
                printDarkFairy();
                break;
            case "Dragon":
                printDragon();
                break;
            case "Cave Goblin":
                printGoblin();
                break;
            case "Rock Giant":
                printRockGiant();
                break;
            case "Skeleton":
                printSkeleton();
                break;
            case "Troll":
                printTroll();
                break;
        }
        System.out.println("\n    Will you 'fight' or 'run'?");
    }
    private static void printBat(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[35;1m"+"    You have encountered a Bat");
        System.out.println("        =/\\                 /\\=");
        System.out.println("        / \\'._   (\\_/)   _.'/ \\");
        System.out.println("       / .''._'--(o.o)--'_.''. \\");
        System.out.println("      /.' _/ |`'=/ \" \\='`| \\_ `.\\");
        System.out.println("     /` .' `\\;-,'\\___/',-;/` '. '\\");
        System.out.println("    /.-'       `\\(-V-)/`       `-.\\");
        System.out.println("    `            \"   \"            `"+"\033[35;0m");
    }
    private static void printDarkFairy(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[36;1m"+"    You have encountered a Dark Fairy");
        System.out.println("          o    o");
        System.out.println("           \\__/,'`.,'`._,");
        System.out.println("          /,-. \\  /    <_,");
        System.out.println("          > - )/ /     <_,");
        System.out.println("          \\__,/ /      ,'");
        System.out.println("          _/_(_/______/__");
        System.out.println("         ( (_ ,,--'---^,\\\\");
        System.out.println("     ___/ \\   / ___,'");
        System.out.println("    /,---' \\\\ \\_   `.");
        System.out.println("    `      /    `.   \\");
        System.out.println("           |      \\_  \\");
        System.out.println("           |/\\/\\/\\| `. \\");
        System.out.println("            \\ |  /\\   `.`.");
        System.out.println("             \\( /\\ \\    `.`.");
        System.out.println("              | \\ `.`._,  `-\\_,");
        System.out.println("              | /|  `-'");
        System.out.println("              |/\\(");
        System.out.println("              |(_\\\\_");
        System.out.println("              | / \\ (");
        System.out.println("             /_/   \\_\\"+"\033[36;0m");
    }
    private static void printDragon(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[31;1m"+"    You have encountered a Dragon");
        System.out.println("                   \\||/");
        System.out.println("                   |  @___oo");
        System.out.println("         /\\  /\\   / (__,,,,|");
        System.out.println("         ) /^\\) ^\\/ _)");
        System.out.println("         )   /^\\/   _)");
        System.out.println("         )   _ /  / _)");
        System.out.println("     /\\  )/\\/ ||  | )_)");
        System.out.println("    <  >      |(,,) )__)");
        System.out.println("     ||      /    \\)___)\\");
        System.out.println("     | \\____(      )___) )___");
        System.out.println("      \\______(_______;;; __;;;"+"\033[31;0m");
    }
    private static void printGoblin(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[32;1m"+"    You have encountered a Goblin");
        System.out.println("           ,      ,");
        System.out.println("          /(.-\"\"-.)\\");
        System.out.println("      |\\  \\/      \\/  /|");
        System.out.println("      | \\ / =.  .= \\ / |");
        System.out.println("      \\( \\   o\\/o   / )/");
        System.out.println("       \\_, '-/  \\-' ,_/");
        System.out.println("         /   \\__/   \\");
        System.out.println("         \\ \\__/\\__/ /");
        System.out.println("       ___\\ \\|--|/ /___");
        System.out.println("     /`    \\      /    `\\");
        System.out.println("    /       '----'       \\"+"\033[32;0m");
    }
    private static void printRockGiant(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[37;1m"+"    You have encountered a Rock Giant");
        System.out.println("                   (    )");
        System.out.println("                  ((((()))");
        System.out.println("                  |o\\ /o)|");
        System.out.println("                  ( (  _')");
        System.out.println("                   (.^.  /\\__");
        System.out.println("                  ,\\___,/ '  ')");
        System.out.println("    '.,_,,       (  .- .   .    )");
        System.out.println("     \\   \\\\     ( '        )(    )");
        System.out.println("      \\   \\\\    \\.  _.__ ____( .  |");
        System.out.println("       \\  /\\\\   .(   .'  /\\  '.  )");
        System.out.println("        \\(  \\\\.-' ( /    \\/    \\)");
        System.out.println("         '  ()) _'.-|/\\/\\/\\/\\/\\|");
        System.out.println("             '\\\\ .( |\\/\\/\\/\\/\\/|");
        System.out.println("               '((  \\    /\\    /");
        System.out.println("               ((((  '.__\\/__.')");
        System.out.println("                ((,) /   ((()   )");
        System.out.println("                 \"..-,  (()(\"   /");
        System.out.println("                  _//.   ((() .\"");
        System.out.println("          _____ //,/\" ___ ((( ', ___");
        System.out.println("                           ((  )");
        System.out.println("                            / /");
        System.out.println("                          _/,/'");
        System.out.println("                        /,/,\""+"\033[37;0m");
    }
    private static void printSkeleton(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[37;1m"+"    You have encountered a Skeleton");
        System.out.println("        .-.");
        System.out.println("       (o.o)");
        System.out.println("        |=|");
        System.out.println("       __|__");
        System.out.println("     //.=|=.\\\\");
        System.out.println("    // .=|=. \\\\");
        System.out.println("    \\\\ .=|=. //");
        System.out.println("     \\\\(_=_)//");
        System.out.println("      (:| |:)");
        System.out.println("       || ||");
        System.out.println("       () ()");
        System.out.println("       || ||");
        System.out.println("       || ||");
        System.out.println("      ==' '=="+"\033[37;0m");
    }
    private static void printTroll(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[32;1m"+"    You have encountered a Troll");
        System.out.println("         .:\\:/:.");
        System.out.println("       .:\\:\\:/:/:.");
        System.out.println("      :.:\\:\\:/:/:.:");
        System.out.println("     :=.' -   - '.=:");
        System.out.println("     '=(\\ 9   9 /)='");
        System.out.println("        (  (_)  )");
        System.out.println("        /`-vvv-'\\");
        System.out.println("       /         \\");
        System.out.println("      / /|,,,,,|\\ \\");
        System.out.println("     /_//  /^\\  \\\\_\\");
        System.out.println("     WW(  (   )  )WW");
        System.out.println("      __\\,,\\ /,,/__");
        System.out.println("     (______Y______)"+"\033[32;0m");
    }

    private static void printFightSplash(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\033[31;1m"+"                            ______  ___ _____ _____ _      _____"+"\033[31;1m");
        System.out.println("\033[34;1m"+"                   /\\"+"\033[34;0m"+"\033[31;1m"+"       | ___ \\/ _ \\_   _|_   _| |    |  ___|"+"\033[31;0m");
        System.out.println("\033[34;1m"+"                   )( _____"+"\033[34;0m"+"\033[31;1m"+" | |_/ / /_\\ \\| |   | | | |    | |__  "+"\033[31;0m"+"\033[34;1m"+"____________________ "+"\033[34;0m");
        System.out.println("\033[34;1m"+"        (_)///////(**)_____"+"\033[34;0m"+"\033[31;1m"+" | ___ \\  _  || |   | | | |    |  __| "+"\033[31;0m"+"\033[34;1m"+"___________________/ "+"\033[34;0m");
        System.out.println("\033[34;1m"+"                   )("+"\033[34;0m"+"\033[31;1m"+"       | |_/ / | | || |   | | | |____| |___ "+"\033[31;0m");
        System.out.println("\033[34;1m"+"                   \\/"+"\033[34;0m"+"\033[31;1m"+"       \\____/\\_| |_/\\_/   \\_/ \\_____/\\____/"+"\033[31;0m");
    }

    private static void printFightStats( Hero player, Villan enemy){
        System.out.println("\033[32;1m"+"                          _______________________________________"+"\033[32;0m");
        // Name Line
        System.out.print("\033[32;1m"+"                          | " + player.get_name()+"\033[32;0m");
        for (int i = player.get_name().length(); i < 17; i++)
            System.out.print(" ");
        System.out.print("\033[32;1m"+"| " + enemy.get_name()+"\033[32;0m");
        for (int i = enemy.get_name().length(); i < 17; i++)
            System.out.print(" ");
        System.out.print("\033[32;1m"+"|\n"+"\033[32;0m");
        System.out.println("\033[32;1m"+"                          |__________________|__________________|"+"\033[32;0m");
        // Attack Line
        printStatLine("\033[33;1m"+"ATK"+"\033[33;0m", player.get_attack(), enemy.get_attack());
        // Defense Line
        printStatLine("\033[34;1m"+"DEF"+"\033[34;0m", player.get_defense(), enemy.get_defense());
        // Hitpoints
        printStatLine("\033[31;1m"+"HP "+"\033[31;0m", player.get_hitpoints(), enemy.get_hitpoints());
        System.out.println("\033[32;1m"+"                          |__________________|__________________|"+"\033[32;0m");
    }
    private static void printStatLine(String statType, int playerStat, int enemyStat){
        System.out.print("\033[32;1m"+"                          | "+"\033[32;0m" + statType + ": " + playerStat);
        for (int i = String.valueOf(playerStat).length(); i < 12; i++)
            System.out.print(" ");
        System.out.print("\033[32;1m"+"| "+"\033[32;0m" + statType + ": " + enemyStat);
        for (int i = String.valueOf(enemyStat).length(); i < 12; i++)
            System.out.print(" ");
        System.out.print("\033[32;1m"+"|\n"+"\033[32;0m");
    }
}

//                            ______  ___ _____ _____ _      _____
//                   /\       | ___ \/ _ \_   _|_   _| |    |  ___|
//         _         )( _____ | |_/ / /_\ \| |   | | | |    | |__  ___________________
//        (_)///////(**)_____ | ___ \  _  || |   | | | |    |  __| _________________/
//                   )(       | |_/ / | | || |   | | | |____| |___
//                   \/       \____/\_| |_/\_/   \_/ \_____/\____/
//
//

//                              /\
//                    _         )( _____ __________________
//                   (_)///////(**)_____ _________________.>
//                              )(
//                              \/


//             =/\                 /\=
//             / \'._   (\_/)   _.'/ \
//            / .''._'--(o.o)--'_.''. \
//           /.' _/ |`'=/ " \='`| \_ `.\
//          /` .' `\;-,'\___/',-;/` '. '\
//         /.-'       `\(-V-)/`       `-.\
//         `            "   "            `

//        o    o
//         \__/,'`.,'`._,
//        /,-. \  /    <_,
//        > - )/ /     <_,
//        \__,/ /      ,'
//        _/_(_/______/__
//       ( (_ ,,--'---^,\\
//   ___/ \   / ___,'
//  /,---' \\ \_   `.
//  `      /    `.   \
//         |      \_  \
//         |/\/\/\| `. \
//          \ |  /\   `.`.
//           \( /\ \    `.`.
//            | \ `.`._,  `-\_,
//            | /|  `-'
//            |/\(
//            |(_\\_
//            | / \ (
//           /_/   \_\
//

//                \||/
//                |  @___oo
//      /\  /\   / (__,,,,|
//      ) /^\) ^\/ _)
//      )   /^\/   _)
//      )   _ /  / _)
//  /\  )/\/ ||  | )_)
// <  >      |(,,) )__)
//  ||      /    \)___)\
//  | \____(      )___) )___
//   \______(_______;;; __;;;

//         ,      ,
//        /(.-""-.)\
//    |\  \/      \/  /|
//    | \ / =.  .= \ / |
//    \( \   o\/o   / )/
//     \_, '-/  \-' ,_/
//       /   \__/   \
//       \ \__/\__/ /
//     ___\ \|--|/ /___
//   /`    \      /    `\
//  /       '----'       \


//                   (    )
//                  ((((()))
//                  |o\ /o)|
//                  ( (  _')
//                   (.^.  /\__
//                  ,\___,/ '  ')
//    '.,_,,       (  .- .   .    )
//     \   \\     ( '        )(    )
//      \   \\    \.  _.__ ____( .  |
//       \  /\\   .(   .'  /\  '.  )
//        \(  \\.-' ( /    \/    \)
//         '  ()) _'.-|/\/\/\/\/\|
//             '\\ .( |\/\/\/\/\/|
//               '((  \    /\    /
//               ((((  '.__\/__.')
//                ((,) /   ((()   )
//                 "..-,  (()("   /
//                  _//.   ((() ."
//          _____ //,/" ___ ((( ', ___
//                           ((  )
//                            / /
//                          _/,/'
//                        /,/,"


//     .-.
//    (o.o)
//     |=|
//    __|__
//  //.=|=.\\
// // .=|=. \\
// \\ .=|=. //
//  \\(_=_)//
//   (:| |:)
//    || ||
//    () ()
//    || ||
//    || ||
//   ==' '==


//
//           .:\:/:.
//         .:\:\:/:/:.
//        :.:\:\:/:/:.:
//       :=.' -   - '.=:
//       '=(\ 9   9 /)='
//          (  (_)  )
//          /`-vvv-'\
//         /         \
//        / /|,,,,,|\ \
//       /_//  /^\  \\_\
//       WW(  (   )  )WW
//        __\,,\ /,,/__
//       (______Y______)

