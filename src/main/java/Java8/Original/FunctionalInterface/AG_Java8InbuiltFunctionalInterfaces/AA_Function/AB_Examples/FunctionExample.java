package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AA_Function.AB_Examples;

import java.util.function.Function;

public class FunctionExample {
    public void findSquare(){
        Function<Integer,Integer> square = number->number*number;
        System.out.println("Square is " + square.apply(12));
    }
    public void countTheLetters(){
        Function<String,Integer> count = inputString->inputString.length();
        System.out.println("Length is " + count.apply("Vasanthi"));
    }
    public void convertToUpperCase(){
        Function<String,String> upperCase = inputString->inputString.toUpperCase();
        System.out.println("UpperCase is " + upperCase.apply("Vasanthi"));
    }
    public void checkEmpty(){
        Function<String,Boolean> count = inputString->inputString.isEmpty() ||
                inputString.isBlank() || inputString.equals("");
        System.out.println("Check IsEmpty " + count.apply("Vasanthi"));
    }
    public static void main(String ar[])
    {
        FunctionExample functionExample = new FunctionExample();
        functionExample.findSquare();
        functionExample.countTheLetters();
        functionExample.convertToUpperCase();
        functionExample.checkEmpty();
    }
}
