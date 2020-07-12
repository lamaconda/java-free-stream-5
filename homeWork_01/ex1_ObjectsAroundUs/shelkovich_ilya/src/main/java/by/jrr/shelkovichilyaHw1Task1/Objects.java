package by.jrr.shelkovichilyaHw1Task1;
    class Objects {
    public static void main(String[] args){
        candle();
        scissors();
        kolonka();
        radio();
        pencil();
        water();
    }
    public static void candle(){
        System.out.println("Обьект - свеча");
        System.out.println("Cостояние:");
        System.out.println("    1.Горит/не горит");
        System.out.println("    2.Кол-во воска");
        System.out.println("Поведение:");
        System.out.println("    1.Зажечь"); // При горении воск переходит в жидкое состояние
        System.out.println("    2.Потушить"); // Воск переходит в твердое состояние
    }
    public static void scissors(){
        System.out.println("Обьект - ножницы");
        System.out.println("Cостояние:");
        System.out.println("    1.Уровень заточки");
        System.out.println("Поведение:");
        System.out.println("    1.Резать");
    }
    public static void kolonka() {
        System.out.println("Обьект - Колонка");
        System.out.println("Cостояние:");
        System.out.println("    1.Вкл/выкл");
        System.out.println("    2.Уровень звука");
        System.out.println("    3.Моды");
        System.out.println("Поведение:");
        System.out.println("    1.Включить/выключить");
        System.out.println("    2.Повысить/понизить уровень звука"); // Используя этот метод вы постепенно повыш/пониж уровень звука
        System.out.println("    3.Смена мода"); // При использовании этого поведения вы выбираете к какому устройству будет подключена колонка
    }
    public static void radio() {
        System.out.println("Обьект - радио");
        System.out.println("Cостояние:");
        System.out.println("    1.Вкл/выкл");
        System.out.println("    2.Вещание");
        System.out.println("    3.Часы");
        System.out.println("    4.Уровень звука");
        System.out.println("Поведение:");
        System.out.println("    1.Смена частот");
        System.out.println("    2.Установка времени");
        System.out.println("    3.Установка будильника");
        System.out.println("    4.Повысить/понизить уровень звука");
    }
    public static void water(){
        System.out.println("Обьект - вода");
        System.out.println("Cостояние:");
        System.out.println("    1.Жидкость");
        System.out.println("    2.Лед");
        System.out.println("    3.Пар");
        System.out.println("Поведение:");
        System.out.println("    1.Течет");
        System.out.println("    2.Замерзает");
        System.out.println("    3.Нагревается");
    }
    public static void pencil(){
        System.out.println("Обьект - карандаш");
        System.out.println("Cостояние:");
        System.out.println("    1.Уровень заточки");
        System.out.println("    2.Длина");
        System.out.println("Поведение:");
        System.out.println("    1.Рисовать"); //Используя этот метод вы постепенно уменьшаете уровень заточки
        System.out.println("    2.Точить"); //Используя этот метод вы постепенно повыщаете уровень заточки, но понижаете длину
    }
    public static void banana(){
        System.out.println("Обьект - банан");
        System.out.println("Cостояние:");
        System.out.println("    1.Спелость");
        System.out.println("    2.Вкус");
        System.out.println("Поведение:");
        System.out.println("    1.Созревание");
        System.out.println("    2.Разложение");
    }
    public static void bottle(){
        System.out.println("Обьект - бутылка");
        System.out.println("Cостояние:");
        System.out.println("    1.Пустая/наполненная");
        System.out.println("    2.Открытая/закрытая");
        System.out.println("Поведение:");
        System.out.println("    1.Откручивание/закручивание крышки");
        System.out.println("    2.Заполнение емкости");
        System.out.println("    3.Опустошение емкости");
    }
    public static void flowers(){
        System.out.println("Обьект - цветы");
        System.out.println("Cостояние:");
        System.out.println("    1.Рост");
        System.out.println("Поведение:");
        System.out.println("    1.Цветение");
        System.out.println("    2.Увядание");
    }
    public static void fridge(){
        System.out.println("Обьект - холодильник");
        System.out.println("Cостояние:");
        System.out.println("    1.Вкл/выкл");
        System.out.println("    2.Температура");
        System.out.println("Поведение:");
        System.out.println("    1.Включение");
        System.out.println("    1.Установка температуры");
        System.out.println("    1.Хранение");
    }
}

