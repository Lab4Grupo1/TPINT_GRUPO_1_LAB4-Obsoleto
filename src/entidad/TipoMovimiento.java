package entidad;

public class TipoMovimiento {
	public TipoMovimiento(String descripcion) {
		super();
		Descripcion = descripcion;
	}

	private int Id;
	private String Descripcion;
	
	public int getId() {
		return Id;
	}
	
	public void setDescripcion(String desc) {
		Descripcion = desc;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
}