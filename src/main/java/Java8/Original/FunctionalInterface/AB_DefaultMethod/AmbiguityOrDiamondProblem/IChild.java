package Java8.Original.FunctionalInterface.AB_DefaultMethod.AmbiguityOrDiamondProblem;

public interface IChild {
    default void test() {
        System.out.println("I am Child");
    }
}
