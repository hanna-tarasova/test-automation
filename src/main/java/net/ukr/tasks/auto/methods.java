package net.ukr.tasks.auto;

import java.util.Arrays;

public class methods {

    public int summa (int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }




    public int[] sort (int array[]) {
        int[] array2 = new int[array.length];

        int count1 = 0;
        int count2 = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                array2[count1] = array[i];
                count1++;
            } else {
                array2[count2] = array[i];
                count2--;
            }
        }
        int count3 = 0;
        int count4 = array.length - 1;
        for (int j = 0; j < array.length; j++) {

            if ((array2[j] % 2) == 0) {
                array[count3] = array2[j];
                count3++;
            } else {
                array[count4] = array2[j];
                count4--;
            }
            }

        return array;
    }

}
