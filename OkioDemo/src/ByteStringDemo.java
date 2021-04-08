import okio.ByteString;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStringDemo {
    public static void main(String[] args) throws IOException {
        String str = "This is a string";
        System.out.println(str.length());

        ByteString byteString = ByteString.encodeUtf8(str);
        System.out.println(byteString);

        String base64 = byteString.base64();
        System.out.println(base64);

        ByteString md5 = byteString.md5();
        System.out.println(md5.hex());

        ByteString byteString1 = ByteString.decodeBase64("YWJj");
        System.out.println(byteString1);

        String hex = byteString1.sha1().hex();
        System.out.println(hex);

        FileInputStream in = new FileInputStream("in.png");
        ByteString read = ByteString.read(in, in.available());
        System.out.println(read);

        FileOutputStream out = new FileOutputStream("out.png");
        read.write(out);

        in.close();
        out.close();
    }
}
