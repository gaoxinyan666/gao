package xml;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.* ;
public class ReadXMLUtilTV{
public static String getBrandName(){
try{
DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder builder = dFactory.newDocumentBuilder();
Document doc = builder.parse(new File("configTV.xml"));
NodeList nl = doc.getElementsByTagName( "brandName" );
Node classNode = nl. item(0).getFirstChild();
String brandName = classNode.getNodeValue().trim();
return brandName;
} catch(Exception e){
System.out.println(e.getMessage()); 
return null; 
}
}
}
