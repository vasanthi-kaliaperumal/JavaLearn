package Java8.Original.AnonymousInnerClass.AC_anonymousInnerClassUsingInterface;

public class RunnerMainClass {
    public static void main(String ar[]){
        IParent parent = new IParent() {
            @Override
            public void findPartner() {
                System.out.println("Find my parter Anonymous Inner class");
            }
        };
    }

}
