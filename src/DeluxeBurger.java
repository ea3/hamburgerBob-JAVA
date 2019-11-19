public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe","Sausage and Bacon", 17, "White");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("Drink", 2);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can't add additional ingredients to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can't add additional ingredients to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can't add additional ingredients to a deluxe hamburger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can't add additional ingredients to a deluxe hamburger");
    }
}
