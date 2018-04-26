package com.study.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestSafety {
	public static void test(List<String> stringList) {
		  // 用于获得 List 的实现类名，例如 ArrayList
		  String className = stringList.getClass().getSimpleName();
		  new Thread(() -> Stream.of("1", "2").forEach((e) -> {
		    stringList.add(e);
		    System.out.println(className + " 添加了 " + e);
		    System.out.println(className + stringList.toString());
		    System.out.println(className + " [length=" + stringList.size() + "]");
		  })).start();
		  new Thread(() -> Stream.of("1", "2").forEach((e) -> {
		    stringList.add(e);
		    System.out.println(className + " 添加了 " + e);
		    System.out.println(className + stringList.toString());
		    System.out.println(className + " [length=" + stringList.size() + "]");
		  })).start();
	}
	public static void main(String[] args) {
		List<String> stringList1 = new ArrayList<String>();
		TestSafety.test(stringList1);
	}
}
