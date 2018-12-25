import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_test {
    public static void main(String[] args) throws MalformedURLException {
        //绝对路径构建
        URL url = new URL("http://www.baidu.com:80/index.html#aa?uname=bjsxt");

        System.out.println("协议：" +url.getProtocol());
        System.out.println("域名：" +url.getHost());
        System.out.println("端口：" +url.getPort());
        System.out.println("绝对路径：" +url.getPath());
        System.out.println("锚点：" +url.getRef());
        System.out.println("参数：" +url.getQuery());//？之后的参数，存在锚点返回null，如果不存在，则返回正确

    }
}
