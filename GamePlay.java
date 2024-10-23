import java.util.*;

public class GamePlay {
        public static void main() {

                Scanner input = new Scanner(System.in);
                String[] caughtFishNames = new String[3];

                for (int i = 0; i <= 2; i++) {

                        Random rand = new Random();
                        System.out.println("\n What power level do you want?: \n* 0\n* 1\n* 2\n ");
                        GameScripts.inputPretty();

                        int fishRow = input.nextInt();
                        if (fishRow == 0 || fishRow == 1 || fishRow == 2) {
                                String[][] FishArt = { { "         >()0>" +
                                                "       /`\\\n" +
                                                "          \\o/       / \n" +
                                                "     _____ |  _____/ \n" +
                                                "     \\_         _/   \n" +
                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                "         _\\_   \n" +
                                                                "       \\/  o\\  \n" +
                                                                "       //\\___= \n" +
                                                                "          ''' \n" +
                                                                "                     /`\\\n" +
                                                                "          \\o/       / \n" +
                                                                "     _____ |  _____/ \n" +
                                                                "     \\_         _/   \n" +
                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                " \\``/ \n" +
                                                                "/o `)) \n" +
                                                                "/_/\\_ss)) \n" +
                                                                "   |_ss))  /| \n" +
                                                                "    |__ss))_| \n" +
                                                                "   |__sss))_| \n" +
                                                                "   |___ss))\\| \n" +
                                                                "    |_ss))   \n" +
                                                                "     )_s))  \n" +
                                                                "(`(  /_s)) \n" +
                                                                "(_\\/_s)) \n" +
                                                                " (\\/)) \n" +
                                                                "                   /`\\\n" +
                                                                "          \\o/       / \n" +
                                                                "     _____ |  _____/ \n" +
                                                                "     \\_         _/   \n" +
                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                "     /\"*._          _ \n" +
                                                                "  .-*'`    `*-.._.-'/ \n" +
                                                                "< * ))     ,       ( \n" +
                                                                "  `*-._`._(__.--*\"`.\\ \n" +
                                                                "                     /`\\\n" +
                                                                "          \\o/       / \n" +
                                                                "     _____ |  _____/ \n" +
                                                                "     \\_         _/   \n" +
                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                "/`\'''`8-.___\n" +
                                                                "\\   ._      ) \n" +
                                                                " '' ''''  ''' \n" +
                                                                "                     /`\\\n" +
                                                                "          \\o/       / \n" +
                                                                "     _____ |  _____/ \n" +
                                                                "     \\_         _/   \n" +
                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                                },

                                                { "          ^   \n" +
                                                                "       /     \\  \n" +
                                                                "       |     |    \n " +
                                                                "      |     |     \n" +
                                                                "       | 0   |   \n" +
                                                                "       // ||\\\\   \n" +
                                                                "      (( //  ||   \n" +
                                                                "       \\\\))  \\\\   \n" +
                                                                "       //||   ))   \n" +
                                                                "       ))    //   \n" +
                                                                "      //     ((   \n" +
                                                                "                     /`\\\n" +
                                                                "          \\o/       / \n" +
                                                                "     _____ |  _____/ \n" +
                                                                "     \\_         _/   \n" +
                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                                "   ><))))))))))'>    /`\\\n" +
                                                                                "          \\o/       / \n" +
                                                                                "     _____ |  _____/ \n" +
                                                                                "     \\_         _/   \n" +
                                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                                "                                           =...  \n" +
                                                                                "                                               *:.. \n "
                                                                                +
                                                                                "                                               *:=. \n "
                                                                                +
                                                                                "                                               =-+.  \n"
                                                                                +
                                                                                "                    #=---------=**-           +:-.. \n"
                                                                                +
                                                                                "                  -*--=------=--------........:-::  \n"
                                                                                +
                                                                                "                +---------   :*---:-----:::--:-:  \n"
                                                                                +
                                                                                "                --==---=        :==---------::  \n"
                                                                                +
                                                                                "              :+------             :**=:-+#  \n"
                                                                                +
                                                                                "               +--=--- \n" +
                                                                                ".-==-.         +=----.  \n" +
                                                                                "=+==*+=      *----:  \n" +
                                                                                "--==#%=     :*=--+--  \n" +
                                                                                "--#======--------+  \n" +
                                                                                " +.*:====---=---*:  \n" +
                                                                                "       -#*+*#+:  \n" +
                                                                                "                     /`\\\n" +
                                                                                "          \\o/       / \n" +
                                                                                "     _____ |  _____/ \n" +
                                                                                "     \\_         _/   \n" +
                                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                                "                             -#-#:      \n" +
                                                                                "                       @+%+*%%*+==+*#%#-. \n"
                                                                                +
                                                                                "                      =@#*-:**%=::::*#**+# \n"
                                                                                +
                                                                                "                    ##:::::%-:=::::::=*:.-%: \n"
                                                                                +
                                                                                "                #*+%**##*-::::::::::::::::::#- \n"
                                                                                +
                                                                                "               #@=:=#:::::::::::::::::::::.%#@= \n"
                                                                                +
                                                                                "          #=::-#*#::::-::::::::::::::::::::::-%+ \n"
                                                                                +
                                                                                "          #=:::::-::+#*%=:::::::::::::::::::::*##@: \n"
                                                                                +
                                                                                "          *#:::::::#+::+@=::::%%::::::::+@+::+*-@: \n"
                                                                                +
                                                                                "          +#:::::::+*:::::-:::-@@-:-+:=-:*@#::+#:+# \n"
                                                                                +
                                                                                "          #-::-*@=:-#@@@@%+:::::::::=#=:::::::*#%#: \n"
                                                                                +
                                                                                "           +*+-.:@=::::::::::::::::::::::::::-# \n"
                                                                                +
                                                                                "                #+##-:::::::::-:..........:-:#- \n"
                                                                                +
                                                                                "                    *#:......-%.+.......**+%%: \n"
                                                                                +
                                                                                "                      =#+:...:#+.........+%- \n"
                                                                                +
                                                                                "                        *-#@*=:.....:=#@+ \n"
                                                                                +
                                                                                "                         -*-....::=#-# \n"
                                                                                +
                                                                                "                     /`\\\n" +
                                                                                "          \\o/       / \n" +
                                                                                "     _____ |  _____/ \n" +
                                                                                "     \\_         _/   \n" +
                                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                                "          :+#%##%##%%%%%%*:\n" +
                                                                                "         =##%#%#*#%##****#%%%-\n" +
                                                                                "       +###*##%#%%+:......-*%%+\n" +
                                                                                "      +#***%###%*:--=+*.-#*-=#%*\n" +
                                                                                "    +%*#%####%*:=...:=:*%%%-=#%=\n" +
                                                                                "    :%###%%%###:--....+-=**%%:#%*\n" +
                                                                                "    =#####%%%%+..:-:.-:=:-##+:+%*:\n" +
                                                                                "    ++#*%#%*##=------*=-+-:...+%#:\n" +
                                                                                "   :+*#*#####*--....+*=+=+#*#+*%*:\n" +
                                                                                "    +%#=######-:..:-:-=:--#+***#*\n" +
                                                                                "    =*#**##%##+:-=:--..+-#*+%*#%=\n" +
                                                                                "     #*#+##*#%#-..=:...---%#++%*\n" +
                                                                                "     :*#%*#%##%#-:-..-*%+.:-=%*\n" +
                                                                                "       +#%##%**##+-#++*%*.:*#*\n" +
                                                                                "        :+%%####%%#*----=#%#-\n" +
                                                                                "           :*##%%%%%%%#%%*:  \n" +
                                                                                "                     /`\\\n" +
                                                                                "          \\o/       / \n" +
                                                                                "     _____ |  _____/ \n" +
                                                                                "     \\_         _/   \n" +
                                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                                                },
                                                { "    >())))))))\\/))))))))))0> \n" +
                                                                "\n" +
                                                                "          \\o/       / \n" +
                                                                "     _____ |  _____/ \n" +
                                                                "     \\_         _/   \n" +
                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                                "                             -#*: \n" +
                                                                                "  -                          %#%+ \n" +
                                                                                "  -@#*                       =%*#%+ \n"
                                                                                +
                                                                                "    @%##:                   :%##*###*: \n"
                                                                                +
                                                                                "     #%#**             :*#%*===+++=--=*#- \n"
                                                                                +
                                                                                "      :%*=+=-#*=+*++#@##@@@@@@@@@@@@@@@@@@%+- \n"
                                                                                +
                                                                                "      :%*-+###*##@#@#@#@%%##**+*=+-*=-==-+++@@%=- \n"
                                                                                +
                                                                                "     *@#++:.+*=.:=                 -:.-:.-::-++--+*########*+=- \n"
                                                                                +
                                                                                "    #@+++         :##%*=       *%%*:-:*-=.:+=: \n"
                                                                                +
                                                                                "   %#%=            ##%:        #@*+#+ \n"
                                                                                +
                                                                                "                              =@*#%= \n"
                                                                                +
                                                                                "                             **-#=' \n "
                                                                                +
                                                                                "                    /`\\\n" +
                                                                                "          \\o/       / \n" +
                                                                                "     _____ |  _____/ \n" +
                                                                                "     \\_         _/   \n" +
                                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                                "               ,  \n" +
                                                                                "             .' ;  \n" +
                                                                                "      . - ' ` . '      \n" +
                                                                                "  , '  . - ' - . ' \\    \n" +
                                                                                " ;   /          ' - '  \n" +
                                                                                "   |   \\               , - ,  \n" +
                                                                                "  \\    ' - . __       )_ ` ' . _  \n"
                                                                                +
                                                                                "    ' .           ` ` `            ` ` ' - - . _  \n"
                                                                                +
                                                                                "    . - '  ,                                        ` ' -  .  \n"
                                                                                +
                                                                                " ' - ' ` - . _                           ( (     o       )  \n"
                                                                                +
                                                                                "                 ` ' - - . . . . ( ` -  , __ . . - - '  \n"
                                                                                +
                                                                                "                              ' - ' `    \n"
                                                                                +
                                                                                "                     \n",
                                                                "                     =+          =+***= \n" +
                                                                                "                    :-#*+::::-=*##%%%+  \n"
                                                                                +
                                                                                "                    ::+%#########%%%+  \n"
                                                                                +
                                                                                "               +------#########%%##   \n"
                                                                                +
                                                                                "                =##*########%%###%#*  \n"
                                                                                +
                                                                                "                 =*%@########%%#%%#*  \n"
                                                                                +
                                                                                "                   *%####%%######%#*  \n"
                                                                                +
                                                                                "                   =##**##***######*  \n"
                                                                                +
                                                                                "                   +##*****##%%##***====\\ \n"
                                                                                +
                                                                                "                   *####%%%%####*++      \\========  \n"
                                                                                +
                                                                                "                   +##%%##**+                     \\======\n"
                                                                                +
                                                                                "                   +#%%#*  \n" +
                                                                                "                    +%*  \n" +
                                                                                "                     /`\\\n" +
                                                                                "          \\o/       / \n" +
                                                                                "     _____ |  _____/ \n" +
                                                                                "     \\_         _/   \n" +
                                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                                                "  #******+=+#@                           #+=+******# \n"
                                                                                +
                                                                                "    %#+++++***==#                    #==***+++++*%  \n"
                                                                                +
                                                                                "      #=====+++*+=*                #++*++======*  \n"
                                                                                +
                                                                                "       *=======+*++#  @        @  %++*+=======+@  \n"
                                                                                +
                                                                                "      @+=====++++*+++-:@ @%#@ @--=++*+++++=====%  \n"
                                                                                +
                                                                                "      *=+**+++=+*+++-=%+--:::-+%=-=++*+=+++***++  \n"
                                                                                +
                                                                                "     #**++===+**+#  %+==-:::--==+%  %+**+===++**#  \n"
                                                                                +
                                                                                "    %%%*+===***+%  #==+========+==#  @*+**===+*#%%  \n"
                                                                                +
                                                                                "        %==*+*+#   *==============+@  %+*+*==# \n"
                                                                                +
                                                                                "         **+=*+   %*==+========+==+#   *+++#+  \n"
                                                                                +
                                                                                "         **+=*+@%====+*=+=++=+=*+====# **=+**  \n"
                                                                                +
                                                                                "         %  %+*#%++*====O====O====*++##*+#  %@  \n"
                                                                                +
                                                                                "             @++*+**+*#+======+#**+*+*++%  \n"
                                                                                +
                                                                                "        @*==--=*+++#+*-=#*#**#+:*+**+++*=--=*@   \n"
                                                                                +
                                                                                "       *===+===-+**#=+*+======+*+=#***========+@  \n"
                                                                                +
                                                                                "      #=*#  %+===**+**++==--===+**+**+==+##@##==#   \n"
                                                                                +
                                                                                "      #*     *+++=+=====+=--===+===+===+*#==# %+*   \n"
                                                                                +
                                                                                "         *+ #*+==+======*====*====+==+++%%===@ @%   \n"
                                                                                +
                                                                                "         +=*@@**==+====+======++++===++*====+@   \n"
                                                                                +
                                                                                "     #=---++=+**+===+=====+========++***=++===+%  \n"
                                                                                +
                                                                                "    +=======+*++*+=======*+*++=====*+++*+=======*   \n"
                                                                                +
                                                                                "    +========+++*#+++++*++%++*+**+*+++====+======@  \n"
                                                                                +
                                                                                "    *+======+=====++++==+# *+===========+**+====*  \n"
                                                                                +
                                                                                "     %*+++##+++======+++%   #++======+++#+===++*  \n"
                                                                                +
                                                                                "             %*++++++*%       #*++++*%                \n"
                                                                                +
                                                                                "                     /`\\\n" +
                                                                                "          \\o/       / \n" +
                                                                                "     _____ |  _____/ \n" +
                                                                                "     \\_         _/   \n" +
                                                                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                                                } };

                                String[][] FishNames = {
                                                { "Anchovy: ", "Goldfish: ", "Seahorse: ", "Toadfish: ", "Old shoe: " },
                                                { "Squid: ", "Bass: ", "Eel: ", "Pufferfish: ", "Car tire: " },
                                                { "Tuna: ", "Swordfish: ", "Great White Shark: ", "Manta Ray: ",
                                                                "Cthulhu: " } };

                                String FishInfo[][] = { {
                                                "\nMany people like anchovies on pizza but they can also concentrate an acid, making them poisonous for humans to consume as a whole.\n",
                                                "\nGoldfish can randomly turn carnivorous and are an invasive species if released into the wild.\n",
                                                "\nBecause of their body shape, seahorses are rather inept swimmers and can easily die of exhaustion when caught in storm-roiled seas.\n",
                                                "\nToadfish are named for their slimy skin which is related to frogs.\n",
                                                "\nSize 12 old shoe, its wet and soggy as if it's been underwater for a while, how did it get here?\n" },
                                                { "\nSquid have three hearts. Two branchial hearts feed the gills, each surrounding the larger systemic heart that pumps blood around the body.\n",
                                                                "\nDuring the spawn male bass will nudge females to help stimulate the release of eggs.\n ",
                                                                "\nEels eat shrimps, snails, fishes, mussels, and worms, and they generally live alone.\n ",
                                                                "\nPufferfish are ambush predators which detect their prey using pin-sharp vision.\n ",
                                                                "\nA car tire that looks ripped and torn, how did you get that onto the boat?\n " },
                                                { "\nTuna can maintain a body temperature higher than that of the surrounding water, thanks to a network of blood vessels in its body.\n ",
                                                                "\nSwordfish have a unique organ near their eyes that warm their brains and eyes, allowing them to hunt in colder waters.\n ",
                                                                "\nShark teeth can move within the jaw, and they use this flexibility to understand what it is they're biting.\n ",
                                                                "\nThey are harmless to humans and do not have a spine on their tail for defense.\n ",
                                                                "" } };

                                int fishColumn = rand.nextInt(5);
                                caughtFishNames[i] = FishNames[fishRow][fishColumn];

                                if (fishColumn == 4 && fishRow == 2) {
                                        System.out.println(FishArt[fishRow][fishColumn]);
                                        GameScripts.Cthulhu();
                                } else {
                                        System.out.println(FishArt[fishRow][fishColumn]);
                                        System.out.println(FishNames[fishRow][fishColumn]);
                                        System.out.println(FishInfo[fishRow][fishColumn]);
                                }
                        }

                        // This is if user missed
                        else {
                                GameScripts.type_100("Please type in a vaid power level next time\n");
                                GameScripts.type_100(
                                                "Like wow you missed pretty bad...... like really really bad.....\n\n");
                        }
                }

                System.out.println("\nHeres your fishing bag inventory after your trip: ");
                for (String name : caughtFishNames) {
                        System.out.println(name);
                }

                input.close();

        }
}