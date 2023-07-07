import java.util.InputMismatchException;

public final class Cart extends ItemRepository {
    
    private Client owner;
    private Money totalCost;
    private ItemRepository stock;
   

    public Cart(Client owner, ItemRepository stock) {
        //super() - auto generated
        this.owner = owner;
        this.stock = stock;
        this.totalCost= new Money(000,Currency.EUR);
    }


    @Override
    public String toString() {
        return "Cart [owner=" + owner +" \n\ttotalCost"+ totalCost + " ]" + super.toString() ;
    }

    // Cart Logic

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

   

    
    @Override
    public void addItem(Item<Product> item){
        
        super.addItem(item);
        addItemCost(item);
        Item<Product> stockItem = stock.getItemById(item.getValue().getId());
        stockItem.setQuantity(stockItem.getQuantity()- item.getQuantity());
    }

     //HW4: ADD removeItem(Item item)
            //removes the indicated object
            //update totalCost
    

    @Override
    public void removeItem(Item<Product> item) {
        
        super.removeItem(item);
        substractItemCost(item);
        Item<Product> stockItem = stock.getItemById(item.getValue().getId());
        stockItem.setQuantity(stockItem.getQuantity()+ item.getQuantity());
    }

    // A bit of optimization for .removeItem(Item item) && addItem(Item item)
    
    public int totalCostOfDistinctProduct(Item<Product> item){
        return item.getValue().getPrice().getAmount()*item.getQuantity();
    }

    public void substractItemCost(Item<Product> item){
        totalCost.setAmount(
            totalCost.getAmount()-totalCostOfDistinctProduct(item)
        );
    }

    public void addItemCost(Item<Product> item){
        totalCost.setAmount(
            totalCost.getAmount()+totalCostOfDistinctProduct(item)
        );
    }

    

    
    

   

    // HW3: draw the diagram of toString() delegation
    //    : draw the diagram of constructor() delegation
     //    : draw the diagram of addItem() delegation

    //HW5: inceaseItemQuantity(Item item, Integer amount);
            // set protection 

    public void increaseItemQuantity(Item<Product> item, Integer amount){
        if (amount >0) {
            incrementFunctionProcess(item,amount);
        }
    }


    //     decreaseItemQuantity(Item item, Integer amount);
            // set protection

    public void decreaseItemQuantity(Item<Product> item, Integer amount)throws ValueOutOfRangeException, InputMismatchException{
        if ((item.getQuantity()).intValue() <= amount || amount <= 0) {
            throw new ValueOutOfRangeException("ERROR: try another amount or delete this item from cart !!! ");
        }else {
            decrementFunctionProcess(item,amount);
        };
    }

    // A bit of optimization for increase, decrease methods!!!!!!!

    public void decrementFunctionProcess(Item<Product> item, Integer amount){
        item.setQuantity(item.getQuantity()-amount);
        totalCost.setAmount(totalCost.getAmount()-item.getValue().getPrice().getAmount() *amount);
    }
    

    public void incrementFunctionProcess(Item<Product> item, Integer amount){
        item.setQuantity(item.getQuantity()+amount);
        totalCost.setAmount(totalCost.getAmount()+item.getValue().getPrice().getAmount() *amount);
    }

    class ValueOutOfRangeException extends Exception{

        public ValueOutOfRangeException (String message){
            super(message);
        }
    }
    



    
     
    
}



    
     
    
}
