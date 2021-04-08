import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedSource source = Okio.buffer(Okio.source(new File("in.txt")));

        BufferedSink sink = Okio.buffer(Okio.sink(new File("out.txt")));

        source.readAll(sink);

        source.close();
        sink.close();
    }
}
