package Java8.Original.FunctionalInterface.AC_StaticMethod.BeforeJava8;

public class Runner {
    public static void main(String ar[]){
        IStringUtils str = new StringUtilsImpl();
        str.convertToLowerCase("Kathir");
        str.convertToUpperCase("Malar");
    }
}
