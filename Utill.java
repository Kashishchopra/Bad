import java.lang.*;
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;


public class Utill {
	public static String readFile(String fname) throws Exception{
		StringBuilder sb=new StringBuilder();
		FileReader fr=new FileReader(fname);
		int i;
		while((i=fr.read())!=-1){
			sb.append((char) i);
		}
		return sb.toString();
	}

public static Element getElementByProperty(Document doc, String data){
	StringBuilder sb=new StringBuilder();
		sb.append("a[href=");
		sb.append(data);
		sb.append("]");
	Element Links=doc.select(sb.toString()).first();
		return links;
	}

public static String getOwnConatiningText(Element e){
	return e.text();
	}

