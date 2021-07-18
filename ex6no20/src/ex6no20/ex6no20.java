package ex6no20;

public class ex6no20 {  //  281p
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv;
	static int cv2 = new ex6no20().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);
		ex6no20 ex = new ex6no20();
		System.out.println(ex.iv);
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();
		ex6no20 ex = new ex6no20();
		ex.instanceMethod1();
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
