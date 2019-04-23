import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;
import java.io.IOException;
public class Invoke {
    public static void main(String[] args) throws Exception {
        String html = Utill.readFile("demo.html");
	

	Document doc=Jsoup.parse(html);
	Element e =Utill.getElementByProperty(doc,"http://mw:8090/browse/PP-1274");

	String s=Utill.getOwnContainingText(e);
	
	if(s.toUpperCase().indexOf("insert".toUppercase())>-1) {
		System.out.println(s);
	}
 	else{
		System.out.println("Error");
		}
	}
}