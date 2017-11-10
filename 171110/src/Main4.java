import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

class GridLayoutTest extends Frame
{
	Button bt[]=new Button[9];
	public GridLayoutTest(String str) {
		super(str);
		setLayout(new GridLayout(3,2));
		for(int i=0;i<9;i++) {
			bt[i]=new Button(i+1+" button ");
			add(bt[i]);
		}
		setSize(300,300);
		setVisible(true);
	}
}
public class Main4 {
	public static void main(String[] args) {
		new GridLayoutTest("GridLayout Test");
	}

}
