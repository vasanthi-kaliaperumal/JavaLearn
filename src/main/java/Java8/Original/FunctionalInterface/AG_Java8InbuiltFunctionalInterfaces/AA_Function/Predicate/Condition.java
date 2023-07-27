package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AA_Function.Predicate;

public class Condition {
    public boolean isEligible(int age){
        if(age>18)
            return true;
        return false;
    }
}
