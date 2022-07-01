package TestArraylist;

import java.util.*;

public class SetandHashset {
    //set đảm bảo các phần tử  nhập vào ko trùng nhau.
    public static void leanSetAndHashSet(){
        //hashset không đảm bảo vị trí sắp sếp theo đầu vào
        //hashset sắp xếp number ok, còn String thì...
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(5);
        hashset.add(7);
        hashset.add(-5);
        hashset.add(-1);
        hashset.add(6);
        hashset.add(7);

        HashSet<String> hashSetString = new HashSet<>();
        hashSetString.add("d");
        hashSetString.add("b");
        hashSetString.add("a");
        hashSetString.add("b");
        hashSetString.add("c");

        HashSet<String> hashSetString2 = new HashSet<>(hashSetString);
        hashSetString2.add("ba");
        hashSetString2.add("aca");
        hashSetString2.add("hello");

        //inkedHashset duy trì thứ tụ nhập vào
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(77);
        linkedHashSet.add(2);
        linkedHashSet.add(2);

        //TreeSet sắp xếp chuỗi theo thứ tự của chữ cái đầu tiên
        //TreeSet sắp xếp hoa trước thường sau, ko qtam độ dài chuỗi
        TreeSet<String> treeSet =new TreeSet<>(hashSetString2);
        treeSet.add("abccccc");
        treeSet.add("Abc");
        treeSet.add("aBc");
        treeSet.add("BAC");
        treeSet.add("Zya");

        TreeSet<Integer> treeSetNumber = new TreeSet<>(linkedHashSet);
        treeSetNumber.add(22);

        System.out.println(hashSetString2);
        System.out.println(hashset);
        System.out.println(hashSetString);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
        System.out.println(treeSetNumber);
    }

}
