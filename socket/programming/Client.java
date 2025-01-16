package socket.programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

class Client {
	public static void main(String[] args) throws Exception {
		System.out.println("Client Program Started ...");

		Socket st = new Socket("localhost", 2000);

		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader is = new BufferedReader(new InputStreamReader(st.getInputStream()));
		PrintStream os = new PrintStream(st.getOutputStream());

		String msg;
		do {
			System.out.println("Enter msg, type \"end\" to quit : ");
			msg = kb.readLine();
			os.println(msg);
			if (msg.equalsIgnoreCase("end"))
				break;
			msg = is.readLine();
			System.out.println("From Server : " + msg + "\n");
		} while (true);

		st.close();
		System.out.println("Client Program Ended ...");
	}
}