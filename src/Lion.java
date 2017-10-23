public class Lion extends Animal {
    public Lion() {
        super();
    }

    @Override
    public void timePasses() {
        super.timePasses();

        if (super.getHunger() >= 3) {
            System.out.println("The Lion paces hungrily.");
        }
    }

    public void talk() {
        System.out.println("Lion: \"Roar!\".");
    }

    @Override
    public String toString() {
        return "Lion";
    }
}
