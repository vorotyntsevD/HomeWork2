package ua.org.oa.mrsuperdan;


import java.util.Arrays;
import java.util.Scanner;

public class StudentsInfo {
    int[] student1 = new int[5];
    int[] student2 = new int[5];
    int[] student3 = new int[5];

    double student1Average;
    double student2Average;
    double student3Average;
    double totalAverage;

    // Этот метод случайным образом присваевает ученикам 5 оценок по 12-ти бальной шкале

    public void fillArrayStudents() {

        for (int i = 0; i < student1.length; i++) {
            student1[i] = (int) (Math.random() * 11 + 1);

            student2[i] = (int) (Math.random() * 11 + 1);

            student3[i] = (int) (Math.random() * 11 + 1);
        }
    }

    // Метод считает среднюю оценку группы на основе средних оценок ее учеников

    public double countTotalAverage() {

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 0; i < student1.length; i++) {
            sum1 += student1[i];
        }
        student1Average = sum1 / student1.length;


        for (int i = 0; i < student2.length; i++) {
            sum2 += student2[i];
        }
        student2Average = sum2 / student2.length;


        for (int i = 0; i < student3.length; i++) {
            sum3 += student3[i];
        }
        student3Average = sum3 / student3.length;

        return totalAverage = (student1Average + student2Average + student3Average) / 3;

    }

    // Методы сравнивают среднюю оценку ученика со средней оценкой группы

    public void moreThanAverage() {
        if (student1Average > totalAverage) {
            System.out.println("Средний балл ученика №1 ВЫШЕ среднего балла группы");
        }
        if (student2Average > totalAverage) {
            System.out.println("Средний балл ученика №2 ВЫШЕ среднего балла группы");
        }
        if (student3Average > totalAverage) {
            System.out.println("Средний балл ученика №3 ВЫШЕ среднего балла группы");
        }
    }

    public void lessThanAverage() {
        if (student1Average < totalAverage) {
            System.out.println("Средний балл ученика №1 НИЖЕ среднего балла группы");
        }
        if (student2Average < totalAverage) {
            System.out.println("Средний балл ученика №2 НИЖЕ среднего балла группы");
        }
        if (student3Average < totalAverage) {
            System.out.println("Средний балл ученика №3 НИЖЕ среднего балла группы");
        }
    }

    // Методы сравнивают среднюю оценку ученика с указанным баллом

    public void moreThanFixGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите балл:");
        int fixGrade = scanner.nextInt();

        if (student1Average > fixGrade) {
            System.out.println("Средний балл ученика №1 ВЫШЕ чем " + fixGrade);
        }
        if (student2Average > fixGrade) {
            System.out.println("Средний балл ученика №2 ВЫШЕ чем " + fixGrade);
        }
        if (student3Average > fixGrade) {
            System.out.println("Средний балл ученика №3 ВЫШЕ чем " + fixGrade);
        }

    }

    public void lessThanFixGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите балл:");
        int fixGrade = scanner.nextInt();

        if (student1Average < fixGrade) {
            System.out.println("Средний балл ученика №1 НИЖЕ чем " + fixGrade);
        }
        if (student2Average < fixGrade) {
            System.out.println("Средний балл ученика №2 НИЖЕ чем " + fixGrade);
        }
        if (student3Average < fixGrade) {
            System.out.println("Средний балл ученика №3 НИЖЕ чем " + fixGrade);
        }

    }

    @Override
    public String toString() {
        return "StudentsInfo{" +
                "student1=" + Arrays.toString(student1) +
                ", student2=" + Arrays.toString(student2) +
                ", student3=" + Arrays.toString(student3) +
                '}';
    }
}