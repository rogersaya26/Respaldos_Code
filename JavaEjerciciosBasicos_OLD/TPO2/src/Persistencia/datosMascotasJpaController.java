package Persistencia;

import Logica.datosMascotas;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class datosMascotasJpaController implements Serializable {

    public datosMascotasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public datosMascotasJpaController() {
        
        emf = Persistence.createEntityManagerFactory("TPO2PU");
    }

    public void create(datosMascotas datosMascotas) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(datosMascotas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (finddatosMascotas(datosMascotas.getNum_cliente()) != null) {
                throw new PreexistingEntityException("datosMascotas " + datosMascotas + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(datosMascotas datosMascotas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datosMascotas = em.merge(datosMascotas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = datosMascotas.getNum_cliente();
                if (finddatosMascotas(id) == null) {
                    throw new NonexistentEntityException("The datosMascotas with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            datosMascotas datosMascotas;
            try {
                datosMascotas = em.getReference(datosMascotas.class, id);
                datosMascotas.getNum_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The datosMascotas with id " + id + " no longer exists.", enfe);
            }
            em.remove(datosMascotas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<datosMascotas> finddatosMascotasEntities() {
        return finddatosMascotasEntities(true, -1, -1);
    }

    public List<datosMascotas> finddatosMascotasEntities(int maxResults, int firstResult) {
        return finddatosMascotasEntities(false, maxResults, firstResult);
    }

    private List<datosMascotas> finddatosMascotasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(datosMascotas.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public datosMascotas finddatosMascotas(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(datosMascotas.class, id);
        } finally {
            em.close();
        }
    }

    public int getdatosMascotasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<datosMascotas> rt = cq.from(datosMascotas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
