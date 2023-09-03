package ru.gb.naumov.action;

public class Quotient implements Action {
    @Override
    public double result(double a, double b) {
        return a / b;
    }
}
