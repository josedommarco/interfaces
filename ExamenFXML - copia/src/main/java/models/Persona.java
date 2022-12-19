package models;

/**
 *
 * @author josel
 */
public class Persona {
    
    private String nombre;
    private String sexo;
    private Integer edad;
    private Double peso;
    private Integer altura;
    private String actividad;
    private Double GET;
    private Double GER;

    public Double getGET() {
        return GET;
    }

    public void setGET(Double GET) {
        this.GET = GET;
    }

    public Double getGER() {
        return GER;
    }

    public void setGER(Double GER) {
        this.GER = GER;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Persona() {
    
    }
    
}
