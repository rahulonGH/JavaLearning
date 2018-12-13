package git.Learning;

import java.net.SocketOption;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceExample {

	public static void main(String[] args) {
		Map<Integer,InvoiceBean> m = new TreeMap<Integer,InvoiceBean>();
			InvoiceBean ib1 = new InvoiceBean(1,1552,2451,"Vendor1",4,448.37);
			InvoiceBean ib2 = new InvoiceBean(2,1452,6151,"Vendor2",554,5008.56);
			InvoiceBean ib3 = new InvoiceBean(3,122,51,"Vendor3",1544,545.26);
			InvoiceBean ib4 = new InvoiceBean(4,4342,2051,"Vendor4",1454,58.36);
	
		m.put(1001, ib1);
		m.put(1002, ib2);
		m.put(1003, ib3);
		m.put(1004, ib4);
		//System.out.println(m);
		
		
		for(Map.Entry<Integer,InvoiceBean> e : m.entrySet()){
			int key = e.getKey();
			InvoiceBean ib = e.getValue();
			System.out.println(key+" ## "+ib.display());
		}
	}

}
