package main;

import controller.CLogin;
import model.BDConex;
import model.MLogin;
import model.MOperarLogin;
import view.ILogin;
import view.VLogin;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ILogin v = new VLogin();
		MLogin m = new MLogin();
		MOperarLogin op = new MOperarLogin();
		CLogin c = new CLogin(m, v, op);
		BDConex conexion = new BDConex();
		
		v.setController(c);
		
		v.run();

	}

}
