public class cupCoffee extends Coffee {


    public cupCoffee() {
        setPrice(20);//设置一杯咖啡的价钱
        setDescription("a cup of coffee");//一杯咖啡的描述
    }

    public int cost() {
        return super.getPrice();//上面的构造函数设置的价钱
    }
}
