package com.study.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListTest {
	static final int MAXIMUM_CAPACITY = 1 << 30;
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 
		List<String> list1 = new LinkedList<String>();
		Set<String> set = new HashSet<String>(16);
		System.out.println(ListTest.tableSizeFor(5));
		String a="a",b="a";
		Integer c= 1,d=1;
		Integer g = new Integer(1);
		Integer h = new Integer(1);
		Integer e= 1000,f=1000;
		System.out.println(a==b);//true
		System.out.println(c==d);//true
		System.out.println(e==f);//false
		System.out.println(g==h);//false
	}
	
	
	static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
