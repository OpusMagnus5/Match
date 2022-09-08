public interface IMatchDAO {
    void saveMatch(Match match);
    int getNextId();
}
