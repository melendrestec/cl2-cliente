package soap.cliente.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import soap.cibertec.interfaces.Producto;
import soap.cibertec.servicio.ProductoService;

@ParentPackage("dawi")
public class ProductoAction extends ActionSupport {
	//
	public List<Producto> listaProducto;
	public Producto producto;
	private double pre1;
	private double pre2;
	
	//
	private Map<String,Object> session=ActionContext.getContext().getSession();
	

	//
	private ProductoService servicio;

	public ProductoAction() {
		servicio = new ProductoService();
	}

	//
	@Action(value = "/listAllProductoAtPrecio", results = { @Result(name = "ok", type = "json") })
	public String listAllProductoAtPrecio() {

		listaProducto = servicio.listaProdcutos(pre1, pre2);

		return "ok";
	}

	//
	@Action(value = "/saveProducto", results = { @Result(name = "ok", location = "/producto.jsp") })

	public String saveProducto() {
		int salida;
		salida=servicio.saveProducto(producto);
		if(salida!=-1) {
			session.put("MENSAJE", "Registro ok..");
		}else {
			session.put("MENSAJE", "Error en Registro..");
		}

		return "ok";
	}

	public List<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getPre1() {
		return pre1;
	}

	public void setPre1(double pre1) {
		this.pre1 = pre1;
	}

	public double getPre2() {
		return pre2;
	}

	public void setPre2(double pre2) {
		this.pre2 = pre2;
	}

}
