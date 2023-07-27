package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AD_BiFunctionalInterfaces;

import java.util.function.BiConsumer;

public class AC_BiConsumer {
    public static void main(String ar[]){
        //Add
        BiConsumer<Integer,Integer> add = (num1,num2)->System.out.println(num1+num2);
        add.accept(1,2);
        BiConsumer<Integer,Integer> mul = (num1,num2)->System.out.println(num1*num2);
        mul.accept(2,3);
        add.andThen(mul).accept(3,4);
    }
}
