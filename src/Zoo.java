public class Zoo {
    Animal cage1;
    Animal cage2;
    Animal cage3;

    public Zoo() {
        this.cage1 = null;
        this.cage2 = null;
        this.cage3 = null;
    }

    public void putInCage1(Animal animal) {
        this.cage1 = animal;
    }

    public void putInCage2(Animal animal) {
        this.cage2 = animal;
    }

    public void putInCage3(Animal animal) {
        this.cage3 = animal;
    }

    public void print() {
        System.out.println("The zoo contains the following:");

        if (cage1 != null) {
            System.out.println("\t" + this.cage1);
        }

        if (cage2 != null) {
            System.out.println("\t" + this.cage2);
        }

        if (cage3 != null) {
            System.out.println("\t" + this.cage3);
        }
    }

    public void timePasses() {
        if (cage1 != null) {
            cage1.timePasses();
        }

        if (cage2 != null) {
            cage2.timePasses();
        }

        if (cage3 != null) {
            cage3.timePasses();
        }
    }

    public void allTalk() {
        if (cage1 != null) {
            cage1.talk();
        }

        if (cage2 != null) {
            cage2.talk();
        }

        if (cage3 != null) {
            cage3.talk();
        }
    }

    public void feedAll() {
        System.out.println("The zookeeper feeds all the animals.");
        if (cage1 != null) {
            cage1.feed();
        }

        if (cage2 != null) {
            cage2.feed();
        }

        if (cage3 != null) {
            cage3.feed();
        }
    }
}
