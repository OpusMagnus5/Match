import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/match")
public class MatchResources {
    @Inject
    IMatchService matchService;

    @PUT
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response putMatch(MatchDTO matchDTO) {
        Team team1 = Team.builder()
                .id(matchDTO)

        Match match = Match.builder()
                .id(matchService.getNextId())
                .team1(matchDTO.getTeam1DTO())
                .team2(matchDTO.getTeam2DTO())
                .team1Score(matchDTO.team1Score)
                .team2Score(matchDTO.team2Score)
                .build();
        matchService.saveMatch(match);
        Team team1 =
    }

}
