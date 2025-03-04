package io.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

// 문자로된 파일을 읽고 쓸 때 과거에는 `FileReader`, `FileWriter` 같은 복잡한 스트림 클래스를 사용해야 했다.
// Files 는 이런 문제를 코드 한 줄로 깔끔하게 해결해준다.
public class ReadTextFileV1 {
    private static final String PATH = "temp/hell2.txt";

    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("== Write String ==");
        System.out.println(writeString);
        Path path = Path.of(PATH);

        //1. 파일에 쓰기
        Files.writeString(path, writeString, StandardCharsets.UTF_8);

        //2. 파일에서 읽기
        String readString = Files.readString(path, StandardCharsets.UTF_8);

        System.out.println("== Read String ==");
        System.out.println(readString);
    }

}
