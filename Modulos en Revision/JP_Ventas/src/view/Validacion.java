package view;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class Validacion {
	public void validarLongitud(JTextField tx, int cantidad) {
		tx.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				int tamanio=tx.getText().length();
				if(tamanio>=cantidad) {
					e.consume();
				}
			}
		});
	}
}
