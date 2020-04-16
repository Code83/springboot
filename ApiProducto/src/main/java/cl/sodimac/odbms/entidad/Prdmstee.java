package cl.sodimac.odbms.entidad;

public class Prdmstee {
	
	private Integer prd_lvl_child;
	private String prd_name_full;
	
	
		
	public Prdmstee(Integer prd_lvl_child, String prd_name_full) {
		super();
		this.prd_lvl_child = prd_lvl_child;
		this.prd_name_full = prd_name_full;
	}
	
	public Integer getPrd_lvl_child() {
		return prd_lvl_child;
	}
	public void setPrd_lvl_child(Integer prd_lvl_child) {
		this.prd_lvl_child = prd_lvl_child;
	}
	public String getPrd_name_full() {
		return prd_name_full;
	}
	public void setPrd_name_full(String prd_name_full) {
		this.prd_name_full = prd_name_full;
	}
	
	
	@Override
	public String toString() {
		return "Prdmstee [prd_lvl_child=" + prd_lvl_child + ", prd_name_full=" + prd_name_full + "]";
	}
	
	
	
	
	

}
