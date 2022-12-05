package com.example.effectivejavastudy.weaknessReference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

// PhantomReference



public class ReferenceTest {
    private List<WeakReference<BigData>> weakRefs = new LinkedList<>();
    private List<SoftReference<BigData>> softRefs = new LinkedList<>();
    private List<BigData> strongRefs = new LinkedList<>();


    public void weakReferenceTest() {
        try {
            for (int i = 0; true; i++) {
                weakRefs.add(new WeakReference<BigData>(new BigData()));
            }
        } catch (OutOfMemoryError ofm) { // weak일 경우 out of memory 발생 하지 않는다.
            System.out.println("out of memory!");
        }
    }

    public void softReferenceTest() {
        try {
            for (int i = 0; true; i++) {
                softRefs.add(new SoftReference<BigData>(new BigData()));
            }
        } catch (OutOfMemoryError ofm) { // weak일 경우 out of memory 발생 하지 않는다.
            System.out.println("out of memory!");
        }
    }


    public void strongReferenceTest() {
        try {
            for (int i = 0; true; i++) {
                strongRefs.add(new BigData());
            }
        } catch (OutOfMemoryError ofm) { // Strong일 경우 out of memory 발생
            System.out.println("out of memory!");
        }
    }


    public static void main(String[] args) {
        System.out.println("실행");

        ReferenceTest test = new ReferenceTest();
        //test.weakReferenceTest();
        //test.softReferenceTest();
        test.strongReferenceTest();

        System.out.println("종료");
    }
}
