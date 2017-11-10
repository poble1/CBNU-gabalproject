import java.awt.*;

public class LabelTest extends Frame {
		Panel p;
		Label lb1, lb2, lb3;
		public LabelTest(String str) {
			super(str);
			p=new Panel();
			lb1 = new Label("red");
			lb2 = new Label("blue");
			lb3 = new Label("green");
			lb1.setBackground(Color.red);
			lb2.setBackground(Color.blue);
			lb3.setBackground(Color.green);
			p.add(lb1); p.add(lb2); p.add(lb3);
			add(p);
			setSize(300,300);
			setVisible(true);
		}
	
	}

class me{
	public static void main(String[] args) {
		new LabelTest("레이블 테스트");
	}
}