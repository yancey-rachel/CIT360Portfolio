package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	

	private Socket clientSocket;
	private BufferedReader input;
	private PrintStream output;
	private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Client client = new Client();
		client.connect();
	}
	public void connect(){
		
		
		try {
			clientSocket = new Socket("localhost", 9999);
			 output = new PrintStream(clientSocket.getOutputStream());
			 
			 output.println("How can I help you?");
			 
			 input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
			
			
			while(clientSocket.isConnected()){
			String message = input.readLine();
			System.out.println("Client: "+ message);
			
			String reply = scan.nextLine();
			output.println(reply);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
