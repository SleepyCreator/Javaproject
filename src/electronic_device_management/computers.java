package electronic_device_management;

public class computers extends devices{
	public void input() {
		super.input();
	}

	public computers(int id, String color, int year, String name, int quality, double price, double discount) {
		super(id, color, year, name, quality, price, discount);

	}

	public double discount() {
		if(this.quality>=100)
			return this.discount=this.quality*this.price*0.1;
		else
			return this.discount=this.quality*this.price;
	}
	public computers() {
		
	}
	public String toString() {
		return "Computer: "+super.toString()+" Discount : "+this.discount;
	}
	
}
