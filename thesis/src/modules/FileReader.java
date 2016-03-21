package modules;

import java.io.BufferedReader;

public class FileReader {
	BufferedReader br;
	String filename;
	String content;
	
	public FileReader(String filename){
		this.filename = filename;
	}
	
	public String getContentFromFile(){
		String content = null;
		br = null;
		try{
			String line;
			br = new BufferedReader(new java.io.FileReader(filename));
			while((line=br.readLine()) != null){
				content += line;
			}
			
		} catch (Exception e){
			System.err.println("hiba tortent a file beolvasasanal!");
			e.printStackTrace();
		} finally {
			try{
				if(br != null){
					br.close();
				}
			} catch(Exception e){
				System.err.println("hiba tortent a fileolvaso bezarasanal");
				e.printStackTrace();			
			}
		}
		
		
		
		
		return content;
	}
	
	
	
}
