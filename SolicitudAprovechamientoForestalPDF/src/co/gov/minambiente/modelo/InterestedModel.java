package co.gov.minambiente.modelo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author marit
 */
public class InterestedModel extends PersonModel {
    
    private String typePerson;
    private LinkedList<Integer> requests;
    private AttorneyModel attorney;
    private String interestedQuality;
    private ArrayList<String> projectCost;
    private boolean authorization;
    private String emailAdress;
    private long telephone;
    private AddressModel adress;
    
    //Constructors

    public InterestedModel(){
        super();
        this.typePerson = null;
        this.requests = new LinkedList();
        this.attorney = null;
        this.interestedQuality = null;
        this.projectCost = new ArrayList<>();
        this.authorization = false;
        this.emailAdress = null;
        this.telephone = 0;
        this.adress = new AddressModel();
    }

    public InterestedModel(String typePerson, LinkedList<Integer> requests,
            String interestedQuality, ArrayList projectCost,
            boolean authorization, String emailAdress,long telephone) {

        this.typePerson = typePerson;
        this.requests = requests;
        this.attorney = null;
        this.interestedQuality = interestedQuality;
        this.projectCost = projectCost;
        this.authorization = authorization;
        this.emailAdress = emailAdress;
        this.telephone = telephone;
    }

    public InterestedModel(String typePerson, LinkedList<Integer> requests,
           String interestedQuality, ArrayList projectCost,
           boolean authorization, String emailAdress, long telephone, 
           String name, String typeId, String id) {

        super(name, typeId, id);
        this.typePerson = typePerson;
        this.requests = requests;
        this.attorney = null;
        this.interestedQuality = interestedQuality;
        this.projectCost = projectCost;
        this.authorization = authorization;
        this.emailAdress = emailAdress;
        this.telephone = telephone;
    }
    
        public InterestedModel(String typePerson, int requestReference,
           String interestedQuality, ArrayList projectCost,
           boolean authorization, String emailAdress, long telephone, 
           String name, String typeId, String id) {

        super(name, typeId, id);
        this.typePerson = typePerson;
        this.requests = new LinkedList<>();
        this.requests.add(requestReference);
        this.attorney = null;
        this.interestedQuality = interestedQuality;
        this.projectCost = projectCost;
        this.authorization = authorization;
        this.emailAdress = emailAdress;
        this.telephone = telephone;
    }

    //Getters & setters
    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public LinkedList<Integer> getRequests() {
        return requests;
    }

    public void setRequests(LinkedList<Integer> requests) {
        this.requests = requests;
    }

    public String getInterestedQuality() {
        return interestedQuality;
    }

    public void setInterestedQuality(String interestedQuality) {
        this.interestedQuality = interestedQuality;
    }

    public AttorneyModel getAttorney() {
        return attorney;
    }

    public void setAttorney(AttorneyModel attorney) {
        this.attorney = attorney;
    }

    public ArrayList getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(ArrayList projectCost) {
        this.projectCost = projectCost;
    }

    public boolean isAuthorization() {
        return authorization;
    }

    public void setAuthorization(boolean authorization) {
        this.authorization = authorization;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public AddressModel getAdress() {
        return adress;
    }

    public void setAdress(AddressModel adress) {
        this.adress = adress;
    }

    @Override
    public void setId(String id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTypeId(String typeId) {
        super.setTypeId(typeId); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTypeId() {
        return super.getTypeId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
     
}
