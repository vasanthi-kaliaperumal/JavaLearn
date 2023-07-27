package Java8.Original.FunctionalInterface.AG_Java8InbuiltFunctionalInterfaces.AC_Supplier.ArrayList;

public class Student {
    String name;
    double mark;
    Student(String name, double mark){
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public double getMark() {
        return mark;
    }
    @Override
    public String toString(){
        return "Name : " + this.name + "\nMark : " + this.mark;
    }
}
