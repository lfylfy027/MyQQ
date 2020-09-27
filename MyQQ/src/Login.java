import java.awt.Container;
import java.awt.Frame;

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
		
		//窗口上部的图片
		jlb_north = new JLabel("北部背景");
		jlb_north.setBounds(0,0,430,182);
		jlb_north.setHorizontalAlignment(SwingConstants.CENTER);
		
		//登陆按钮
		jbt_login=new JButton("登录");
		jbt_login.setBounds(100, 265, 230,40);
		jbt_login.setHorizontalAlignment(SwingConstants.CENTER);
		
		//输入账号
		qq_num=new JTextField();
		qq_num.setBounds(100,160,230,30);
		
		//输入密码
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
	public static void main(String args[]) {
		new Login();
	}
}
