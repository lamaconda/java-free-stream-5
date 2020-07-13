
    public class Objects {
        public static void main(String[] args) {
            Objects obj = new Objects();
        }
        public Objects() {
            Car();
            PC();
            Glass();
            Clock();
            Phone();
            Headphones();
            Wallet();
            Door();
            Book();
            Laser();
        }
        public void Car(){
            System.out.println("1. Машина Peugeot 407c.");
            System.out.println("Состояние:");
            System.out.println("Заведена/заглушена.");
            System.out.println("В движении/припарковона.");
            System.out.println("Поведение:");
            System.out.println("Заведена - тратит топливо.");
            System.out.println("Заглушена - топливо в безоапсности.");
            System.out.println("В движении - колесики крутяться.");
            System.out.println("припарковона - нет движения.");

        }
        public void PC(){
            System.out.println("\n2. Компьютер стационарный");
            System.out.println("Состояние:");
            System.out.println("Включен/Выключен.");
            System.out.println("Нагружен/не нагружен.");
            System.out.println("Поведение:");
            System.out.println("Включени - работает.");
            System.out.println("Выключен - не работает.");
            System.out.println("Нагружен - старается и кряхтит.");
            System.out.println("Не нагружен - кайфует и потребляет энергию на холяву.");
        }
        public void Glass(){
            System.out.println("\n3.Стакан");
            System.out.println("Состояние:");
            System.out.println("Полный/пустой.");
            System.out.println("Чистый/грязный.");
            System.out.println("Поведение:");
            System.out.println("Полный - содержит жидкость.");
            System.out.println("Пустой - жидкость кончилась.");
            System.out.println("Чистый - помытый.");
            System.out.println("Грязный - не мытый.");
        }
        public void Clock(){
            System.out.println("\n4. Часы.");
            System.out.println("Состояние:");
            System.out.println("Работают/не работают.");
            System.out.println("Поведение:");
            System.out.println("Работают - показывают время, стрелки ходят.");
            System.out.println("Не работают - показывают не верное время, стрелки не ходят.");
        }
        public void Phone(){
            System.out.println("\n5. Телефон.");
            System.out.println("Состояние:");
            System.out.println("Включен/Выключен");
            System.out.println("Поведение:");
            System.out.println("Включен - работает, можно звонить.");
            System.out.println("Выклчюен - не работает.");
        }
        public void Headphones(){
            System.out.println("\n6. Наушникик.");
            System.out.println("Состояние:");
            System.out.println("Подключены/отключены");
            System.out.println("Поведение:");
            System.out.println("Подключены - воспроизводят звук.");
            System.out.println("отключены - звук не воспроизводят.");
        }
        public void Wallet(){
            System.out.println("\n7. Бумажник.");
            System.out.println("Состояник:");
            System.out.println("Полный/пустой");
            System.out.println("Поведение:");
            System.out.println("Полный - есть денежка.");
            System.out.println("Пустой - запрлата через неделю.");
        }
        public void Door(){
            System.out.println("\n8. Дверь.");
            System.out.println("Состояние:");
            System.out.println("Открыта/закрыта.");
            System.out.println("Поведение:");
            System.out.println("Открыта - можно пройти.");
            System.out.println("Закрыта - нельзя пройти.");
        }
        public void Book(){
            System.out.println("\n9. Книга.");
            System.out.println("Состояние:");
            System.out.println("Открыта/закрыта.");
            System.out.println("Поведение:");
            System.out.println("Открыта - можно читать и просвещаться.");
            System.out.println("Закрыта - нельзя читать.");
        }
        public void Laser() {
            System.out.println("\n10. Лазер.");
            System.out.println("Состояние:");
            System.out.println("Включен/выключен.");
            System.out.println("Поведение:");
            System.out.println("Включен - котенку весело.");
            System.out.println("Выключен - котенку весело, но без лазера.");
        }

    }
