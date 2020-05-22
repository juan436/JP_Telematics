package model;

public class MVenta {
	private String cnom,cdir,cest,ctel,ctipo,vced,vzon,vnom,vtel,pnom,crif,pcod,codigo;
	private double ppre,vesub,veiva,vetot;
	private int vecant,id,idv,idtipo,idest;
	private boolean borrado;
	
	public int getIdVendedor() {
		return idv;
	}
	public void setIdVendedor(int idv) {
		this.idv = idv;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public int getIdEstado() {
		return idest;
	}
	public void setIdEstado(int idest) {
		this.idest = idest;
	}
	
	public int getIdCliente() {
		return id;
	}
	public void setIdCliente(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo=codigo;
	}
	
	public String getNombreCliente() {
		return cnom;
	}
	public void setNombreCliente(String cnom) {
		this.cnom = cnom;
	}
	public String getDireccionCliente() {
		return cdir;
	}
	public void setDireccionCliente(String cdir) {
		this.cdir = cdir;
	}
	public String getEstadoCliente() {
		return cest;
	}
	public void setEstadoCliente(String cest) {
		this.cest = cest;
	}
	public String getTelefonoCliente() {
		return ctel;
	}
	public void setTelefonoCliente(String ctel) {
		this.ctel = ctel;
	}
	public String getTipoCliente() {
		return ctipo;
	}
	public void setTipoCliente(String ctipo) {
		this.ctipo = ctipo;
	}
	public String getCedulaVendedor() {
		return vced;
	}
	public void setCedulaVendedor(String vced) {
		this.vced = vced;
	}
	public String getZonaVendedor() {
		return vzon;
	}
	public void setZonaVendedor(String vzon) {
		this.vzon = vzon;
	}
	public String getNombreVendedor() {
		return vnom;
	}
	public void setNombreVendedor(String vnom) {
		this.vnom = vnom;
	}
	public String getTelefonoVendedor() {
		return vtel;
	}
	public void setTelefonoVendedor(String vtel) {
		this.vtel = vtel;
	}
	public String getNombreProducto() {
		return pnom;
	}
	public void setNombreProducto(String pnom) {
		this.pnom = pnom;
	}
	public double getSubtotalVenta() {
		return vesub;
	}
	public void setSubtotalVenta(double vesub) {
		this.vesub = vesub;
	}
	public double getIvaVenta() {
		return veiva;
	}
	public void setIvaVenta(double veiva) {
		this.veiva = veiva;
	}
	public double getTotalVenta() {
		return vetot;
	}
	public void setTotalVenta(double vetot) {
		this.vetot = vetot;
	}
	public double getPrecioProducto() {
		return ppre;
	}
	public void setPrecioProducto(double ppre) {
		this.ppre = ppre;
	}
	public int getCantidadVenta() {
		return vecant;
	}
	public void setCantidadVenta(int vecant) {
		this.vecant = vecant;
	}
	public String getRifCliente() {
		return crif;
	}
	public void setRifCliente(String crif) {
		this.crif=crif;
	}
	public String getCodigoProducto() {
		return pcod;
	}
	public void setCodigoProducto(String pcod) {
		this.pcod=pcod;
	}
	
	public boolean getBorrado() {
		return borrado;
	}
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
}
