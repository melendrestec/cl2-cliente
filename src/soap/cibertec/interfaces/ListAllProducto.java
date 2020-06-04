
package soap.cibertec.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listAllProducto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listAllProducto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="precio1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="precio2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listAllProducto", propOrder = {
    "precio1",
    "precio2"
})
public class ListAllProducto {

    protected double precio1;
    protected double precio2;

    /**
     * Obtiene el valor de la propiedad precio1.
     * 
     */
    public double getPrecio1() {
        return precio1;
    }

    /**
     * Define el valor de la propiedad precio1.
     * 
     */
    public void setPrecio1(double value) {
        this.precio1 = value;
    }

    /**
     * Obtiene el valor de la propiedad precio2.
     * 
     */
    public double getPrecio2() {
        return precio2;
    }

    /**
     * Define el valor de la propiedad precio2.
     * 
     */
    public void setPrecio2(double value) {
        this.precio2 = value;
    }

}
