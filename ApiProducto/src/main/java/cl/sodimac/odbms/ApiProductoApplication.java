package cl.sodimac.odbms;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.sodimac.odbms.dao.ProveedorRepository;
import cl.sodimac.odbms.entidad.Prdmstee;

@SpringBootApplication
public class ApiProductoApplication implements CommandLineRunner{

	@Autowired
	DataSource datasource;
	
	@Autowired
	ProveedorRepository proveedorRepository; 
	
//	@Override
	public static void main(String[] args) {
		SpringApplication.run(ApiProductoApplication.class, args);
	}

	public void run(String... arg0) throws Exception {
        datasource.getConnection();
        System.out.println("HOLA MUNDO SPRING BOOT");
        System.out.println("DATASOURCE = " + datasource);
        System.out.println("\n1.findAll()...");
        for (Prdmstee ptemp : proveedorRepository.findAll()) {
            System.out.println(ptemp);
        }
       
       
    }
}
