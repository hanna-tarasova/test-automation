package net.ukr.tasks.auto;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class methodsTest {

    int[] input = new int[]{1, 2, 3, 4, 5, -3, 2, 5, 7, 9, 0, 2, 3, 4, 1, -10, 12, 14};
    int[] output = new int[]{2, 4, 2, 0, 2, 4, -10, 12, 14, 1, 3, 5, -3, 5, 7, 9, 3, 1};

    int[] input1 = new int[]{1, 2, 3, 4, 5, -3, 2, 9, 5, 7, 9, 0, 2, 3, 4, 1, -10, 12, 14};
    int output1 = 70;

    methods at = new methods();


    @Test
    public void sortTest () {
        assertEquals (Arrays.toString (output), Arrays.toString (at.sort (input)));
    }

    @Test
    public void summaTest () {
        assertEquals (output1, at.summa(input1));
    }
}
