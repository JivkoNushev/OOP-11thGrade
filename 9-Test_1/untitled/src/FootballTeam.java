import java.util.ArrayList;

public class FootballTeam extends Team{

    public ArrayList<FootballAthlete> athletes;

    public FootballTeam(String name, String country, String sport_type, ArrayList<FootballAthlete> athletes) {
        super(name, country, sport_type);
        this.athletes = athletes;
    }

    public void addAthlete(FootballAthlete athlete) {
        if(18 == athletes.size()){
            System.out.println("Too many athletes");
            return;
        }
        athletes.add(athlete);
    }

    public boolean canPlay() {
        if(athletes.size() < 11)
            return false;

        boolean has_goalkeeper = false, has_captain = false;
        int c = 0;
        for(FootballAthlete ath : athletes){
            if(has_goalkeeper && has_captain)
                break;
            if(ath.position.equals("goalkeeper"))
                has_goalkeeper = true;
            else if(ath.position.equals("captain"))
                has_captain = true;
            else
                c++;
        }
        if(!(has_goalkeeper && has_captain) || c < 9)
            return false;

        return true;
    }

    @Override
    public String toString() {
        String res = "";
        for(FootballAthlete ath: athletes)
            res += ath.toString();
        return name + ", " + country + ", " + sport_type + ", " + res + "\n";
    }
}
