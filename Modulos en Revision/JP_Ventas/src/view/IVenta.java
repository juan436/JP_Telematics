package view;

import controller.CVenta;

public interface IVenta {
	
	public static final String PROCESAR = "procesar";
	public static final String LIMPIAR = "limpiar";
	public static final String SALIR = "salir";
	public static final String LUPA = "lupa";
	public static final String LUPA1 = "lupa1";
	public static final String EXIT = "exit";
	
	public void run();
	public void setControlador(CVenta c);
	public String getDireccionCliente();
	public String getEstadoCliente();
	public String getTelefonoCliente();
	public String getTipoCliente();
	public String getCedulaVendedor();
	public String getZonaVendedor();
	public String getNombreVendedor();
	public String getTelefonoVendedor();
	public String getNombreProducto();
	public double getSubtotalVenta();
	public double getIvaVenta();
	public double getTotalVenta();
	public double getPrecioProducto();
	public int getCantidadVenta();
	public String getRifCliente();
	public String getCodigoProducto();
	public void escribirCliente(String tcnom,String tcdir,String tctipo,String tctel,String tcest,String tvced,String tvnom,String tvtel,String tvzon);
	public void escribirProducto(String tpnom,double tppre);
	public void escribirVenta(double tsub,double tiva,double ttot);
	public double getiva();
	public void salir();
	public void limpiar();
}
