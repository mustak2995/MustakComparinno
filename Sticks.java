import java.util.Scanner;

public class Sticks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No cases");
		int n = sc.nextInt();
		for(int k=1; k<=n; k++)
		{
			System.out.println("Enter size of array");
			int size = sc.nextInt();
			int [] a = new int[size];
			System.out.println("Enter "+size+" Element");
			for (int i = 0; i < a.length; i++) 
			{
				a[i] = sc.nextInt();
			}
			int j = a.length-1;
			int cnt=0;
			for (int i = 0; i < a.length/2; i++) 
			{
				if(a[i] == a[j--] && a[0]==1 && a[1]==2)
					cnt++;
			}
			if(cnt == (a.length-1)/2)
				System.out.println("-1");
			else
				System.out.println("2");
		}
	}

}
