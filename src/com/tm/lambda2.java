package com.tm;

interface calculator {
    int calculate(int num1,int num2);
}
public class lambda2 {
    public static void main(String gg[]) {
        calculator add=(number1,number2) -> number1+number2;
        calculator substract=(number1,number2) -> number1-number2;
        calculator multiply=(number1,number2)->number1*number2;
        calculator divide=(number1,number2)->number1/number2;
        System.out.printf("Total is %d\n",add.calculate(10,2));
        System.out.printf("Difference is %d\n",substract.calculate(10,2));
        System.out.printf("Product is is %d\n",multiply.calculate(10,2));
        System.out.printf("Quotient is %d\n",divide.calculate(10,2));
    }
}