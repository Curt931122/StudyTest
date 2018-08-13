package com.study.thread;
/**
 * volatile修饰的变量只能保证变量的读写是原子性的
 * increaseI++是一个复合操作，他可以简单分为：
 * 	var = increaseI; //步骤1：将increaseI的值加载到寄存器var
 * 	var = var + 1;//步骤2：将寄存器var的值增加1
 * 	increaseI = var;//步骤3：将寄存器var的值写入increaseI
 * volatile只能保证第一步和第三部单个操作的原子性，并不能保证整个自增和自减过程的原子性
 * @author chenguangjin
 *
 */
public class TestVolatile {
	private volatile static int increaseI = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					increaseI++;
				}
			}, String.valueOf(i));
			thread.start();
		}

		while (Thread.activeCount() > 1)
			Thread.yield();
		System.out.println(increaseI);
	}
}
