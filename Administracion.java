import java.util.List;
import java.util.ArrayList;

public class Administracion
{
    //Variables
    private List<Cliente> clientes;
    private List<Vehiculo> vehiculos;
    private List<Reserva> reservas;

    //Constructor
    public Administracion(){
        clientes = new ArrayList<>();
        vehiculos = new ArrayList<>();
        reservas = new ArrayList<>();
    }
    
}
