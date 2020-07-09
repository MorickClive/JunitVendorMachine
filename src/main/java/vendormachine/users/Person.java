package vendormachine.users;

import vendormachine.users.util.Wallet;

public class Person {

    private String name = "";
    private Wallet myWallet = null;

    public Person(String name){
        this.name = name;
        this.myWallet = new Wallet();
    }

    public Person(String name, Wallet wallet){
        this.name = name;
        this.myWallet = wallet;
    }

    //===============================
    //===  'get'ors
    //===============================

    public String getName(){
        return this.name;
    }

    public float getCredit(float retrieve){
        if(myWallet != null) {
            return this.myWallet.getCredit(retrieve);
        }else{
            //TODO replace with Log4j
            System.out.println("WARNING: "+this.name+" does not own a wallet!");
            return 0;
        }
    }

    //===============================
    //===  'set'ors
    //===============================

    public void setName(String name){
        this.name = name;
    }

    public void addCredit(float credit){
        if(myWallet != null) {
            this.myWallet.addCredit(credit);
        }else{
            //TODO replace with Log4j
            System.out.println("WARNING: "+this.name+" does not own a wallet!");
        }
    }
}
