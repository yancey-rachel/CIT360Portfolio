package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	private ServerSocket serverSocket;
	private Socket acceptSocket;
	private BufferedReader input;
	private PrintStream output;
	private Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Server server = new Server();
		server.connect();
		
	}
	
	public void connect(){
		try {
			serverSocket = new ServerSocket(9999);
			acceptSocket = serverSocket.accept();
			
			output = new PrintStream(acceptSocket.getOutputStream());
			
			
			input = new BufferedReader(new InputStreamReader(acceptSocket.getInputStream()));
			
			while(acceptSocket.isConnected()){
			String message = input.readLine();
			System.out.println("Server: "+ message);
			
			String reply = scan.nextLine();
			output.println(reply);
		
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
