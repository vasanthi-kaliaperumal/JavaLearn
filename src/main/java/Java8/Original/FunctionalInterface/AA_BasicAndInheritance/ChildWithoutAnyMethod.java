package Java8.Original.FunctionalInterface.AA_BasicAndInheritance;

public interface ChildWithoutAnyMethod extends FunctionalInterfacesExample {

    //can define any method here as its a normal child interface
    void status();
    void call();
    //There is no point in overriding parent functional interface methods. its optional
    //reason it is a normal interface
}
