import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.*;
import java.net.SocketTimeoutException;

public class Server {
	public Server() {
		int port =6666;
		DataInputStream in;
		DataOutputStream out;
		ServerSocket server;
		Socket socket;
		
		try {
			server=new ServerSocket(port);
			socket=server.accept();
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
			
			int i=in.readInt();
			System.out.println(i);
		} catch (Exception e) {
			// TODO: handle exception
		}

		
	}
	
	public static void main(String args[]) {
		new Server();
	}
}
