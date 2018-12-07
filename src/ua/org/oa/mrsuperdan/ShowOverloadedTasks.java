package ua.org.oa.mrsuperdan;

// Этот класс показывает использование перегруженных методов и конструкторов

public class ShowOverloadedTasks {

    private double width;
    private double height;
    private double depth;


    // Перегруженные конструкторы:

    public ShowOverloadedTasks(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        if (width <= 0 || height <= 0 || depth <= 0) {
            System.out.println("ERROR");
        }
    }

    public ShowOverloadedTasks(double width, double height) {
        this.width = width;
        this.height = height;
        this.depth = 0;
        if (width <= 0 || height <= 0 || depth < 0) {
            System.out.println("ERROR");
        }
    }

    public ShowOverloadedTasks() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    public void getVolume() {

        if (depth == 0) {
            double volume = width * height;
            System.out.println("ДВУХмерный объект. Площадь = " + volume);
        } else if (width == 0) {
            System.out.println("Введите параметры объекта");
        } else {
            double volume = width * height * depth;
            System.out.println("ТРЕХмерный объект. Объем = " + volume);
        }
    }

    /*
     *   Перегруженные методы:
     */

    // Выводит сумму всех чисел в диапазоне двух указаных чисел
    public void overloadMethod(int firstInt, int lastInt) {
        int sum = 0;

        for (int i = firstInt; i <= lastInt; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел от " + firstInt + " до " + lastInt + " = " + sum);

    }

    // Выводит сумму всех чисел от 0 до указанного числа
    public void overloadMethod(int lastInt) {
        int sum = 0;
        for (int i = 0; i <= lastInt; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 0 до " + lastInt + " = " + sum);
    }

}