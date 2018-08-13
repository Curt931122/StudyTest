package com.study.HeapOutOfMemory;

import java.util.ArrayList;
import java.util.List;

public class HeapOutOfMemory {
	public static void testHeap() {
        System.out.println("Java Runtime >>>> total=" + Runtime.getRuntime().totalMemory()
                + "|free=" + Runtime.getRuntime().freeMemory());

        List<TestObject> list = new ArrayList<TestObject>();
        while (true) {
            TestObject oomObject = new TestObject();
            list.add(oomObject);
            list.addAll(list);
        }
    }

    public static void main(String[] args) {
    	//-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=D:\\
        testHeap();
    }
}
