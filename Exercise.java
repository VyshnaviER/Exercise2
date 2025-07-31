import java.util.Scanner;
public class SumofOddandEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of data:");
		int array_size=sc.nextInt();
		int[] n=new int[array_size];
		System.out.print("Enter the numbers");
		int even=0;
		int odd=0;
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
			if(n[i]%2==0) {
				even=even+n[i];}
			else
			{
				odd+=even+1;
			}
		}
		System.out.print("Even:"+even);
		System.out.print(" Odd:"+odd);
		
sc.close();
	}}
