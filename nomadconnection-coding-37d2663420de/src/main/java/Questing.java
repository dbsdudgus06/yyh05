/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		// FIXME

		double a;
		  a = Math.round(d/2);
		  return (int) a;  
		
	}


	
	static boolean quest2(String s) {
		// FIXME
		
		String s1;
				
		s1 = "({}[])";		
		
		if(s.equals(s1))
			return true;
		else
			return false;
	}
}

