package com.data.thread;

/**
 * @author dk
 * @date 2016/1/25
 */
public class TestFinal {
    private int i;
    private final int j;

    public TestFinal(int j, int i) {
        this.j = j;
        this.i = i;
    }

    public static void main(String[] args) {
        TestFinal testFinal = new TestFinal(10,1);
        System.out.println(testFinal.j);
        testFinal = new TestFinal(110,1);
        System.out.println(testFinal.j);
        testFinal = new TestFinal(1110,1);
        System.out.println(testFinal.j);

        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        final String f = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((b == d));
        System.out.println((a == e));
        System.out.println((b == f));


        final MyClass myClass = new MyClass();
        System.out.println(myClass.i++);
        System.out.println(myClass.i+=10);

        MyClass1 myClass1 = new MyClass1();
        MyClass1 myClass2 = new MyClass1();
        System.out.println(myClass1.i);
        System.out.println(MyClass1.j);
        System.out.println(myClass2.i);
        System.out.println(MyClass1.j);


        finalParamClass paramClass = new finalParamClass();
        StringBuffer buffer = new StringBuffer("hello");
        paramClass.changeValue(buffer);
        System.out.println(buffer.toString());

        Prarm prarm = new Prarm();
        prarm.name ="";
        System.out.println(prarm.age);
        paramClass.changeObj(prarm);
        System.out.println(prarm.age);
    }
}
class MyClass{
    public int i = 1;
}

class MyClass1 {
    public final double i = Math.random();
    public static double j = Math.random();
}

class finalParamClass{
    void changeValue(final StringBuffer buffer){
        buffer.append(" world");
    }

//    void changeInt(final int i){
//        i++;
//    }

    void changeObj(final Prarm prarm){
        prarm.age = 100;
    }
}

class Prarm{
    public String name = "haha";
    public int age = 10;
}
