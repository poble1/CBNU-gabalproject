
import java.awt.*;
class BorderLayoutTest1 extends Frame 
{
	public BorderLayoutTest1(String str) 
	{
		super(str);
		setLayout(new BorderLayout());
		add("North", new Button("N"));
		add("West", new Button("W"));
		add("East", new Button("E"));
		add("Center", new Button("M"));
		add("South", new Button("S"));

		setSize(200,200);
		setVisible(true);
	}
}

public class Main3{
	public static void main(String[] args) {
		new BorderLayoutTest1("BorderLayout ¿¹Á¦");
	}
}
