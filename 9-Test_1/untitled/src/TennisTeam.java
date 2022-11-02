import java.util.ArrayList;

public class TennisTeam extends Team{
    public TennisAthlete athlete;

    public TennisTeam(String name, String country, String sport_type, TennisAthlete athlete) {
        super(name, country, sport_type);
        this.athlete = athlete;
    }

    public void addAthlete(TennisAthlete athlete) {
        if (this.athlete != null) {
            System.out.println("Too many athletes");
            return;
        }
        this.athlete = athlete;
    }

    public String getPreferedCourt() {
        int best_index = 0;

        if(athlete.wonMatches[0] < athlete.wonMatches[1])
            best_index = 1;
        else if(athlete.wonMatches[0] < athlete.wonMatches[2])
            best_index = 2;
        if(athlete.wonMatches[1] < athlete.wonMatches[2])
            best_index = 2;

        switch (best_index){// glina, treva, tvurda
            case 0:
                return "clay";
            case 1:
                return "grass";
            case 2:
                return "hard";
            default:
                break;
        }
        return "";
    }
    @Override
    public String toString() {
        String res = athlete.toString();
        return name + ", " + country + ", " + sport_type + ", " + res + "\n";
    }

}
