# JavaLanguage
Primary

Java中的字符串处理主要有下面三个类来处理的：String、StringBuffer、StringBuilder。

三者区别综述：

1，String、StringBuffer、StringBuilder都是被final修饰的，是不能够被继承改写的。

2，String在实例化之后，其内存空间的内容大小是不能够被修改的；而StringBuffer是一个线程安全的可变字符序列，在实例化之后可以动态的修改堆内存中的内容，所以内存长度和大小是可变的；StringBuilder实例化之后内存大小长度也是可变的，不

同之处在于StringBuilder不是线程同步，因此操作起来必然比StringBuffer更加高效。

三者区别详细分析：

例子：

String str = "hello"; 

str += "world";

上述代码在内存中已经开辟了3个空间，分别是：”hello“， ”world“， ”helloworld“，他们的堆内存大小是固定的，最终str指向了”helloworld“的堆地址。如下图所示：


而StringBuffer使用时，只会开辟一块内存空间，可以使用append添加delete等操作内容。
String有一个特殊之处：
构造String对象时可以使用new构造也可以使用"hello"直接构造。中两种方法推荐使用第二种。
图示如下：


1、 String a= new String("hello");

2、String a = "hello"; 

解释如下：

1：在栈内存重定义了一个a对象引用，先指向堆内存值为“hello”内存地址，然后又指向new之后堆内存为“hello”的地址。最终开辟了两个空间，第一个空间没有对象引用，会被JVM垃圾回收。

2：在栈内存中定义了一个a对象引用，指向堆内存的值“hello”内存地址。最终开辟了一个内存空间

3：需要注意到是==与equals的用法
String a = "111";
String b = "111";
System.out.print(a==b);
System.out.print(a.equals(b));
String c = new String("222");
String d = new String("222");
System.out.print(c==d);
System.out.print(c.equals(d));
结果是：true    true    false    true

三者使用说明：

String 每次生成对象都会对系统性能产生影响，特别当内存中无引用对象多了以后， JVM 的 GC 就会开始工作，那速度是一定会相当慢的。 而如果是使用 StringBuffer/StringBuilder 类则结果就不一样了，每次结果都会对 StringBuffer/StringBuilder 对象本身进行操作，而不是生成 新的对象，再改变对象引用。

因而在对一个字符串循环赋值时，最好使用StringBuffer（源码中各种使用synchronized）或StringBuilder（线程不安全），这样可以节约内存，提高性能，切记。  

总结：

 1.如果要操作少量的数据用 = String
 2.单线程操作字符串缓冲区 下操作大量数据 = StringBuilder
 3.多线程操作字符串缓冲区 下操作大量数据 = StringBuffer
--------------------- 
作者：hughjin 
来源：CSDN 
原文：https://blog.csdn.net/baidu_25310663/article/details/51276966 




