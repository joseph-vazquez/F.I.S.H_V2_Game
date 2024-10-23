import java.util.*;

public class GameScripts {

    public String introCard() {
        String introCard = " ~ ~ F.I.S.H ~ ~ \n \n " +
                "* Federal. \n " +
                "* Intergalactic. \n " +
                "* Society. \n " +
                "* Of. \n " +
                "* Harvesting \n \n \n " +
                "- Press 1 to play \n" +
                " - Press 2 to exit \n";
        return introCard;
    }

    // this prints out the main menu
    public static String mainMenu() {
        String mainMenu = "\n\n" +
                "Hello and welcome to F.I.S.H, \n" +
                "This is a game about fishing!\n\n" +
                "Press 1 to start your adventure\n" +
                "Press 2 for help/ controls\n" +
                "Press 3 to quit\n\n";
        return mainMenu;
    }

    // this checks what the user typed in in the introCard
    public static void introCheck() {
        Scanner input = new Scanner(System.in);
        inputPretty();
        int check = input.nextInt();
        System.out.println();
        if (check == 1) {
            System.out.print(mainMenu());
        } else if (check == 2) {
            System.out.print("Maybe another time :( ");
            System.exit(0);
        } else {
            System.out.print("Please only type in \"1\" if you want to play \n");
            System.out.print("\nPlease only type in \"2\" if you want to exit \n");
            introCheck();
        }

    }

    public static String help() {
        String help = "\n\n" +
                "~~~~~~~~~~~~~~ HELP MENU ~~~~~~~~~~~~~~ \n\n" +
                "The program will ask you for your rod power -\n\n" +
                "There are 3 power levels of your fishing rod: \n" +
                "0: Little power - Bobber is near boat\n" +
                "1: Medium power - Bobber is pretty far\n" +
                "2: RAAAH POWER - You can no longer see the bobber, you just know it's somewhere in the ocean\n" +
                "\n\n" +
                "Now this menu will go back to the main menu \n \n" +
                "~~~~~~~~~~~~~~ HELP MENU ~~~~~~~~~~~~~~ \n";
        return help;
    }

    // This does is the main hub for the checking and setting up the player to the
    // other menus
    public static void mainMenuCheck() {
        Scanner input = new Scanner(System.in);
        inputPretty();
        double check2 = input.nextDouble();
        if (check2 == 1) {
            System.out.println("Let's Start Your Adventure!");
        } else if (check2 == 2) {
            System.out.print(help());
            System.out.print(mainMenu());
            mainMenuCheck();
        } else if (check2 == 3) {
            System.out.print("AWWW man... Maybe another time :( ");
            System.exit(0);
        } else if (check2 == 0.20604) {
            // easter egg
            System.out.print("Hey thats my birthday!");
            System.exit(0);
        } else {
            System.out.println("Please press one number from the menu: \n");
            mainMenuCheck();
        }

    }

