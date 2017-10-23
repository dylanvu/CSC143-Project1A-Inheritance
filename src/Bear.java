public class Bear extends Animal {
    public Bear() {
        super();
    }

    public void feed() {
        super.feed();

        System.out.println("The bear is full and falls asleep.");
    }

    public void talk() {
        System.out.println("Bear: \"Roar!\".");
    }

    public String toString() {
        return "Bear";
    }
}
