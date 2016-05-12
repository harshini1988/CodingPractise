import java.util.Arrays;


public class StringbuilderImpl {
	
	private char[] charBuffer;
	private int curIndex=0;
	
	public StringbuilderImpl(){
		charBuffer=new char[10];
	}
	
	public void add(String anotherString){
		if(anotherString !=null){
			char[] charArray=anotherString.toCharArray();
			int charArraylength=charArray.length;
			if(overflow(charArraylength)){
				charBuffer=Arrays.copyOf(charBuffer, newLength(charArraylength));
			}
			for(int i=0;i<charArraylength;i++){
				charBuffer[curIndex++]=charArray[i];
			}
		}
	}
	
	public int newLength(int newArrayLength){
		return (charBuffer.length + newArrayLength) + 10;
	}
	
	public boolean overflow(int arraylength){
		return ((arraylength+curIndex) > charBuffer.length);
	}

}
