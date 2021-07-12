import java.util.Arrays;
import java.util.Scanner;
class StringFact{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of test cases: ");
	int t = sc.nextInt();
       while(t > 0){
	      String str = sc.next();
	      int[] count = new int[256];
	      int len = str.length();
          int arrlen = 0;
	      for(int i = 0 ; i < len ; i++ ){
		    if(count[str.charAt(i)] == 0){
			  arrlen++;
			  count[str.charAt(i)]++;
		    }
		    else{
		      count[str.charAt(i)]++;
		    }
		   
	      }
	      int[] arr = new int[arrlen];
    
          int j = 0;

	      for(int i = 0 ;i < 256;i++){
		     if(count[i] != 0){
			   arr[j] = count[i];
			   j++;
		     }
	      }

	      Arrays.sort(arr);

          int fib = 0;
         
	      for(int i = 2 ; i < arrlen ; i++){
		     if(arr[i] == arr[i-1] + arr[i-2]){
			   fib++;
		     }
	      }

	      if(fib != 0 || arrlen < 2){
		    System.out.println("Dynamic");
	      }
	      else{
		    System.out.println("Not");
	      }
	      t--;
        }
}
}
