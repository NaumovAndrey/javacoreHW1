package ru.gb.naumov.processing;

import ru.gb.naumov.action.Delimiters;

import java.util.Arrays;

public class Controller {
    public int calculation(String text) {
        String regex = String.join("|",
                Delimiters.SUM.getDelimiters(),
                Delimiters.DIFFERENCE.getDelimiters(),
                Delimiters.PRODUCT.getDelimiters(),
                Delimiters.QUOTIENT.getDelimiters());

        String[] numbers = text.split(regex);
        int[] num = new int[numbers.length];
        char[] signs = text.replaceAll("[^" + regex + "]", "").toCharArray();

        for (int i = 0; i < numbers.length; i++) {
            num[i] = Integer.parseInt(numbers[i]);
        }

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(signs));

        return -1;
    }

}
