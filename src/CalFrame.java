import java.awt.*;
import java.awt.event.*;

public class CalFrame extends Frame implements ActionListener {
	Panel num = new Panel();

	public TextArea show = new TextArea();

	Button btn0 = new Button("0");
	Button btn1 = new Button("1");
	Button btn2 = new Button("2");
	Button btn3 = new Button("3");
	Button btn4 = new Button("4");
	Button btn5 = new Button("5");
	Button btn6 = new Button("6");
	Button btn7 = new Button("7");
	Button btn8 = new Button("8");
	Button btn9 = new Button("9");
	Button btndoc = new Button(".");

	Button plus = new Button("+");
	Button minus = new Button("-");
	Button mult = new Button("*");
	Button div = new Button("/");
	Button equ = new Button("=");
	Button clean = new Button("CE");

	public double num1, num2, num3;

	public CalFrame() {
		CE ce = new CE(show, num1, num2, num3);
		RESULT res = new RESULT(show, num1, num2, num3);

		this.setTitle("Calculator");
		this.setLayout(new GridLayout(4, 0));
		num.setLayout(new GridLayout(5, 4));
		num.add(btn7);
		num.add(btn8);
		num.add(btn9);
		num.add(plus);
		num.add(btn4);
		num.add(btn5);
		num.add(btn6);
		num.add(minus);
		num.add(btn1);
		num.add(btn2);
		num.add(btn3);
		num.add(mult);
		num.add(btndoc);
		num.add(btn0);
		num.add(equ);
		num.add(div);
		num.add(clean);
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btndoc.addActionListener(this);
		clean.addActionListener(ce);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		equ.addActionListener(res);

		this.add(show);
		this.add(num);

		this.setSize(400, 400);
		this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		show.append(e.getActionCommand());
	}

}
