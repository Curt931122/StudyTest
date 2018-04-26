package com.study.sorting;

public class User {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		new User().test2();;
	}
	public void test1(){
		User user = new User();
		user.setId(1);
		User.test1_method(user);
		System.out.println(user.getId());
	}
	public void test2(){
		User user = new User();
		System.out.println(user instanceof UserEx);
	}
	public static void test1_method(User user){
		user = new User();
		user.setId(2);
	}
}
