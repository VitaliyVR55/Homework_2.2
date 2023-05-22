
public class Main {
    public static void main(String[] args) {
        // Исходное состояние счета
        int act = 130;
        // Пополнение счета
        int refill = 1300;
        // Назначени переменной бонусных рублей
        int bonus = 0;
        // Проверка суммы пополнения и начисление бонусных рублей
        if (refill > 1000) {
            bonus = refill / 100;
        }
        // Зачисление пополненых и бонусных средств
        act = act + refill + bonus;
        // Вувод данных о счете и бонусах
        System.out.println("Состояние счета: " + act + "руб.       " + "Количество бонусных рублей: " + bonus);

    }

}