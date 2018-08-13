package com.study.thread;

/**
 * http://www.cnblogs.com/konck/p/9336940.html
 * 
 * @author chenguangjin
 *
 */
public class DoubleCheck {

	private volatile static DoubleCheck instance = null;

	private DoubleCheck() {

	}

	public static DoubleCheck getInstance() {

		if (null == instance) { // 步骤一
			synchronized (DoubleCheck.class) {
				if (null == instance) { // 步骤二
					instance = new DoubleCheck(); // 步骤三
				}
			}
		}
		return instance;
	}

	public static void main(String[] args) throws InterruptedException {

		DoubleCheck doubleCheck = DoubleCheck.getInstance();
	}
}
