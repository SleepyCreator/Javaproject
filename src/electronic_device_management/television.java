package electronic_device_management;

public class television extends devices {
	public void input() {
		super.input();
	}
	
	public television(int id, String color, int year, String name, int quality, double price, double discount) {
		super(id, color, year, name, quality, price, discount);
	}

	public television() {
		
	}
	public double discount() {
		if(this.quality>=150)
			return this.discount=this.quality*this.price*0.2;
		else
			return this.discount=this.quality*this.price;
	}
	@Override
	public String toString() {
		return "Television: "+super.toString()+" Discount : "+this.discount;
	}
}
