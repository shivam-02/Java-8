package com.tm;

interface CookSomething{
    void cook(String food);
}

class MyRecipe{
    public static void cookFood(String food){
        System.out.println("Cooked "+food);
    }
}

public class MethodReference {
    public static void main(String gg[]) {
        CookSomething cookSomething=MyRecipe::cookFood;
        cookSomething.cook("Paneer");
    }



}
