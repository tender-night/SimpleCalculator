import java.awt.*;
import java.awt.event.*;

public class RESULT implements ActionListener {
	TextArea show;
	double num1, num2, num3;
	String ch, ch1;

	public RESULT(TextArea show, double num1, double num2, double num3) {
		this.show = show;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void actionPerformed(ActionEvent ez) {
		int len = 0, i;
		String sub, s;

		sub = show.getText();
		for (i = 0; i < sub.length(); i++) {
			s = sub.substring(i, i + 1);
			if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
				len = i;
				num1 = Double.parseDouble(sub.substring(0, len));
				ch = s;
			}
		}

		num2 = Double.parseDouble(sub.substring(len + 1, sub.length()));

		if (ch.equals("+")) {
			num3 = num1 + num2;
			ch1 = Double.toString(num3);
			show.setText(ch1);
		} else if (ch.equals("-")) {
			num3 = num1 - num2;
			ch1 = Double.toString(num3);
			show.setText(ch1);
		} else if (ch.equals("*")) {
			num3 = num1 * num2;
			ch1 = Double.toString(num3);
			show.setText(ch1);
		} else if (ch.equals("/")) {
			num3 = num1 / num2;
			ch1 = Double.toString(num3);
			show.setText(ch1);
			if (num2 == 0) {
				show.setText("ERROR");
			}
		}
	}
}
