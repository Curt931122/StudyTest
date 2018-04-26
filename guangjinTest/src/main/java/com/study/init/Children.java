package com.study.init;

public class Children extends Father{
	{
		str = "children_init";
		System.out.println("构造代码块 children");
	}
	Children(String str) {
		str = "children_constructor";
		System.out.println("构造函数(str) children");
		// TODO Auto-generated constructor stub
	}
	static{
		staticStr = "children_staticinit_static";
		System.out.println("静态代码块 children");
	}
	public void method(){
		System.out.println("普通方法 children");
	}
	public static void staticMethod(){
		System.out.println("静态方法 children");
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Father f = new Children("asd");
		System.out.println("-------------------");
		//new Children("asd");
		f.method();
		f.staticMethod();//子类可以调用父类的静态方法，但是不能被重写，出现同名方法，父类方法隐藏
		System.out.println("-------------------");
		System.out.println("f.getClass() == Father.class " + (f.getClass() == Father.class));
		System.out.println("f.getClass() == Children.class " + (f.getClass() == Children.class));
		System.out.println("f instanceof Father " + (f instanceof Father));
		System.out.println("f instanceof Children " + (f instanceof Children));
	}
	
}
