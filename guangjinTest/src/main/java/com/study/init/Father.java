package com.study.init;

public class Father {
	public static String staticStr;
	protected String str; 
	{
		str = "father_init";
		System.out.println("构造代码块 father");
		
	}
	static{
		staticStr = "father_staticinit_static";
		System.out.println("静态代码块 father");
	}
	Father(){
		str = "father_no_params_constructor";
		System.out.println("构造函数() father");
	}
	Father(String str){
		str = "father_constructor";
		System.out.println("构造函数(str) father");
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public static void staticMethod(){
		System.out.println("静态方法 father");
	}
	public void method(){
		System.out.println("普通方法 father");
	}
}
