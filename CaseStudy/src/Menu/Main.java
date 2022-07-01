package Menu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("New York"); collection.add("Atlanta");
        collection.add("Dallas"); collection.add("Madison");
        Iterator<String> iterator = collection.iterator();
        int t =1;
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toUpperCase() + " ");
            System.out.println(iterator.hasNext());
        }
        collection.add(2,"LonDon");
        Collections.sort(collection);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
        System.out.println(collection);
        HomePage.login();
    }
}
