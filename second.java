import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
public class second extends JFrame{
	private JTextArea field1;
	private JButton one;
	private JButton two;
	private JButton thr;
	private JButton fou;
	private JButton fiv;
	private JButton six;
	private JButton sev;
	private JButton eig;
	private JButton nin;
	private JButton zer;
	private JButton add;
	private JButton sub;
	private JButton mult;
	private JButton div;
	private JButton mod;
	private JButton dec;
	private double num1;
	private double num2;
	private boolean x = true;
	public second(){
		super("The Ultra Calculator");
		setLayout(new FlowLayout());
		field1 = new JTextArea();
		
		field1.setSize(400,200);
		add(field1);
		field1.setEditable(false);
		one = new JButton("1");
		one.setPreferredSize(new Dimension(80,50));
		add(one);
		two = new JButton("2");
		add(two);
		two.setPreferredSize(new Dimension(80,50));
		thr = new JButton("3");
		add(thr);
		thr.setPreferredSize(new Dimension(80,50));
		fou = new JButton("4");
		add(fou);
		fou.setPreferredSize(new Dimension(80,50));
		fiv = new JButton("5");
		add(fiv);
		fiv.setPreferredSize(new Dimension(80,50));
		six = new JButton("6");
		add(six);
		six.setPreferredSize(new Dimension(80,50));
		sev = new JButton("7");
		add(sev);
		sev.setPreferredSize(new Dimension(80,50));
		eig = new JButton("8");
		add(eig);
		eig.setPreferredSize(new Dimension(80,50));
		nin = new JButton("9");
		add(nin);
		nin.setPreferredSize(new Dimension(80,50));
		zer = new JButton("0");
		add(zer);
		zer.setPreferredSize(new Dimension(80,50));
		dec = new JButton(".");
		add(dec);
		dec.setPreferredSize(new Dimension(80,50));
		field1.setPreferredSize(new Dimension(480,200));
		add = new JButton("+");
		add(add);
		add.setPreferredSize(new Dimension(80,50));
		sub = new JButton();
		mult = new JButton();
		div = new JButton();
		mod = new JButton();
		Way yay = new Way();
		one.addActionListener(yay);
		two.addActionListener(yay);
		thr.addActionListener(yay);
		fou.addActionListener(yay);
		fiv.addActionListener(yay);
		six.addActionListener(yay);
		sev.addActionListener(yay);
		eig.addActionListener(yay);
		nin.addActionListener(yay);
		zer.addActionListener(yay);
		dec.addActionListener(yay);
		add.addActionListener(yay);
		sub.addActionListener(yay);
		mult.addActionListener(yay);
		div.addActionListener(yay);
		mod.addActionListener(yay);
		
	}
	private class Way implements ActionListener{
		public void actionPerformed (ActionEvent wow) {
			if (wow.getSource() == one){
				field1.append("1");
			}
			if (wow.getSource() == two){
				field1.append("2");
			}
			if (wow.getSource() == thr){
				field1.append("3");
			}
			if (wow.getSource() == fou){
				field1.append("4");
			}
			if (wow.getSource() == fiv){
				field1.append("5");
			}
			if (wow.getSource() == six){
				field1.append("6");
			}
			if (wow.getSource() == sev){
				field1.append("7");
			}
			if (wow.getSource() == eig){
				field1.append("8");
			}
			if (wow.getSource() == nin){
				field1.append("9");
			}
			if (wow.getSource() == zer){
				field1.append("0");
			}
			if(wow.getSource() == dec){
				if (x==true){
					field1.append(".");
					x = false;
				}
			}
		}
	}
	public double addit(double a, double b){
		double c = a+b;
		return c;
	}
	public double subit(double a, double b){
		double c = a - b;
		return c;
	}
	public double multit(double a, double b){
		double c = a*b;
		return c;
	}
	public double divit(double a, double b){
		double c = a/b;
		return c;
	}
	public double modit(double a, double b){
		double c = a%b;
		return c;
	}
}