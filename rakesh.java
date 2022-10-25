
import java.util.*;
class rakesh {
    public static void main(String args[]){

         String name,Password = "984868";

         //declare and initialize balance, withdraw, and deposit  
           long balance = 0 , withdraw,deposit;

         //create scanner class object to get details of user  
         Scanner sc = new Scanner(System.in);

         System.out.print("Please Enter Your Name :");

         name = sc.nextLine();

         System.out.print(" Hello " + name + " Please Enter Your PIN :");

         Password = sc.nextLine();

         switch(Password){
            case "984868":
        
           
         while(true)  
         {  
             System.out.println("ATM");  
             System.out.println("Choose 1 for Withdraw");  
             System.out.println("Choose 2 for Deposit");  
             System.out.println("Choose 3 for Check Balance");  
             System.out.println("Choose 4 for EXIT");  
             System.out.print("Choose the operation you want to perform:");  
               
             //get choice from user  
             int choice = sc.nextInt();  
             switch(choice)  
             {  
                 case 1:  
         System.out.print("Enter money to be withdrawn:");  
                       
         //get the withdraw money from user  
         withdraw = sc.nextInt();  
                       
         //check whether the balance is greater than or equal to the withdraw amount  
         if(balance >= withdraw)  
         {  
             //remove the withdraw amount from the total balance  
             balance = balance - withdraw;  
             System.out.println("Please collect your money");  
         }  
         else  
         {  
             //show custom error message   
             System.out.println("Insufficient Balance");  
         }  
         System.out.println("");  
         break;  
    
                 case 2:  
                       
         System.out.print("Enter money to be deposited:");  
                       
         //get deposite amount from to user  
         deposit = sc.nextInt();  
                       
         //add the deposit amount to the total balance  
         balance = balance + deposit;  
         System.out.println("Your Money has been successfully deposited");  
         System.out.println("");  
         break;  
    
                 case 3:  
         //displaying the total balance of the user  
         System.out.println("Balance : "+balance);  
         System.out.println("");  
         break;  
    
                 case 4:  
          System.out.println("I Hope You Have Great Day ThankYou For Choosing Us !!");  
             }  
         }  

                  //displaying the Wrong password of the user  

         default:
         System.out.println(" Your Password is Invalid " +name+ " Try Again!! ");
         System.out.println();
         break;
     }  
    }
}
