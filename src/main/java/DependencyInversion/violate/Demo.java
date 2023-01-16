package DependencyInversion.violate;

public class Demo {
    public static void main(String[] args) {
        Store store = new Store("Emmanuel");
        store.purchaseBIke(5);
    }
}
