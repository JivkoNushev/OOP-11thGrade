import java.util.ArrayList;

public abstract class Team {
    public String name, country, sport_type;
    public ArrayList<AthleteInterface> athletes;
    public Team(String name, String country, String sport_type) {
        this.name = name;
        this.country = country;
        this.sport_type = sport_type;
    }

    public abstract String toString();
}
