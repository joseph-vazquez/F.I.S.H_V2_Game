public class GameText {

    // this is the intro for the "story"
    public String startText() {
        String startText = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n " +
                " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "Hello young angler, \n" +
                "You are on your small row boat in the middle of an ocean. \n" +
                "Which ocean? We don't know and your phone's online maps doesn't know either. \n" +
                "However, don't let this small detail scare you. \n\n" +
                "Let's start fishing! \n" +
                "You can carry up to 3 different \"aqua\" lifeforms\n\n" +
                "Ready?\n" +
                "Well.... You better be!\n";
        return startText;
    }

    public String endTextFast1() {
        String endTextFast1 = "\n\nWell young angler that boat of yours look full of fun!\n" +
                "\nI really do hope you enjoyed your time here in the middle of nowhere.\n\n\n\n";
        return endTextFast1;
    }

    public String endTextSlow() {
        String endTextSlow = "Uhhhh someone is gonna get you right?\n" +
                "uhhhhhhh       ...........\n\n\n";
        return endTextSlow;
    }

    public String endTextFast2() {
        String endTextFast2 = "nahh Im sure you're fine!    :) \n" +
                "Catch! you later!\n";
        return endTextFast2;
    }

}
