package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import model.MVenta;
import model.OperarVenta;
import view.IVenta;

public class CVenta implements ActionListener {
		MVenta m;
		IVenta v;
		OperarVenta op;
		
		public CVenta(MVenta m,IVenta v,OperarVenta op) {
			this.m=m;
			this.v=v;
			this.op=op;
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
