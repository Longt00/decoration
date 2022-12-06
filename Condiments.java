public class Condiments extends Coffee {
    private Coffee obj;

    public Condiments(Coffee obj) {
        this.obj = obj;
    }

    @Override
    public int cost() {
        return obj.cost() + super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.description + " " + super.getPrice() + " && " + obj.getDescription();
        // print father class description and price
        // 返回父类的描述和父类的价格和调料的价格
    }
}
