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
        int[] array2 = {11, 54, 66, 0, 45, 5, 7, 8, 92, 91};
        // объявляем некий новый массив, пока пустой, но содержащий ровно столько элемнтов, сколько наш массив 2.
        // в новый массив мы будем вносить сначала числа из первого массива, которые выполняют условие - являются парными
        int[] array3 = new int[10];
        // показываем иизначальный массив
        System.out.println("Here is a second array: " + Arrays.toString(array2));


        int count1 = 0;
        int count2 = 9;
        for (int i = 0; i < array2.length; i++)
        {
            if ((array2[i] % 2) == 0)
            {
                array3[count1] = array2[i];
                count1++;
            }
            else
            {
            array3[count2] = array2[i];
            count2--;
            }

        }
      System.out.println("Here are even numbers, then odd numbers of second array: " + Arrays.toString(array3));

    }
}








        //






