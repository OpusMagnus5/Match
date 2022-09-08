import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class MatchService implements IMatchService{
    @Inject
    IMatchDAO matchDAO;

    public void saveMatch(Match match){
        matchDAO.saveMatch(match);
    }

    public int getNextId(){
        return matchDAO.getNextId();
    }
}
