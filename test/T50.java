import org.apache.xmlrpc.*;
import java.util.*;

public class T50 {
    public static void main(String[] args) {
	try {
	    XmlRpcClient xmlrpc = new XmlRpcClient("http://localhost:4567/");
	    Vector params = new Vector();
	    Vector v = new Vector();
	    v.addElement(new Integer(42));
	    v.addElement(new String("foo"));
	    params.add(v);
	    Hashtable h = new Hashtable();
	    h.put("bar", new Double(45.5));
	    h.put("baz", new Integer(4711));
	    params.add(h);
	    //Object response = xmlrpc.execute("echo", params);
	    //System.out.println(response.toString());
	    Object response = xmlrpc.execute("foo", new Vector());
	    System.out.println(response.toString());
	} catch (Exception e) {
	    System.err.println(e);
	}
    }
}
