package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AA_Function.Predicate.Examples;

import java.util.function.Predicate;

public class OrAndNegateExample {
    Predicate<String> category = name->name.equals("fruit");
    Predicate<String> apple = name->name.equals("apple");
    public void andExample()
    {
        System.out.println("Is both present as fruit? " +category.and(apple).test("fruit"));
    }
    public void orExample()
    {
        System.out.println("Is any fruit present? " +category.or(apple).test("fruit"));
    }
    public void negateExample()
    {
        System.out.println("Is fruit not present? " +category.negate().test("fruit"));
        System.out.println("Is fruit not present? " +apple.negate().test("fruit"));
    }
    public static void main(String ar[]){
        OrAndNegateExample runner = new OrAndNegateExample();
        runner.andExample();
        runner.orExample();
        runner.negateExample();
    }
}
