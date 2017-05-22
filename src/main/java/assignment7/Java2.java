package assignment7;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
//import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class Java2 extends AbstractMessageTransformer{

	
	
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		String source = "Hello World";

		StringBuffer sb= new StringBuffer(source);
		String d1= sb.reverse().toString();
		return d1;
		
		/*String name = message.getProperty("name", PropertyScope.INVOCATION);
    	System.out.println("Method Reverse Activated");
		String Name=new StringBuilder(name).reverse().toString();
		return "Revere String="+Name;		
    	        return animal;*/
	}
}

	

