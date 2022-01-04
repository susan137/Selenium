package program.checkdays;

public class CheckdaysMain {
	
		static Checkdays obj=new Checkdays();
	
	 
		public static void main(String[] args) {
		
				
			testcase1();
			testcase2();
			testcase3();
			testcase4();
			testcase5();
			testcase6();
			testcase7();
			testcase8();
			testcase9();
			testcase10();
		}
			
		//TestCase#1:Verify with testData '0'
		public static void testcase1() {
			
			int testdata=0;
			
			String actual_result=obj.checkdays(testdata);
			String expected_result="Invalid";
			if(actual_result.equals(expected_result)) {
				System.out.println("Tescase#1:Test Pass");
			}
			
		}
		//TestCase#2:Verify with negative number
		public static void testcase2() {
			
			int testdata=-1;
			
			String actual_result=obj.checkdays(testdata);
			String expected_result="Invalid";
			if(actual_result.equals(expected_result)) {
				System.out.println("Tescase#2:Test Pass");
			}
				
		}
		
		//TestCase#3:Verify with Large number
		public static void testcase3() {
					
			int testdata=-1;
					
			String actual_result=obj.checkdays(testdata);
			String expected_result="Invalid";
			if(actual_result.equals(expected_result)) {
				System.out.println("Tescase#3:Test Pass");
			}
						
		}
		
		//TestCase#4:Verify with TestData "1"
		public static void testcase4() {
							
			int testdata=1;
							
			String actual_result=obj.checkdays(testdata);
			String expected_result="Monday";
			if(actual_result.equals(expected_result)) {
				System.out.println("Tescase#4:Test Pass");
			}
								
		}
		
		//TestCase#5:Verify with TestData "2"
		public static void testcase5() {
									
			int testdata=2;
									
			String actual_result=obj.checkdays(testdata);
			String expected_result="Tuesday";
			if(actual_result.equals(expected_result)) {
				
				System.out.println("Tescase#5:Test Pass");
			}
										
		}
		
		//TestCase#6:Verify with TestData "3"
		public static void testcase6() {
									
					
			int testdata=3;						
			String actual_result=obj.checkdays(testdata);
			String expected_result="Wednesday";
			if(actual_result.equals(expected_result)) {
						
				System.out.println("Tescase#6:Test Pass");
					
			}
										
				
		}
		//TestCase#7:Verify with TestData "4"
		public static void testcase7() {
									
			int testdata=4;
			String actual_result=obj.checkdays(testdata);
			String expected_result="Thursday";
			if(actual_result.equals(expected_result)) {
					
				System.out.println("Tescase#7:Test Pass");
					
			}
										
		}
		//TestCase#8:Verify with TestData "5"
		public static void testcase8() {
									
			int testdata=5;
			String actual_result=obj.checkdays(testdata);
			String expected_result="Friday";
			if(actual_result.equals(expected_result)) {
				
				System.out.println("Tescase#8:Test Pass");
				
			}
										
		}
				
		//TestCase#9:Verify with TestData "6"
	    public static void testcase9() {
									
				int testdata=6;
				String actual_result=obj.checkdays(testdata);
				String expected_result="Saturday";
					
				if(actual_result.equals(expected_result)) {
						
					System.out.println("Tescase#9:Test Pass");
					
					
				}
										
				
	    }
			
	 
	    //TestCase#10:Verify with TestData "7"
				
	    public static void testcase10() {
									
					
	    	int testdata=7;
			String actual_result=obj.checkdays(testdata);
			String expected_result="Sunday";
			if(actual_result.equals(expected_result)) {
						
				System.out.println("Tescase#10:Test Pass");
				
					
			}
										
				
	    }
			
}
