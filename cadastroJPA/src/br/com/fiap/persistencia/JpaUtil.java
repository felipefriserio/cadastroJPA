package br.com.fiap.persistencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Cadastro");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}