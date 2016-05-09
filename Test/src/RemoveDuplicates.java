import java.util.Arrays;


public class RemoveDuplicates {
	int r=0;

	public static void main(String args[]){
		int[] inputArray={1,3,3,4,5,5,6,6};
		int[] outputArray=removeDuplicates(inputArray);
		
		for(int i:outputArray){
			System.out.println(i);
		}
		
	}
	
	public static int[] removeDuplicates(int[] input){
		//return if array lenght is less than 2
		int i=0;
		int j=1;
		
		if(input.length < 2){
			return input;
		}
		
		while(j<input.length){
			if(input[i]==input[j]){
				j++;
			}
			else{
				i++;
				input[i]=input[j];
				j++;
			}
		}
		
		int[] B = Arrays.copyOf(input, i + 1);
		 
		return B;
		
	}
}
