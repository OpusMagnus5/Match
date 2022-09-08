public class Team {
    private int id;
    private String name;
    private int playedMatches;
    private int wonMatches;
    private int lostMatches;
    private int drawMatches;

    private Team(Builder builder) {
        setId(builder.id);
        setName(builder.name);
        setPlayedMatches(builder.playedMatches);
        setWonMatches(builder.wonMatches);
        setLostMatches(builder.lostMatches);
        setDrawMatches(builder.drawMatches);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getPlayedMatches() {
        return playedMatches;
    }

    private void setPlayedMatches(int playedMatches) {
        this.playedMatches = playedMatches;
    }

    public int getWonMatches() {
        return wonMatches;
    }

    private void setWonMatches(int wonMatches) {
        this.wonMatches = wonMatches;
    }

    public int getLostMatches() {
        return lostMatches;
    }

    private void setLostMatches(int lostMatches) {
        this.lostMatches = lostMatches;
    }

    public int getDrawMatches() {
        return drawMatches;
    }

    private void setDrawMatches(int drawMatches) {
        this.drawMatches = drawMatches;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder {
        private int id;
        private String name;
        private int playedMatches;
        private int wonMatches;
        private int lostMatches;
        private int drawMatches;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder playedMatches(int playedMatches) {
            this.playedMatches = playedMatches;
            return this;
        }

        public Builder wonMatches(int wonMatches) {
            this.wonMatches = wonMatches;
            return this;
        }

        public Builder lostMatches(int lostMatches) {
            this.lostMatches = lostMatches;
            return this;
        }

        public Builder drawMatches(int drawMatches) {
            this.drawMatches = drawMatches;
            return this;
        }

        public Team build() {
            return new Team(this);
        }
    }
}
