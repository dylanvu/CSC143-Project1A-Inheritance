public abstract class Animal {
    private int hunger;

    public Animal() {
        this.hunger = 0;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void timePasses() {
        this.hunger += 1;
    }

    public void feed() {
        this.hunger = 0;
    }

    public abstract void talk();
}
