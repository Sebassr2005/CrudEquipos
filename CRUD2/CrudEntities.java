package Entities;

public class CrudEntities {

   
    public CrudEntities(Long id, String nombre, String ciudad, String liga, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.liga = liga;
        this.codigo = codigo;
    }

    
    public CrudEntities() {
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

  
    @Override
    public String toString() {
        return "EquipoFutbolEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", liga='" + liga + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }

  
    private Long id; 
    private String nombre; 
    private String ciudad;
    private String liga; 
    private String codigo; 
}
