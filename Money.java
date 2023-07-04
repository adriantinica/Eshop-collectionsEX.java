public class Money {

    private Integer amount;
    private Currency currency;
    
    
    public Money(Integer amount, Currency currency) {
        this.amount = amount;
        if (isValidCurrency(currency)== false) {
            throw new IllegalArgumentException("Invalid currency inserted !!!");
        } else{
        this.currency = currency;
        }
    }

    private boolean isValidCurrency(Currency currency) {
        for (Currency validCurrency : Currency.values()) {
            if (validCurrency == currency) {
                return true;
            }
        }
        return false;
    }


    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Currency getCurrency() {
        return currency;
    }
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    @Override
    public String toString() {
        return "Money [amount= " + amount + ", currency= " + currency + "]";
    }

    

    
}