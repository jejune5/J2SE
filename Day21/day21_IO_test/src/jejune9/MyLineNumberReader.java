package jejune9;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Jejune on 2018/8/12.
 */
public class MyLineNumberReader {
    private Reader r ;
    private int lineNumber = 0;

    public MyLineNumberReader(Reader r) {
        this.r = r;
    }

    public int getLineNumber() {
        return lineNumber;
    }
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String readLine() throws IOException {
        lineNumber++;

        StringBuilder sb = new StringBuilder();

        int ch = 0;
        while ((ch = r.read()) != -1) {
            if (ch == '\r'){
                continue;
            }

            if (ch == '\n'){
                return sb.toString();
            }else {
                sb.append((char) ch);
            }

            if (sb.length() >0) {
                return sb.toString();
            }
        }

        return null;
    }

    public void close() throws IOException {
        this.r.close();
    }
}
