package repository;

public class IceCreamDecorator implements Icecream{
    private Icecream icecream;

    public IceCreamDecorator(Icecream icecream){
        this.icecream=icecream;
    }

    @Override
    public double cost() {
        return this.icecream.cost();
    }
}
