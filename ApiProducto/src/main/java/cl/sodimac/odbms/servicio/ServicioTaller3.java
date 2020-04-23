package cl.sodimac.odbms.servicio;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.sodimac.odbms.dao.Taller3Repository;
import cl.sodimac.odbms.entidad.Taller3;

@RestController
@RequestMapping(value = "/taller3")
public class ServicioTaller3 {
	
	
	@Autowired
	Taller3Repository taller3Repo;
	
	@GetMapping(value = "/")
	public List<Taller3> getAll(){
		return (List<Taller3>) taller3Repo.findAll();
	}

	@PostMapping(value = "/")
	public Taller3 guardar (@RequestBody @Valid Taller3 objeto) {
	taller3Repo.save(objeto);
	return objeto;
	}
	
}
