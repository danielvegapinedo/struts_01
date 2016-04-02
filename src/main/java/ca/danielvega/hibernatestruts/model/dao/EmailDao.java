package ca.danielvega.hibernatestruts.model.dao;

import ca.danielvega.hibernatestruts.model.entities.PEmailTypes;
import java.util.List;

/**
 * Create, Read, Update and Delete
 * @author daniel_d
 */
public interface EmailDao {
    
    public boolean saveType(PEmailTypes type);
    
    public boolean updateType(PEmailTypes type);
    
    public boolean deleteType(PEmailTypes type);
    
    public boolean deleteType(String type);
    
    public List<PEmailTypes> listTypes();
    
    public PEmailTypes findType(String emailType);
}
