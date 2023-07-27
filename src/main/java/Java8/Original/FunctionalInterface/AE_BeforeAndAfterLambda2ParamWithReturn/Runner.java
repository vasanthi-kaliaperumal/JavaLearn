package Java8.Original.FunctionalInterface.AE_BeforeAndAfterLambda2ParamWithReturn;

public class Runner {
    public void ClassicWay(){
        ICalculate calculate = new CalculateImpl();
        System.out.println("ClassicWay " + calculate.add(5,3));
    }

    public void AnonymousInnerClass(){
        ICalculate calculate = new ICalculate(){
            @Override
            public int add (int a,int b)
            {
                return a+b;
            }
        };
        System.out.println("AnonymousInnerClass " + calculate.add(6,4));
    }
    public void LambdaExpression(){
        //ICalculate calculate =(int a,int b)-> {return a+b;};
        ICalculate calculate =(a,b)-> a+b;

        System.out.println("Lambda " + calculate.add(7,5));
    }
    public static void main(String ar[]){
        Runner runner=new Runner();
        //Before Java 8
        runner.ClassicWay();
        //After Java 8
        runner.AnonymousInnerClass();
        runner.LambdaExpression();
    }
}
