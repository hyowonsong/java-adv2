package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 이걸 만들기 전에 반드시 temp 라는 폴더를 만들자.(java-adv2에 존재)
// 자바 프로세스가 가지고 있는 데이터를 밖으로 보내려면 출력 스트림, 안으로 가져오려면 입력 스트림
public class StreamStartMain1 {
    public static void main(String[] args) throws IOException {
        // FileOutPutStream 이 파일에 데이터를 출력하는 스트림이다.
        // 파일이 없으면 파일을 자동으로 만들고, 데이터를 해당 파일에 저장한다.
        // 폴더를 만들지는 않기 때문에 미리 만들어두어야 한다.
        FileOutputStream fos = new FileOutputStream("temp/hello.dat");
        // write() : byte 단위로 값을 출력한다.
        fos.write(65);
        fos.write(66);
        fos.write(67);
        // 반드시 close 를 해줘야 한다.
        fos.close();

        FileInputStream fis = new FileInputStream("temp/hello.dat");
        // 파일에서 데이터를 읽어오는 스트림이다.
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        // 현재 3개만 저장하였기 때문에 그 이후부터는 -1이 출력된다.
        System.out.println(fis.read());
        fis.close();
    }
}
