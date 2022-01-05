package program.checkdays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckdaysMain {
	
		static Checkdays obj=new Checkdays();
	
	 
		/*public static void main(String[] args) {
		
				
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
		}*/
		@Test
		//TestCase#1:Verify with testData '0'
		public static void testcase1() {
			
			int testdata=0;
			
			String actual_result=obj.checkdays(testdata);
			String expected_result="Invalid";
			Assert.assertEquals(actual_result,expected_result,"Testcase#1");
			
			
		}
		//TestCase#2:Verify with negative number
		@Test
		public static void testcase2() {
			
			int testdata=-1;
			
			String actual_result=obj.checkdays(testdata);
			String expected_result="Invalid";
			Assert.assertEquals(actual_result,expected_result,"Testcase#2");
				
		}
		
		//TestCase#3:Verify with Large number
		@Test
		public static void testcase3() {
					
			int testdata=1354546657;
					
			String actual_result=obj.checkdays(testdata);
			String expected_result="Invalid";
			Assert.assertEquals(actual_result,expected_result,"Testcase#3");
						
		}
		
		//TestCase#4:Verify with TestData "1"
		@Test
		public static void testcase4() {
							
			int testdata=1;
							
			String actual_result=obj.checkdays(testdata);
			String expected_result="Monday2";
			Assert.assertEquals(actual_result,expected_result,"Testcase#4");
								
		}
		
		//TestCase#5:Verify with TestData "2"
		@Test
		public static void testcase5() {
									
			int testdata=2;
									
			String actual_result=obj.checkdays(testdata);
			String expected_result="Tuesday";
			Assert.assertEquals(actual_result,expected_result,"Testcase#5");
										
		}
		
		//TestCase#6:Verify with TestData "3"
		@Test
		public static void testcase6() {
									
					
			int testdata=3;						
			String actual_result=obj.checkdays(testdata);
			String expected_result="Wednesday";
			Assert.assertEquals(actual_result,expected_result,"Testcase#6");
										
				
		}
		//TestCase#7:Verify with TestData "4"
		@Test
		public static void testcase7() {
									
			int testdata=4;
			String actual_result=obj.checkdays(testdata);
			String expected_result="Thursday";
			Assert.assertEquals(actual_result,expected_result,"Testcase#7");
										
		}
		//TestCase#8:Verify with TestData "5"
		@Test
		public static void testcase8() {
									
			int testdata=5;
			String actual_result=obj.checkdays(testdata);
			String expected_result="Friday";
			Assert.assertEquals(actual_result,expected_result,"Testcase#8");						
		}
				
		//TestCase#9:Verify with TestData "6"
		@Test
	    public static void testcase9() {
									
				int testdata=6;
				String actual_result=obj.checkdays(testdata);
				String expected_result="Saturday";
					
				Assert.assertEquals(actual_result,expected_result,"Testcase#9");
										
				
	    }
			
	 
	    //TestCase#10:Verify with TestData "7"
		@Test
		public static void testcase10() {
					
	    	int testdata=7;
			String actual_result=obj.checkdays(testdata);
			String expected_result="Sunday";
			Assert.assertEquals(actual_result,expected_result,"Testcase#10");
										
				
	    }
			
}
