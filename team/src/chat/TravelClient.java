package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class TravelClient {
	public static void main(String[] args) {
		
	}
	
	int port = 9907;
	String ip = "127.0.0.1";
	public void go() {
		Socket s = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			System.out.println("소켓 만들기");
			s = new Socket(ip, port);
			br = new BufferedReader(
					new InputStreamReader(System.in));
			pw = new PrintWriter(
					new OutputStreamWriter(s.getOutputStream()),true);
			String msg = "";
			System.out.println("아이디를 입력하세요");
			String name = br.readLine();
			
			//쓰레드
			ClientThread ctr  = new ClientThread(s);
			ctr.start();
			
			while((msg=br.readLine())!=null) {
				pw.println(name+":"+msg);
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				pw.close();
				s.close();
			}catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
