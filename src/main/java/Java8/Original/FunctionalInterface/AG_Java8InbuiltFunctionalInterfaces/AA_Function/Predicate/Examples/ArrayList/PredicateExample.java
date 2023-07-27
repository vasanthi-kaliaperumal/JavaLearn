package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AA_Function.Predicate.Examples.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample  {
    public static void main(String a[]){
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vasanthi",59));
        studentList.add(new Student("Malar",95));
        studentList.add(new Student("Kathir",99));

        Predicate<Student> markList = list->list.getMark()<75;
        for(Student student:studentList){
            if(markList.test(student))
                System.out.println(student.getName());
        }
    }
}
