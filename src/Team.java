import java.util.Scanner;
public class Team{
    public String name;
    public String dt;
    public Player[] players = new Player[6];
    public String city;
    public String estadio;
    public Team crearTeam(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del equipo: ");
        name = leer.nextLine();
        System.out.print("Ingrese el nombre del dt: ");
        dt = leer.nextLine();
        System.out.println("Se ingresarán 6 jugadores para el equipo " + name);
        System.out.print("Ingrese la ciudad del equipo: ");
        city = leer.nextLine();
        System.out.print("Ingrese el nombre del estadio: ");
        estadio = leer.nextLine();
        return this;
    }
}