package demohorses;

public class Horse {
    private String name;
    private String color;
    private int birth;
    public Horse(String name1, String color1, int birth1){
        name = name1;
        color = color1;
        birth = birth1;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public int getBirth(){
        return birth;
    }
    public void setName(String HName){
        name = HName;
    }
    public void setColor(String HColor){
        color = HColor;
    }
    public void setBirth(int birthYear){
        birth = birthYear;
    }
    public void display(){
    System.out.println(name + " - " + color + " - " + birth);
    }
}
