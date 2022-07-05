package TestFile;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Module2\\Case\\CaseStudy\\src\\TestFile\\helloWorld.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int i = 0;
        Scanner scanner = new Scanner(file);
        String[] stringArr  = new String[100];
        int[] arr = new int[100];
        i=0;
        if (scanner.hasNextLine()){
            while (scanner.hasNext()!=false){
                String w = scanner.next();
                System.out.println(w);
            }
        }
        //in dòng sau
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            arr[i] = number;
            i++;
        }

        shownumber(arr);
        // in tất cả
//        while (scanner.hasNext()) {
//            String w = scanner.next();
//            stringArr[i] =w;
//            i++;
//        }
//        showinfo(stringArr);
    }

    private static void shownumber(int[] arr) {
        for (int number : arr){
            if (number ==0){
                break;
            }else {
                System.out.print(number+" ");
            }
        }
    }

    private static void showinfo(String[] stringArr) {
        for (String w : stringArr){
            if (w == null){
                break;
            }else {
                System.out.print(w+"s");
            }
        }
    }

}
