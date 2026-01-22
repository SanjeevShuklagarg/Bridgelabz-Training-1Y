import java.util.Scanner;
class Operator{
	public static void main(String ... args){
		// first .....................................................
		int i = 0;
		System.out.print("Value1 " + i+ "\n");
		i++;
		System.out.print("Value2 " + i++ + "\n");
		System.out.print("Value3 " + i + "\n");
		++i;
		System.out.print("Value4 "+i++ + "\n");
		System.out.print("Value5 " + i++ + "\n");
		int z = i + i++ + ++i + i + ++i + i++;
		System.out.print("Value6 " + z);
		
		
		// Second ....................................................
		
	for(i=0;i<10;i++){
		System.out.print(" \n i: " + i);
	}
	
	 int j=10;
	 while(j>0){
		 System.out.print(" \n j: " + j);
		 j--;
	 }
	
	
	}
}
		
	