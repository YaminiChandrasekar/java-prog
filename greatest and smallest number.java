
//greatest of three number 
 
import java.util.Scanner;  
public class LargestNumberExample1  
{  
public static void main(String[] args)   
{  
int a, b, c, largest, temp;  
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
temp=a>b?a:b;  
largest=c>temp?c:temp;  
System.out.println("The largest number is: "+largest);  
}  
} 


output:
java -cp /tmp/TUkI6Ia8VF LargestNumberExample1
Enter the first number:
5
Enter the second number:
6
Enter the third number:
9
The largest number is: 9


//smallest of three number


import java.util.Scanner;  
public class SmallestNumberExample1  
{  
public static void main(String[] args)   
{  
int a, b, c, smallest, temp;   
Scanner sc = new Scanner(System.in);    
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();   
temp=a<b?a:b;  
smallest=c<temp?c:temp;  
System.out.println("The smallest number is: "+smallest);  
}  
}  



output:

java -cp /tmp/tm7VKWag2u SmallestNumberExample1
Enter the first number:
5
Enter the second number:
3
Enter the third number:
7
The smallest number is: 3
