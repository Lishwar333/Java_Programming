package JavaFundamentalsPractice;

public class Book implements BookInterface { 

	String name;
	private float price;
	Author []auth;
	public Book(String name, float price, Author[] auth) {
		super();
		this.name = name;
		this.price = price;
		this.auth = auth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Author[] getAuth() {
		return auth;
	}
	public void setAuth(Author[] auth) {
		this.auth = auth;
	}
	@Override
	public void BookPublication() {
		// TODO Auto-generated method stub
		System.out.println("Sport Publications");
		
	}
	
}