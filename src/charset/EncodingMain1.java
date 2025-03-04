package charset;

import static java.nio.charset.StandardCharsets.*;

import java.nio.charset.Charset;
import java.util.Arrays;

public class EncodingMain1 {

    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        // String 을 byte 로 변경해준다.
        System.out.println("== ASCII 영문 처리 ==");
        encoding("A", US_ASCII);
        encoding("A", ISO_8859_1);
        encoding("A", EUC_KR);
        encoding("A", MS_949);
        encoding("A", UTF_8);
        encoding("A", UTF_16BE);

        System.out.println("== 한글 지원 ==");
        encoding("가", EUC_KR);
        encoding("가", MS_949);
        encoding("가", UTF_8);
        encoding("가", UTF_16BE);
    }

    private static void encoding(String text, Charset charset) {
        // String.getBytes(Charset) 메서드를 사용하면 `String` 문자를 `byte` 배열로 변경
        // 문자를 byte로 변경하려면 문자 집합이 필요하다. 따라서, 어떤 문자를 참고해서 byte로 변경할지 정해야 한다.
        byte[] bytes = text.getBytes(charset);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte\n", text, charset,
                Arrays.toString(bytes), bytes.length);
    }
}
