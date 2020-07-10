package by.gwt.pitsukha;

public class Wash{

    public void run(){
        System.out.println("Алгоритм умывания");
        bathroom();
        open();
        washing();
        close();
    }

    public void bathroom(){
        System.out.println("Шаг 1: Зайти в ванну");
    }
    public void open(){
        System.out.println("Шаг 2: Открыть кран с водой");
    }
    public void washing(){
        System.out.println("Шаг 3: Умыться");
    }
    public void close(){
        System.out.println("Шаг 4: Закрыть кран с водой \n");
    }
}
