package com.study.math;

import java.lang.reflect.Field;

public class MathTest {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, SecurityException {
		long a = 100l;
		System.out.println(a/33l);
		demo5();
	}
	public static void demo5() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, SecurityException {
        Class<?> class1 = Class.forName("com.study.reflect.Person");
        Object obj = class1.newInstance();
        Field personNameField = class1.getDeclaredField("name");
        personNameField.setAccessible(true); //取消访问检查
        personNameField.set(obj, "小虎");
        System.out.println("修改属性之后得到属性变量的值：" + personNameField.get(obj));
    }
}
