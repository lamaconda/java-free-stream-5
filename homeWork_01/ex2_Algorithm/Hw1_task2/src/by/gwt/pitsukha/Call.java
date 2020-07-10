package by.gwt.pitsukha;

public class Call{
    public void run(){
        System.out.println("Звонок по телефону");
        phone();
        number();
        press();
        talk();
        end();
    }
    public void phone(){
        System.out.println("Шаг 1: Взять телефон");
    }
    public void number(){
        System.out.println("Шаг 2: набрать номер");
    }
    public void press(){
        System.out.println("Шаг 3: Нажать кнопку 'Вызов'");
    }
    public void talk(){
        System.out.println("Шаг 4: Поговорить по телефону");
    }
    public void end(){
        System.out.println("Шаг 5: Нажать кнопку 'Завершить вызов' \n");
    }
}
