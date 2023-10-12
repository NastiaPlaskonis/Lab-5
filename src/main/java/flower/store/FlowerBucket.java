package flower.store;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


public class FlowerBucket extends Item {

    @Setter @Getter

    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks) {
            price += flowerPack.getPrice();
        }
        return price;
    }
}

// package flower.store;

// import java.util.ArrayList;
// import java.util.List;

// public class FlowerBucket extends Item {
//     private List<FlowerPack> flowerPacks = new ArrayList<>();

//     public void add(FlowerPack flowerPack) {
//         flowerPacks.add(flowerPack);
//     }

//     public double getPrice() {
//         double price = 0;
//         for (FlowerPack flowerPack : flowerPacks) {
//             price += flowerPack.getPrice();
//         }
//         return price;
//     }
// }