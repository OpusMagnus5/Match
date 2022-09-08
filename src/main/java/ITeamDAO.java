import java.util.Optional;

public interface ITeamDAO {
    Optional<Team> getTeamById(int teamId);
    int getNextId();
}
