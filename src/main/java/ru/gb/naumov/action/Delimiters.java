package ru.gb.naumov.action;

public enum Delimiters {
    SUM("\\+"),
    DIFFERENCE("\\-"),
    PRODUCT("\\*"),
    QUOTIENT("\\/");

    private String delimiters;

    private Delimiters(String s) {
        this.delimiters = s;
    }

    public String getDelimiters() {
        return delimiters;
    }
}
