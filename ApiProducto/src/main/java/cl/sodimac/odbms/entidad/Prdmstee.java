package cl.sodimac.odbms.entidad;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Prdmstee {
	@Id
	
	private Integer prd_lvl_child;
	private String prd_name_full;
	
	
		

}
