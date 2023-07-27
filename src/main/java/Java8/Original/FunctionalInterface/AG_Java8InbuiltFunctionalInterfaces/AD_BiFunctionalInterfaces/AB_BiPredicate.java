package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AD_BiFunctionalInterfaces;

import java.util.function.BiPredicate;

public class AB_BiPredicate {
    public static void main(String ar[]){
        //last name should not be empty
        BiPredicate<String,String> lastnameValidate = (firstName,lastName)->
                lastName.length()>0;
        System.out.println(lastnameValidate.test("Vasanthi",""));

        //check equality of two given strings
        BiPredicate<String,String> equality = (name1,name2)->
                name1.equals(name2);
        System.out.println(lastnameValidate.test("Vasanthi","K"));

        //check equality ignoring case sensitivity
        BiPredicate<String,String> equalIgnoreCase = (name1,name2)->
                name1.equalsIgnoreCase(name2);
        System.out.println(lastnameValidate.test("Vasanthi","vasanthi"));
    }
}
