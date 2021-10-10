package exercice2;

import java.util.Random;

public class Arraylist {
	public int size;
	public Object array[];
	int index = 0;
	
	// constructor
	public Arraylist(int size){
		this.size=size;
		this.array =new Object[size];
	
	}
	
	// method add to add object obj in the last index
	public void add(Object obj) {
		array[index] = obj ;
		index ++;
		
	}
	
	public static void main(String[] args) {
		Arraylist o2=new Arraylist(10000000);
		
		Random r= new Random();
		char c = (char)(r.nextInt(26)+97);//To generate a random char in a-z:
		long start = System.currentTimeMillis();// beginning of execution time 
		o2.add(c);
		
		for (int i=1;i<10000000;i++) {
			Random random= new Random();
			char ch = (char)(random.nextInt(26)+97);
			o2.add(ch);
		}
		
		
		
		long finish = System.currentTimeMillis();// end of execution time
		long t = finish-start;// execution time 
		System.out.println("Le temps d'execution pour un arraylist est : "+t +"ms" );
	}
	

	}
	

