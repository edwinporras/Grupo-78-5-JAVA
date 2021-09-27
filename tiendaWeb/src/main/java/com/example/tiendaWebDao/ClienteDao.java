package com.example.tiendaWebDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.example.tiendaWedDto.ClienteVO;

public class ClienteDao {
	
	public ArrayList<ClienteVO> listarClientes(){
		ArrayList<ClienteVO> listarClientes = new ArrayList<ClienteVO>();
		Conexion conex = new Conexion();
		
		try {
			String query = "SELECT id_cliente, nombre, direccion FROM clientes";
			PreparedStatement consulta = conex.getConnection().prepareStatement(query);
			ResultSet res = consulta.executeQuery();
			
			while (res.next()) { //va campo x campo hasta completar la tabla
				
				//CAMBIAR APELLIDO // CAMBIAR CAMPOS DE LA TABLA CLIENTE
				ClienteVO cliente = new ClienteVO();
				cliente.setIdCliente(res.getInt("id_cliente"));
				cliente.setNombre(res.getString("nombre"));
				cliente.setDireccion(res.getString("direccion"));
				listarClientes.add(cliente);
			}
			res.close();
			consulta.close();
			conex.desconectar();
		} catch (Exception e) {
			System.out.println("error cliente DAO" + e);
		}
		
		return listarClientes;
	}
	
}
