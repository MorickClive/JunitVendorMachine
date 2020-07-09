package vendormachine.vendors;

public class Snack {

    public String name;
    private float creditCost;

    public Snack(float creditCost){
        this.creditCost = creditCost;
    }

    public Snack(String name, float creditCost){
        this.name = name;
        this.creditCost = creditCost;
    }

    public float cost(){
        return this.creditCost;
    }

    public void setValue(float cost){
        this.creditCost = cost;
    }

}
