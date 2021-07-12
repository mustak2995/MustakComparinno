import java.util.Scanner;

public class Cat_Dogs {

	public static void main(String[] args) {
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of test cases");
		int t=sc.nextInt();
		for (int j = 0; j <t; j++)
		{
			System.out.println("Enter elements ");
			int c=sc.nextInt();
			int d=sc.nextInt();
			int l=sc.nextInt();
			
			if(l%4==0)
			{
				if(c<=2*d)
				{
					if(l>=4*d&&l<=(c+d)*4)
						System.out.println("Yes");
					else
						System.out.println("No");
				}
				else if(c>2*d)
				{
					if(l>=(d+c-2*d)&&l<=4*(c+d))
						System.out.println("Yes");
					else
						System.out.println("No");
				}
			}
			else
				System.out.println("No");
		}
		
	}

}
