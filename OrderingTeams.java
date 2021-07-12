import java.util.Scanner;

public class OrderingTeams {

	public static void main(String[] args) {
		//Test case 1
//		int a1 [] = {1,2,3};  
//		int a2 [] = {2,3,4,};
//		int a3 [] = {2,3,5};
		//Test case 2
		int a1 [] = {1,2,3};
		int a2 [] = {2,3,4,};
		int a3 [] = {2,3,4};
		//Test case 3
//		int a1 [] = {5,6,5};
//		int a2 [] = {1,2,3,};
//		int a3 [] = {2,3,4};
		
		int cnt1 =0;
		int cnt2 =0;
		int cnt3 =0;
		 
		for (int i = 0; i < a3.length; i++)
		{
			if(a1[i] == a2[i] )
			{
				cnt1++;
			}
			if( a2[i]==a3[i] )
			{
				cnt2++;
			}
			if( a1[i] == a3[i])
			{
				cnt3++;
			}
		}
		
		if(cnt1 == a1.length || (cnt2 == a2.length || cnt3 == a3.length))
			System.out.println("No");
		else
			System.out.println("Yes");
	}

}
