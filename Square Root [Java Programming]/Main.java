import java.util.Scanner;  
class Main   
{  
    public static void main(String[] args)    
    {   
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        System.out.println(squareRoot(n));  
    }  

public static double squareRoot(int num)   
{  
    double prev;  
    double sqrt=num/2;  
   //Try out your code here
  sqrt= Math.sqrt(num); 
    return sqrt;  
    }  
}  
