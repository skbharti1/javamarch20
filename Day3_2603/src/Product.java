
public class Product {

	private int productId;		//properties/instance variables
	private String pName;
	private double price;
	
	//constructor method is invoked automatically when object is created
	
	
	//by default there's always a default constructor in every class, 
	//which initializes default values to the data members/properties
	
	//you can have a parameterized constructor 
	
	public Product(int productId, String pName, double price) {
 		this();
		this.productId = productId;
		this.pName = pName;
		this.price = price;
		
		System.out.println("Product object is initialized with the given values");
	}

	public Product() {
		
		System.out.println("Product object is created");
	}

	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	} 
	
}
