package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{14,2,6},2)));
    }

    public static double[] tribonacci(double[] s, int n) {
        if(n < 0 || n == 0) {
            return new double[0];
        } else if (n == 1) {
            return new double[]{s[0]};
        } else if (n == 2) {
            return new double[]{s[0],s[1]};
        }
        double[] array = new double[n];
        array[0] = s[0];
        array[1] = s[1];
        array[2] = s[2];
        for(int i = 3; i < n;i++) {
            array[i] = array[i - 1] + array[i - 2] + array[i - 3];
        }
        return array;
    }
}