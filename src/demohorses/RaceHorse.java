package demohorses;

public class RaceHorse extends Horse {
    private int races;

    public RaceHorse(String name1, String color1, int birth1, int races1) {
        super(name1, color1, birth1);
        races = races1;
    }
    public int getRaces(){
        return races;
    }
    public void setRaces(int totRaces){
        races = totRaces;
    }
    public void display2(){
        System.out.println("Races: " + races);
    }
    
}
