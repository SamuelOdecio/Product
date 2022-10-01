
package produto;

public class Product {

    private String name;
    private double price;
    private int quantity ;
    
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    /* RETORNA O VALOR DO ATRIBUTO*/
    public String getProductName(){
        return this.name;
    }
    
     public double getProductPrice(){
        return this.price;
    }
     
     public int getProductQuantity(){
        return this.quantity;
    }
    
    /* METODOS - TOTAL - ADD - REMOVE*/
    public double TotalValueInStock(double price, int quantity) {
        return price*quantity;
    } 
     
    public void AddProducts(int quantity){
        this.quantity+=quantity;
    }
    
    public void RemoveProducts(int quantity){
        this.quantity-=quantity;
    }
  
}
