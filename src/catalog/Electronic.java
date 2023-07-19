package catalog;

abstract class Electronic implements iElectronic{
    private String maker;

    public Electronic(String maker) {
        this.maker = maker;
    }

    @Override
    public String getMaker() {
        return maker;
    }
}
