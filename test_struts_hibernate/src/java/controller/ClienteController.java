/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ModelDriven;
import java.util.ArrayList;
import model.dao.ClienteDAO;
import model.dao.ClienteDAOImpl;
import model.entities.Cliente;

/**
 *
 * @author omaryahir
 */
public class ClienteController implements ModelDriven<Cliente> {

	Cliente cliente=new Cliente();
	ArrayList<Cliente> listaClientes=new ArrayList();
	ClienteDAO clienteDAO;
	String msg="";

	@Override
	public Cliente getModel() {
		return cliente;
	}

	public ClienteController(){
		clienteDAO = new ClienteDAOImpl();
	}
	
    	public String agregarInicio(){
        	return "exito";
    	}

    	public String listarInicio(){
        	return "exito";   
    	}

	public String agregar(){
		if(clienteDAO.agregar(cliente))
			msg="Se agrego un nuevo cliente";
		else
			msg="Ocurrió un error";
		return "fin"; 
	}

	public String listar(){
		listaClientes = clienteDAO.listar();
		return "fin";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}

	public String getMsg() {
		return msg;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
		
	
	
}
