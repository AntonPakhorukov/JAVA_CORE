package ru.geekbrains.seminar_01.regular;

/**
 * Создание декоратора для красивого вывода
 */
public class Decorator {
    /**
     * Метод декорирования
     * @param a - принимает число
     * @return - возвращает красивый вывод
     */
    public static String decorator(int a) {
        return String.format("here is your number: %d.", a);
    }
}
