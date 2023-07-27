package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AB_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExamples {
    public static void main(String ar[]){
        List<Integer> list = Arrays.asList(1,3,5,6,8,10);

        System.out.println("Before Java 1.5");
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+"\t");

        System.out.println("\nAfter Java 1.5");
        for(int i : list)
            System.out.print(i+"\t");

        System.out.println("\nAfter Java 1.8 - Method 1");
        Consumer<Integer> integerConsumer = input->System.out.print(input+"\t");
        list.forEach(integerConsumer);

        System.out.println("\nAfter Java 1.8 - Method 2");
        list.forEach(input->System.out.print(input+"\t"));

    }
}
