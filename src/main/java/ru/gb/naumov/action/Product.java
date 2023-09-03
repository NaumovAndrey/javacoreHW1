package ru.gb.naumov.action;

public class Product implements Action {
    @Override
    public double result(double a, double b) {
        return a * b;
    }
}
