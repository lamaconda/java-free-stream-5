package main.java.by.jrr.sheremet.task4;

public class App {
    public static void main(String[] args) {
        short symbolCode = 120;
        char symbol = 'p';
        Encoder.encode(symbolCode);
        Encoder.decode(symbol);
    }
}
