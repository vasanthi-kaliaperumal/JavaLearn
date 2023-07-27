package Java8.Original.FunctionalInterface.AA_BasicAndInheritance;

@FunctionalInterface
public interface ChildWithoutAnyMethodWithAnnotation extends FunctionalInterfacesExample {
    //we cannot define any new abstract method here as it will violate SAM concept

    //we can override parent SAM here
    @Override
    void test();
    //we can override parent default methods not necessarily all methods
    //if not overriden parent implementation is taken into picture
    @Override
    default void start() {
        System.out.println("I am overriding Start in with Annotation");
    }
}
