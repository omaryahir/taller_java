/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import model.entities.Cliente;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author omaryahir
 */
public class ClienteDAO {

	Transaction transaction;
	Session session;

	public boolean agregar(Cliente cliente) {
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(cliente);
			transaction.commit();
			return true;
		} catch(Exception e) {
			if(transaction!=null){
				transaction.rollback();
			}
			return false;
		}
	}

	public ArrayList<Cliente> listar() {
		try{
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			return (ArrayList<Cliente>)session.createQuery("from Cliente").list();
		} catch (Exception e) {
			return null;
		}
	}
	
}
