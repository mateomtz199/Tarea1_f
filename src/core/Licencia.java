package core;

import java.util.Date;

/**
 *
 * @author Yo
 */
public class Licencia extends Persona{
    private String NoControl;
    private String tipoLicencia;
    private Date fechaRegistro;
    private Date fechaVencimiento;
    private int vigencia;
    private String telEmergencia;
    private String telefono;
    private String observaciones;

    public Licencia() {
    }
    
    public Licencia(String NoControl, String tipoLicencia, Date fechaRegistro, Date fechaVencimiento, int vigencia, String telEmergencia, String telefono, String observaciones) {
        this.NoControl = NoControl;
        this.tipoLicencia = tipoLicencia;
        this.fechaRegistro = fechaRegistro;
        this.fechaVencimiento = fechaVencimiento;
        this.vigencia = vigencia;
        this.telEmergencia = telEmergencia;
        this.telefono = telefono;
        this.observaciones = observaciones;
    }
    
    
    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public void setTelEmergencia(String telEmergencia) {
        this.telEmergencia = telEmergencia;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public String getNoControl() {
        return NoControl;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getVigencia() {
        return vigencia;
    }

    public String getTelEmergencia() {
        return telEmergencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getObservaciones() {
        return observaciones;
    }
    
}
