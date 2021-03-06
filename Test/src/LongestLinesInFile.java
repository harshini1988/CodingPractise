import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class LongestLinesInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br =null;
		String filepath="C:/Users/c_hgarik/Documents/Workspace/fusemaster_Workspace_TestLearn/Test/src/sample.txt";
		
		int topList=0;
		Set<Entries> lineSet=new TreeSet<Entries>(new CompareLine());
		
		try {
			br=new BufferedReader(new FileReader(new File(filepath)));
			String line=br.readLine();
			 topList = Integer.parseInt(line.trim());
			 while((line = br.readLine()) != null){
	                line = line.trim();
	                if(!"".equals(line)){
	                	lineSet.add(new Entries(line, line.length()));
	                }
	            }
	            int count = 0;
	            for(Entries ent:lineSet){
	                System.out.println(ent.line);
	                if(++count == topList){
	                    break;
	                }
	            }
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
  
		
		
	}
	
	public static class Entries{
		Integer length;
		String line;
		Entries(String line,Integer l){
			this.line=line;
			this.length=l;
		}
	}
	
	public static class CompareLine implements Comparator<Entries>{
		
		public int compare(Entries e1,Entries e2){
			if(e2.length > e1.length)
				return 1;
			else 
				return -1;
		}
		
	}

}
