package Java8.Original.FunctionalInterface.AC_StaticMethod;

public class Child implements IParent {
    /*
        1. Static method cannot be implemented
        2. Static method cannot be ovverriden
        3. If a same method is implemented, its is considered as new method
         */
        static void test(){
            System.out.println("I am an independent child");
        }
        /*
        Main difference between default and static methods in interface is
        Static method cannot be implemented i.e Override not possible
        Default method can be implemented i.e Ovveride possible
         */
    public static void main(String ar[]){
        //can invoke parent static method with interface name only
        //we cannot invoke with the help of object
        IParent.test();
        Child child = new Child();
        child.test();
    }
}
