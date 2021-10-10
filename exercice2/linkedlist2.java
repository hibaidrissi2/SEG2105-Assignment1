package exercice2;

import java.util.LinkedList;
import java.util.Random;
public class linkedlist2 {
	public static void main(String args[]) {
		LinkedList list=new LinkedList();
		
		Random r= new Random();
		char c = (char)(r.nextInt(26)+97);//To generate a random char in a-z:
		long start = System.currentTimeMillis();// beginning of execution time 
		list.add(c);
		
		for (long i=1;i<10000000;i++) {
			Random random= new Random();
			char ch = (char)(random.nextInt(26)+97);
			list.add(ch);
		}
		
		

		long finish = System.currentTimeMillis();// end of execution time
		long t = finish-start;// execution time 
		System.out.println("Le temps d'execution pour une Linkedlist est : "+t +"ms" );
	}
	
	
	}

