package com.company;

import java.util.Scanner;

public class lesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //задание 9
        System.out.println("Введите число");

        int num = scanner.nextInt();
        if (num%2==0){
            System.out.println("Вы ввели четное число либо 0\n");
        }
        else
            System.out.println("Вы ввели нечетное число\n");

        //задание 10
        System.out.println("Введите число от 1 до 7");
        int day = scanner.nextInt();
        if (day == 1){
            System.out.println("Понедельник");}
        if (day ==2){
            System.out.println("Вторник");}
        if (day ==3){
            System.out.println("Среда"); }
        if (day==4){
            System.out.println("Четверг");
        }
        if (day==5){
            System.out.println("Пятница");
        }
        if (day==6){
            System.out.println("Суббота");
        }
        if (day==7){
            System.out.println("Воскресенье");
        }
        if (day<1||day>7)
            System.out.println("Вы ввели неправильное число. Введите число от 1 до 7");

    }
}
