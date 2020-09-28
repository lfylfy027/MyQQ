import java.awt.Container;
import java.awt.Frame;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class Login extends JFrame {
	private JLabel jlb_north;
	private JButton jbt_login;
	private JTextField qq_num;
	private JPasswordField qq_pword;
		
	public Login() {
		this.setSize(430 , 320);
		
		this.setUndecorated(true);
		
		//¥∞ø⁄…œ≤øµƒÕº∆¨
		jlb_north = new JLabel("±±≤ø±≥æ∞");
		jlb_north.setBounds(0,0,430,182);
		jlb_north.setHorizontalAlignment(SwingConstants.CENTER);
		
		//µ«¬Ω∞¥≈•
		jbt_login=new JButton("µ«¬º");
		jbt_login.setBounds(100, 265, 230,40);
		jbt_login.setHorizontalAlignment(SwingConstants.CENTER);
		
		// ‰»Î’À∫≈
		qq_num=new JTextField();
		qq_num.setBounds(100,160,230,30);
		
		// ‰»Î√‹¬Î
		qq_pword=new JPasswordField();
		qq_pword.setBounds(100,200,230,30);
				
				
		Container con=this.getContentPane();
		con.setLayout(null);
		con.add(jlb_north);
		con.add(jbt_login);
		con.add(qq_num);
		con.add(qq_pword);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void client() {
		int port=6666;
		String host="localhost";
		try {
		Socket socket=new Socket(host,port);
		DataInputStream in=new DataInputStream(socket.getInputStream());
		DataOutputStream out=new DataOutputStream(socket.getOutputStream());
		out.writeInt(5);
		out.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}	
		}
	public static void main(String args[]) {
		new Login();
		client();
	}
}
