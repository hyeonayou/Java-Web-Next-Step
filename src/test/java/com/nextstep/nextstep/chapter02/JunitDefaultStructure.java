package com.nextstep.nextstep.chapter02;

import org.junit.jupiter.api.Test;

public class JunitDefaultStructure {

    @Test
    public void sum() {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(6,3));
    }

    @Test
    public void num(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.num(6,3));
    }

    @Test
    public void multiply(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.multiply(6,3));
    }

    @Test
    public void divide(){
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(6,3));
    }
}
