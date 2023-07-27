package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AB_Consumer;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String ar[]){
        Consumer<String> consumer = e->System.out.println(e.toUpperCase());
        consumer.accept("vasanthi");

        Consumer<String> integerConsumer = e->System.out.println(e.toLowerCase());
        integerConsumer.andThen(consumer).accept("sugapriyan");
    }

}
