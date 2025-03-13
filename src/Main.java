

class Product{

    String name;
    int productCode;
    double price;
    int quantity;
    String expiryDate;


    public Product(String name, int productCode, double price, int quantity, String expiryDate) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;

    }

    public void sellProduct(int quantity){
    if(quantity > 0){
        quantity--;
        System.out.println(name + " sells "  + "Price " + price );

    }
    else if(quantity == 0){
        System.out.println(" cant be sold, nothing to sell");
    }
    }
    public void addProduct(int quantity){

        System.out.println("quantity is increased by: " + quantity);
        quantity++;

    }
    public void displayProduct(){
    System.out.println("Name: " + name);
    System.out.println("Product Code: " + productCode);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("Expiry Date: " + expiryDate);


    }
    public void checkExpiryDate(String currentDate){
    if(currentDate.equals(expiryDate)){
        System.out.println(name + " is expiry");

    }else
        System.out.println(name + " is not expired");
    }
}



public class Main {
    public static void main(String[] args) {
        Product Product = new Product("GreekAlfabet",5667,33.5,5,"12.12.2025");
        Product Product2 = new Product("ook",6773,78,7,"16.12.2026");
        Product Product3 = new Product("noob",4473,45,6,"11.12.2026");
        Product Product4 = new Product("elka",5673,34.6,8,"12.12.2027");

        Product.sellProduct(1);
        Product.displayProduct();
        Product.addProduct(1);
        Product.checkExpiryDate("13.03.2025");
        System.out.println("<----------------produkt kolejny------------------>");
        Product2.sellProduct(1);
        Product2.addProduct(1);
        Product2.displayProduct();
        Product2.checkExpiryDate("13.03.2025");
        System.out.println("<--------------produkt kolejny------------------>");
        Product3.sellProduct(1);
        Product3.addProduct(1);
        Product3.displayProduct();
        Product3.checkExpiryDate("13.03.2025");
        System.out.println("<----------------produkt kolejny------------------>");
        Product4.sellProduct(1);
        Product4.addProduct(1);
        Product4.displayProduct();
        Product4.checkExpiryDate("13.03.2025");




    }
}