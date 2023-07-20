package superMarket;

public class Main {
    public static void main(String[] args) {
        superMarketBag<Fruit> bagFruits = new superMarketBag<>();
        superMarketBag<Cleaning> bagCleaning = new superMarketBag<>();
        superMarketBag<Lacteo> bagLacteo = new superMarketBag<>();
        superMarketBag<NotPerecible> bagNotPerecible = new superMarketBag<>();

        bagFruits.addProduct(new Fruit("Apple", 1200, "Pomacea", "China"));
        bagFruits.addProduct(new Fruit("Orange", 1300, "Citric", "China"));
        bagFruits.addProduct(new Fruit("Pineapple", 5000, "Tropical", "Brasil"));
        bagFruits.addProduct(new Fruit("Strawberry", 5500, "Rastreras estoloníferas", "Alpes"));
        bagFruits.addProduct(new Fruit("Watermelon", 8000, "Cucurbitaceae", "Kalahari"));

        bagCleaning.addProduct(new Cleaning("Clorox", 2200, "Desinfectant", true));
        bagCleaning.addProduct(new Cleaning("Liquid Soap", 5600, "Cleaning", true));
        bagCleaning.addProduct(new Cleaning("Wipers", 2500, "Desinfectant", true));
        bagCleaning.addProduct(new Cleaning("Varsol", 7200, "Desinfectant", true));
        bagCleaning.addProduct(new Cleaning("Alcohol", 1500, "Desinfectant", false));

        bagLacteo.addProduct(new Lacteo("Yogurt", 1800, "Milk fermented and acidified by bacteria.", true));
        bagLacteo.addProduct(new Lacteo("Milk", 3200, "Milk ", true));
        bagLacteo.addProduct(new Lacteo("Milk cream", 4600, "Centrifuged milk.", true));
        bagLacteo.addProduct(new Lacteo("Condensed milk", 2800, "Milk without water, by evaporation", true));
        bagLacteo.addProduct(new Lacteo("Kumis", 1900, "Fermented milk drink.", true));

        bagNotPerecible.addProduct(new NotPerecible("Canned soups and pasta.", 4750, 60, true));
        bagNotPerecible.addProduct(new NotPerecible("Canned tuna.", 5670, 60, true));
        bagNotPerecible.addProduct(new NotPerecible("Frozen vegetables.", 6750, 12, true));
        bagNotPerecible.addProduct(new NotPerecible("Rice.", 2300, 24, false));
        bagNotPerecible.addProduct(new NotPerecible("Legumes in bag.", 6430, 12, true));

        System.out.println("Bag fruits");
        for (Fruit fruit : bagFruits.getProducts()) {
            System.out.println("Name fruit: " + fruit.getNameProduct() +
                    "\nPrice: " + fruit.getPrice() +
                    "\nType: " + fruit.getType() +
                    "\nOrigin: " + fruit.getOrigin()+
                    "\n===================================");
        }

        System.out.println("Bag cleaning");
        for (Cleaning cleaning : bagCleaning.getProducts()) {
            System.out.println("Name product: " + cleaning.getNameProduct() +
                    "\nPrice: " + cleaning.getPrice() +
                    "\nCategory: " + cleaning.getCategory() +
                    "\nToxic: " + cleaning.isToxic()+
                    "\n==================================");
        }

        System.out.println("Bag lacteo");
        for (Lacteo lacteo : bagLacteo.getProducts()) {
            System.out.println("Name Product: " + lacteo.getNameProduct() +
                    "\nPrice: " + lacteo.getPrice() +
                    "\nMilk type: " + lacteo.getMilkType() +
                    "\nOrganic: " + lacteo.isOrganic()+
                    "\n=================================");
        }

        System.out.println("Bag not perecible");
        for (NotPerecible notPerecible : bagNotPerecible.getProducts()) {
            System.out.println("Name product: " + notPerecible.getNameProduct() +
                    "\nPrice: " + notPerecible.getPrice() +
                    "\nDuration months: " + notPerecible.getDurationMonths() +
                    "\nNeed refrigeration: " + notPerecible.isNeedRefrigeration()+
                    "\n================================");
        }


    }
}
