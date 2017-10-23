public class Lion extends Animal {
    public Lion() {
        super();
    }

    public void timePasses() {
        super.timePasses();

        if (getHunger() >= 3) {
            System.out.println("The Lion paces hungrily.");
        }
    }

    public void talk() {
        System.out.println("Lion: \"Roar!\"");
    }
}
