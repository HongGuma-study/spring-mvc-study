package org.example.ioc.operator;

public class CalSub implements Operator {
    @Override
    public int operator(int x, int y) {
        return x - y;
    }
}