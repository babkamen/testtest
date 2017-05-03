import java.net.InetAddress;
public class Main
{
	public static void main(String[] args) throws Exception{
			System.out.println(InetAddress.getLocalHost().getHostAddress()+"\n"+InetAddress.getLocalHost().getHostName());
	}
}