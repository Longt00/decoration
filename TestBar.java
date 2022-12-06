public class TestBar {
    public static void main(String[] args) {

        Coffee normalcoffee = new cupCoffee();
        System.out.println("normalcoffee use "+normalcoffee.cost()+"dollar");
        System.out.println("normalcoffee use "+normalcoffee.getDescription());


        Coffee Milkcoffee = new Milk(normalcoffee);
        System.out.println("Milkcoffee use "+Milkcoffee.cost()+"dollar");
        System.out.println("Milkcoffee use "+Milkcoffee.getDescription());
    }

}
