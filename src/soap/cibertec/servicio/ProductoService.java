package soap.cibertec.servicio;

import java.util.List;

import soap.cibertec.interfaces.Producto;

public class ProductoService {

	private ProductoServiceImplService ws = null;

	public List<Producto> listaProdcutos(double pre1, double pre2) {
		List<Producto> lista = null;
		try {
			ws = new ProductoServiceImplService();
			Servicio soap = ws.getServicioProductoPort();
			lista = soap.listAllProducto(pre1, pre2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public int saveProducto(Producto bean) {
		int salida = -1;
		try {
			ws = new ProductoServiceImplService();
			Servicio soap = ws.getServicioProductoPort();
			salida = soap.saveProducto(bean);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return salida;
	}

}
