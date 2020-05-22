package main;

import model.BDConex;
import view.IVenta;
import view.VVenta;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IVenta v = new VVenta();
		BDConex c = new BDConex();
		
		v.run();
	}

}
