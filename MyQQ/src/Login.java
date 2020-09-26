import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Login extends JFrame {
	public Login() {
		JFrame frame =new JFrame("QQ");
		frame.setSize(430 , 300);
		frame.setVisible(true);
		JLabel jlb_north = new JLabel(new ImageIcon("image/login/login.jpg"));
		jlb_north.setBounds(0,0,430,182);

	}
	public static void main(String args[]) {
		new Login();
	}
}
