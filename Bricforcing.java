import java.util.*;
import java.io.*;

public class Bricforcing implements Hacking{

 	private File file=new File("code.txt");

	public Bricforcing(){

	}

	public void setFile(File t_test){
		this.file=t_test;
	}

	public File getFile(){
		return this.file;
	}

	public void CrackerWay(Compte compte){
		int taille=compte.getLength();
		String line;
		char[] word=new char[62];
		try{
			File fichier=this.file;
			FileReader sc=new FileReader(fichier);
		    BufferedReader read=new BufferedReader(sc);
			line=read.readLine();
			
			int i=0;
			while(line!=null){
				word[i]=line.charAt(0);
				i++;
				line=read.readLine();		
			}
			read.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		int n=62;
		Boolean answer=false;
		int nb=0;
		char[] mdp=new char [taille];
		for (int i=0;i<n ;i++ ) {
			if (nb==2) {
				break;
			}
			mdp[0]=word[i];
			for(int j=0;j<n;j++){
				if (nb==1) {
					nb=2;
					break;
				}
				mdp[1]=word[j];
				for(int k=0;k<n;k++){
					if (nb==3) {
						nb=1;
						break;
					}
					if (taille>=3) {
						mdp[2]=word[k];
						answer=compte.test(String.valueOf(mdp));
						if (answer==true) {
							System.out.print("Mot de passe trouve en : ");
							nb=1;
							break;
						}
					}
					for (int l=0;l<n ;l++ ) {
						if (nb==4) {
							nb=3;
							break;
						}
						if (taille>=4) {
							mdp[3]=word[l];
							answer=compte.test(String.valueOf(mdp));
							if (answer==true) {
								System.out.print("Mot de passe trouve en : ");
								nb=3;
								break;
							}
						}else
							break; 						
						for (int d=0;d<n ;d++) {
							if (nb==5) {
								nb=4;
								break;
							}
							if (taille>=5) {
								mdp[4]=word[d];
								answer=compte.test(String.valueOf(mdp));
								if (answer==true) {
									System.out.print("Mot de passe trouve en : ");
									nb=4;
									break;
								}
							}else break;
							for (int r=0;r<n ;r++ ) {
								if (nb==6) {
									nb=5;
									break;
								}
								if (taille>=6) {
									mdp[5]=word[r];
									answer=compte.test(String.valueOf(mdp));
									if (answer==true) {
										System.out.print("Mot de passe trouve en : ");
										nb=5;
										break;
									}
								}else break;
								for (int m=0;m<n ;m++ ) {
									if (nb==7) {
										nb=6;
										break;
									}
									if (taille>=7) {
										mdp[6]=word[m];
										answer=compte.test(String.valueOf(mdp));
										if (answer==true) {
											System.out.print("Mot de passe trouve en : ");
											nb=6;
											break;
										}
									}else break;
									for (int p=0;p<n ;p++ ) {
										if (nb==8) {
											nb=7;
											break;
										}
										if (taille>=8) {
											mdp[7]=word[p];
											answer=compte.test(String.valueOf(mdp));
											if (answer==true) {
												System.out.print("Mot de passe trouve en : ");
												nb=7;
												break;
											}
										}else break;
										for (int s=0;s<n ;s++ ) {
											if (taille==9) {
												mdp[8]=word[s];
												answer=compte.test(String.valueOf(mdp));
												if (answer==true) {
													System.out.print("Mot de passe trouve en : ");
													nb=8;
													break;
												}
											}else break;
										}
									}
								}
							}
						}
					}
				}
			}
		}
			
	}
}