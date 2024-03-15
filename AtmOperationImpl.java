import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf{
    ATM atm =new ATM();
    Map<Double,String> ministmt=new HashMap<>();

    public void viewBalance() {
        System.out.println("Available balance:"+atm.getBalance());

    }

    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount<=atm.getBalance()){
            ministmt.put(withdrawAmount,"withdrawAmount");
            System.out.println("Collect your card:"+withdrawAmount);
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();
        }
        else{
            System.out.println("Insufficent Balance");
        }
        
    }

    public void depositeAmount(double depositeAmount) {
        ministmt.put(depositeAmount,"Amount Deposited");
        System.out.println(depositeAmount+"Deposited Successfully!!");
        atm.setBalance(atm.getBalance()+depositeAmount);
        viewBalance();
    
    }

    public void viewMiniStatement() {
        for(Map.Entry<Double,String>m:ministmt.entrySet());
        System.out.println();
    }


}
   
   
   