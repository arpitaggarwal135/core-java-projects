package socket.programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		System.out.println("Server Program Started ...");

		ServerSocket ss = new ServerSocket(2000);
		Socket st = ss.accept();

		BufferedReader is = new BufferedReader(new InputStreamReader(st.getInputStream()));
		PrintStream os = new PrintStream(st.getOutputStream());

		String msg;

		do {
			msg = is.readLine();
			if (msg.equalsIgnoreCase("end"))
				break;
			msg = new String(new StringBuffer(msg).reverse());
			os.println(msg);
		} while (true);

		ss.close();
		System.out.println("Server Program Ended ...");
	}
}