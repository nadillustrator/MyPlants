package repositories;

public class Plant {
    private int id;
    private String name;
    private String family;
    private static int countId;


    public Plant(int id, String name, String family){
        this.id = ++countId;
        this.name = name;
        this.family = family;
    }
}
