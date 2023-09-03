package ru.gb.naumov;

import ru.gb.naumov.data.AddData;
import ru.gb.naumov.processing.Controller;

public class Main {
    public static void main(String[] args) {
        AddData addData = new AddData();
        String text = addData.addConsole();

        Controller controller = new Controller();
        int result = controller.calculation(text);
        System.out.println(result);
    }
}