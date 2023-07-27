package Java8.Original.FunctionalInterface.AD_BeforeAndAfterLambda2Param2Return;

public class Runner {
    public void ClassicWay(){
        IParent parent = new ChildImpl();
        parent.test();
    }

    public void AnonymousInnerClass(){
        IParent parent = new IParent() {
            @Override
            public void test() {
                System.out.println("I am Anonymous Inner Class");
            }
        };
        parent.test();
    }
    public void LambdaExpression(){
        IParent parent = () -> System.out.println("I am lambda. So Simple.");
        parent.test();
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
