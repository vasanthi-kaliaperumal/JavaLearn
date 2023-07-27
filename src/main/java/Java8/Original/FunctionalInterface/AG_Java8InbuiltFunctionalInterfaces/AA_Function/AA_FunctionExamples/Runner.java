package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AA_Function.AA_FunctionExamples;

import java.util.function.Function;

public class Runner {
    public double ClassicalWay(){
        IUsdToInrConverter converter = new UsdToInrImpl();
        return converter.convert(10);
    }
    public double LambdaStyle(){
        Function<Integer,Double> function = usd -> usd*81.5;
        return function.apply(10);
    }
    public static void main(String ar[]){
        Runner runner = new Runner();
        if(runner.ClassicalWay() == runner.LambdaStyle())
            System.out.println("Success You learn Function Interface");
    }
}
