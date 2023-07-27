package Java8.Original.FunctionalInterface.AB_DefaultMethod.AmbiguityOrDiamondProblem;

public interface IParent {
    default void test(){
        System.out.println("I am parent");
    }
}
