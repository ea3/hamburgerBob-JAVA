public class Main {
    public static void main(String [] args){
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 5.25, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 1.23);
        hamburger.addHamburgerAddition2("lechuga", 1.48);
        hamburger.addHamburgerAddition3("bacon", 2.34);
        hamburger.addHamburgerAddition4("Cheese", 1.12);
        System.out.println("total burger price is: "+ hamburger.itemizeHamburger());
        HealthyBurger healthyBurger = new HealthyBurger("Chorizo", 5.67);

        healthyBurger.addHealthyAddition1("Pineappple", 3);
        healthyBurger.addHealthyAddition2("Sweet Potatoes", 2);
        System.out.println("The price total for the Healthy burger is: "+ healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition3("SHOULD NOT DO THIS", 10);
        deluxeBurger.addHamburgerAddition3("SHOULD NOT DO THIS", 4);
    }
}
