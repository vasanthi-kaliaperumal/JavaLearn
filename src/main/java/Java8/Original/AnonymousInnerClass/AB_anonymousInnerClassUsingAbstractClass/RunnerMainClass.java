package Java8.Original.AnonymousInnerClass.AB_anonymousInnerClassUsingAbstractClass;

public class RunnerMainClass {
    public static void main(String ar[]){
        Parent child = new Parent() {
            @Override
            public void findPartner() {

                System.out.println("Child finds partner in anonyous inner class");

            }
        };
        child.findPartner();
    }

}
