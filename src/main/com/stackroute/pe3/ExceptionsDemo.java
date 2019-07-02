package com.stackroute.pe3;

public class ExceptionsDemo {
    public String checkNullException(String input) //throws Null pointer Exception
    {
        String str;
        try {
            if (input.equals(" ")) {
                throw new NullPointerException(input);
            }
        } catch (NullPointerException e) {
            str = "nullPointerException";
            return str;
        }
        return null;
    }

    public String checkOutOfBoundException(String string) {
        try {

            string.substring(0, string.length() + 1);


        } catch (IndexOutOfBoundsException e) {
            return "index out of bound";
        }
        return  null;
    }

    public String checkNegativeArraySizeException(int size) {
        String result = null;
        try {
            if (size < 0) {
                throw new NegativeArraySizeException();
            } else {
                int[] array = new int[size];
                result = "Array Created";
                return result;

            }


        } catch (NegativeArraySizeException e) {
            return "Negative Array Size";
        }
    }
}
