package ca.danielvega.hibernatestruts.model.dao;

import ca.danielvega.hibernatestruts.model.entities.PEmailTypes;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmailDaoImpl implements EmailDao {

    private static final Logger LOGGER = LogManager.getLogger(EmailDaoImpl.class);
//    private Transaction transaction;
    private Session session;

    private void loadSession() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        if (!session.isOpen()) {
           session =  HibernateUtil.getSessionFactory().openSession();
        }
    }

    @Override
    public boolean saveType(PEmailTypes type) {
        try {
            loadSession();
            session.beginTransaction();
            session.save(type);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOGGER.error("Cannot create an Email Type", e);
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean updateType(PEmailTypes type) {
        try {
            loadSession();
            session.beginTransaction();
            session.update(type);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOGGER.error("Cannot create an Email Type", e);
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean deleteType(PEmailTypes type) {
        try {
            loadSession();
            session.beginTransaction();
            session.delete(type);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            LOGGER.error("Cannot delete an Email Type", e);
            session.getTransaction().rollback();
            return false;
        }
    }

    public boolean deleteType(String type) {
        deleteType(findType(type));
        return true;
    }

    @Override
    public List<PEmailTypes> listTypes() {
        try {
            loadSession();
            session.beginTransaction();
            List<PEmailTypes> result = session.createQuery("from PEmailTypes").list();
            session.getTransaction().commit();

            return result;
        } catch (Exception e) {
            LOGGER.error("Cannot list Email Types", e);
            session.getTransaction().rollback();
            return null;
        }
    }

    @Override
    public PEmailTypes findType(String emailType) {
        try {
            loadSession();
            session.beginTransaction();
            PEmailTypes result = (PEmailTypes) session.get(PEmailTypes.class, emailType);
            session.getTransaction().commit();

            return result;
        } catch (Exception e) {
            LOGGER.error("Cannot find the Email Types", e);
            session.getTransaction().rollback();
            return null;
        }
    }

}
