/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador.database;

import co.gov.minambiente.modelo.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 *
 * @author daniel
 */
class ObjectInstantiator {

    private final LinkedHashMap hm;

    ObjectInstantiator(LinkedHashMap hm) {
        this.hm = hm;
    }

    RequestModel getRequestInstance() {
        return new RequestModel(
                (String) hm.get("reference"),
                (String) hm.get("typeRequest"),
                getInterestedInstance((LinkedHashMap) hm.get("interested")),
                getPropertiesList((ArrayList) hm.get("properties")),
                (String) hm.get("howToAcquire"),
                getCategoriesList((ArrayList) hm.get("categories")),
                (String) hm.get("intendedUse"),
                (String) hm.get("fileNumber"),
                (String) hm.get("actNumber")
        );
    }

    private InterestedModel getInterestedInstance(LinkedHashMap info) {
        return new InterestedModel(
                (String) info.get("typePerson"),
                getAttorney((LinkedHashMap) info.get("attorney")),
                (String) info.get("interestedQuality"),
                (ArrayList) info.get("projectCost"),
                (boolean) info.get("authorization"),
                (String) info.get("emailAdress"),
                (String) info.get("telephone"),
                (String) info.get("name"),
                (String) info.get("typeId"),
                (String) info.get("id")
        );
    }

    private AttorneyModel getAttorney(LinkedHashMap info) {
        return (info != null ? new AttorneyModel(
                (String) info.get("profesionalCard"),
                (String) info.get("name"),
                (String) info.get("typeId"),
                (String) info.get("id")
        ) : null);
    }

    private LinkedList<PropertyModel> getPropertiesList(ArrayList<LinkedHashMap> info) {
        LinkedList<PropertyModel> properties = new LinkedList();
        for (LinkedHashMap pHm : info) {
            properties.add(getPropertyInstance(pHm));
        }
        return properties;
    }

    private PropertyModel getPropertyInstance(LinkedHashMap info) {
        return new PropertyModel(
                (String) info.get("typeProperty"),
                (String) info.get("name"),
                (String) info.get("surface"),
                getAddressInstance((LinkedHashMap) info.get("adress")),
                (String) info.get("realStateRegistration"),
                (String) info.get("cadastralIdNumber"),
                getCoordinatesList((ArrayList) info.get("coordiantes")),
                getSpeciesList((ArrayList) info.get("species"))
        );
    }

    private AddressModel getAddressInstance(LinkedHashMap info) {
        return new AddressModel(
                (String) info.get("street"),
                (String) info.get("typeArea"),
                (String) info.get("department"),
                (String) info.get("municipality"),
                (String) info.get("sidewalk")
        );
    }

    private LinkedList<SpecieModel> getSpeciesList(ArrayList<LinkedHashMap> info) {
        LinkedList<SpecieModel> species = new LinkedList();
        info.forEach((sHm) -> {
            species.add(getSpecieInstance(sHm));
        });
        return species;
    }

    private SpecieModel getSpecieInstance(LinkedHashMap info) {
        return new SpecieModel(
                (double) info.get("quantity"),
                (String) info.get("unit"),
                (String) info.get("commonName"),
                (String) info.get("scientificName"),
                (String) info.get("habit"),
                (String) info.get("closure"),
                (String) info.get("threatClassification"),
                (String) info.get("partUsed")
        );
    }

    private LinkedList<CoordinateModel> getCoordinatesList(ArrayList<LinkedHashMap> info) {
        LinkedList<CoordinateModel> coordinates = new LinkedList();
        if (info.size() > 0) {
            final boolean plane;
            if (info.size() > 0) {
                plane = info.get(0).keySet().size() == 3;
            } else {
                plane = false; // Just initializing
            }
            info.forEach((cHm) -> {
                if (plane) {
                    coordinates.add(getPlaneCoordinateInstance(cHm));
                } else {
                    coordinates.add(getGeographicCoordinateInstance(cHm));
                }
            });
        }
        return coordinates;
    }

    private PlaneCoordinateModel getPlaneCoordinateInstance(LinkedHashMap info) {
        return new PlaneCoordinateModel(
                (double) info.get("x"),
                (double) info.get("y"),
                (short) info.get("point")
        );
    }

    private GeographicCoordinateModel getGeographicCoordinateInstance(LinkedHashMap info) {
        return new GeographicCoordinateModel(
                (ArrayList) info.get("LATITUDE"),
                (ArrayList) info.get("LONGITUDE"),
                (double) info.get("ALTITUDE"),
                (String) info.get("ORIGIN"),
                (short) info.get("point")
        );
    }

    private LinkedList<CategoryModel> getCategoriesList(ArrayList<LinkedHashMap> info) {
        LinkedList<CategoryModel> categories = new LinkedList();
        info.forEach((pHm) -> {
            categories.add(getCategoryInstance(pHm));
        });
        return categories;
    }

    private CategoryModel getCategoryInstance(LinkedHashMap info) {
        String[] keys = (String[]) info.keySet().toArray();
        CategoryModel category;
        if (keys.length > 1) {
            switch (keys[1]) {
                case "typeUtilization":
                    if (((String) info.get("name")).equals(" - nombre de categoria A")) {
                        category = new CategoryAModel(
                                (String) info.get("typeUtilization"),
                                (String) info.get("name")
                        );
                    } else {
                        category = new CategoryDModel(
                                (String) info.get("typeUtilization"),
                                (String) info.get("name")
                        );
                    }
                    break;
                case "typeOperation":
                    category = new CategoryBModel(
                            (String) info.get("typeOperation"),
                            (ArrayList) info.get("revenuesExpected"),
                            (String) info.get("associatedCategory"),
                            (String) info.get("name")
                    );
                    break;
                default:
                    switch (keys.length) {
                        case 3:
                            category = new CategoryC1Model(
                                    (String) info.get("locationOrType"),
                                    (String) info.get("name"),
                                    (String) info.get("individualStatus")
                            );
                            break;
                        case 5:
                            category = new CategoryC3Model(
                                    (String) info.get("locationOrType"),
                                    (String) info.get("name"),
                                    (boolean) info.get("logging"),
                                    (String) info.get("individualStatus"),
                                    (String) info.get("cause")
                            );
                            break;
                        default:
                            category = new CategoryC4Model(
                                    (boolean) info.get("logging"),
                                    (String) info.get("activity"),
                                    (String) info.get("locationOrType"),
                                    (String) info.get("name")
                            );
                            break;
                    }
                    break;
            }
        } else {
            category = new CategoryC2Model(
                    (String) info.get("locationOrType"),
                    (String) info.get("name")
            );
        }
        return category;
    }

}
