public class TennisAthlete extends Athlete{
    public int playedMatches;
    public int[] wonMatches = {0,0,0}; // glina, treva, tvurda

    public TennisAthlete(String name, String country, int age, int points, int playedMatches, int[] wonMatches) {
        super(name, country, age, points);
        this.playedMatches = playedMatches;
        this.wonMatches = wonMatches;
    }

    @Override
    public String toString() {
        Integer a = age, p = points, pl = playedMatches;
        Integer clay = wonMatches[0];
        Integer grass = wonMatches[1];
        Integer hard = wonMatches[2];
        return name + ", " + country + ", " + a.toString() + ", " + p.toString() + ", " + pl.toString() + ", " + "clay:" + clay.toString() + ", " + "grass:" + grass.toString() +  ", " + "hard:" + hard.toString() +"\n";
    }

    public TennisAthlete findStrongestTennisPlayer(TennisAthlete[] tennis_athletes) {
        TennisAthlete best_ath = tennis_athletes[0];
        float ratio = (float)(best_ath.wonMatches[0] + best_ath.wonMatches[1] + best_ath.wonMatches[2]) / best_ath.playedMatches;

        for (TennisAthlete ath : tennis_athletes) {
            float new_rat = (float)(ath.wonMatches[0] + ath.wonMatches[1] + ath.wonMatches[2]) / ath.playedMatches;
            if (ratio < new_rat){
                best_ath = ath;
                ratio = new_rat;
            }
        }

        return best_ath;
    }



}
