import java.io.File;

import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;

import xml.app.sample.HelloDocument;
import xml.app.sample.HelloDocument.Hello;



public class XmlBeansWriter {

	public static void main(String[] args) throws Exception {
		
		
		HelloDocument document = HelloDocument.Factory.newInstance();
		
		//Array
		Hello hello = document.addNewHello();
		XmlString name1 = hello.addNewName();
		name1.setStringValue("Name 1");
		XmlString name2 = hello.addNewName();
		name2.setStringValue("Name 2");
	
		System.out.println(document.validate());
		
		XmlOptions options = new XmlOptions();
		options.setLoadLineNumbers();
		options.setSavePrettyPrint();
		options.setSavePrettyPrintIndent(4);
		
		System.out.println(document.xmlText(options));
		
		document.save(new File("../hello.xml"));
	}
	
}
