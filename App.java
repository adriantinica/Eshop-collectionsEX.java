import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) throws InputMismatchException, Cart.ValueOutOfRangeException {

        Stock stock = new Stock();

        Product product1  = new Product(1001,"Samsung XX11", new Money (1000, Currency.EUR));
        Product product2  = new Product (1002,"Apple 14 PRO", new Money (1600, Currency.EUR));
        Product product3 = new Product(1003, "OPPO Reno 8 ", new Money(500, Currency.EUR));

        stock.addItem( 
            new Item<>(product1,100));
        stock.addItem(
            new Item<>(product2,100));
        stock.addItem(
            new Item<>(product3,100));


        


        Cart cart  =new Cart (new Client("John Doe","123456789"),stock);
         
       
        System.out.println(stock);

        Item<Product> item1 = new Item<>( product1,
            120);
        cart.addItem(item1);
            
        Item<Product> item2 = new Item<>(product2,
            80);
        cart.addItem(item2);

         Item<Product> item3 = new Item<>(product3,
            100);
        cart.addItem(item3);
        
        
        System.out.println("Real Stock after cart fill: ");
        System.out.println(stock);
        System.out.println(cart);
        cart.removeItem(item3);
        System.out.println("Situation after removing item3");
        System.out.println(stock);
        System.out.println(cart);
                

        
       
        

       

        //System.out.println(cart.getItemById(1003));// print Item
    }
}
