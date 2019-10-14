package designPatterns.facadePattern;

public class MobileShopKeeper {
    Iphone iphone;
    Samsung samsung;

    public MobileShopKeeper() {
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
