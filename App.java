public class App {

    public static void main(String[] args) {

        Stock stock = new Stock();

        stock.addItem( 
            new Item<>(
                new Product(1001,"Samsung XX11", new Money (1000, Currency.EUR)),
                100));
        stock.addItem(
            new Item<>(
                new Product (1002,"Apple 14 PRO", new Money (1600, Currency.USD)),
                10));
        stock.addItem(
            new Item<>(
                new Product(1003, "OPPO Reno 8 ", new Money(500, Currency.USD)),13));

        System.out.println(stock.getItemById(13));
        System.out.println();
        System.out.println(stock);
        stock.removeItemById(1002) ;
        System.out.println();
        System.out.println(stock);
            


        //Product product1 = new Product("Samsung XX11", new Money (1000, Currency.EUR));
        //Product product2 = new Product ("Apple 14 PRO", new Money (1600, Currency.USD));
        //System.out.println(product1);
        //System.out.println(product2);
        
    }
}