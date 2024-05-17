public class Vehiculo
{
    //Variables
    private String modelo;
    private int anio;
    private String placa;
    private double tarifaDia;
    private boolean disponibilidad;
    
    //Constructor
    public Vehiculo(){
    }
    
    public Vehiculo(String modelo, int anio, String placa, double tarifaDia, boolean disponibilidad){
        this.modelo = modelo;
        this.anio = anio;
        this.placa = placa;
        this.tarifaDia = tarifaDia;
        this.disponibilidad = disponibilidad;
    }

    //Getters & Setters
    public String getModelo(){
        return modelo;
    }
    public int getAnio(){
        return anio;
    }
    public String getPlaca(){
        return placa;
    }
    public double getTarifaDia(){
        return tarifaDia;
    }
    public boolean getDisponibilidad(){
        return disponibilidad;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setIdCliente(double tarifaDia){
        this.tarifaDia = tarifaDia;
    }
    public void setDisponibilidad(boolean Disponibilidad){
        this.disponibilidad = Disponibilidad;
    }
}
