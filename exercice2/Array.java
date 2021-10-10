package exercice2;

import java.util.Random;

public class Array{
	public char [] tab ;
	
	//constructor
	public Array() { 
		tab= new char[10000000];
	}
	
	// method add to add an element l in the position i
	public void add(char l,int i) {tab[i]= l;}
	
	public static void main(String [] args) {
		Array o1=new Array();
		
		Random r= new Random();
		char c = (char)(r.nextInt(26)+97);  //To generate a random char in a-z:
		long start = System.currentTimeMillis(); // beginning of execution time 
		o1.add(c,0);
		
		for (int i=1;i<10000000;i++) {
			Random random= new Random();
			char ch = (char)(random.nextInt(26)+97);
			o1.add(ch,i);
		}
		
		
		
		long finish = System.currentTimeMillis(); // end of execution time
		long t = finish-start; // execution time 
		System.out.println("Le temps d'execution pour un array est : "+t +"ms" );
	}
	
	
	

}
