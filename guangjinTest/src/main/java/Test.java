
public class Test {
	//1.8
	public static void main(String[] args) {
//        String s1 = new String("hello");
//        String intern1 = s1.intern();
//        System.out.println(s1== intern1);//false
//        String s2 = "hello";
//        System.out.println(s1 == s2);//false
//        String s3 = new String("hello") + new String("hello");
//        String intern3 = s3.intern();
//        System.out.println(s3 == intern3);//true
//        String s4 = "hellohello";
//        System.out.println(s3 == s4);//true
		
		
//        String a = "hello";
//        String s1 = new String(a);
//        String s2 = "hello";
//        String intern1 = s1.intern();
//        System.out.println(s1 == s2);//false
//        String s3 = new String("hello") + new String("hello");
//        String s4 = "hellohello";
//        String intern3 = s3.intern();
//        System.out.println(s3 == s4);//false
        
//		
        String str=new StringBuilder("hsc").append("test").toString();
        String strIntern=str.intern();
        String strNew=new StringBuilder("hsc").append("test").toString();
        String strNewIntern=strNew.intern();
        /**
         * 输出:true
         */
        System.out.println(str==strIntern);
        /**
         * 输出:true
         */
        System.out.println(strNewIntern==str);
        /**
         * 输出:false
         */
        System.out.println(strNewIntern==strNew);
    }
}
