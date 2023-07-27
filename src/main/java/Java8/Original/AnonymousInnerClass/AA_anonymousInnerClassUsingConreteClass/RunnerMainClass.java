package Java8.Original.AnonymousInnerClass.AA_anonymousInnerClassUsingConreteClass;

public class RunnerMainClass {
    public static void main(String ar[]){
        Parent child = new Parent()
        {
            public void findPartner(){
                System.out.println("Child find partner Anonymously");
            }
        };
        child.educate();
        child.leavesAssets();
        child.findPartner();
        Parent parent = new Parent();
        parent.findPartner();
    }

}
