package cl.sodimac.odbms.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.sodimac.odbms.entidad.Prdmstee;

@RestController //Clase de serivio
@RequestMapping(value = "/producto") //Punto de acceso

public class ProductoController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<List<Prdmstee>> getList(){
		
		List<Prdmstee> lista = new ArrayList<Prdmstee>();
		lista.add(new Prdmstee (1234,"Producto Creado"));
		lista.add(new Prdmstee (12345, "Producto Creado 2"));
		
		return new ResponseEntity<List<Prdmstee>>(lista,HttpStatus.OK);
		//return new ResponseEntity<List<Prdmstee>>(lista,HttpStatus.BAD_REQUEST);
	}

		
	
}
