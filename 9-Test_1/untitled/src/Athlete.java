public abstract class Athlete implements AthleteInterface{
    public String name, country;
    public int age, points;

    public Athlete(String name, String country, int age, int points) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.points = points;
    }

}

