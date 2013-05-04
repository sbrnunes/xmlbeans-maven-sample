import java.io.File;

import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import xml.app.sample.HelloDocument;



public class XmlBeansParser {

	public static void main(String[] args) throws Exception {
		
		File file = new File("../hello.xml");
		
		XmlOptions options = new XmlOptions();
		options.setLoadLineNumbers();
		options.setSavePrettyPrint();

		//Parse with XmlObject
    	XmlObject document = XmlObject.Factory.parse(file, options);
    	
    	if(document instanceof HelloDocument) {
    		String[] names = ((HelloDocument)document).getHello().getNameArray();
    		
    		for (String name : names) {
				System.out.println(name);
			}
    	}
    	
    	//or with the implementation class (if known)
    	
    	HelloDocument documentImpl = HelloDocument.Factory.parse(file, options);
    	
		String[] names = ((HelloDocument)documentImpl).getHello().getNameArray();
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
}
