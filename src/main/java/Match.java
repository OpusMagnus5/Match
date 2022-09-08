public class Match {
    private int id;
    private Team team1;
    private Team team2;
    private int team1Score;
    private int team2Score;

    private Match(Builder builder) {
        setId(builder.id);
        setTeam1(builder.team1);
        setTeam2(builder.team2);
        setTeam1Score(builder.team1Score);
        setTeam2Score(builder.team2Score);
    }


    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public Team getTeam1() {
        return team1;
    }

    private void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    private void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    private void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    private void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder {
        private int id;
        private Team team1;
        private Team team2;
        private int team1Score;
        private int team2Score;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder team1(Team team1) {
            this.team1 = team1;
            return this;
        }

        public Builder team2(Team team2) {
            this.team2 = team2;
            return this;
        }

        public Builder team1Score(int team1Score) {
            this.team1Score = team1Score;
            return this;
        }

        public Builder team2Score(int team2Score) {
            this.team2Score = team2Score;
            return this;
        }

        public Match build() {
            return new Match(this);
        }
    }
}
