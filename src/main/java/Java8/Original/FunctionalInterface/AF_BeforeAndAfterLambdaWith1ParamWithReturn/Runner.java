package Java8.Original.FunctionalInterface.AF_BeforeAndAfterLambdaWith1ParamWithReturn;

public class Runner {
    public void ClassicWay(){
        IName name = new NameImpl();
        System.out.println("ClassicWay " + name.nameWithSurName("Vasanthi"));
    }

    public void AnonymousInnerClass(){
        IName name = new IName(){
            @Override
            public String nameWithSurName(String name) {
                return name + " Sugapriyan";
            }
        };
        System.out.println("AnonymousInnerClass " + name.nameWithSurName("Kathir"));
    }
    public void LambdaExpression(){
        IName name = e -> e + " Sugapriyan";
        System.out.println("Lambda " + name.nameWithSurName("Malar"));
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
