//package src;
//
//public class CardDisplay {
//    private static String newline = System.getProperty("line.separator");
//    public static String[] hearts = new String[]{
//            String.join(newline,
//                    " _____",
//                    "|2    |",
//                    "|  ♥  |",
//                    "|     |",
//                    "|  ♥  |",
//                    "|____z|")
//            , String.join(newline,
//            " _____",
//            "|3    |",
//            "| ♥ ♥ |",
//            "|     |",
//            "|  ♥  |",
//            "|____E|")
//            , String.join(newline,
//            " _____",
//            "|4    |",
//            "| ♥ ♥ |",
//            "|     |",
//            "| ♥ ♥ |",
//            "|____h|")
//            , String.join(newline,
//            " _____",
//            "|5    |",
//            "| ♥ ♥ |",
//            "|  ♥  |",
//            "| ♥ ♥ |",
//            "|____S|")
//            , String.join(newline,
//            " _____",
//            "|6    |",
//            "| ♥ ♥ |",
//            "| ♥ ♥ |",
//            "| ♥ ♥ |",
//            "|____9|")
//            , String.join(newline,
//            " _____",
//            "|7    |",
//            "| ♥ ♥ |",
//            "|♥ ♥ ♥|",
//            "| ♥ ♥ |",
//            "|____L|")
//            , String.join(newline,
//            " _____",
//            "|8    |",
//            "|♥ ♥ ♥|",
//            "| ♥ ♥ |",
//            "|♥ ♥ ♥|",
//            "|____8|")
//            , String.join(newline,
//            " _____",
//            "|9    |",
//            "|♥ ♥ ♥|",
//            "|♥ ♥ ♥|",
//            "|♥ ♥ ♥|",
//            "|____6|")
//            , String.join(newline,
//            " _____",
//            "|10 ♥ |",
//            "|♥ ♥ ♥|",
//            "|♥ ♥ ♥|",
//            "|♥ ♥ ♥|",
//            "|___0I|")
//            , String.join(newline,
//            " _____",
//            "|J♥ ww|",
//            "|   {)|",
//            "|(♥)% |",
//            "| ♥ % |",
//            "|__%%[|")
//            , String.join(newline,
//            " _____",
//            "|Q♥   |",
//            "|   {(|",
//            "|(♥)%%|",
//            "| ♥%%%|",
//            "|_%%%Ò|")
//            , String.join(newline,
//            " _____",
//            "|K♥ ww|",
//            "|   {)|",
//            "|(♥)%%|",
//            "| ♥%%%|",
//            "|_%%%>|"),
//            String.join(newline,
//                    " _____",
//                    "|A_ _|",
//                    "|( v )|",
//                    "|\\ / |",
//                    "|  .  |",
//                    "|____V|")
//    };
//    public static String[] diamonds = new String[]{
//            String.join(newline,
//                    " _____",
//                    "|2    |",
//                    "|  ♦  |",
//                    "|     |",
//                    "|  ♦  |",
//                    "|____z|")
//            , String.join(newline,
//            " _____",
//            "|3    |",
//            "| ♦ ♦ |",
//            "|     |",
//            "|  ♦  |",
//            "|____E|")
//            , String.join(newline,
//            " _____",
//            "|4    |",
//            "| ♦ ♦ |",
//            "|     |",
//            "| ♦ ♦ |",
//            "|____h|")
//            , String.join(newline,
//            " _____",
//            "|5    |",
//            "| ♦ ♦ |",
//            "|  ♦  |",
//            "| ♦ ♦ |",
//            "|____S|")
//            , String.join(newline,
//            " _____",
//            "|6    |",
//            "| ♦ ♦ |",
//            "| ♦ ♦ |",
//            "| ♦ ♦ |",
//            "|____9|")
//            , String.join(newline,
//            " _____",
//            "|7    |",
//            "| ♦ ♦ |",
//            "|♦ ♦ ♦|",
//            "| ♦ ♦ |",
//            "|____L|")
//            , String.join(newline,
//            " _____",
//            "|8    |",
//            "|♦ ♦ ♦|",
//            "| ♦ ♦ |",
//            "|♦ ♦ ♦|",
//            "|____8|")
//            , String.join(newline,
//            " _____",
//            "|9    |",
//            "|♦ ♦ ♦|",
//            "|♦ ♦ ♦|",
//            "|♦ ♦ ♦|",
//            "|____6|")
//            , String.join(newline,
//            " _____",
//            "|10 ♦ |",
//            "|♦ ♦ ♦|",
//            "|♦ ♦ ♦|",
//            "|♦ ♦ ♦|",
//            "|___0I|")
//            , String.join(newline,
//            " _____",
//            "|J♦ ww|",
//            "|   {)|",
//            "|(♦)% |",
//            "| ♦ % |",
//            "|__%%[|")
//            , String.join(newline,
//            " _____",
//            "|Q♦   |",
//            "|   {(|",
//            "|(♦)%%|",
//            "| ♦%%%|",
//            "|_%%%Ò|")
//            , String.join(newline,
//            " _____",
//            "|K♦ ww|",
//            "|   {)|",
//            "|(♦)%%|",
//            "| ♦%%%|",
//            "|_%%%>|"),
//            String.join(newline,
//                    " _____",
//                    "|A♦^  |",
//                    "| / \\ |",
//                    "| \\ / |",
//                    "|  .  |",
//                    "|___♦V|")
//    };
//    public static String[] clubs = new String[]{
//            String.join(newline,
//                    " _____",
//                    "|2    |",
//                    "|  ♣  |",
//                    "|     |",
//                    "|  ♣  |",
//                    "|____z|")
//            , String.join(newline,
//            " _____",
//            "|3    |",
//            "| ♣ ♣ |",
//            "|     |",
//            "|  ♣  |",
//            "|____E|")
//            , String.join(newline,
//            " _____",
//            "|4    |",
//            "| ♣ ♣ |",
//            "|     |",
//            "| ♣ ♣ |",
//            "|____h|")
//            , String.join(newline,
//            " _____",
//            "|5    |",
//            "| ♣ ♣ |",
//            "|  ♣  |",
//            "| ♣ ♣ |",
//            "|____S|")
//            , String.join(newline,
//            " _____",
//            "|6    |",
//            "| ♣ ♣ |",
//            "| ♣ ♣ |",
//            "| ♣ ♣ |",
//            "|____9|")
//            , String.join(newline,
//            " _____",
//            "|7    |",
//            "| ♣ ♣ |",
//            "|♣ ♣ ♣|",
//            "| ♣ ♣ |",
//            "|____L|")
//            , String.join(newline,
//            " _____",
//            "|8    |",
//            "|♣ ♣ ♣|",
//            "| ♣ ♣ |",
//            "|♣ ♣ ♣|",
//            "|____8|")
//            , String.join(newline,
//            " _____",
//            "|9    |",
//            "|♣ ♣ ♣|",
//            "|♣ ♣ ♣|",
//            "|♣ ♣ ♣|",
//            "|____6|")
//            , String.join(newline,
//            " _____",
//            "|10 ♣ |",
//            "|♣ ♣ ♣|",
//            "|♣ ♣ ♣|",
//            "|♣ ♣ ♣|",
//            "|___0I|")
//            , String.join(newline,
//            " _____",
//            "|J♣ ww|",
//            "|   {)|",
//            "|(♣)% |",
//            "| ♣ % |",
//            "|__%%[|")
//            , String.join(newline,
//            " _____",
//            "|Q♣   |",
//            "|   {(|",
//            "|(♣)%%|",
//            "| ♣%%%|",
//            "|_%%%Ò|")
//            , String.join(newline,
//            " _____",
//            "|K♣ ww|",
//            "|   {)|",
//            "|(♣)%%|",
//            "| ♣%%%|",
//            "|_%%%>|"),
//            String.join(newline,
//                    " _____",
//                    "|A♣_  |",
//                    "| ( ) |",
//                    "|(_'_)|",
//                    "|  |  |",
//                    "|___♣V|")
//    };
//    public static String[] spades = new String[]{
//            String.join(newline,
//                    " _____",
//                    "|2    |",
//                    "|  ♠  |",
//                    "|     |",
//                    "|  ♠  |",
//                    "|____z|")
//            , String.join(newline,
//            " _____",
//            "|3    |",
//            "| ♠ ♠ |",
//            "|     |",
//            "|  ♠  |",
//            "|____E|")
//            , String.join(newline,
//            " _____",
//            "|4    |",
//            "| ♠ ♠ |",
//            "|     |",
//            "| ♠ ♠ |",
//            "|____h|")
//            , String.join(newline,
//            " _____",
//            "|5    |",
//            "| ♠ ♠ |",
//            "|  ♠  |",
//            "| ♠ ♠ |",
//            "|____S|")
//            , String.join(newline,
//            " _____",
//            "|6    |",
//            "| ♠ ♠ |",
//            "| ♠ ♠ |",
//            "| ♠ ♠ |",
//            "|____9|")
//            , String.join(newline,
//            " _____",
//            "|7    |",
//            "| ♠ ♠ |",
//            "|♠ ♠ ♠|",
//            "| ♠ ♠ |",
//            "|____L|")
//            , String.join(newline,
//            " _____",
//            "|8    |",
//            "|♠ ♠ ♠|",
//            "| ♠ ♠ |",
//            "|♠ ♠ ♠|",
//            "|____8|")
//            , String.join(newline,
//            " _____",
//            "|9    |",
//            "|♠ ♠ ♠|",
//            "|♠ ♠ ♠|",
//            "|♠ ♠ ♠|",
//            "|____6|")
//            , String.join(newline,
//            " _____",
//            "|10 ♠ |",
//            "|♠ ♠ ♠|",
//            "|♠ ♠ ♠|",
//            "|♠ ♠ ♠|",
//            "|___0I|")
//            , String.join(newline,
//            " _____",
//            "|J♠ ww|",
//            "|   {)|",
//            "|(♠)% |",
//            "| ♠ % |",
//            "|__%%[|")
//            , String.join(newline,
//            " _____",
//            "|Q♠   |",
//            "|   {(|",
//            "|(♠)%%|",
//            "| ♠%%%|",
//            "|_%%%Ò|")
//            , String.join(newline,
//            " _____",
//            "|K♠ ww|",
//            "|   {)|",
//            "|(♠)%%|",
//            "| ♠%%%|",
//            "|_%%%>|"),
//            String.join(newline,
//                    " _____",
//                    "|A♠.  |",
//                    "| /.\\ |",
//                    "|(_._)|",
//                    "|  |  |",
//                    "|___♠V|")
//    };
//}
