package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class OperarVenta {
	private MVenta vent = null;
	
	
	public boolean crearVenta(MVenta ven) {
		this.vent = ven;
		int op = 0;
		BDConex bd = new BDConex();
		boolean correcto = false;

			op = bd.ejecutar("INSERT INTO `ventas`(`id_venta`, `id_cliente`, `id_producto`, `cantidad`, `total`, `id_iva`, `subtotal`, `iva_calculado`, `hora_y_fecha`) VALUES ("+null+",1,1,"+ven.getCantidadVenta()+","+ven.getTotalVenta()+","+1+","+ven.getSubtotalVenta()+","+ven.getIvaVenta()+",CURDATE())");
			if (op > 0) {
				correcto = true;
				JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
			} else {
				JOptionPane.showMessageDialog(null, "Error al almacenar el registro.");
			}
		

		bd.desconectar();
		return correcto;
	}
	public MVenta buscarCliente(String rif)
	{
		ResultSet rs = null;
		BDConex bd = new BDConex();
		MVenta ven = new MVenta();
		
		rs = bd.consultar("SELECT * FROM clientes WHERE rif='" + rif + "' and borrado=false;");
		try{
			if(rs.first())
			{rs.beforeFirst();
			 rs.next();
			 ven.setIdCliente(Integer.parseInt(rs.getString("id_cliente")));
			 ven.setNombreCliente(rs.getString("nombre"));
			 ven.setRifCliente((rs.getString("rif")));
			 ven.setDireccionCliente((rs.getString("direccion")));
			 ven.setTelefonoCliente((rs.getString("telefono")));
			 ven.setIdVendedor(Integer.parseInt(rs.getString("id_vendedor")));
			 ven.setIdtipo(Integer.parseInt(rs.getString("id_tipo_persona")));
			 ven.setIdEstado(Integer.parseInt(rs.getString("id_estado")));
			 ven.setBorrado(Boolean.parseBoolean(rs.getString("borrado")));
			 
			}else{
				JOptionPane.showMessageDialog(null, "El codigo no existe en la Base de Datos.");
				ven = null;
			}
		}catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bd.desconectar();
		return ven;
		
		
		
	}
	
	
}
