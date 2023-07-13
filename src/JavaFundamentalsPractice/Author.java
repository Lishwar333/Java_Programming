package JavaFundamentalsPractice;

public class Author {

    String name;
    int Aid;
    Book[] arraybook;

    Author(String name,int Aid,Book[] arraybook){

        this.name = name;
        this.Aid = Aid;
        this.arraybook = arraybook;
    }

    void getDetails() {

        System.out.print("name " +name + "\nAid " + Aid );
        System.out.print("\nBooks:\n" + arraybook[0].Bname + " " + arraybook[0].Bid + 
                "\n" + arraybook[1].Bname + " " + arraybook[1].Bid);

    }

}