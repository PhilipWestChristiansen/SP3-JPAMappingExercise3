package entity;

import javax.persistence.*;

@Entity
public class DiscountQuantity extends DiscountType {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    int quantityForDiscount = 3;
    double discount = 0.2; //20% on all if quantity is 3 or more

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return quantity >= quantityForDiscount ? priceItem * quantity * discount : 0;
    }

}
