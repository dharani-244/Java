import java.util.Scanner;
import java.io.*;
public class Exception_Handling{

       static void readFile() throws IOException
        {
            FileReader fr=new FileReader("Pattern.java");
            System.out.println("File Opened");
        }
    
    public static void main(String[] args)
    {
        try{
            readFile();
        }catch( IOException e){
            System.out.println("something went wrong");
        }


       /*  Scanner get=new Scanner(System.in);
        System.out.print("enter your age : ");
        int age=get.nextInt();
        if(age<18){
            throw new ArithmeticException("not Eligible to vote");
        
        }
        System.out.println("the person is eligible to vote");*/
       
    }
}


/* System.out.print("enter num1 value : ");
        int num1=get.nextInt();
        System.out.print("enter num2 value : ");
        int num2=get.nextInt();
        
        try{
            System.out.println("the division value : "+(num1/num2));

        }catch(ArithmeticException e){
            System.out.println("no number can be divided by zero");
             System.out.print("enter num1 value : ");
             num1=get.nextInt();
             System.out.print("enter num2 value : ");
             num2=get.nextInt();
             System.out.println("the division value : "+(num1/num2));

        }
        finally{
            System.out.println("program executed successfully");
        }
 */