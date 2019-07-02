package com.stackroute.pe3;

public class Check7ConsecutiveNumbers {
    public static String checkConsecutive(int numbers[], int size) //checking whether the given inputs are consecutive or not
    {
        boolean b = true;

        String string = " ";
        for (int i = 0; i < size; i++) {
            if (numbers[i + 1] - numbers[i] == 1) {

            } else
                b = false;
        }
        if (b) {
            for (int i = 0; i <= size; i++) {
                string = string + numbers[i] + ",";
            }

            return string + " are consecutive";

        } else {
            for (int i = 0; i <= size; i++) {
                if (i == size) {
                    string = string + numbers[i];
                } else
                    string = string + numbers[i] + ",";
            }
            return string + " are not consecutive";
        }
    }
}
