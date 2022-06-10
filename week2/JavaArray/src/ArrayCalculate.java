import java.util.Scanner;
public class ArrayCalculate {

	public static void main(String[] args) {
		int n, sum = 0,temp=0;
        float average;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        
        // sort
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }               
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(a[i] + " ");    
        }    
        System.out.println();
        System.out.println("Sum:"+sum);
        average = (float)sum / n;
        System.out.println("Average:"+average);

	}

}
