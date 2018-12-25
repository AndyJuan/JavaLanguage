import java.io.*;
import java.net.URL;
//获取资源用流的形式
public class URL_test2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");

        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
        String msg = null;
        while ((msg = br.readLine())!=null){
           // System.out.println(msg);
            bw.append(msg);
            bw.newLine();;
        }
        bw.flush();;
        bw.close();
        br.close();

    }
}
