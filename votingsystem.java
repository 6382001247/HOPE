import java.util.Scanner;
class votingsystem
{
    public static void main (String ar[])
    {
        int hope=0, kuttie=0;
        int age;
     Scanner input=new Scanner(System.in);
     System. out. println("your name");
     String name=input.next();
     System. out. println ("your age");
     age=input. nextInt();
     if (age>=18)
     {
         System. out. println("whom you're voteing");
         System. out. println("hope");
         System. out. println("kuttie");
         int selection=input.nextInt() ;
         if(selection==1)
         {
             hope++;
         }
         else if (selection==2)
         {
             kuttie++;
         }
         System. out. println("thankyou");
     }
     else 
     {
     System. out. println("you are not eligible to vote");
    }
    System. out. println ("hope"+hope);
    System. out. println("kuttie"+kuttie);
}
}