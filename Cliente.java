public class Cliente
{
    // instance variables    
    private int idCliente;
    private String nombre;
    private String dir;
    private String tlf;
    private String email;

    //Constructor 
    public Cliente(){
    }
    
    public Cliente(int idCliente, String nombre, String dir, String tlf, String email){
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dir = dir;
        this.tlf = tlf;
        this.email = email;
    }

    //Getters & Setters
    public int getIdCliente(){
        return idCliente;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(String dir){
        return dir;
    }
    public String getTelefono(){
        return tlf;
    }
    public String getEmail(){
        return email;
    }
    
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDirrecion(String dir){
        this.dir = dir;
    }
    public void setTelefono(String tlf){
        this.tlf = tlf;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
