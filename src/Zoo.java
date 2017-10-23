public class Zoo {
    public static void main(String[] args) {
        Zebra joe = new Zebra();
        System.out.println("Zebra Joe's Hunger: " + joe.getHunger());
        joe.talk();
        joe.timePasses();
        System.out.println("Zebra Joe's Hunger grows as time passes: " + joe.getHunger());

        System.out.println();

        Lion simba = new Lion();
        System.out.println("Lion Simba's Hunger: " + simba.getHunger());
        simba.talk();
        simba.timePasses();
        System.out.println("Lion Simba's Hunger grows as time passes: " + simba.getHunger());
    }
}
