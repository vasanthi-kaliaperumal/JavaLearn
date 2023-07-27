package Java8.Original.FunctionalInterface.AB_DefaultMethod.AmbiguityOrDiamondProblem;

public class MultipleInheritance implements IParent,IChild {
    /*
    When we do multiple inheritance, a method is implemented in both classes,
    then we need to stricly Override that method

    This is called ambiguity or diamond problem
     */
    public void test(){
        System.out.println("1. I will implement myself");
        //deliberately provide which interface to be used(can provide both also)
        IParent.super.test();
        IChild.super.test();
    }
    public static void main(String ar[]){
        //Create object for the current class alone
        MultipleInheritance multipleInheritance= new MultipleInheritance();
        multipleInheritance.test();

        System.out.println("***Using Parent Interface***");
        //Create object for the parent Interface
        IParent parent = new MultipleInheritance();
        parent.test();
    }
}
