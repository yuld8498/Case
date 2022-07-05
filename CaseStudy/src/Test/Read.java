package Test;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Module2\\Case\\CaseStudy\\src\\Test\\sinhvien.txt");
            BufferedInputStream dataInputStream = new BufferedInputStream(fileInputStream);
//            System.out.println(dataInputStream.read());
            int j = dataInputStream.available();
            for (int i = 0; i < j; i++) {
                System.out.println(dataInputStream.read());
            }
            dataInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        try {
//            FileReader fileReader = new FileReader("D:\\Module2\\Case\\CaseStudy\\src\\Test\\sinhvien.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            System.out.println(bufferedReader.readLine());
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
