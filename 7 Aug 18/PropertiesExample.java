package git.Learning;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PropertiesExample {

	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		/*pr.setProperty("username", "rahul");
		pr.setProperty("password", "1245");
		
		FileWriter fw = new FileWriter("credentials.properties");
		pr.store(fw, "firstPropertyFile");
		fw.close();*/
		
		/*FileReader fr = new FileReader("credentials.properties");
		pr.load(fr);
		System.out.println(pr.getProperty("username").length());
		System.out.println(pr.getProperty("password").length());
		
		fr.close();*/
		
		Properties syPro = System.getProperties();
		Set s = syPro.entrySet();
		Iterator itr =s.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey() + " = "+ me.getValue());
		}
	}

}
