package com.study.HeapOutOfMemory;
/**
 * 测试虚拟机栈溢出(多线程模式下)
 * @author chenguangjin
 *
 */
public class StackOverflowMultiThread {
	//VM args: -Xss2M
	public static void main(String[] args) throws Exception {

        StackOverflowMultiThread stackOverflow = new StackOverflowMultiThread();

        try {
            stackOverflow.stackLeakByThread();
        } catch (Exception e) {

            throw e;
        }

    }

    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }
}
