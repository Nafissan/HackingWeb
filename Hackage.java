import java.util.Scanner;

import java.sql.Date;

public class Hackage{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choisissez une methode (1 ou 2)!");
		int way=sc.nextInt();
		long timer=System.currentTimeMillis();
		Hacking cracker=FactoryHacking.hackingWay(way);
		cracker.CrackerWay();
		System.out.println(((System.currentTimeMillis()-timer))+"ms");
	}
}
