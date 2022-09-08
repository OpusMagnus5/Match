public class MatchDTO {
    private int id;
    private TeamDTO team1DTO;
    private TeamDTO team2DTO;
    private int team1Score;
    private int team2Score;

    private MatchDTO(Builder builder) {
        setId(builder.id);
        setTeam1DTO(builder.team1DTO);
        setTeam2DTO(builder.team2DTO);
        setTeam1Score(builder.team1Score);
        setTeam2Score(builder.team2Score);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public TeamDTO getTeam1DTO() {
        return team1DTO;
    }

    private void setTeam1DTO(TeamDTO team1DTO) {
        this.team1DTO = team1DTO;
    }

    public TeamDTO getTeam2DTO() {
        return team2DTO;
    }

    private void setTeam2DTO(TeamDTO team2DTO) {
        this.team2DTO = team2DTO;
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
        private TeamDTO team1DTO;
        private TeamDTO team2DTO;
        private int team1Score;
        private int team2Score;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder team1DTO(TeamDTO team1DTO) {
            this.team1DTO = team1DTO;
            return this;
        }

        public Builder team2DTO(TeamDTO team2DTO) {
            this.team2DTO = team2DTO;
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

        public MatchDTO build() {
            return new MatchDTO(this);
        }
    }
}
