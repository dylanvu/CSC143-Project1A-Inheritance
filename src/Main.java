public class Main {
    public static void main(String[] args) {
        Bear rilakuma = new Bear();
        Lion simba = new Lion();
        Zebra joe = new Zebra();

        Zoo zoo = new Zoo();
        zoo.putInCage1(rilakuma);
        zoo.putInCage2(simba);
        zoo.putInCage3(joe);

        zoo.print();
        System.out.println();

        zoo.allTalk();
        System.out.println();

        zoo.timePasses();
        zoo.timePasses();
        zoo.timePasses();
        System.out.println();

        zoo.feedAll();
    }
}
