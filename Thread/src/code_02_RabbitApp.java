/**
 * *
 * 模拟龟兔赛跑
 * 创建多线程，继承Thread +重写run(线程体)
 *
 */

public class code_02_RabbitApp {
    public static void main(String[] args) {
        code_01_Rabbit rab = new code_01_Rabbit();
        turtor tur = new turtor ();
        rab.start();
        tur.start();
    }
}
