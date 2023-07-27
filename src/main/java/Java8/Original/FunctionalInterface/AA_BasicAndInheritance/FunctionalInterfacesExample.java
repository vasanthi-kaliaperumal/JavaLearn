package Java8.Original.FunctionalInterface.AA_BasicAndInheritance;

@FunctionalInterface
public interface FunctionalInterfacesExample {
    /*
        Interface important points:
        1. Interface methods are by default public and abstract
        2. Interface variables are by default public, static and final
        3. Interface variables  must be initialized
        4. Interface can have any number of unimplemented methods
        5. Interface cannot have implemented methods (before Java8)
            After Java 8 only default methods can be implemented

        Functional Interface: Introduced in Java 8
        1. Functional Interface enforces only ONE ABSTRACT method
        2. Also called as SAM -> Single Abstract Method
        3. To make an interface behave strictly as Functional Interface
            use the annotation @FunctionalInterface
    */
    void test();

    //  4. Can also have other methods from Object class(parent of all classes)
    int hashCode();
    boolean equals(Object obj);

    //  5. Interface can have only default implemented Methods
    default void start(){
        System.out.println("This is default method one");
    }
    default void stop(){
        System.out.println("There can be n number of default methods");
    }

}
