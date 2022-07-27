import java.util.*;
import java.io.*;

public class Dictionary implements Hacking{
 
 	private File file=new File("password.txt");
	public Dictionary(){

	}
	public void setFile(File t_test){
		this.file=t_test;
	}

	public File getFile(){
		return this.file;
	}

	public void CrackerWay(Compte compte){
		String line;
		int n=0;
		String psswd=compte.getPass();
		try{
			File fichier=this.file;
			FileReader sc=new FileReader(fichier);
		    BufferedReader read=new BufferedReader(sc);
			line=read.readLine();
			while(line!=null){
				if (line.equals(psswd)) {
					System.out.println("Mot de passe trouve");					
					n=1;
					break;
				}
				line=read.readLine();
			}
			if (n==0) {
				FileWriter lire =new FileWriter(fichier.getAbsoluteFile(),true);
		    	lire.write("\n"+psswd);
		    	lire.close();
				System.out.println("mot de passe non trouve!");	
			}
			read.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}