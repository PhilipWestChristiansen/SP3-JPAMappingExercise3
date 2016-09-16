package entity;

import javax.persistence.*;

@Entity
public class DiscountFixed extends DiscountType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    double discount = 0.1; //10% on all

    @Override
    public double calcDiscount(double priceItem, int quantity) {
        return priceItem * discount * quantity;
    }

}
