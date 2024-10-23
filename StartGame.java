public class StartGame {
    public static void main(String[] args) {

        // Game obj connections
        GameScripts ScriptOBJ = new GameScripts();
        GameText TextOBJ = new GameText();

        // intro
        System.out.println("\n" + ScriptOBJ.introCard() + "\n");
        GameScripts.introCheck();
        GameScripts.mainMenuCheck();

        // starting
        GameScripts.type_100(TextOBJ.startText());
        GameScripts.readyCheck();

        // game play
        GamePlay.main();

        // ending
        GameScripts.type_100(TextOBJ.endTextFast1());
        GameScripts.type_300(TextOBJ.endTextSlow());
        GameScripts.type_100(TextOBJ.endTextFast2());
        GameScripts.type_100(ScriptOBJ.credits());

    }

}
