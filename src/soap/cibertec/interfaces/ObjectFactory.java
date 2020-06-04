
package soap.cibertec.interfaces;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.cibertec.interfaces package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SaveProducto_QNAME = new QName("http://interfaces.cibertec.soap/", "saveProducto");
    private final static QName _SaveProductoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "saveProductoResponse");
    private final static QName _ListAllProductoResponse_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllProductoResponse");
    private final static QName _ListAllProducto_QNAME = new QName("http://interfaces.cibertec.soap/", "listAllProducto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.cibertec.interfaces
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveProductoResponse }
     * 
     */
    public SaveProductoResponse createSaveProductoResponse() {
        return new SaveProductoResponse();
    }

    /**
     * Create an instance of {@link ListAllProducto }
     * 
     */
    public ListAllProducto createListAllProducto() {
        return new ListAllProducto();
    }

    /**
     * Create an instance of {@link ListAllProductoResponse }
     * 
     */
    public ListAllProductoResponse createListAllProductoResponse() {
        return new ListAllProductoResponse();
    }

    /**
     * Create an instance of {@link SaveProducto }
     * 
     */
    public SaveProducto createSaveProducto() {
        return new SaveProducto();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "saveProducto")
    public JAXBElement<SaveProducto> createSaveProducto(SaveProducto value) {
        return new JAXBElement<SaveProducto>(_SaveProducto_QNAME, SaveProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "saveProductoResponse")
    public JAXBElement<SaveProductoResponse> createSaveProductoResponse(SaveProductoResponse value) {
        return new JAXBElement<SaveProductoResponse>(_SaveProductoResponse_QNAME, SaveProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllProductoResponse")
    public JAXBElement<ListAllProductoResponse> createListAllProductoResponse(ListAllProductoResponse value) {
        return new JAXBElement<ListAllProductoResponse>(_ListAllProductoResponse_QNAME, ListAllProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces.cibertec.soap/", name = "listAllProducto")
    public JAXBElement<ListAllProducto> createListAllProducto(ListAllProducto value) {
        return new JAXBElement<ListAllProducto>(_ListAllProducto_QNAME, ListAllProducto.class, null, value);
    }

}
