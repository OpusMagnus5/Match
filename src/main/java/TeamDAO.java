import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;
import java.util.Optional;

@ApplicationScoped
public class TeamDAO implements ITeamDAO{
    private HashSet<Team> teams = new HashSet<>();
    private static int nextId = 0;

    public Optional<Team> getTeamById(int teamId){
        for(Team team : this.teams){
            if (team.getId() == teamId){
                return Optional.of(team)
            }
        }
        return Optional.empty();
    }

    public int getNextId() {
        nextId++;
        return nextId;
    }

    public void saveTeam(Team team){
        this.teams.add(team);
    }
}
