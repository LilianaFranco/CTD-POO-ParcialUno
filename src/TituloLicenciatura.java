import java.util.Date;

public class TituloLicenciatura extends Titulo implements compareTo{

    //Atributos
    private String temaTesis;
    private Date fechaEntrega;
    private Integer cantidadInvestigaciones;

    //Constructor
    public TituloLicenciatura(Integer cantidadMaterias, Date fechaInicio, Date fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto) {
        super(cantidadMaterias, fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto);
    }

    //Métodos
    @Override
    public boolean puedeEjercer(){
        if(isSelladoInstituto() == true && isSelladoMinisterio() == true){
            return true;
        }
        return false;
    };

    @Override
    public int compareTo(Object Object){
        // Devuelve 0 si son iguales
        // Devuelve 1 si la licenciatura actual tiene más trabajo de investigación
        // Devuelve 2 si la licenciatura comparada tiene más trabajo de investigación
        TituloLicenciatura tituloLicenciatura = (TituloLicenciatura) Object;
        if(this.cantidadInvestigaciones == tituloLicenciatura.getCantidadInvestigaciones()){
            return 0;
        }else if(this.cantidadInvestigaciones > tituloLicenciatura.getCantidadInvestigaciones()){
            return 1;
        }else{
            return 0;
        }
    }

    public String getTemaTesis() {
        return temaTesis;
    }

    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Integer getCantidadInvestigaciones() {
        return cantidadInvestigaciones;
    }

    public void setCantidadInvestigaciones(Integer cantidadInvestigaciones) {
        this.cantidadInvestigaciones = cantidadInvestigaciones;
    }
}
