package Java8.Original.AnonymousInnerClass;

public class ThreadImplementation {
    public static void main(String ar[]){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<3;i++){
                    System.out.println("Hey Thread " + i);
                }
            }
        });
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<3;i++){
                    System.out.println("Hey Thread without obj " + i);
                }
            }
        }).start();
    }
}
