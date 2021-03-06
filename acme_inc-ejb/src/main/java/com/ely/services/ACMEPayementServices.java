package com.ely.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ely.entities.Payement;
import com.ely.interfaces.ACMEPayementServicesRemote;


@Stateless
@LocalBean
public class ACMEPayementServices implements ACMEPayementServicesRemote {

	@PersistenceContext(unitName = "acme_inc-ejb")
	EntityManager em;
	
	@Override
	public int AddPayement(Payement payement) {
		em.persist(payement);
		return payement.getId();
	}
	
	@Override
	public void DeletePayement(int payementId) {
		em.remove(em.find(Payement.class, payementId));
	}
	
	@Override
	public void UpdatePayement(Payement payement) {
		em.merge(payement);
	}
	
	@Override
	public List<Payement> getAllPayements() {
		List<Payement> allProducts = em.createQuery("select e from Payement e", Payement.class).getResultList();				
		return allProducts;
	}
	
	

}
