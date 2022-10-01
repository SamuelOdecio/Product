
package produto;


public class TestaProduto {
    public static void main(String[] args) {
        Product product1 = new Product("LAJOTA", 1.35, 550);
        
        System.out.println("NOME: " + product1.getProductName());
        System.out.println("PREÇO: " + product1.getProductPrice());
        System.out.println("QTD: " + product1.getProductQuantity());
        
        double valorTotal = product1.TotalValueInStock(product1.getProductPrice(), product1.getProductQuantity());
        System.out.println("PREÇO TOTAL: " + valorTotal);
        
        
        product1.RemoveProducts(50);
        System.out.println("QTD: " + product1.getProductQuantity());
        
        product1.AddProducts(100);
        System.out.println("QTD: " + product1.getProductQuantity());
        
        
        System.out.println("CLOSE!");
        
    }
}
