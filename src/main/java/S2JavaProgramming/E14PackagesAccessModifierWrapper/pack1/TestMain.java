package S2JavaProgramming.E14PackagesAccessModifierWrapper.pack1;

import S2JavaProgramming.E14PackagesAccessModifierWrapper.Test;

/*public class TestMain extends Test
 {
 	public static void main(String[] args) {
		
		TestMain tm=new TestMain();
		System.out.println(tm.x);
		tm.m1();
		
	
	}
	
}*/
	
public class TestMain{

		public static void main(String[] args) {
						
			Test t=new Test();
			
			System.out.println(t.x);
			
			t.m1();
			
		}

}
