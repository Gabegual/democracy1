package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
	 
		while(true) {
			String digits = readLine("Enter a numeric string:  ");
			if (digits.length() == 0)
				break;
			println(addCommasToNumericString(digits));
		}
	}
		private String addCommasToNumericString(String digits) {
			String comm = "";
			int len = digits.length();
			
			if(digits.length() >= 3) {
				for(int i = 0; i < digits.length(); i++) {
					len--;
				if(len<0) {
					len = 0;
				}
				if(i % 3 ==0 && i !=0) {
					comm +=(",");
				}
				comm += digits.charAt(len);
				}
				return(new StringBuilder(comm).reverse().toString());
			}else {
				return digits;
			}
		}
}
