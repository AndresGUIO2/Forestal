package co.gov.minambiente.modelo;

/**
 *
 * @author Natalia García
 */
public class CategoryC3Model extends CategoryCModel{
    private boolean logging;
    private String individualStatus;
    private String cause;

    public CategoryC3Model(String locationOrType) {
        super(locationOrType);
        this.logging = false;
        this.individualStatus = "";
        this.cause = "";
    }
    
    public CategoryC3Model(String locationOrType, boolean logging, String individualStatus, String cause) {
        super(locationOrType);
        this.logging = false;
        this.individualStatus = individualStatus;
        this.cause = cause;
    }

    public boolean isLogging() {
        return logging;
    }

    public void setLogging(boolean logging) {
        this.logging = logging;
    }

    public String getIndividualStatus() {
        return individualStatus;
    }

    public void setIndividualStatus(String individualStatus) {
        this.individualStatus = individualStatus;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
