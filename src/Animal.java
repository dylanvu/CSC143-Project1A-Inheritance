public abstract class Animal {
    private int hunger;

    public Animal() {
        this.hunger = 0;
    }

    public int getHunger() {
        return this.hunger;
    }

    public abstract void talk();
}
