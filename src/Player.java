import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Player{
    //Atributos de la clase
    public String nombre;
    public int dorsal;
    public String posicion;
    public double peso;
    public double altura;
    public LocalDate birthday;
    public String nacionalidad;
    public boolean isActive;
    public Player crearPlayer(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese el dorsal: ");
        dorsal = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese la posición: ");
        posicion = leer.nextLine();
        System.out.print("Ingrese el peso: ");
        peso = leer.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = leer.nextDouble();
        leer.nextLine();
        // System.out.print("Ingrese la fecha de nacimiento (yyyy-mm-dd): ");
        // birthday = LocalDate.parse(leer.nextLine()); // si quieres usarlo
        System.out.print("Ingrese la nacionalidad: ");
        nacionalidad = leer.nextLine();
        isActive = true;
        return this;
    }
}