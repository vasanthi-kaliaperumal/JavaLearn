package Java8.Original.AnonymousInnerClass.AD_anonymousInnerClassAsMethodArgument;

public class Runnable {
    public static void main(String a[]){
        ChildImpl child= new ChildImpl();
        child.manage(new IParent() {
            @Override
            public void findPartner() {
                System.out.println("Manage Anonymously");
            }
        });
    }

}
