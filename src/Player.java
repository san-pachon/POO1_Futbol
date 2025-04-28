import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Player {

    Scanner leer = new Scanner(System.in);
    //Atributos de la clase

    public String name;
    public int dorsal;
    public String team;
    public String position;
    public double weight;
    public double height;
    public LocalDate birthday;
    public String nationality;
    public boolean isActive;

    public Player()
    {
        System.out.println("Player por Constructor");
        name = leer.nextLine();
        dorsal = leer.nextInt();
        team = leer.next();
    }

    public Player(String name, int dorsal)
    {
        this.name = name;
        this.dorsal = dorsal;
    }

    public Player crearPlayer()
    {
        System.out.println("Creando el player");
        System.out.println("Ingresar Nombre");
        name = leer.nextLine();
        System.out.println("Ingresar Dorsal");
        dorsal = leer.nextInt();
        System.out.println("Ingresar Team");
        team = leer.nextLine();
        System.out.println("Ingresar Position");
        position = leer.nextLine();
        System.out.println("Ingresar Weight");
        weight = leer.nextDouble();
        System.out.println("Ingresar Height");
        height = leer.nextDouble();
        //System.out.println("Ingresar birthday");
        //birthday = LocalDate.parse(leer.nextLine());
        System.out.println("Ingresar nationality");
        nationality = leer.nextLine();
        isActive = true;

        return this;

    }

}
