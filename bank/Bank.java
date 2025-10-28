package bank;
//we make this package same as we import java.util.*; same we can use this in any other file 

class Account{
    public String name;
    protected String email;
    private String password;

//getters & Setters


public String getPassword(){
    return this.password;
}
 public void setPassword(String pass){
    this.password =pass;
}   

}
public class Bank {
    public static void main(String arg[]){
        Account account1 = new Account();
        account1.name="Apna College";
        account1.email="apnacollege@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
