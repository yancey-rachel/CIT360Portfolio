package httpurlconnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class urlconnection {


	public static void main(String[] args) {
		  try {//variable url is my website
		      URL url = new URL("http://yancey-rachel.github.io");
		      //creating a variable to connection the url
		      HttpURLConnection connect = (HttpURLConnection) url.openConnection();
		      // variable read will read data from the inputstream
		      String read = readStream(connect.getInputStream());
		     //will display what is in the url
		      System.out.println(read);
		    } catch (Exception e) {
		      e.printStackTrace();
		    }

		  }

		  private static String readStream(InputStream in) {
		    StringBuilder sb = new StringBuilder();
		    try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {
		      
		      String nextLine = "";
		      while ((nextLine = reader.readLine()) != null) {
		        sb.append(nextLine);
		      }
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		    return sb.toString();
		  }
		 
	}


