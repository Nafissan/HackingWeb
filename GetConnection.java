import java.net.*;
import java.io.*;
public class GetConnection{

    private String url="http://localhost/test.php";

    public GetConnection(){}

    public void settURL(String url){this.url=url;}

    public String getURL(){return this.url;}

    public Boolean testPassword(String password){

        Boolean response=false;
        try{
            URL url=new URL(this.url+"?pass="+password);
            HttpURLConnection urlCon=(HttpURLConnection) url.openConnection();
            urlCon.setRequestMethod("GET");
            try(BufferedReader in=new BufferedReader(new InputStreamReader(urlCon.getInputStream()))){
                String urlString="";
            while((urlString=in.readLine())!=null){
                if(urlString.equals("false")) response=false;
                else if(urlString.equals("true")) response=true;
            }
            }  
        }catch(IOException e){
            e.printStackTrace();
        }
        return response;
    }
    public int getLength(){
        String urlString="";
        int i=0;
        String longueur="";
        String carc="";
        try{
            URL url=new URL(this.url);
            HttpURLConnection urlCon=(HttpURLConnection) url.openConnection();
            urlCon.setRequestMethod("GET");
            try(BufferedReader in=new BufferedReader(new InputStreamReader(urlCon.getInputStream()))){
                while((urlString=in.readLine())!=null){                    
                    ++i;
                    if(i==10){
                        longueur=urlString;
                    }
            }
            }  
        }catch(IOException e){
            e.printStackTrace();
        }
        carc=longueur.substring(46,longueur.length()-2);
        return carc.length();
    }
}