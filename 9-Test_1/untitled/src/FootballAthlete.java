public class FootballAthlete extends Athlete{
    public int playedMatches, goals;

    public FootballAthlete(String name, String country, int age, int points, int playedMatches, int goals, String position) {
        super(name, country, age, points);
        this.playedMatches = playedMatches;
        this.goals = goals;
        this.position = position;
    }

    public String position;

    @Override
    public String toString() {
        Integer a = age, p = points, pl = playedMatches, g = goals;
        return name + ", " + country + ", " + a.toString() + ", " + p.toString() + ", " + pl.toString() + ", " + g.toString() + ", " + position + "\n";
    }
}
