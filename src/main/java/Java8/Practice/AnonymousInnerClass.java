package Java8.Practice;

public class AnonymousInnerClass {
    public static void main(String ar[]){
        //Using Concrete Methods
        ParentConcreteClass concreteMethods = new ParentConcreteClass(){
            public void test(){
                System.out.println("concrete Runner");
            }
        };
        concreteMethods.test();

        //Using Abstract methods
        ParentAbstractClass abstractClass = new ParentAbstractClass() {
            @Override
            public void test() {
                System.out.println("abstract Runner");
            }
        };
        abstractClass.test();

        //Using Interface methods
        IParentClass iParentClass = new IParentClass() {
            @Override
            public void test() {
                System.out.println("Interface Runner");
            }
        };
        iParentClass.test();

        //As a Method
        ChildClassImpl childClass = new ChildClassImpl();
        childClass.childMethod(new IParentClass() {
            @Override
            public void test() {
                System.out.println("As a method");
            }
        });




    }


}
