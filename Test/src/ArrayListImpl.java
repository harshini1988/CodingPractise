import java.util.Arrays;


public class ArrayListImpl {
	
	private Object[] myStore;
	private int actSize=0;
	
	public ArrayListImpl(){
		myStore=new Object[10];
		
	}
	
	public Object get(int index){
		if(index < actSize){
			return myStore[index];
			
		}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void add(Object obj){
		if(myStore.length-actSize<=5){
			increaseLength();
		}
		else{
			myStore[actSize++]=obj;
		}
		
	}
	
	public void increaseLength(){
		myStore=Arrays.copyOf(myStore, myStore.length*2);
		
		System.out.println("new Array length-- "+myStore.length);
	}
	
	public Object remove(int index){
		if(index < actSize){
			Object obj=myStore[index];
			myStore[index]=null;
			int tmp=index;
			while(tmp < actSize){
				myStore[tmp]=myStore[tmp+1];
				myStore[tmp+1]=null;
				tmp++;
			}
			actSize--;
			return obj;
			
			}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	@Override
	public String toString() {
		return "ArrayListImpl [myStore=" + Arrays.toString(myStore)
				+ ", actSize=" + actSize + "]";
	}

	
}
