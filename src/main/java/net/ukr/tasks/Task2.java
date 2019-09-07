package net.ukr.tasks;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        // задание номер 1
        // объявляем массив
        int[] array1 = {1, 23, 65, 67, 45, 333, 66, 434, 55};
        // объявляем некую переменную - сумма всех чисел, которая пока равна нулю
        int sum = 0;
        // цикл, где мы перебираем по очереди каждое число массива.
        // Дальше наша переменная "сумма" - это нулевое значение плюс каждое выполнение условия"иф"
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        // печатаем сначала весь массив, и сумму, которая получилась

        System.out.println("Here is an array: " + Arrays.toString(array1));
        System.out.println("Here is a sum of numbers: " + sum);


        // задание номер 2
        // объявляем массив
        int[] array2 = {1, 2, 3, 4, 5, -3, 2, 5, 7, 9, 0, 2, 3, 4, 1, -10, 12, 14};
        // объявляем некий новый массив, пока пустой, но содержащий ровно столько элемнтов, сколько наш массив 2.
        // в новый массив мы будем вносить сначала числа из первого массива, которые выполняют условие - являются парными
        int[] array3 = new int[array2.length];
        // показываем иизначальный массив
        System.out.println("Here is a second array: " + Arrays.toString(array2));

        //берём вспомогательные переменные - первая ячейка будущего массива, и последняя
        int count1 = 0;
        int count2 = array2.length-1;
        // перебираем элементы изначального массива
        for (int i = 0; i < array2.length; i++)
        {
            // если остаток от деления равен нулю, то это значение занимает первую ячейку
            if ((array2[i] % 2) == 0)
            {
                array3[count1] = array2[i];
                count1++;
            }
            // если остаток от деления равен единице (условие - иначе) то занимает последнюю ячейку
            else
            {
                array3[count2] = array2[i];
                count2--;
            }

        }
        //берём ещё раз вспомогательные переменные, чтобы отсортировать нечётные числа в порядок, указанный вначале
        int count3 = 0;
        int count4 = array2.length-1;
        for (int j = 0; j < array2.length; j++) {

            if ((array3[j] % 2) == 0) {
                array2[count3] = array3[j];
                count3++;
            } else {
                array2[count4] = array3[j];
                count4--;
            }
        }
        System.out.println("Here are even numbers, then odd numbers of second array: " + Arrays.toString(array2));
    }
}