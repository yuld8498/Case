package TestArraylist;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        SetandHashset.leanSetAndHashSet();
        //HashMap
        HashMap<Integer, String> hashMap =new HashMap<Integer, String>();
        hashMap.put(1,"Hue");
        hashMap.put(2, " Sai gon");
        hashMap.put(3, "Ha Noi");
        hashMap.put(4,"Da nang");
        System.out.println(hashMap.put(4,"Da Lat"));
        for (int i : hashMap.keySet()){
            System.out.println(i + " " + hashMap.get(i));
        }
        myClass.Students();
    }
}
