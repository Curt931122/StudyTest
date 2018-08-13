package com.study.proxy;

public class HelloServiceImpl implements HelloService{
	@Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }

	@Override
	public void sayGoodbye() {
		System.out.println("Goodbye!");
	}
}
