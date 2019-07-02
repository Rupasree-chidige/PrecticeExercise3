package com.stackroute.pe3;

public class RemoveVowels {
    public String removeVowelsInArray(String[] input)
    {
        if(input.length>0) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < input.length; i++) {
                input[i] = input[i].replaceAll("[AaEeIiOoUu]", "");

            }
            for (String item : input) {
                stringBuilder.append(item + "\n");
            }
            return stringBuilder.toString();
        }

       else{
           return "Empty Array";
        }
    }
}
