package vendormachine.vendors.item;

public class Snack implements Item{

    public String name;
    private float price;

    public Snack(float creditCost){
        this.price = creditCost;
    }

    public Snack(String name, float creditCost){
        this.name = name;
        this.price = creditCost;
    }
    
	//==================
	//===	Methods
	//==================

    public float cost(){
        return this.price;
    }

    public void setValue(float cost){
        this.price = cost;
    }

}
