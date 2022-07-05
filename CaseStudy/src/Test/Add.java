package Test;

import java.io.*;

public class Add {
    public static void main(String[] args) {
        int[] arr = new int[]{84,104,97,110,104,32,68,97,105,32,75,97};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Module2\\Case\\CaseStudy\\src\\Test\\sinhvien.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            for (int i : arr){
                bufferedOutputStream.write(i);
            }
//            File file = new File("D:\\Module2\\Case\\CaseStudy\\src\\Test\\sinhvien.txt");
//            file.createNewFile();
//            bufferedOutputStream.write(80);
            bufferedOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
