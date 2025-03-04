package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.txt");
        byte[] input = {65,66,67};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.txt");
        // readAllBytes() 를 사용하면 스트림이 끝날 때까지 모두 읽어들인다.
        byte[] readBytes = fis.readAllBytes();
        System.out.println(Arrays.toString(readBytes));
        fis.close();
    }
}
