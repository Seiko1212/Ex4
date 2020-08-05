import java.util.*;

   public class Ex4
 {
     public static void main(String[] args)
     {
	 
	 String[] coins ={"Heads","Tails"};
	 int c;
	 int h=0,t=0;
	 Random r = new Random();
	 Scanner sc = new Scanner(System.in);
	 
	 
           System.out.println("Who are you?");
	   String str = sc.nextLine();
	   System.out.printf("Hello, %s!\n",str);
	  System.out.println("Tossing a coin...");
	 for(int i=0; i < 3; i++)
	     {
		 c= r.nextInt(2);
		 if(c==0) h++;
		 else t++;
		 System.out.printf("Round %d: %s\n",i+1,coins[c]);	 
	     }
	 
	
	 System.out.printf("Heads: %d, Tails: %d\n",h,t);
	 if(h>t) System.out.printf("%s won!\n",str);
	 else System.out.printf("%s lost!\n",str);
     }


}
