import java.util.ArrayList;
import java.util.List;

public abstract class ItemRepository {

    protected List<Item<Product>> items;

    public ItemRepository () {
        items = new ArrayList<>();
    }

    //repository Logic


    public void addItem(Item<Product> item){
        items.add(item);  
    }

    // to get items
    public void getItems(Integer index){
        System.out.println(items.get(index));        
    }


    @Override
    public String toString() {
        return "\t\n\n [items =  " + items + "]\n";
    }


    public Item<Product> getItemById(Integer id){
        Item<Product> item = null;

        for (int i = 0; i < items.size(); i++) {
           
            if((items.get(i).getValue().getId()).equals(id)){
                item = items.get(i);
                System.out.println("The product with id "+id+" you searched for:");
                break;
            }else if(!(items.get(i).getValue().getId()).equals(id)){
                System.err.println("You've entered wrong ID !!!");
                break;
            }
            
        }
        return item;

    }

    //HW2: add removeItemById method;

    public void removeItemById(Integer id){
        Item<Product> item = null;
        for (int index = 0; index < items.size(); index++) {
            if((items.get(index).getValue().getId()).equals(id)){
                item = items.get(index);
                items.remove(item);
                break;
            } 
        }
        System.out.println("The product with ID : "+ id +" was REMOVED !!!");
    }

    public List<Item<Product>> getItems() {
        return items;
    }

    public void removeItem(Item<Product> itemToRemove) {
        for (int index = 0; index < items.size(); index++) {
                    if ((items.get(index)).equals(itemToRemove)) {
                        Item<Product> removedItem = items.remove(index);
            //            totalCost.setAmount(totalCost.getAmount() - (removedItem.getValue().getPrice().getAmount() * removedItem.getQuantity()));
                        break;
                    }
                }
    }

   
    
    

    
    
}
