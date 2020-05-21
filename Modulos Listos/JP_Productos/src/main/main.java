package main;

import controller.CProducto;
import model.BDConex;
import model.MProductos;
import model.OperarProducto;
import view.IProducto;
import view.VProducto;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IProducto v = new VProducto();
		MProductos m = new MProductos();
		OperarProducto op = new OperarProducto();
		CProducto c = new CProducto(m, v, op);
		BDConex conexion = new BDConex();
		
		v.setController(c);
		
		v.run();
	}

}
