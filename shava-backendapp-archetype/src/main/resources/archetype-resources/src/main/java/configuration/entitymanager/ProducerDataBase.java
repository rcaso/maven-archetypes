package ${package}.configuration.entitymanager;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.shava.entitymanager.producer.DbApplication;


/**
 * <ul>
 * <li>Copyright 2016 Ministerio Publico - Fiscalia de la Nacion. Todos los derechos reservados.</li>
 * </ul> 
 * 
 * La Class ProducerDataBase.
 * 
 * @author OSIS
 * @version 1.0 , 08/04/2016
 */
public class ProducerDataBase {
	
	/** La em. */
	@Produces
	@DbApplication
	@PersistenceContext(unitName = "CHANGEME")
	private EntityManager em;

	/**
	 * Instancia un nuevo producer data base.
	 */
	public ProducerDataBase() {
		// TODO Auto-generated constructor stub
	}

}
