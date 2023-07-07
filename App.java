import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) throws InputMismatchException, Cart.ValueOutOfRangeException {

        Stock stock = new Stock();

        stock.addItem( 
            new Item<>(
                new Product(1001,"Samsung XX11", new Money (1000, Currency.EUR)),
                100));
        stock.addItem(
            new Item<>(
                new Product (1002,"Apple 14 PRO", new Money (1600, Currency.EUR)),
                10));
        stock.addItem(
            new Item<>(
                new Product(1003, "OPPO Reno 8 ", new Money(500, Currency.EUR)),13));

        //System.out.println(stock.getItemById(13));
        //System.out.println();
        //System.out.println(stock);
        //stock.removeItemById(1002) ;
        //System.out.println();
        //System.out.println(stock);

        //Product product1 = new Product("Samsung XX11", new Money (1000, Currency.EUR));
        //Product product2 = new Product ("Apple 14 PRO", new Money (1600, Currency.USD));
        //System.out.println(product1);
        //System.out.println(product2);

        Cart cart  =new Cart (new Client("John Doe","123456789"));
         
        System.out.println(cart);

        Item<Product> item1 =new Item<>(  new Product(1001,"Samsung XX11", new Money (1000, Currency.EUR)),
            2);
        cart.addItem(item1);
            
        Item<Product> item2 = new Item<Product>(new Product(1002,"Apple 14 PRO", new Money (1600, Currency.EUR)),
            2);
        cart.addItem(item2);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
       
        //cart.removeItem(item1);
         System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(cart);

        cart.increaseItemQuantity(item2, 10);
        System.out.println(cart);
        cart.decreaseItemQuantity(item2, 13);

        System.out.println(cart);



       

        //System.out.println(cart.getItemById(1003));// print Item
    }
}
