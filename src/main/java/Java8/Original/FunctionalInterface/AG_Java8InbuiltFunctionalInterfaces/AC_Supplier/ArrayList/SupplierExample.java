package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AC_Supplier.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String a[]){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vasanthi",59));
        studentList.add(new Student("Malar",95));
        studentList.add(new Student("Kathir",99));

        studentList.forEach(input->System.out.println(input));

        Supplier<List<Student>> supplier = ()->studentList;
        System.out.println(supplier.get());
    }
}
