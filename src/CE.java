import java.awt.*;
import java.awt.event.*;

public class CE implements ActionListener {
	TextArea show;
	double num1, num2, num3;

	public CE(TextArea show, double num1, double num2, double num3) {
		this.show = show;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public void actionPerformed(ActionEvent ex) {
		show.setText("");
		num1 = 0;
		num2 = 0;
		num3 = 0;
	}	
}
