public class FactoryHacking{

	public FactoryHacking(){
		
	}

	public static  Hacking hackingWay(int method){
		Hacking hacker=null;
		if (method==1) {
			hacker=new Bricforcing();
		}else if (method==2) {
			hacker=new Dictionary();
		}else{
            throw new IllegalArgumentException("Unknown method type "+method);
		}
		return hacker;
	}
}