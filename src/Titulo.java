import java.util.Date;
public abstract class Titulo{

    //atributos
    private Integer cantidadMaterias;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private boolean selladoMinisterio;
    private boolean selladoInstituto;
    private Persona persona;

    //constructor
    public Titulo(Integer cantidadMaterias, Date fechaInicio, Date fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto) {
        this.cantidadMaterias = cantidadMaterias;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
    }

    //métodos
    public abstract boolean puedeEjercer();

    public Integer getCantidadMaterias() {
        return cantidadMaterias;
    }

    public void setCantidadMaterias(Integer cantidadMaterias) {
        this.cantidadMaterias = cantidadMaterias;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public boolean isSelladoMinisterio() {
        return selladoMinisterio;
    }

    public void setSelladoMinisterio(boolean selladoMinisterio) {
        this.selladoMinisterio = selladoMinisterio;
    }

    public boolean isSelladoInstituto() {
        return selladoInstituto;
    }

    public void setSelladoInstituto(boolean selladoInstituto) {
        this.selladoInstituto = selladoInstituto;
    }
}
