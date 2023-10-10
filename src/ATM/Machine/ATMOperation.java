package ATM.Machine;

public interface ATMOperation {
     public void viewBalance();
     public void withDrawAmount(double withdrawAmount) throws IllegalArgumentException;
     public void depositAmount(double depositAmount) throws IllegalArgumentException;
     public void viewMiniStatement();
}
