import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;


public class DistinctiveWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is a test program asdddddddddddddddddddddddddddd";
		
		int count=(str.split("\\s+")).length;
		
		String[] ch=str.split("\\s+");
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] charray=str.toCharArray();
		
		for(char c:charray){
			
			int n=map.get(c);
			map.put(c, n++);
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			System.out.println("key--"+entry.getKey()+"value--"+entry.getValue());
	
		}	
	
	}

}
