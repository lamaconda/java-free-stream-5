package main.java.by.jrr.sheremet.task4;

public class Encoder {
    private Encoder(){}
    public static void encode(short symbolCode) {
        char symbol = (char) symbolCode;
        System.out.println("The symbol of code " + symbolCode + " is '" + symbol + "'");
    }

    public static void decode(char symbol) {
        short symbolCode = (short) symbol;
        System.out.println("The code of symbol '" + symbol + "' is " + symbolCode);
    }
}
