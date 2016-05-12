
public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="aaabbbbccccc";
		
		System.out.println("After removing duplicates--"+removeDuplicates(input));

	}
	
	public static String removeDuplicates(String str){
		
		final StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++){
			String curChar=str.substring(i,i+1);
			if(result.indexOf(curChar)<0){
				result.append(curChar);
			}
		}
		return result.toString();
		
	}

}
