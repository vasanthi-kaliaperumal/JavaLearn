package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AC_Supplier;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String ar[]){
        Supplier<Object> supplier = ()->{
            Calendar calendar = Calendar.getInstance();
            return calendar.getTime();
        };
        System.out.println(supplier.get());
    }
}
