package TestArraylist;

import java.util.ArrayList;
import java.util.Collection;

public class myClass{
    public static void Students(){
       Student thanh = new Student("Thanh",24,true);
       Student phap = new Student("Phap", 23, true);
       Student trung = new Student("Trung", 22,false);
       Student thien = new Student("Thien", 26,true);
       ArrayList<Student> danhsach;
       ArrayList<Student> classA2 = new ArrayList<>();
       classA2.add(thanh);
       classA2.add(thien);
       classA2.add(trung);
       classA2.add(phap);
       ArrayList<Student> students = new ArrayList<>();
        System.out.println(students.size());
        System.out.println(classA2.size());
        students.addAll(classA2);
        danhsach = classA2;
        System.out.println(classA2.get(3));
        System.out.println(students.size());
        Student[] arr =  new Student[4];
        classA2.toArray(arr);
        System.out.println(arr[1]);
    }
}
