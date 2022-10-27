package labsheet5.exercise4;

public class BankAccount {
    private String owner;
    private int number;
    private static double interestRate;
    private static int count;
    public BankAccount(){
        owner = "Owner Not Available";
        number = 0;
        interestRate = 0;
        //count = 0;
        incrementCount();
    }
    public BankAccount(String owner, double interestRate){
        setOwner(owner);
        setInterestRate(interestRate);
        incrementCount();
        setNumber(number);
    }
    public String getOwner(){

        return owner;
    }
    public int getNumber(){

        return number;
    }
    public static double getInterestRate(){

        return interestRate;
    }
    public static int getCount() {
        return count;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setNumber(int number){

        this.number = number;
    }
    public static void setInterestRate(double interestRate){

        BankAccount.interestRate = interestRate;
    }
    public String toString(){
        return "Owner: " + getOwner() + "  Account Number: " + getNumber() + "  Interest Rate: "+getInterestRate() + "  ID: "+getCount();
    }
    public static void incrementCount(){
        count++;
    }


}
