package com.tm;

@FunctionalInterface
interface Host{
     void welcome(String name);
     default void sayHi(int name){
         System.out.println("say Hi");
     }

}

interface FeeCalculator{
     int getCourseFee(String course);
}

public class lambda1 {
    public static void main(String gg[]) {
        Host indianHost=(message) -> { System.out.printf("Namaste %s\n",message);};
        Host americanHost=(message) -> { System.out.printf("Welcome %s\n",message);};
        indianHost.welcome("Sameer");
        americanHost.welcome("Shivam");
        FeeCalculator javaCourse=(course)-> {
            if(course.equals("Java course")){
                return 1000;
            }
            else
                return 0;
        };
        System.out.println(javaCourse.getCourseFee("Java course"));
    }
}
