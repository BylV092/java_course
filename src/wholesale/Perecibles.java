package wholesale;

public class Perecibles extends ProductMayor {
    private String storageType;
    private String subType;

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public Perecibles(String nameProduct, double price, int quantity, String storageType, String subType) {
        super(nameProduct, price, quantity);
        this.storageType = storageType;
        this.subType = subType;
    }
}
