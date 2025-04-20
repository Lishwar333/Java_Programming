package JavaFundamentalsPractice;

public class Author extends AuthorAssociation{

	String name;
	int age;
	String origin;
	
	public Author(String name, int age, String origin) {
		super();
		this.name = name;
		this.age = age;
		this.origin = origin;
	
	}
	
	public String getName() {
		
		return name;
	}

	@Override
	public void AssoociationName() {
		// TODO Auto-generated method stub
		System.out.println("World Writing Association");
	}
   

}