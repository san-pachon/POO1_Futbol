import java.util.Scanner;
public class Equipo{
    Scanner leer = new Scanner(System.in);
    public Team[] teams = new Team[4];
    public Equipo crearEquipo(){
        for (int i = 0; i < 4; i++) {
            System.out.println("=== Ingresando datos del equipo #" + (i + 1) + " ===");
            Team team = new Team();
            team.crearTeam();
            for (int j = 0; j < 6; j++) {
                System.out.println("---- Ingresando datos del jugador #" + (j + 1) + " para el equipo " + team.name + " ----");
                Player player = new Player();
                team.players[j] = player.crearPlayer();
            }
            teams[i] = team;
        }
        return this;
    }
}