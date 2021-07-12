import java.util.Scanner;
public class Beautiful_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Cases");
		int n = sc.nextInt();
		for(int k  =1; k<= n; k++)
		{
			System.out.println("Enter Size Of Array");
			int size = sc.nextInt();
			
		int [] a = new int [size];
		System.out.println("Enter "+size+" Element");
		for (int i = 0; i < size; i++)
		{
			a[i] = sc.nextInt();
		}
		boolean flag = true;
			for (int i = 0; i < a.length; i++) 
			{
				for (int j = i+1; j < a.length; j++) 
				{
					int temp =a[i]*a[j];
					if(temp== a[i] || temp == a[j])
						flag = false;
				}
			}
		if(!flag)
			System.out.println("Yes");
		else
			System.out.println("No");
		}
	}
}