import javax.enterprise.context.ApplicationScoped;
import java.util.HashSet;

@ApplicationScoped
public class MatchDAO implements IMatchDAO{
    private final HashSet<Match> matches = new HashSet<>();
    private static int nextId = 0;

    public void saveMatch(Match match){
        this.matches.add(match);
    }

    public int getNextId(){
        nextId++;
        return nextId;
    }
}
