package ex3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        IntegerSet s1 = new IntegerSet();
        ArrayList<IntegerSet> s1 = new ArrayList<IntegerSet>();
        IntegerSet item = new IntegerSet(30);
        s1.insertElement(20);
        s1.insertElement(30);

        ArrayList<IntegerSet> s2 = new ArrayList<IntegerSet>();
//        IntegerSet s2 = new IntegerSet();
        s2.insertElement(10);
        s2.insertElement(15);
        s2.insertElement(20);
        s2.insertElement(25);

        System.out.println("s1=" + s1.toSetString());
        System.out.println("s2=" + s2.toSetString());
        System.out.println("intersecção=" + s1.intersecction(s2).toSetString());
        System.out.println("união=" + s1.union(s2).toSetString());
        System.out.println("s1 e s2 iguais? " + s1.isEqualsTo(s2));

//        IntegerSet s3 = new IntegerSet();
        ArrayList<IntegerSet> s3 = new ArrayList<IntegerSet>();
//        s3.insertElement(30);
//        s3.insertElement(10);
//        s3.insertElement(20);
        System.out.println("s1 e s3 iguais? " + s1.isEqualsTo(s3));

        s3.deletElement(20);
        System.out.println("s1 e s3 iguais? " + s1.isEqualsTo(s3));

        System.out.println("set vazio: " + new IntegerSet().toSetString());
    }
}
