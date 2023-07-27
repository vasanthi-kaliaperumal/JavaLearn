package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces;

public class Definitions {
    /*1.****Function****
    Used when there is any input and any return value then use Function

    Function<ParameterType,ReturnType> fn = e -> manipulation;
    i.e
    Function<String,Integer> fn = e -> e.getLength();
    fn.apply("test");
     */

     /*2.****Predicate****
    Any type of input and return value is boolean we go for Predicate
    Predicate<ParameterType> pr = e->e.manipulation;
    i.e
    Predicate<String> pr = e -> e.isEmpty();
    pr.test("Indian");
     */

    /*3.****Consumer****
    Any type of input perform operation but no output then go for Consumer
    Consumer<ParameterType> cr = e->e.manipulation;
    i.e
    Consumer<String> cr = e -> System.out.println(e.isEmpty());
    cr.accept("Vasanthi");
     */

    /*4.****Supplier****
    No input but perform operation and return a value then go for Supplier
    Supplier<ReturnType> sp = e->e.manipulation;
    i.e
    Supplier<String> sp = e -> e.isEmpty();
    sp.get("Vasanthi");
     */

    /*
    Function(T,R)   BiFunction(T,U,R)
    Predicate(T)    BiPredicate(T,U)
    Consumer(T)     BiConsumer(T,U)
    Supplier(R)     -None- Reason: no input for Supplier so no concept
     */
}
