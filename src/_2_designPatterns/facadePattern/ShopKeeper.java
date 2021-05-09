package _2_designPatterns.facadePattern;

public class ShopKeeper {
    Iphone iphone;
    Samsung samsung;

    public ShopKeeper() {
        this.iphone = new Iphone();
        this.samsung = new Samsung();
    }
    public void getIphoneDetail(){
        iphone.modelName();
        iphone.modelPrice();
    }
    public void getSamsungDetail(){
        samsung.modelName();
        samsung.modelPrice();
    }
}
