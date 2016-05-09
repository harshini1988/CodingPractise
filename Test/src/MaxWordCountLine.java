import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class MaxWordCountLine {
	
	private int curMaxCount=0;
	List<String> lines=new ArrayList<String>();
	
	
	

	public int getCurMaxCount() {
		return curMaxCount;
	}




	public void setCurMaxCount(int curMaxCount) {
		this.curMaxCount = curMaxCount;
	}




	public List<String> getLines() {
		return lines;
	}




	public void setLines(List<String> lines) {
		this.lines = lines;
	}


	public void readMaxLine(String fileName){
		FileInputStream fis=null;
		DataInputStream dis=null;
		BufferedReader br=null;
		
		try {
			
			fis=new FileInputStream(fileName);
			dis=new DataInputStream(fis);
			br=new BufferedReader(new InputStreamReader(dis));
			String line=null;
			
			while((line=br.readLine())!=null){
				int count=(line.split("\\s+")).length;
				if(count > curMaxCount){
					lines.clear();
					lines.add(line);
					curMaxCount=count;
				}
				else if(count == curMaxCount){
					lines.add(line);
				}
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
            try{
                if(br != null) br.close();
            }catch(Exception ex){}
		}
		
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MaxWordCountLine mx=new MaxWordCountLine();
     String filepath="C:/Users/c_hgarik/Documents/Workspace/fusemaster_Workspace_TestLearn/Test/src/sample.txt";
     mx.readMaxLine(filepath);
     System.out.println("Max word count is--"+mx.getCurMaxCount());
     List<String> li=mx.getLines();
     System.out.println("the line is--");
     for(String l:li){
    	 System.out.println(l);
     }
     
	}

}
