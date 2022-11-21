import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //JLabel use to display the JUI String of text,an image or both
        //To add image on the label
        ImageIcon image=new ImageIcon("C:\\Users\\Abugida\\Desktop\\lesson11_assig\\AvatarCover.png");
        //to create a boarder
        Border boarder=BorderFactory.createLineBorder(Color.green,3);

        JLabel label=new JLabel();//create a label
        //in order to move the image or text
        label.setVerticalAlignment(JLabel.TOP);
        //to set the horizontal alignment
        label.setHorizontalAlignment(JLabel.CENTER);




        label.setText("The program of Movie List");
        label.setIcon(image);
        //to set the position of the text
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        //let's change the color and the size
        label.setForeground(new Color(0x00FF1));//this code is for grain
        //to set the font
        label.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setIconTextGap(10);//set gap of text image
        //to set the background color
        label.setBackground(Color.black);
        //to display the background color
        label.setOpaque(true);
        //to display the boarder that we set from the above
        label.setBorder(boarder);
        //To set the icon+text at the center
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //to set the text and label at the determine position
        label.setBounds(0,0,500,500);





        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        //To resize the icon and the text use the below code
        //These frame.pack();uses after add the label like frame.add(label);
        //frame.pack();


        //Jpanel= a GUI component that functions as a container to hold other components
       //lets add image icon
        /*
        ImageIcon image=new ImageIcon("C:\\Users\\Abugida\\Desktop\\lesson11_assig\\love.png");
        //let's add a label for the three color components
        JLabel label=new JLabel();
        //to set text on the label
        label.setText("Hello");
        label.setIcon(image);

        JPanel redPanel1=new JPanel();
        redPanel1.setBackground(Color.red);
        redPanel1.setBounds(0,0,250,250);

        JPanel bluePanel1=new JPanel();
        bluePanel1.setBackground(Color.BLUE);
        bluePanel1.setBounds(0,0,500,500);

        JPanel greenPanel1=new JPanel();
        greenPanel1.setBackground(Color.YELLOW);
        greenPanel1.setBounds(0,0,750,750);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setVisible(true);
        redPanel1.add(label);
        frame.add(redPanel1);
        frame.add(bluePanel1);
        frame.add(greenPanel1);*/


    }
}