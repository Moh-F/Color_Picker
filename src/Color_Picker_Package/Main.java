package Color_Picker_Package;

import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

@SuppressWarnings("serial")
public class Main extends JFrame {
	
	public Main() {
		createAndShowGUI();
	}
	
	
	private void createAndShowGUI() {
	JFrame frame = new JFrame("Color Picker");
	
	JLabel label_red = new JLabel ("Red");
	JLabel label_green = new JLabel ("Green");
	JLabel label_blue = new JLabel ("Blue");
	
	JScrollBar scrollBar_red = new JScrollBar(JScrollBar.HORIZONTAL,127,1,0,256);
	JScrollBar scrollBar_green = new JScrollBar(JScrollBar.HORIZONTAL,127,1,0,256);
	JScrollBar scrollBar_blue = new JScrollBar(JScrollBar.HORIZONTAL,127,1,0,256);
	
	JPanel panel_color = new JPanel();
	
	JLabel label_color = new JLabel("Color: 127, 127, 127", JLabel.CENTER);
	
	frame.setLocationRelativeTo(null);
	frame.setResizable(false);
	frame.setSize(575, 250);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	
	label_red.setBounds(40, 50, 50, 25);
	scrollBar_red.setBounds(100, 50, 255, 25);
	label_green.setBounds(40, 95, 50, 25);
	scrollBar_green.setBounds(100, 95, 255, 25);
	label_blue.setBounds(40, 140, 50, 25);
	scrollBar_blue.setBounds(100, 140, 255, 25);
	panel_color.setBounds(380, 50, 150, 90);
	label_color.setBounds(395, 150, 150, 25);
	
	scrollBar_red.setBackground(Color.RED);
	scrollBar_green.setBackground(Color.GREEN);
	scrollBar_blue.setBackground(Color.BLUE);
	panel_color.setBackground(new Color(127, 127, 127));
	
	frame.add(label_red);
	frame.add(label_green);
	frame.add(label_blue);
	frame.add(scrollBar_red);
	frame.add(scrollBar_green);
	frame.add(scrollBar_blue);
	frame.add(panel_color);
	frame.add(label_color);
	
	frame.setVisible(true);
	
	AdjustmentListener al = new AdjustmentListener() {

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			// TODO Auto-generated method stub
			label_color.setText("Color: "+scrollBar_red.getValue()
										 +", "+scrollBar_green.getValue()
										 +", "+scrollBar_blue.getValue());
			
			panel_color.setBackground(new Color(scrollBar_red.getValue(),
												scrollBar_green.getValue(),
												scrollBar_blue.getValue()));
			
		}};
		
		scrollBar_red.addAdjustmentListener(al);
		scrollBar_green.addAdjustmentListener(al);
		scrollBar_blue.addAdjustmentListener(al);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Main();
			}
			
		});
			

	}

}




/*scrollBar_red.addAdjustmentListener(new AdjustmentListener() {

@Override
public void adjustmentValueChanged(AdjustmentEvent e) {
	// TODO Auto-generated method stub
	label_color.setText("Color: "+scrollBar_red.getValue()+", "+scrollBar_green.getValue()+","+scrollBar_blue.getValue());
	
}

});*/
