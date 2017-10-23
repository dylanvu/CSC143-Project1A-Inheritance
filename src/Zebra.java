public class Zebra extends Animal {
    public Zebra() {
        super();
    }

    public void talk() {
        System.out.println("The Zebra quietly chews.");
    }

    @Override
    public String toString() {
        return "Zebra";
    }
}
