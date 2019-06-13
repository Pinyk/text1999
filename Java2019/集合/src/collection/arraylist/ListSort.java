package collection.arraylist;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Students> students = new ArrayList <>();
        students.add(new Students("aa",23));
        students.add(new Students("bb",32));
        students.add(new Students("cc",22));
        students.add(new Students("bd",1));
        students.add(new Students("ee",32));
        students.add(new Students("sa",45));
        students.add(new Students("ea",46));

        System.out.println(students);

        students.sort(Comparator.comparingInt(Students::getAge));
        System.out.println(students);
    }
}






