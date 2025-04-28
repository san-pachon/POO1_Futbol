
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
       Player pl1 = new Player();
        Player pl2 = new Player();
        Player pl3 = new Player("One Dollar", 15);
        System.out.println(pl3.dorsal);
        //pl2.crearPlayer();
        //System.out.println("Ingrese el nombre del jugador");
        pl1.name = "Puttazzo";
        pl1.dorsal=9;
        pl1.team="Cueritos";
        pl1.position="Aguador";
        pl1.weight=45.2;
        pl1.height=172.0;
        pl1.nationality="Bolivian";
        pl1.isActive=true;
        pl1.birthday= LocalDate.of(2006,10,7);
        System.out.println(pl1);
        Team team1 = new Team();
        team1.id=1;
        team1.name="Cueritos";
        team1.dt=new Player();
        team1.city="Marvel";
        team1.stadium="Tony Stadium";
        team1.players[0]=pl1;

        System.out.println(team1.players[0].position);
        System.out.println(pl2.name);

    }
}