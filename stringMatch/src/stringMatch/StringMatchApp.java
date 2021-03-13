package stringMatch;

public class StringMatchApp {

	public static void main(String[] args) {
		int result = stringMatch(xxcaazz, xxbaaz);
	System.out.println(result);

	}
	
	public int stringMatch(String a, String b) {
		int counter = 0;
		
		for(int i = 0; ((i < a.length() - 2) && (i < b.length() - 2 )); i++) {
			
			String aSubString = a.substring(i, i + 2);
			String bSubString = b.substring(i, i + 2);
			
			if(aSubString.equals(bSubString)) {
				counter++;
			}
		}
		return counter;
	}

}
