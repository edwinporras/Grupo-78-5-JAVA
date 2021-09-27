package com.example.tiendaWeb;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tiendaWebDao.ClienteDao;
import com.example.tiendaWedDto.ClienteVO;

@RestController
public class ClienteController {
	
	@RequestMapping("/listarCliente")
	public ArrayList<ClienteVO> listar() {
		ClienteDao dao = new ClienteDao();
		return dao.listarClientes();
	}
}
