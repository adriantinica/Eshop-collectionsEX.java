public class Cart extends ItemRepository {
    
    private Client owner;
    private Money totalCost;
    private Item<Product> itemToRemove;

    public Cart(Client owner) {
        //super() - auto generated
        this.owner = owner;
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

    public void setItemToRemove(Item<Product> item) {
        itemToRemove = item;
    }


    
    @Override
    public void addItem(Item<Product> item) {
        // TODO Auto-generated method stub
        
        super.addItem(item);
        totalCost.setAmount(totalCost.getAmount()+item.getValue().getPrice().getAmount()*item.getQuantity()
        );
    }

    public void removeItem() {
        if (itemToRemove != null) {
            super.removeItem(itemToRemove);
            totalCost.setAmount(totalCost.getAmount() - (itemToRemove.getValue().getPrice().getAmount() * itemToRemove.getQuantity()));
            itemToRemove = null; 
        }
    }

    //public void removeItem(Item<Product> item) {
   //     for (int index = 0; index < items.size(); index++) {
    //        if ((items.get(index)).equals(item)) {
    //            Item<Product> removedItem = items.remove(index);
    //            totalCost.setAmount(totalCost.getAmount() - (removedItem.getValue().getPrice().getAmount() * removedItem.getQuantity()));
    //            break;
    //        }
    //    }
    //    System.out.println("The item : "+ item +" was REMOVED !!!");
    //}


    // HW3: draw the diagram of toString() delegation
    //    : draw the diagram of constructor() delegation
     //    : draw the diagram of addItem() delegation

    //HW4: ADD removeItem(Item item)
            //removes the indicated object
            //update totalCost
   

    //HW5: ineaseItemQuantity(Item item, Integer amount);
            // set protection 
            // decreaseItemQuantity(Item item, Integer amount);
            // set protection


    
     
    
}
