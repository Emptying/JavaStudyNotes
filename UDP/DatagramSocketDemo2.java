import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramSocketDemo2 {

	public static void main(String[] args) {
		//��һ���������ͣ��ڶ�����������
		try {
			DatagramSocket socket = new DatagramSocket(8000);
			byte [] buf = new byte[100];
			DatagramPacket packet = new DatagramPacket(buf, 100);
			socket.receive(packet);
			System.out.println(packet.getAddress()+":"+packet.getPort()+":"+new String(buf,0,packet.getLength()));
			//����
			String str = "word hello to";
			DatagramPacket packet2 = new DatagramPacket(str.getBytes(),str.length(),packet.getAddress(),
					packet.getPort());
			socket.send(packet2);
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
