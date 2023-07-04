public class Item <T>{

    private T value;
    private Integer quantity;

    public Item(T value, Integer quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item [value=" + value + ", quantity=" + quantity + "]\n";
    }

   

    

    
}