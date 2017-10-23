public class Zoo {
    public static void main(String[] args) {
        Zebra joe = new Zebra();
        System.out.println("Zebra Joe's Hunger: " + joe.getHunger());
        joe.talk();
        joe.timePasses();
        System.out.println("Zebra Joe's Hunger: " + joe.getHunger());
        joe.feed();
        System.out.println("Zebra Joe's Hunger: " + joe.getHunger());

        System.out.println();

        Lion simba = new Lion();
        System.out.println("Lion Simba's Hunger: " + simba.getHunger());
        simba.talk();
        simba.timePasses();
        simba.timePasses();
        simba.timePasses();
        System.out.println("Lion Simba's Hunger: " + simba.getHunger());
        simba.feed();
        System.out.println("Lion Simba's Hunger: " + simba.getHunger());
    }
}
