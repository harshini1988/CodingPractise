
public class BinaryNumber {

	public static void main(String[] args) {
		BinaryNumber obj=new BinaryNumber();

		System.out.println("Is 1010 Binary-- "+obj.isBinary(1010));
	}

	public boolean isBinary(int number){
		boolean status = true;
		
		
		while(true){
			if(number ==0)
			{	break;
			}
			else{
				int tmp=number%10;
				System.out.println(tmp);
				if(tmp > 1){
					status = false;
					break;
				}
				number=number/10;
			}
		}
		return status;
	}
}
