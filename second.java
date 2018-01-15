import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class second extends JFrame{
	private JTextField field1;
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
	private JButton equ;
	private JButton cle;
	private JButton sqrt;
	private JButton squ;
	private JButton bac;
	private double num1;
	private double num2;
	private StringBuilder strbui;
	private int y;
	private boolean x = true;
	private String b;
	public second(){
		super("The Ultra Calculator");
		setLayout(new FlowLayout());
		field1 = new JTextField();

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
		field1.setPreferredSize(new Dimension(330,200));
		add = new JButton("+");
		add(add);
		add.setPreferredSize(new Dimension(80,50));
		sub = new JButton("-");
		add(sub);
		sub.setPreferredSize(new Dimension(80,50));
		mult = new JButton("x");
		add(mult);
		mult.setPreferredSize(new Dimension(80,50));
		div = new JButton("÷");
		add(div);
		div.setPreferredSize(new Dimension(80,50));
		mod = new JButton("mod");
		add(mod);
		mod.setPreferredSize(new Dimension(80,50));
		equ = new JButton("=");
		add(equ);
		equ.setPreferredSize(new Dimension(80,50));
		cle = new JButton("AC");
		add(cle);
		cle.setPreferredSize(new Dimension(80,50));
		sqrt = new JButton ("√");
		add(sqrt);
		sqrt.setPreferredSize(new Dimension(80,50));
		squ = new JButton("x²");
		add(squ);
		squ.setPreferredSize(new Dimension(80,50));
		Way yay = new Way();
		bac = new JButton("←");
		add(bac);
		bac.setPreferredSize(new Dimension(80,50));
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
		equ.addActionListener(yay);
		cle.addActionListener(yay);
		sqrt.addActionListener(yay);
		squ.addActionListener(yay);
		bac.addActionListener(yay);
	}
	private class Way implements ActionListener{
		public void actionPerformed (ActionEvent wow) {
			if (wow.getSource() == one){
				field1.setText(field1.getText() + "1");
			}
			if (wow.getSource() == two){
				field1.setText(field1.getText() + "2");
			}
			if (wow.getSource() == thr){
				field1.setText(field1.getText() + "3");			
				}
			if (wow.getSource() == fou){
				field1.setText(field1.getText() + "4");			
				}
			if (wow.getSource() == fiv){
				field1.setText(field1.getText() + "5");
			}
			if (wow.getSource() == six){
				field1.setText(field1.getText() + "6");
			}
			if (wow.getSource() == sev){
				field1.setText(field1.getText() + "7");
			}
			if (wow.getSource() == eig){
				field1.setText(field1.getText() + "8");
			}
			if (wow.getSource() == nin){
				field1.setText(field1.getText() + "9");
			}
			if (wow.getSource() == zer){
				field1.setText(field1.getText() + "0");
			}
			if(wow.getSource() == dec){
				if (x==true){
					field1.setText(field1.getText() + ".");
					x = false;
				}
			}
			if (wow.getSource() == add){
				num1 = Double.parseDouble(field1.getText());
				field1.setText(field1.getText()+ " + ");
				
				y = 1;
				b = field1.getText();
			}
			if (wow.getSource()== sub){
				num1 = Double.parseDouble(field1.getText());
				field1.setText(field1.getText() + " - ");
				y = 2;
				b = field1.getText();
			}
			if (wow.getSource()== mult){
				num1 = Double.parseDouble(field1.getText());
				field1.setText(field1.getText()+ " x ");
				y = 3;
				b = field1.getText();
			}
			if(wow.getSource()==div){
				num1 = Double.parseDouble(field1.getText());
				field1.setText(field1.getText()+" ÷ ");
				y = 4;
				b = field1.getText();
			}
			if(wow.getSource()==mod){
				num1 = Double.parseDouble(field1.getText());
				field1.setText(field1.getText()+" mod ");
				y = 5;
				b = field1.getText();
			}
			if(wow.getSource()==sqrt){
				field1.setText("√");
				y=6;
				b = field1.getText();
			}
			if (wow.getSource()== squ){
				num1 = Double.parseDouble(field1.getText());
				field1.setText(field1.getText()+"");
			}
			
			if (wow.getSource() == equ){
				String c = field1.getText();
				String a = c.replace(b, "");
				num2 = Double.parseDouble(a);
				if(y==1){
					field1.setText(Double.toString(addit(num1,num2)));
				}
				if(y == 2){
					field1.setText(Double.toString(subit(num1, num2)));
				}
				if (y == 3){
					field1.setText(Double.toString(multit(num1, num2)));
				}
				if (y==4){
					field1.setText(Double.toString(divit(num1, num2)));
				}
				if (y == 5){
					field1.setText(Double.toString(modit(num1, num2)));
				}
				if (y == 6){
					field1.setText(Double.toString(sqrtit(num2)));
				}
			}if(wow.getSource()==cle){
				field1.setText("");
			}if (wow.getSource()==bac){
				String newone = null;
				if (field1.getText().length()>0){
					StringBuilder yoyo = new StringBuilder(field1.getText().length());
					yoyo.deleteCharAt(field1.getText().length());
					newone = yoyo.toString();
					field1.setText(newone);
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
	public double sqrtit(double a){
		double c = Math.sqrt(a);
		return c;
	}
	public double squit(double a){
		double c = Math.pow(a, 2);
		return c;
	}
}
