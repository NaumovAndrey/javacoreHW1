package ru.gb.naumov.data;

import java.util.Scanner;

public class AddData {
    public String addConsole(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the expression: ");
        String stroka = in.nextLine();
        return stroka;
    }
}
