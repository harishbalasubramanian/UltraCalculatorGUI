import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import javax.swing.JLabel;
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
	private JButton power;
	private JButton bac;
	private JButton sin;
	private JButton cos;
	private JButton tan;
	private JButton arcsin;
	private JButton arccos;
	private JButton arctan;
	private JButton sinh;
	private JButton cosh;
	private JButton tanh;
	private JButton sece;
	private JButton cose;
	private JButton cote;
	private JButton neg;
	private JButton loge;
	private JButton logten;
	private JRadioButton degr;
	private JRadioButton radr;
	private ButtonGroup group;
	private double num1;
	private double num2;

	private String sup;
	private String d;
	private double e;
	private double ans;
	private int y;
	private int x = 0;
	private boolean bool;
	private String b;
	private class Nay implements ItemListener{
		public void itemStateChanged(ItemEvent q){
			if(q.getSource() == degr){
				bool = true;
			}
			if(q.getSource()== radr){
				bool = false;
			}
		}
	}
	public second(){
		super("The Ultra Calculator");
		setLayout(new FlowLayout());
		JLabel stuff = new JLabel();
		stuff.setText("Only do one operation at a time.");
		add(stuff);
		field1 = new JTextField();
		field1.setPreferredSize(new Dimension(480,200));
		
		add(field1);
		field1.setEditable(false);
		Nay day = new Nay();
		degr = new JRadioButton("degrees");
		add(degr);
		radr = new JRadioButton("radians");
		add(radr);
		group = new ButtonGroup();
		group.add(degr);
		group.add(radr);
		degr.addItemListener(day);
		radr.addItemListener(day);
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
		
		cle = new JButton("AC");
		add(cle);
		cle.setPreferredSize(new Dimension(80,50));
		
		sqrt = new JButton ("√");
		add(sqrt);
		sqrt.setPreferredSize(new Dimension(80,50));
		power = new JButton("xⁿ");
		add(power);
		loge = new JButton("ln");
		add(loge);
		loge.setPreferredSize(new Dimension(80,50));
		logten = new JButton("log base-10");
		add(logten);
		logten.setPreferredSize(new Dimension(80,50));
		neg = new JButton("±");
		add(neg);
		neg.setPreferredSize(new Dimension(80,50));
		power.setPreferredSize(new Dimension(80,50));
		Way yay = new Way();
		bac = new JButton("←");
		add(bac);
		sin = new JButton("sin ");
		add(sin);
		sin.setPreferredSize(new Dimension(80,50));
		cos = new JButton("cos");
		add(cos);
		cos.setPreferredSize(new Dimension(80,50));
		tan = new JButton("tan ");
		add(tan);
		tan.setPreferredSize(new Dimension(80,50));
		bac.setPreferredSize(new Dimension(80,50));
		arcsin = new JButton("arcsin ");
		add(arcsin);
		arcsin.setPreferredSize(new Dimension(80,50));
		arccos = new JButton("arccos ");
		add(arccos);
		arccos.setPreferredSize(new Dimension(80,50));
		arctan = new JButton("arctan ");
		add(arctan);
		arctan.setPreferredSize(new Dimension(80,50));
		sinh = new JButton("sinh ");
		add(sinh);
		sinh.setPreferredSize(new Dimension(80,50));
		cosh = new JButton("cosh ");
		add(cosh);
		cosh.setPreferredSize(new Dimension(80,50));
		tanh = new JButton("tanh ");
		add(tanh);
		tanh.setPreferredSize(new Dimension(80,50));
		sece = new JButton("secant ");
		add(sece);
		sece.setPreferredSize(new Dimension(80,50));
		cose = new JButton("cosecant ");
		add(cose);
		cose.setPreferredSize(new Dimension(80,50));
		cote = new JButton("cotangent ");
		add(cote);
		cote.setPreferredSize(new Dimension(80,50));
		equ = new JButton("=");
		add(equ);
		equ.setPreferredSize(new Dimension(160,50));
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
		power.addActionListener(yay);
		bac.addActionListener(yay);
		sin.addActionListener(yay);
		cos.addActionListener(yay);
		tan.addActionListener(yay);
		arcsin.addActionListener(yay);
		arccos.addActionListener(yay);
		arctan.addActionListener(yay);
		sinh.addActionListener(yay);
		cosh.addActionListener(yay);
		tanh.addActionListener(yay);
		sece.addActionListener(yay);
		cose.addActionListener(yay);
		cote.addActionListener(yay);
		neg.addActionListener(yay);
		loge.addActionListener(yay);
		logten.addActionListener(yay);
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
				if (x<2)
					field1.setText(field1.getText() + ".");
					x ++;
				
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
			if (wow.getSource()== power){
				num1 = Double.parseDouble(field1.getText());
				field1.setText(field1.getText()+"^");
				y = 7;
				b = field1.getText();
			}
			
			if (wow.getSource() == sin){
				field1.setText("sin ");
				y = 8;
				b = field1.getText();
			}
			if(wow.getSource()==cos){
				field1.setText("cos ");
				y = 10;
				b = field1.getText();
			}
			if(wow.getSource() == tan){
				field1.setText("tan ");
				y = 11;
				b = field1.getText();
			}
			if(wow.getSource() == arcsin){
				field1.setText("arcsin ");
				y = 12;
				b = field1.getText();
			}
			if(wow.getSource() == arccos){
				field1.setText("arccos ");
				y = 13;
				b = field1.getText();
			}
			if(wow.getSource() == arctan){
				field1.setText("arctan ");
				y = 14;
				b = field1.getText();
			}
			if(wow.getSource() == sinh){
				field1.setText("sinh ");
				y = 15;
				b = field1.getText();
			}
			if(wow.getSource() == cosh){
				field1.setText("cosh ");
				y = 16;
				b = field1.getText();
			}
			if(wow.getSource() == tanh){
				field1.setText("tanh ");
				y = 17;
				b = field1.getText();
			}
			if(wow.getSource() == sece){
				field1.setText("secant ");
				y = 18;
				b = field1.getText();
			}
			if(wow.getSource() == cose){
				field1.setText("cosecant ");
				y = 19;
				b = field1.getText();
			}
			if(wow.getSource() == cote){
				field1.setText("cotangent ");
				y = 20;
				b = field1.getText();
			}
			if (wow.getSource() == loge){
				field1.setText("ln ");
				y = 21;
				b = field1.getText();
			}
			if(wow.getSource() == logten){
				field1.setText("logten ");
				y = 22;
				b = field1.getText();
			}
			if(wow.getSource()==neg){
				sup = field1.getText();
				d = sup.replaceAll(b, "");
				e = Double.parseDouble(d);
				e *= -1;
				String f = Double.toString(e);
				field1.setText(f);
			}
			
			
			if (wow.getSource() == equ){
				String c = field1.getText();
				String a = c.replace(b, "");
				num2 = Double.parseDouble(a);
				
				if (y ==1){
					ans = addit(num1,num2);
					field1.setText(Double.toString(ans));
					
				}
				if (y==2){
					ans = subit(num1,num2);
					field1.setText(Double.toString(ans));
					
				}
				if (y==3){
					ans = multit(num1,num2);
					field1.setText(Double.toString(ans));
					
				}
				if (y==4){
					ans = divit(num1,num2);
					field1.setText(Double.toString(ans));
					
				}
				if (y == 5){
					ans = modit(num1,num2);
					field1.setText(Double.toString(ans));
					
				}
				if (y == 6){
					ans = sqrtit(num2);
					field1.setText(Double.toString(ans));
					
				}
				if (y == 7){
					ans = powit(num1,num2);
					field1.setText(Double.toString(ans));
					
				}
				if(y == 8){
					ans = num2;
					if (bool == true){
						ans = Math.round(sinit(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(sinit(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				
				if(y == 10){
					ans = num2;
					if (bool == true){
						ans = Math.round(cosit(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(cosit(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
				}
				if(y == 11){
					ans = num2;
					if (bool == true){
						ans = Math.round(tanit(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(tanit(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 12){
					ans = num2;
					if (bool == true){
						ans = Math.round(arcsinit(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(arcsinit(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 13){
					ans = num2;
					if (bool == true){
						ans = Math.round(arccosit(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(arccosit(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 14){
					ans = num2;
					if (bool == true){
						ans = Math.round(arctanit(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(arctanit(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 15){
					ans = num2;
					if (bool == true){
						ans = Math.round(sinhit(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(sinhit(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 16){
					ans = num2;
					if (bool == true){
						ans = Math.round(coshin(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(coshin(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 17){
					ans = num2;
					if (bool == true){
						ans = Math.round(tanhit(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(tanhit(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 18){
					ans = num2;
					if (bool == true){
						ans = Math.round(secant(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(secant(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 19){
					ans = num2;
					if (bool == true){
						ans = Math.round(cosecant(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(cosecant(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if(y == 20){
					ans = num2;
					if (bool == true){
						ans = Math.round(cotangent(ans*Math.PI/180)*1000)/1000.0;
					}else if (bool==false){
						ans = Math.round(cotangent(ans)*1000)/1000.0;
					}
					field1.setText(Double.toString(ans));
					
				}
				if (y == 21){
					ans = lnit(num2);
					field1.setText(Double.toString(ans));
				}
				if (y == 22){
					ans = logit(num2);
					field1.setText(Double.toString(ans));
				}
			}if(wow.getSource()==cle){
				field1.setText("");
			}
			if (wow.getSource()==bac){
				String backspace = null;
				if(field1.getText().length()>0){
					StringBuilder what = new StringBuilder(field1.getText());
					
					what.deleteCharAt(field1.getText().length()-1);
					backspace = what.toString();
					field1.setText(backspace);
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
	public double powit(double a, double b){
		double c = Math.pow(a, b);
		return c;
	}
	public double sinit(double a){
		double b = Math.sin(a);
		return b;
	}
	public double degit(double a){
		double b = Math.toDegrees(a);
		return b;
	}
	public double cosit(double a){
		double b = Math.cos(a);
		return b;
	}
	public double tanit(double a){
		double b = Math.tan(a);
		return b;
	}
	public double arcsinit(double a){
		double b = Math.asin(a);
		return b;
	}
	public double arccosit(double a){
		double b = Math.acos(a);
		return b;
	}
	public double arctanit(double a){
		double b = Math.atan(a);
		return b;
	}
	public double sinhit(double a){
		double b = Math.sinh(a);
		return b;
	}
	public double coshin(double a){
		double b = Math.cosh(a);
		return b;
	}
	public double tanhit(double a){
		double b = Math.tanh(a);
		return b;
	}
	public double secant(double a){
		double b = 1/(Math.cos(a));
		return b;
	}
	public double cosecant(double a){
		double b = 1/(Math.sin(a));
		return b;
	}
	public double cotangent(double a){
		double b = 1/(Math.tan(a));
		return b;
	}
	public double lnit(double a){
		double b = Math.log(a);
		return b;
	}
	public double logit(double a){
		double b = Math.log10(a);
		return b;
	}
}
