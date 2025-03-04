package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        // byte 를 하나씩 다루는 것이 아니라, byte[] 를 사용해서 데이터를 원하는 크기만큼 저장
        byte[] input= {65,66,67};
        fos.write(input);
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        byte[] buffer= new byte[10];
        // 만들어둔 byte[] 를 한번에 읽어주는 메서드
        int readCount = fis.read(buffer,0,10);
        System.out.println("readCount:"+readCount);
        System.out.println(Arrays.toString(buffer));
        fis.close();
    }
}
