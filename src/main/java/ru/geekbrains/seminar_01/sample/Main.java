package ru.geekbrains.seminar_01.sample;

import ru.geekbrains.seminar_01.regular.Decorator;
import ru.geekbrains.seminar_01.regular.OtherClass;

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.add(2, 5);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.sub(2, 5);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.mul(2, 5);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.div(2, 5);
        System.out.println(Decorator.decorator(result));
    }
}
