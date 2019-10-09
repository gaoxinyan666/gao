import tv.*;
import tvfactory.*;
import xml.ReadXMLUtilTV;
public class Main{
public static void main(String args[]){
Tv tv;
String brandName =ReadXMLUtilTV.getBrandName();
tv =TVFactory.produceTv(brandName);
tv.play();
}
}
