public abstract class Coffee {
    //咖啡的抽象类
    public String description;//描述
    private int price = 0;//价钱

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public abstract int cost();//价钱的咖啡类
}
