package com.example.demo.Entities;


public class CrudEntities {

    public CrudEntities(Long id, String equiponombre, String equipociudad, String equipoliga, String equipoapodo) {
        this.id = id;
        this.equiponombre = equiponombre;
        this.equipociudad = equipociudad;
        this.equipoliga = equipoliga;
        this.equipoapodo = equipoapodo;
    }

 
    public CrudEntities(){
    }

  
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipoNombre() {
        return equiponombre;
    }

    public void setEquipoNombre(String equiponombre) {
        this.equiponombre = equiponombre;
    }

    public String getEquipoCiudad() {
        return equipociudad;
    }

    public void setEquipoCiudad(String equipociudad) {
        this.equipociudad = equipociudad;
    }

    public String getEquipoLiga() {
        return equipoliga;
    }

    public void setEquipoLiga(String equipoliga) {
        this.equipoliga = equipoliga;
    }

    public String getEquipoApodo() {
        return equipoapodo;
    }

    public void setEquipoApodo(String equipoapodo) {
        this.equipoapodo = equipoapodo;
    }

   
    @Override
    public String toString() {
        return "CrudEntities{" +
                "id=" + id +
                ", equiponombre='" + equiponombre + '\'' +
                ", equipociudad='" + equipociudad + '\'' +
                ", equipoliga='" + equipoliga + '\'' +
                ", equipoapodo='" + equipoapodo + '\'' +
                '}';
    }

    private Long id; 
    private String equiponombre; 
    private String equipociudad;
    private String equipoliga; 
    private String equipoapodo;
	public String getLiga() {
		return null;
	}
	
}
