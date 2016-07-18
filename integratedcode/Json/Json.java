package model;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import com.google.gson.Gson;



public class Json {
	
	
	public static void main(String[] args) {
	 Coke_serialization coke_s = new Coke_serialization();
	 
	 coke_s.setcompanyName("Coke Cola Company");
	 coke_s.setflavor1("Cherry Coke");
	 coke_s.setflavor2("Orange Coke");
	 coke_s.setflavor3("Coke with Lime");
	 coke_s.setflavor4("Raspberry Coke");
	 
	 coke_s.viewcokeflavors();
	 
	 Gson cokejson = new Gson();
	 String coke1;
	 
	 coke1 = cokejson.toJson(coke_s);
	 
	 System.out.println("Json Serialized Coke:");
	 System.out.println(coke1);
	 
	 
	 try (BufferedWriter write = new BufferedWriter(new FileWriter("json.txt"))) {
         write.write(coke1);
         
         write.close();
     } catch (Throwable e ) {
        System.out.println("Doesn't work!");
     }
	 
	 String info = new String();
     
     try (BufferedReader read = new BufferedReader(new FileReader("json.txt"))) {
        info = read.readLine();
        
     } catch (Throwable e) {
         System.out.println("Doesn't work");
     }
     
     System.out.println("Serialized json retrieved from txt file: ");
     System.out.println(info);
	 
	  Coke_serialization coke_ss = cokejson.fromJson(info, Coke_serialization.class);
	  
	  coke_ss.viewcokeflavors();
	}

}
