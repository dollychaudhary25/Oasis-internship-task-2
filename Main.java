import java.util.*;

import javax.swing.text.View;
public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op= new AtmOperationImpl();
        int Accountnumber=12345;
        int Atmpin=9363;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name: ");
        String Name=sc.nextLine();
        System.out.print("enter the AccountNumber: ");
        int AccountNumber=sc.nextInt();
        System.out.print("enter the AtmPin: ");
        int AtmPin=sc.nextInt();
        if((Accountnumber==AccountNumber)&&(Atmpin==AtmPin)){
            while(true){
                System.out.println(" 1.View Available balance\n 2.Deposite Amount\n 3.Withdraw Amount\n 4.View Ministatement\n 5.Exit");
                System.out.println("Enter the choice:");
                int choice =sc.nextInt();
                switch (choice){
                    case 1:System.out.println("View Available balance");
                    op.viewBalance();
                    break;
                    case 2:System.out.print("Enter Amount to Deposite:");
                    int depositeAmount=sc.nextInt();
                    op.depositeAmount(depositeAmount);

                    break;
                    case 3:System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount= sc.nextInt();
                    op.withdrawAmount(withdrawAmount);
                    break;
                    case 4: System.out.println("MiniStatement");
                    op.viewMiniStatement();
                    break;
                    default:System.out.println("Invalid choice!");
                    
                } 


                
            }

        }
        else{
            System.out.println("Invalid Accnumber and Atmpin:");
        }
        
    }

}



   
     


    
