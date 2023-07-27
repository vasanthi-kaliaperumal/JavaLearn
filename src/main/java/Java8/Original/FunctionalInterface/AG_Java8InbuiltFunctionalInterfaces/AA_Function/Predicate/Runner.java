package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AA_Function.Predicate;

import com.google.common.base.Supplier;

import java.util.function.Predicate;

public class Runner {
    public boolean ClassicWay(){
        Condition condition = new Condition();
        return condition.isEligible(20);
    }
    public boolean LambdaStyle(){
        Predicate<Integer> condition = age-> age>18;
        return condition.test(20);
    }
    public static void main(String ar[]){
        Runner runner=new Runner();
        if(runner.ClassicWay() == runner.LambdaStyle())
            System.out.println("Success you learnt Predicate Interface");
    }
}
