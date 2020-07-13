package by.jjr.shelkovichilya_Hw1Task2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Alg {
    public static void main(String[] args) {
        System.out.println("Стирка одежды");
        takeclothes();
        open();
        putclothesin();
        close();
        powder();
        mode();
        start();
        System.out.println("Покупка обуви");
        modelselection();
        model1();
        model2();
        model3();
        buy();
        System.out.println("Забывчивая покупка");
        makelist();
        store();
        checklist();
        item1();
        checklist();    //повторно обращаемся к списку
        item2();
        payment();
        System.out.println("Посадить растение");
        digahole();
        putintsoil();
        fillinthehole();
        watertheplant();
        System.out.println("Покупка билета в кино");
        cinema();
        makeachoice();
        ticket();

    }

    public static void takeclothes() {
        System.out.println("    1.Берем одежду");
    }
    public static void open() {
        System.out.println("    2.Открываем стиралку");
    }
    public static void putclothesin() {
        System.out.println("    3.Кидаем шмотки в стиралку");
    }
    public static void close() {
        System.out.println("    4.Зыкрываем стиралку");
    }
    public static void powder() {
        System.out.println("    5.Засыпаем порошок");
    }
    public static void mode() {
        System.out.println("    6.Выбираем подходящий режим");
    }
    public static void start() {
        System.out.println("    7.Жмем кнопочку вкл");
    }

    public static void modelselection() {
        System.out.println("    1.Выбор моделей");
    }
    public static void model1() {
        System.out.println("    2.Примерка первого варианта");
    }
    public static void model2() {
        System.out.println("    3.Примерка второго варианта");
    }
    public static void model3(){
        System.out.println("    4.Примерка третьего варианта");
    }
    public static void buy(){
        System.out.println("    5.Покупка второго варианта");
    }

    public static void makelist(){
        System.out.println("    1.Пишем список приобретаемого");
    }
    public static void store(){
        System.out.println("    2.Идем в магазин");
    }
    public static void checklist(){
        System.out.println("    3.Смотрим список");
    }
    public static void item1(){
        System.out.println("    4.Первая вещь из списка в корзину");
    }
    public static void item2(){
        System.out.println("    6.Вторая вещь из списка в корзину");
    }
    public static void payment(){
        System.out.println("    7.Оплата на кассе");
    }

    public static void digahole(){
        System.out.println("    1.Сделать углубление в почве");
    }
    public static void putintsoil(){
        System.out.println("    2.Помещаем растение в углубление");
    }
    public static void fillinthehole(){
        System.out.println("    3.Прикапываем углублением");
    }
    public static void watertheplant(){
        System.out.println("    6.Поливаем водой");
    }


    public static void ticket(){
        int ticket = 40;
        if (ticket ==0){
            System.out.println("    3.Видимо в другой раз");
        }else {
            System.out.println("    3.Выбрать место");
            System.out.println("    4.Выбрать кол-во билетов");
            System.out.println("    5.Оплатить");
        }
    }
    public static void cinema(){
        System.out.println("    1.Подойти к кассе");
    }
    public static void makeachoice(){
        System.out.println("    2.Назвать сеанс");
    }

}