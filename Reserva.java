public class Reserva
{
    //Variables
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Fecha fechaInicio;
    private Fecha fechaFin;
    private double costoTotal;;

    //Constructor
    public Reserva(){
    }
    
    public Reserva(Cliente cliente, Vehiculo vehiculo, Fecha fechaInicio, Fecha FechaFin, double costoTotal){
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoTotal = costoTotal;
    }
}
