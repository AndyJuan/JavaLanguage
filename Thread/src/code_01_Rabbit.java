/**
 * *
 * 模拟龟兔赛跑
 * 创建多线程，继承Thread +重写run(线程体)
 *使用线程：创建子类对象
 * 然后调用start()方法，线程启动
 */


public class code_01_Rabbit  extends Thread{

    @Override
    public void run() {
        for ( int i = 1; i<100; i++){
            System.out.println("兔子跑了"+i+"步");
        }
    }

}

class turtor extends Thread{
    @Override
    public void run() {
        for ( int i = 1; i<100; i++){
            System.out.println("乌龟跑了"+i+"步");
        }
    }
}