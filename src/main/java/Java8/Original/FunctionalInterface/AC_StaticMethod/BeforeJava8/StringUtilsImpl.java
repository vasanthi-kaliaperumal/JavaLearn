package Java8.Original.FunctionalInterface.AC_StaticMethod.BeforeJava8;

public class StringUtilsImpl implements IStringUtils{

    @Override
    public void convertToUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    @Override
    public void convertToLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }
}
