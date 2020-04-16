package cl.sodimac.odbms.entidad;

public class Orgmstee {

	
	private Integer org_lvl_child;
	private String  org_name_full;
	private Integer org_lvl_number;
	
	public Orgmstee (Integer org_lvl_child, String org_name_full, Integer org_lvl_number) {
		super();
		this.org_lvl_child = org_lvl_child;
		this.org_name_full = org_name_full;
		this.org_lvl_number = org_lvl_number;
		
		
	}
}
