import java.net.*;
import java.io.*;
public class Compte{

	private String login;
	private String password;

	public Compte(){

	}

	public void setLogin(String t_log){
		this.login=t_log;
	}
	public void setPass(String mdp){
		this.password=mdp;
	}

	String getLogin(){
		return this.login;
	}

	String getPass(){
		return this.password;
	}

    int getLength(){
        GetConnection connection=new GetConnection();
        int longueur=connection.getLength();
        return longueur;
    }

	Boolean test(String password){
        GetConnection connection=new GetConnection();
        Boolean response=connection.testPassword(password);
        return response;
    }
}