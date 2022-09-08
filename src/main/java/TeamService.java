import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class TeamService implements ITeamService{
    @Inject
    ITeamDAO teamDAO;

    public void updateOrSaveNewTeam(Team team){
        Optional<Team> teamBox = getTeamById(team.getId());
        if (teamBox.isEmpty()){
            addNewTeam(Team team);
        }
    }

    public Optional<Team> getTeamById(int teamId){
        return teamDAO.getTeamById(teamId);
    }

    public void addNewTeam(Team team){
        Team newTeam = Team.builder(
                .id(teamDAO.getNextId())
                .
    }
}
