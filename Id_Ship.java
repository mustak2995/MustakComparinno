	import java.util.*;
	import java.lang.*;
	import java.io.*;
	public class Id_Ship {
		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter test cases ");
			int t=scn.nextInt();
			while(t-->0)
			{
				System.out.println("Enter character ");
			    char a=scn.next().charAt(0);
			    if(a=='B' || a=='b')
			    {
			        System.out.println("BattleShip");
			    }
			    else if(a=='C' || a=='c')
			    {
			        System.out.println("Cruiser");
			    }
			    else if(a=='D' || a=='d')
			    {
			        System.out.println("Destroyer");
			    }
			    else{
			        System.out.println("Frigate");
			    }
			}
		}
	}