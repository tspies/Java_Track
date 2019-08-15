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
        System.out.println("    You have encountered a Bat");
        System.out.println("        =/\\                 /\\=");
        System.out.println("        / \\'._   (\\_/)   _.'/ \\");
        System.out.println("       / .''._'--(o.o)--'_.''. \\");
        System.out.println("      /.' _/ |`'=/ \" \\='`| \\_ `.\\");
        System.out.println("     /` .' `\\;-,'\\___/',-;/` '. '\\");
        System.out.println("    /.-'       `\\(-V-)/`       `-.\\");
        System.out.println("    `            \"   \"            `");
    }
    private static void printDarkFairy(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    You have encountered a Dark Fairy");
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
        System.out.println("             /_/   \\_\\");
    }
    private static void printDragon(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    You have encountered a Dragon");
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
        System.out.println("      \\______(_______;;; __;;;");
    }
    private static void printGoblin(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    You have encountered a Goblin");
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
        System.out.println("    /       '----'       \\");
    }
    private static void printRockGiant(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    You have encountered a Rock Giant");
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
        System.out.println("                        /,/,\"");
    }
    private static void printSkeleton(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    You have encountered a Skeleton");
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
        System.out.println("      ==' '==");
    }
    private static void printTroll(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("    You have encountered a Troll");
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
        System.out.println("     (______Y______)");
    }

    private static void printFightSplash(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("                            ______  ___ _____ _____ _      _____");
        System.out.println("                   /\\       | ___ \\/ _ \\_   _|_   _| |    |  ___|");
        System.out.println("                   )( _____ | |_/ / /_\\ \\| |   | | | |    | |__  ____________________ ");
        System.out.println("        (_)///////(**)_____ | ___ \\  _  || |   | | | |    |  __| ___________________/ ");
        System.out.println("                   )(       | |_/ / | | || |   | | | |____| |___ ");
        System.out.println("                   \\/       \\____/\\_| |_/\\_/   \\_/ \\_____/\\____/");
    }

    private static void printFightStats( Hero player, Villan enemy){
        System.out.println("                          _______________________________________");
        // Name Line
        System.out.print("                          | " + player.get_name());
        for (int i = player.get_name().length(); i < 17; i++)
            System.out.print(" ");
        System.out.print("| " + enemy.get_name());
        for (int i = enemy.get_name().length(); i < 17; i++)
            System.out.print(" ");
        System.out.print("|\n");
        System.out.println("                          |__________________|__________________|");
        // Attack Line
        printStatLine("ATK", player.get_attack(), enemy.get_attack());
        // Defense Line
        printStatLine("DEF", player.get_defense(), enemy.get_defense());
        // Hitpoints
        printStatLine("HP ", player.get_hitpoints(), enemy.get_hitpoints());
        System.out.println("                          |__________________|__________________|");
    }
    private static void printStatLine(String statType, int playerStat, int enemyStat){
        System.out.print("                          | " + statType + ": " + playerStat);
        for (int i = String.valueOf(playerStat).length(); i < 12; i++)
            System.out.print(" ");
        System.out.print("| " + statType + ": " + enemyStat);
        for (int i = String.valueOf(enemyStat).length(); i < 12; i++)
            System.out.print(" ");
        System.out.print("|\n");
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

