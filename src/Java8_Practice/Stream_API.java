package Java8_Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Products{

    public Products(int id, String name, int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

 

    int id;
    String name;
    int price;
    @Override
    public String toString() {
        return "Products [id=" + id + ", name=" + name + ", price=" + price + "]";
    }

}

public class Stream_API {

    public static List<Products> getProducts(){

        List<Products> getList = new ArrayList<>();
        getList.add(new Products(1, "Godrej", 25));
        getList.add(new Products(2, "Fanta", 20));
        getList.add(new Products(5, "Miranda", 30));
        getList.add(new Products(3, "Good day", 10));
        getList.add(new Products(4, "5star", 5));

        return getList;    
    }

    public static void main(String[] args) {

        //Problem is to get the list of products > 10

        //normal method
        List<Products> list1 = new ArrayList<>();

        for(Products product : getProducts()) {

            if(product.getPrice()>10) {

                list1.add(product);
            }
        }

        for(Products product: list1) {

            System.out.println(product);
        }

        System.out.println();

        //Stream method
        List<Products> list2 = new ArrayList<>();

        list2 = getProducts()
                .stream()
                .filter(product -> product.getPrice()>10)
                .collect(Collectors.toList());
                //.forEach(product -> System.out.println(product));        

        //printing using functional interface. Can also use forEach as above
        Consumer<List<Products>> consumer = System.out::println;
        consumer.accept(list2);

        System.out.println();

        //Sorting the stream

        //1. Sorting based on id

        getProducts().stream().sorted(Comparator.comparing(Products::getId) ).forEach(System.out::println);

        System.out.println();

        //2. Sorting based on price

        getProducts().stream().sorted((p1,p2)-> p1.getPrice() - p2.getPrice()).forEach(System.out::println);

        System.out.println();

        //3. Sorting based on price reversed

        getProducts().stream().sorted(Comparator.comparing(Products::getPrice).reversed() ).forEach(System.out::println);

        System.out.println();

        //4. Sorting based on price using comparator implementation

        getProducts().stream().sorted(new Comparator<Products>(){

            @Override
            public int compare(Products o1, Products o2) {

                return o1.getPrice() - o2.getPrice();
            }


        }).forEach((product -> System.out.println(product)));

        //Functions map(), min(Comparator.comparing(Integer::valueOf())), 
        //max((Comparator.comparing()), findFirst(), findAll(), count() can also be used

    }
 

}
