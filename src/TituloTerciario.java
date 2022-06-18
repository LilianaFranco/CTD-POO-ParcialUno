import java.util.Date;

public class TituloTerciario extends Titulo{

    //Atributos
    private String validacion;

    //Constructor
    public TituloTerciario(Integer cantidadMaterias, Date fechaInicio, Date fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto) {
        super(cantidadMaterias, fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto);
    }

    // Métodos
    @Override
    public boolean puedeEjercer(){
        if(isSelladoInstituto() == true && isSelladoMinisterio() == true){
            return true;
        }
        return false;
    };

    public boolean validacionNacional(){
        if(this.validacion == "Nacional"){
            return true;
        }
        return false;
    };
};
