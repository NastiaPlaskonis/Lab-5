package flower.store;

import lombok.Getter;
// import lombok.AllArgsConstructor;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    private FlowerPack (Flower flower, int quantity) {
        this.flower = new Flower (flower);
        this.quantity = quantity;

}

    public void setQuantity (int quantity) {
        this.quantity = quantity < 1 ? 1 : quantity;

    }

    public double getPrice() {
        return quantity* flower.getPrice();
    }
}

// package flower.store;

// import lombok.Getter;
// import lombok.Setter;

// @Getter
// @Setter
// public class FlowerPack {
//     private Flower flower;
//     private int quantity;

//     public FlowerPack(Flower flower, int quantity) {
//         setFlower(flower);
//         setQuantity(quantity);

// }

//     public double getPrice() {
//         return this.flower.getPrice()*this.quantity;
//     }
// }