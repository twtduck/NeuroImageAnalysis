package test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewImage {
	final static String IMAGE_PATH = "img.png";
	public static void main(String[] args) {
		File imgFile = new File(IMAGE_PATH);
		System.out.println(imgFile.getAbsolutePath());
		BufferedImage img = null;
		try {
			 img = ImageIO.read(imgFile);
			 System.out.println("Read image");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFrame frame = new JFrame("Hello Ducky");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new JLabel(new ImageIcon(img)));
		frame.pack();
		frame.setVisible(true);
	}
}