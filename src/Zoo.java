public class Zoo {
    public static void main(String[] args) {
        Zebra joe = new Zebra();
        System.out.println("Zebra Joe's Hunger: " + joe.getHunger());
        joe.talk();

        System.out.println();

        Lion simba = new Lion();
        System.out.println("Lion Simba's Hunger: " + simba.getHunger());
        simba.talk();
    }
}
