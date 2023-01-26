package com.eya.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Example JPA entity.
 * <p>
 * To use it, get access to a JPA EntityManager via injection.
 * <p>
 * {@code
 *
 * @Inject EntityManager em;
 * <p>
 * public void doSomething() {
 * MyEntity entity1 = new MyEntity();
 * entity1.field = "field-1";
 * em.persist(entity1);
 * <p>
 * List<MyEntity> entities = em.createQuery("from MyEntity", MyEntity.class).getResultList();
 * }
 * }
 */
@Entity(name = "moviedb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Moviedb extends PanacheEntity {

	public String tconst;
	public String titletype;
	public String primarytitle;
	public String originaltitle;
	public String isadult;
	public String startyear;
	public String endyear;
	public String runtimeminutes;
	public String genres;
}
