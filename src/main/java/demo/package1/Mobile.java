package demo.package1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Component("mob") // user defined id
@Lazy // To define a bean lazy loaded
@Scope("prototype") // to change to default scope
public class Mobile {

	@Value("POCO") // Field Injection
	private String brand;
	private String color;
	private double price;

	public Mobile(@Value("XI") String brand,@Value("Black") String color,@Value("513101.651") double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Value("Apple")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}

}
