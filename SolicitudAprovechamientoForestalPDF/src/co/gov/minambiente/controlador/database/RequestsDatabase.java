/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.minambiente.controlador.database;

import co.gov.minambiente.controlador.Utils;
import java.util.ArrayList;
import co.gov.minambiente.modelo.RequestModel;

/**
 *
 * @author daniel
 */
public class RequestsDatabase{
    
    private static ArrayList<RequestModel> db = new ArrayList();
    private static final int REFERENCE_LENGTH = 10;
    
    /**
     * Adds a request into the database
     * @param request
     * @return true if the request was added successfully, false otherwise
     */
    public static boolean add(RequestModel request){
        return db.add(request);
    }
    
    /**
     * Deletes a request from the database
     * @param reference Reference to request to be deleted
     * @return true if the request was deleted successfully, false if it could not be found
     */
    public static boolean delete(String reference){
        RequestModel r;
        if ((r = get(reference)) != null){
            db.remove(r);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Updates a request of the database
     * @param reference Reference of request to be updated
     * @param newRequest Request to replace the existing one
     * @return true if the request was updated successfully, false if it could not be found
     */
    public static boolean update(String reference, RequestModel newRequest){
        RequestModel r;
        if ((r = get(reference)) != null){
            db.set(db.indexOf(r), newRequest);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Gets a request from the database
     * @param reference Reference of request to search for
     * @return Found request or null if it could not be found
     */
    public static RequestModel get(String reference){
        for (RequestModel r : db){
            if (r.getREFERENCE().equals(reference)){
                return r;
            }
        }
        return null;
    }
    
    public static ArrayList<RequestModel> searchByReference(String reference){
        ArrayList<RequestModel> list = new ArrayList();
        RequestModel r;
        if ((r = get(reference)) != null){
            list.add(r);
        }
        return list;
    }
 
    /**
     * Gets a list containing all requests associated to a person's id
     * @param id Person's id
     * @return List of requests
     */
    public static ArrayList<RequestModel> searchById(String id){
        ArrayList<RequestModel> list = new ArrayList();
        db.stream().filter((r) -> (r.getInterested().getId().equals(id))).forEachOrdered((r) -> {
            list.add(r);
        });
        return list;
    }
    
    /**
     * Gets the whole database
     * @return Database as ArrayList
     */
    public static ArrayList<RequestModel> getDatabase(){
        return db;
    }
    
    /**
     * Gets the whole database as an array
     * @return Database as array
     */
    public static RequestModel[] getDatabaseAsArray(){
        RequestModel[] array = new RequestModel[db.size()];
        int i = 0;
        db.forEach((req) -> {
            array[i] = req;
        });
        return array;
    }
    
    /**
     * Gets a new request reference
     * @return reference
     */
    public static String getNewReference(){
        String ref;
        while (true){
            ref = String.valueOf(Math.random()).substring(2, 2+REFERENCE_LENGTH);
            if (get(ref) == null){
                break;
            }
        }
        return ref;
    }
    
    public static String requestSummary(RequestModel request){
        return request.getREFERENCE() + "  -  " + request.getInterested().getName() + "("
                + request.getInterested().getTypeId() + " " + request.getInterested().getId() + ")";
    }
    
    public static String[] getSearchResult(ArrayList<RequestModel> requests){
        ArrayList<String> list = new ArrayList();
        requests.forEach((r) -> {
            list.add(requestSummary(r));
        });
        return Utils.toStringArray(list);
    }
}