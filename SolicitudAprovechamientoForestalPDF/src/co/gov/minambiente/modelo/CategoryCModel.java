package co.gov.minambiente.modelo;

/**
 *
 * @author Natalia García
 */
public class CategoryCModel extends CategoryModel{
    private String locationOrType;
    
    public CategoryCModel() {
        super("C. Árboles Aislados");
        this.locationOrType = "";
    }
    
    public CategoryCModel(String locationOrType) {
        super("C. Árboles Aislados");
        this.locationOrType = locationOrType;
    }

    public String getLocationOrType() {
        return locationOrType;
    }

    public void setAdquisitionMode(String locationOrType) {
        this.locationOrType = locationOrType;
    }
}
