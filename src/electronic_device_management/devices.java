package electronic_device_management;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.security.DrbgParameters.NextBytes;
import java.util.*;
public class devices  {
	Scanner sc =new Scanner(System.in);
	private int id,year;
	private String color,name;
	protected double price;
	protected double discount,quality;
	public void input() {
		System.out.println("Product code: ");
		id=sc.nextInt();
		System.out.println("Color: ");
		sc.nextLine();
		color=sc.nextLine();

		System.out.println("Year of manufacture: ");
		year=sc.nextInt();
		System.out.println("Quality: ");
		quality=sc.nextInt();
		System.out.println("Name of the factory: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Unit price: ");
		price=sc.nextDouble();
	}
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	protected String getColor() {
		return color;
	}
	protected void setColor(String color) {
		this.color = color;
	}
	protected int getYear() {
		return year;
	}
	protected void setYear(int year) {
		this.year = year;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getPrice() {
		return price;
	}
	protected void setPrice(double price) {
		this.price = price;
	}
	protected double getDiscount() {
		return discount;
	}
	protected void setDiscount(double discount) {
		this.discount = discount;
	}
	public devices(int id, String color, int year, String name, int quality, double price, double discount) {
		super();
		this.id = id;
		this.color = color;
		this.year = year;
		this.name = name;
		this.quality = quality;
		this.price = price;
		this.discount = discount;
	}
	public devices() {
		this.id=0;
		this.color="";
		this.year=0;
		this.name="";
		this.quality=0;
		this.price=0;
		this.discount=0;
	}
	public String toString() {
		return " Product code: " + id + ", color : " + color + ", Year of manufacture: " + year + ", Name of the factory: " + name + ", quality: " + quality
				+ ", price=" + price;
	}
	
}
