package Repositories.Hibernate;

import Entities.Usuario;
import Repositories.UsuarioRepository;
import Utils.JpaManager;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class HibernateUsuarioRepository implements UsuarioRepository {

    private final EntityManager entityManager;

    public HibernateUsuarioRepository() {
        this.entityManager = JpaManager.getEntityManager();
    }

    @Override
    public Usuario create(Usuario usuario) {
        try {
            this.entityManager.getTransaction().begin();
            this.entityManager.persist(usuario);
            this.entityManager.getTransaction().commit();
        } finally {
            this.entityManager.close();
        }
        return null;
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        try {
            TypedQuery<Usuario> query = this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", Usuario.class);
            query.setParameter("email", email);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            this.entityManager.close();
        }
    }
}
