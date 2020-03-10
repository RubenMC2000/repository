package org.academiadecodigo.papabelosbugsters;

public class Calculator {

    public int sum(int a, int b){

        if(a < 0 || b < 0){
            throw new IllegalArgumentException();
        }
        return a + b;
    }

    public int sub(int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException();
        }
        return a - b;
    }

    public int mult(int a, int b){
        return a * b;
    }

    public int div(int a, int b){
        if(a == 0){
            throw new IllegalArgumentException();
        }
        return a / b;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(-10, 10));



    }
}
