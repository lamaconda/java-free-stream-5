public class Algoritms {public static void main(String[] args) {
    Algoritms recipe = new Algoritms();
}
    public Algoritms(){
        TurnOnComputer();
        GetToWork();
        TeaRecipe();
        Call();
        BuyingBread();
    }
    public void TurnOnComputer() {
        System.out.println("1. Включение компьютера");
        System.out.println("a) Заварчить чай.");
        System.out.println("b) Подойти к компьютеру.");
        System.out.println("c) Нажать кнопку включения.");
        System.out.println("d) Ожидать загрузку ОС.");
    }
    public void GetToWork() {
        System.out.println("\n2. Добраться до работы.");
        System.out.println("a) Проснуться.");
        System.out.println("b) Умыться.");
        System.out.println("c) Заварить кофе.");
        System.out.println("d) Покормить котенка.");
        System.out.println("e) Одеться.");
        System.out.println("f) Выйти из дома.");
        System.out.println("g) Сесть и завести в машину.");
        System.out.println("h) 30-40 минут ехать.");
        System.out.println("i) Припарковать машину у здания компании.");
        System.out.println("j) Войти в офис.");
    }
    public void TeaRecipe() {
        System.out.println("\n3. Рецепт чая.");
        System.out.println("a) Прийти на кухню.");
        System.out.println("b) Набрать воды в чайник.");
        System.out.println("c) Поставить чайник на подставку.");
        System.out.println("d) Нажать кнопку включения.");
        System.out.println("e) Ожидать пока чайник закипит.");
        System.out.println("f) Достать чашку.");
        System.out.println("g) Налить заварку.");
        System.out.println("h) Залить заварку водой из чайника.");
        System.out.println("i) Добавиьт сахар по вкусу.");
    }
    public void Call() {
        System.out.println("\n4.Совершить звонок.");
        System.out.println("a) Достать телефон из кармана/сумочки.");
        System.out.println("b) Разблокировать телефон.");
        System.out.println("c) Нажать кнопку \"Вызовы\"");
        System.out.println("d) Набрать номер телефона (Выбрать из списка контактов)");
        System.out.println("e) Совершить вызов.");
        System.out.println("f) Ожидайть ответа.");
    }
    public void BuyingBread() {
        System.out.println("\n5.Покупка хлеба.");
        System.out.println("a) Одеться.");
        System.out.println("b) Взять пакет.");
        System.out.println("c) Взять кошелек.");
        System.out.println("d) Выйти из дома.");
        System.out.println("e) Дойти до магазина.");
        System.out.println("f) Зайти в магазин.");
        System.out.println("g) Найти отдел с хлебом.");
        System.out.println("h) Выбрать хлеб.");
        System.out.println("i) Отнести хлеб на кассу.");
        System.out.println("j) Подождать, пока до Вас дойдет очередь.");
        System.out.println("k) Отдать хлеб кассиру.");
        System.out.println("l) Заплатить за покупку.");
        System.out.println("m) Вернуться домой.");
    }

}
