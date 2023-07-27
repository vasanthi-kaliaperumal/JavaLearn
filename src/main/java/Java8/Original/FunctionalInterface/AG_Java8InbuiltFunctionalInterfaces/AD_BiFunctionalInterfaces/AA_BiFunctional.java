package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AD_BiFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class AA_BiFunctional {
    public static void main(String ar[])
    {
        BiFunction<String,String,String> name =
                (firstName,lastName)->firstName+" " +lastName;
        System.out.println(name.apply("Vasanthi","Kaliaperumal"));

        BiFunction<Integer,Integer,Object> number = (num1,num2)->(num1+num2)/2;
        System.out.println(number.apply(10,11));

        List<String> list1 = Arrays.asList("Bat","Spider","Wonder");
        List<String> list2 = Arrays.asList("Man","Man","Women");
        BiFunction<List<String>,List<String>,Boolean> fullname = (l1,l2)->{
            for(int i = 0; i< l1.size(); i++)
                System.out.println(list1.get(i) + " " + list2.get(i));
            return true;
        };
                
        if(fullname.apply(list1,list2)){
            System.out.println("Success you have learnt BiFunctional Interface");
        }
    }

}
