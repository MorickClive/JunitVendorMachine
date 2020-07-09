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
    	// if our wallet exists.
        if(myWallet != null) {
        	
        	// If what we are trying to retrieve our money within our limits
        	if(retrieve <= myWallet.getAllCredit()) {
				return this.myWallet.getCredit(retrieve);
        	}else {
        		System.out.println("WARNING: "+this.name+" does not have the required credit!");
        		System.out.println("WARNING: Available credit: "+this.myWallet.getAllCredit());
        		return 0;
        	}
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
