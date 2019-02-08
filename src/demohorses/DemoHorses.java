package demohorses;

public class DemoHorses {

    public static void main(String[] args) {
        Horse horse1 = new Horse("Guy", "Dapple", 2001);
        RaceHorse racehorse1 = new RaceHorse("Chuck", " Grey", 2012, 14);
        horse1.display();
        racehorse1.display();
        racehorse1.display2();
    }
    
}
