package Customer;

public class customer {

    private int Customer_ID;
    private String First_Name;
    private String Last_Name;
    private String Email_Address;
    private String Cell_Number;

    public customer() {
    }

    public customer(CustomerBuilder builder) {
        this.Customer_ID = builder.Customer_ID;
        this.First_Name = builder.First_Name;
        this.Last_Name = builder.Last_Name;
        this.Email_Address = builder.Email_Address;
        this.Cell_Number = builder.Cell_Number;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }
    public String getLast_Name() {
        return Last_Name;
    }
    public String getEmail_Address() {
        return Email_Address;
    }
    public String getCell_Number() {
        return Cell_Number;
    }

    @Override
    public String toString() {
        return "customer{" +
                "Customer_ID=" + Customer_ID +
                ", First_Name='" + First_Name + '\'' +
                ", Last_Name='" + Last_Name + '\'' +
                ", Email_Address='" + Email_Address + '\'' +
                ", Cell_Number='" + Cell_Number + '\'' +
                '}';
    }

    public static class CustomerBuilder{

        private int Customer_ID;
        private String First_Name;
        private String Last_Name;
        private String Email_Address;
        private String Cell_Number;

        public CustomerBuilder(int customer_ID, String first_Name, String last_Name, String email_Address, String cell_Number) {
            this.Customer_ID = customer_ID;
            this.First_Name = first_Name;
            this.Last_Name = last_Name;
            this.Email_Address = email_Address;
            this.Cell_Number = cell_Number;
        }
        public CustomerBuilder setCustomer_ID(int Customer_ID) {
            this.Customer_ID = Customer_ID;
            return this;
        }

        public CustomerBuilder setFirst_Name(String First_Name) {
            this.First_Name = First_Name;
            return this;
        }

        public CustomerBuilder setLast_Name(String Last_Name) {
            this.Last_Name = Last_Name;
            return this;
        }
        public CustomerBuilder setEmail_Address(String Email_Address) {
            this.Email_Address = Email_Address;
            return this;
        }

        public CustomerBuilder setCell_Number(String Cell_Number) {
            this.Cell_Number = Cell_Number;
            return this;
        }
        public customer build() {
            return new customer(this);
        }
    }
}
