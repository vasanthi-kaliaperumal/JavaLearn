package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AA_Function.AB_Examples;

import java.util.function.Function;

public class AndThenComposeExample {
    public static void main(String ar[]){
        Function<String,String> breakfast = idly->{return "idly and then ";};
        Function<String,String> lunch = biriyani->{return "biriyani";};
        Function<String,String> dinner = chapatti->{return " and then chapatti";};

//        Function<String,String> breakfast = idly->{
//            System.out.println("idly and then");
//            return "";};
//        Function<String,String> lunch = biriyani->{
//            System.out.println("biriyani");
//            return "";};
//        Function<String,String> dinner = chapatti->{
//            System.out.println("and then chapatti");
//            return "";};
        System.out.println("Expected:");
        System.out.println("First " + breakfast.apply("") +lunch.apply(""));
        System.out.println("First " + lunch.apply("") + dinner.apply(""));
        System.out.println("Actual:");
        System.out.println("First " + breakfast.andThen(lunch).apply(""));
        System.out.println("First " + dinner.compose(lunch).apply(""));

    }
}
