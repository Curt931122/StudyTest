package com.study.HeapOutOfMemory;
/**
 * 测试虚拟机栈溢出
 * @author chenguangjin
 *
 */
public class StackOverflow {
	//-Xss128k
	public static void main(String[] args) throws Exception {
		
        StackOverflow stackOverflow = new StackOverflow();

        try {
            stackOverflow.stackLeak();
        } catch (Exception e) {

            System.out.println("stack lenth : " + stackOverflow.stackLen);

            throw e;
        }

    }

    private int stackLen = 1;

    public void stackLeak() {
        stackLen++;
        stackLeak();
    }
}
