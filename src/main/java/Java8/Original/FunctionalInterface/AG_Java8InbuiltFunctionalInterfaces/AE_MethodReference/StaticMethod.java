package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AE_MethodReference;

interface IAdd{
    void add (int a,int b);
}
public class StaticMethod {
    public static void sum(int n,int m){
        System.out.println(n+m);
    }
    public static void main(String ar[]){
        IAdd iadd = StaticMethod::sum;
        // conditions:
        // Method reference is used only when the same implementation is present
        // method sum must be static
        // return type may or may not be same
        // number of parameters must be same and parameter type also should be inline
        iadd.add(3,6);
    }
}
