package Java8.Original.FunctionalInterface.AC_StaticMethod.AfterJava8;

public interface IStringUtils {

    static void convertToUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    static void convertToLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }
}