    public static void readyCheck() {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "\nType 1 to confirm that you are actually ready:\nOr\nType 0 if you changed your mind and wish to quit: ");
        inputPretty();
        int check3 = input.nextInt();
        if (check3 == 1) {
            System.out.println("Let's start already then!");
        } else if (check3 == 0) {
            System.out.println("Thats okay no hard feelings, nothing in this life is final :) ");
            System.exit(0);
        } else {
            System.out.println("Please ONLY press one of the numbers from the menu shown: \n");
            readyCheck();
        }
    }

    // This is the credits
    public String credits() {
        String credits = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n " +
                " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n~~~~~~~~~~~~ CREDITS ~~~~~~~~~~~~\n\n\n\n\n" +
                "Joseph Vazquez: Code Master\n\n\n\n" +
                "Joseph Vazquez: Art Master\n\n\n\n\n\n" +
                "~~~~~~~~~~~~\tThank You For Playing\t~~~~~~~~~~~~\n\n\n";
        return credits;
    }

    public static void Cthulhu() {
        type_100("Cthulhu!\n");
        type_300("  ...\n     a\n...     what? \n");
        type_5("     A Cthulhu……. .......    wait what?̀ ̷̧̨̧̝̤͉͎͓͔̹͉̺̻̠̜͚̭̞̳̠͈͖̪̪̙̜̳̼̼̯̞̜̤̼͈͈̜̝́̎͜͜ͅo̵̧̘͎̱̣͚̬͇͙̫̭̯͉̅̿̊̑̐̽̏̀̅̐̿̾͂̓̋̅̉̔̈̈́͠ĥ̴̡̧̧̧̧̛̛̛̰͙̤̭͚̖̼͉̠̟̦̩͚̟͖̯̖̘̗̻̟̯̲̤̬̦̣̻̝̹̙͖̠̿̾̿̑͑̈̂̔̈́̏̍͌͛̒̄̀̀̋̿̈́̀͌̕̕͜͠͠͠ͅͅ ̶̛̮̳͉̖̬͍̦̻̭͑̌̐̓̏̈̿͛̃̈́̑̅́̿̄̿͌̑̓̀͋̅͒̌̆͂̌̂̄̀̌͒̓̀̍̑̃̑̄̓̍̕̚͘͘͠͝͝͠ń̸̢̢̢̛̗̱̩̰͙̼̦͔͚̯̍̆͐͐̃͂̾̏͂̇̓͗̉͑̒̉̍̋̄̐̑̌̅̄͜ó̴̡̨̠̳̝̗̹̮̉̂̓̎͑̍̄̓̄͗̈̆́̽͊̈́̂͌̉̔̃̄͂̓̽̄̾̔͂̀́̅̐́͛̾̚̕̕͠͠͠͝,̴̡̢̰͓̯̣̪͚͍͙͖̳͓͉̳͚̣̙̝̮͉͕̻͎̘̮͔̈̋̿̽̆̈́̇̍̈́͝ ̵̫͖̱̻͙͓̬̈́̉̈͛̄̂͆͐̑͗̿̉̕̕͠Í̸̡̛͚̺̘̟̯̬̰̳̤̭̻̙̘͙̖͚̖̺̰͓̬̗̪̰̺̯̰̟̭͛͆̏̏̆̀̋̉̀͒̔̆̌͘̕͠͝ ̵̛̳̯̺͓̳̤̘͍̦̼̦̞̟̜͚͙̮̈́͊́͊̅̋̆̅͒́̾̾́̅̎̑̅̄̄̀͑̅͋̓̔̂͊͐̊̕͜ş̷̨̢̛͈͕̳̤̥̳̭͍̣̹̞̠͎̩̺̭̩̘̫̳̙̯̲̰̭̀͂̾h̶̢̢͎̱̦̤̫͔͎̠̘̞̪͚̬͕͍̠͉̫̏͆͂͜ͅö̵̢̠̻̘̯̜͔̳̖̖̫̗̞̮̰̣͚̗̜̼̺͓͉̲̟̺͖͖̤̳͈̯̥̰̹̻͔̪̝̜͕̮́̓͑͋̑̊͛̀̈́̊͂̌̊͛͜͠ư̴̢̭̰̯̮̥̦̼̫̠͓̰̳̞̣͈̰̼̜̙̫͈̟̺͌ͅl̷̡̤̖̲̱̪̪̣͇̘͇̖͈̟̫͚̭̐̒̎̆͛̋͑̆̆̄̐̓̆͌̿͘̚͜͝d̶̨̡͔̫̻̦̝̤̩͔̦̭̯̘̝̫͉͙̭̝̣̫̲͕͖̤͇͍̯̻͔̱̿̍̾̊̈̃́͛͊̽̓͐́̏̅̔̉́̈́̾̒͐̒́̀͒̾͑͜͝͝ͅṅ̶̨̛̪̪̝̙͔̪̬̹̯̲̘̫̙͔̥̯̠̗͓̺͙͚̹̜̤͛̀̂̊͆̓̋͒̈́͑̃̿͗͊̈̽͊̍̏̃̍̎͜͜͝ͅ'̵̲̼̱̫̲̯̫̫̟͔̲̠̰̻̰͈̳̗̝̝̻͚̼̖̿͊͊́̃̎̍́̑̓͋̋͆̍͛͛̾̀̏̔̄̂̀̀͆͒̌̚̕̚̚͘͝͝ţ̷̨̧̨̛̠͔̹͙̜̙͎̮̜̹̜̩̗̱͎̹̥͚̱̣̭̱͇̹̲͕̃͗̽͆͐̎̿͒̓͂̀̌͛̀̅̀͛̅͆͑̔́͒̋́̎͑̄̎̃̊̀̀͗̆̎͘͘̚͝͝͝͠ͅͅ ̵̨̛̫̦̭͔̣͚͙̟̥̹̬̼̼̞̮͈͎̞̟̯͖̜̗̾̂̉̑̃̅͋͊͗͛̀͐̈́̋̈́̾̊̾͐̈̈̏͛̋̈̋̇̐̂̔͒̎̑͜͜͝͝͝͝h̶̛̛̞̉́͌̂͐͌̀̈̏̔̈́̌́̂̄̈͂͌̎̈́̀̐͋̀͌́̂̃͋̅̀̏̉̓̊̓̒͒̄͐͛̈̚̚a̷̫̳̙͇̜͍̲̯̤̋̈́͛͛̋͑̈́͊̈̊̽̌̒͛̈́̽̊͑̒̅̄̐͐͋͂͑̅̂͌̀͑͊̇̚͠͠͝͝v̴̨̡͕͔̫̗̩͉͔̲̬̮̻̰̬̮͕̯̤̲̂͛͑̈̄̄̍̈́̊͊͛͊̌́́̋͌̓́͌́̐̒̏͋͌̎̌͗̅̔̚͝ḛ̵̡̛̘̦̝͈̺̥̤͉̠͈̼̠̣͙̣̮̘͗͐̐̌͆̌̈̀̽̉̿̐̓̎̌̎̍̇̾͒́̂̀̒̃͊̉̆͂̋͋̉̅̍̽̐̽̔́̉̈͠͠ ̸̡̨̢̢̢̢̨̛̛̘̺̙̪̣͙͔̱͎̮̺͙̞̝̳̻̫̥̥̖͕̭͙͙͙͖͇̟̮͙̳̱͒͗͑́̿͑̌̍̈̈́̅̔̉͒̍͊̇̓͆͋̀͛̾̍͂̉̐́̕͘̕͝d̷̤̫̜̘̬̭̭͎̫̳̮̖̙͈͓͖̹͉͕̝̠̱̘̞̳̠̙̪̻̞̅̒̐́̍̈́̃́̽̄̓̋̀̐̑̽͑̿̈́̆̔̌͆̿̋̇͑̉̆̒͘͘͘̕̕͘͜͠͝ͅǫ̵̨̨̙̰̟̬͔̪͇͇̞͇̤̪͔͇͔̙̪͉͕͈̬͚͔͓͍̼͎͇͉̜̠̗̈́̒͛̾̅̀͗̓̈́̌̀́̈́̍̔̈́͌̇͐̐̍͗̄͛̀̾͗̓̔̈́̐̅͋͐̆͐̕͘͜͠͝͝͝n̴̛̳̺̺̝̗͍̹̍͋̾͛͂͑̐̐͂͗̓͛̀͗̒͂͐̄͐̋͂̓̽͑͛̃͑͋͗̐̅̃̂͐̑̋̆͘̚̚͘͠͠͝͠ȩ̸̢̧̟̱̰̱̬̺͖͎̝̣̺̭̬̣̯̦̝̦̺̣̪͇̯̱͕̜̦̞̲͕̟̪̫̫͈̙̹̥̻̳͍͊̊͂̌̃̃̒͊͛̈́͑̏͒̈̾̔̔́͋̈́̅̐̐̆̋́̉́͂̋̀̽̈́̿͌̔̉̂̚̕͘̚͜͜͠ ̴̨̢̨̮̼̘͖̺͙̝̻̯̝̲̠͕͔̝͙̹͔̘̮̺̩̖͎̝͕̭̘̦̠͙̑̄̓͛̈́̏̌̉͗̈̾͊͋̀̈́̀̃͜t̵̡̛̛͓̥͙͉̦̜̠͕̟̩͕̣̯̩̭̩͍̟̥̰̜͉̙̪̗̒̊͛̑͆̔͌͆̈́̏͊̓̌́͂̉͌͌̌̇͌͒̈̉̀̋̀̒̚͠͠͝ḧ̸̨̨̧̡̺͈͎̪͇̗̫͈̦̫̲͚͙̦̮̭̜̰̪̯̱̤̹͖̜̘͔̬̼͙̪̠̙̹̼͕͔̠̭͕͕͇́̀̿̃̀̈́̒͐́́̽̒͌͋̈́̈͐͋̒̌͋̈́̾̔̒̈́̉̇͂̏͒̆͒̄̽͘͘͘͘͜͝͝ͅá̸̢̡̨̛͈̭̼̹̪͕̩̠̺͔͎̞̲͈̖̺͕̟͔͇̼͇͚̭̟͇̦̬̘̩̠̼̹̘̻́͑̂͒͂͂̀͂̋̀̃͂̔͐͗̑͋̓̉͋͆͒̃͑̍̀̎̓̏͐͂̀̎̍͜͜͠͠͠͝ţ̴̡̺̝̣͖̹̟̝̦̩̖̤̺̗͙̩̳̈̄̄͜.̷̡̻̫͎̗̝̣̥̃͌͛̿̉̐̅̉̒̀̈́͗͝͝.̸̢̛͉͔͎̟̘̙̙̤͈̔͆̉̒͆̽̈̏̇͆͛̄̒̌̒̅̈́̀̅̉͋͆̊̃̏͆̆͊̃͆̊̓̄̎͋̈́͛̕̚̕̚̕̚͝ͅ.̷̢̡̢̛͇̲̝̠͈̥͔̮̣̰̰̺̝͔̰̙͎͙̞͔̙̗͐̎̿̂͛̈͒͛͗̽̄̌̈́̊̾̊̀̀̉̓̌̄̾̊͐̇̉̔́͛̈́̀̊̈̔̇͆͗̂̈͑̿͘̕̚̚͝͠͠ͅ \n");

        type_100("\n\nuuuhhhhh cool?                  \n");
        type_300("              \n");
    }

    // ~~~~~~~~~~~~~~~~~~~~~ TEXT FORMAT ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    // This method is only to make the users input to look pretty and it lets the
    // user know that its their input
    public static void inputPretty() {
        System.out.print("> ");
    }

    // Type speed really fast
    public static void type_5(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            pause((int) (Math.random() * 5));
        }
    }

    // Type speed kinda slow
    public static void type_100(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            pause((int) (Math.random() * 100));
        }
    }

    // Type speed pretty slow
    public static void type_300(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            pause((int) (Math.random() * 300));
        }
    }

    // Pause in-between characters
    // Creadit for this goes to csula Instructor: Keenan Knaur (GitHub)
    public static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }

}
