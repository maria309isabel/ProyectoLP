package beans;

public class Informe {

	private int codigoInforme;
	private int codigoSolicitante;
	private String nombreSolicitante;
	private String fechaSolicitud;
	private int codigoIncidente;
	private String descripcion;
	private String impacto;
	private String recomendaciones;

	public Informe(int codigoInforme, String nombreSolicitante, String fechaSolicitud, 
			String descripcion, String impacto, String recomendaciones) {
		super();
		this.codigoInforme = codigoInforme;
		this.nombreSolicitante = nombreSolicitante;
		this.fechaSolicitud = fechaSolicitud;
		this.descripcion = descripcion;
		this.impacto = impacto;
		this.recomendaciones = recomendaciones;
	}

	public int getCodigoSolicitante() {
		return codigoSolicitante;
	}

	public void setCodigoSolicitante(int codigoSolicitante) {
		this.codigoSolicitante = codigoSolicitante;
	}

	public String getNombreSolicitante() {
		return nombreSolicitante;
	}

	public void setNombreSolicitante(String nombreSolicitante) {
		this.nombreSolicitante = nombreSolicitante;
	}

	public int getCodigoInforme() {
		return codigoInforme;
	}

	public void setCodigoInforme(int codigoInforme) {
		this.codigoInforme = codigoInforme;
	}

	public String getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public int getCodigoIncidente() {
		return codigoIncidente;
	}

	public void setCodigoIncidente(int codigoIncidente) {
		this.codigoIncidente = codigoIncidente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImpacto() {
		return impacto;
	}

	public void setImpacto(String impacto) {
		this.impacto = impacto;
	}

	public String getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
}