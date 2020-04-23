package cl.sodimac.odbms.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data

public class Taller3 {

	
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "TALLER3_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "mySeqGen")
	
	private Integer id;
	
	@NotBlank
	private String nombre;	
	
}
