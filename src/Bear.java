public class Bear extends Animal {
    public Bear() {
        super();
    }

    @Override
    public void feed() {
        super.feed();

        System.out.println("The bear is full and falls asleep.");
    }

    public void talk() {
        System.out.println("Bear: \"Roar!\".");
    }

    @Override
    public String toString() {
        return "Bear";
    }
}
