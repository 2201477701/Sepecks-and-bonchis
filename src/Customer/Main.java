package Customer;

public class Main {
    public static void main(String[] args) {

        customer cus1 = new customer.CustomerBuilder(134,"Zaeem","Dollie","zd@gmail.com","098461281").build();
        System.out.println(cus1.toString());
    }
}