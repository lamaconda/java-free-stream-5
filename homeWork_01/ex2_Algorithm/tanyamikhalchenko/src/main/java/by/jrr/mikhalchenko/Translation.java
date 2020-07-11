package by.jrr.mikhalchenko;

public class Translation {
    public static void main(String[] args) {
        readIt();
        writeOutWords();
        understandIt();
        useADictionary();
        translateIt();
        writeIt();
    }

    public static void   readIt(){
        System.out.println("read the text");
    }
    public static void writeOutWords() {
        System.out.println("write out words that are no known");
    }
    public static void understandIt() {
        System.out.println("try to understand the meaning of these words");
    }
    public static void useADictionary() {
        System.out.println("use a dictionary to translate these words");
    }
    public static void  translateIt() {
        System.out.println("translate the text");
    }
    public static void  writeIt() {
        System.out.println("write the translation in a notebook");
    }
}
