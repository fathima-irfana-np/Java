import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.FontUIResource;


public class calculator implements AncestorListener{
        JFrame jf;
    public calculator(){
        jf=new JFrame("NP FAMILY CALCULATOR");
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setLocation(300,100);
        
        JLabel displaLabel=new JLabel("hello");
        displaLabel.setBounds(40, 40, 400, 40);
        displaLabel.setBackground(Color.YELLOW);
        displaLabel.setForeground(Color.RED);
        displaLabel.setFont(new Font("Georgia", Font.PLAIN, 18));
        displaLabel.setOpaque(true);
        displaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displaLabel);

        JButton sevenbutton=new JButton("7");
        sevenbutton.setBackground(Color.black);
        sevenbutton.setForeground(Color.green);
        sevenbutton.setBounds(30, 130, 45, 55);
        sevenbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        jf.add(sevenbutton);

        JButton eightbutton=new JButton("8");
        eightbutton.setBounds(105, 130, 45, 55);
        eightbutton.setForeground(Color.green);
        eightbutton.setBackground(Color.black);
        eightbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        jf.add(eightbutton);

        JButton ninebutton=new JButton("9");
        ninebutton.setBounds(180, 130, 45, 55);
        ninebutton.setBackground(Color.black);
        ninebutton.setForeground(Color.green);
        ninebutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        jf.add(ninebutton);

        JButton sixbutton=new JButton("6");   
        sixbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        sixbutton.setBounds(30, 205, 45, 55);
        sixbutton.setForeground(Color.green);
        sixbutton.setBackground(Color.black);
        jf.add(sixbutton);

        JButton fivebutton=new JButton("5");
        fivebutton.setBounds(105, 205, 45, 55);
        fivebutton.setBackground(Color.black);
        fivebutton.setForeground(Color.green);
        fivebutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        jf.add(fivebutton);

        JButton fourbutton=new JButton("4");
        fourbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        fourbutton.setBounds(180, 205 , 45, 55);
        fourbutton.setForeground(Color.green);
        fourbutton.setBackground(Color.black);
        jf.add(fourbutton);

        JButton threebutton=new JButton("3");
        threebutton.setBounds(30, 280, 45, 55);
        threebutton.setBackground(Color.black);
        threebutton.setForeground(Color.green);
        threebutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        jf.add(threebutton);

        JButton twobutton=new JButton("2");
        twobutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        twobutton.setBounds(105, 280, 45, 55);
        twobutton.setForeground(Color.green);
        twobutton.setBackground(Color.black);
        jf.add(twobutton);

        JButton onebutton=new JButton("1");
        onebutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        onebutton.setBounds(180, 280, 45, 55);
        onebutton.setBackground(Color.black);
        onebutton.setForeground(Color.green);
        jf.add(onebutton);

        JButton zerobutton=new JButton("0");
        zerobutton.setBounds(30, 355, 45, 55);
        zerobutton.setBackground(Color.black);
        zerobutton.setForeground(Color.green);
        zerobutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        jf.add(zerobutton);

        JButton dotbutton=new JButton(".");
        dotbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        dotbutton.setBounds(105, 355, 45, 55);
        dotbutton.setForeground(Color.green);
        dotbutton.setBackground(Color.black);
        jf.add(dotbutton);

        JButton equalbutton=new JButton("=");
        equalbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        equalbutton.setBounds(180, 355, 45, 55);
        equalbutton.setForeground(Color.green);
        equalbutton.setBackground(Color.black);
        jf.add(equalbutton);

        JButton divbutton=new JButton("÷");
        divbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        divbutton.setBounds(255, 355, 45, 55);
        divbutton.setBackground(Color.black);
        divbutton.setForeground(Color.green);
        jf.add(divbutton);

        JButton plusbutton=new JButton("+");
        plusbutton.setBounds(255, 130, 45, 55);
        plusbutton.setBackground(Color.black);
        plusbutton.setForeground(Color.green);
        plusbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        jf.add(plusbutton);

        JButton minusbutton=new JButton("-");
        minusbutton.setBackground(Color.black);
        minusbutton.setForeground(Color.green);
        minusbutton.setBounds(255, 280, 45, 55);
        minusbutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        jf.add(minusbutton);

        JButton multiplebutton=new JButton("×");
        multiplebutton.setBackground(Color.black);
        multiplebutton.setForeground(Color.green);
        multiplebutton.setFont(new FontUIResource("Georgia", Font.TYPE1_FONT, 15));
        multiplebutton.setBounds(255, 205, 45, 55);
        jf.add(multiplebutton);




        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args){
      new calculator();


    }
    @Override
    public void ancestorAdded(AncestorEvent event) {
      // TODO Auto-generated method stub
      
    }
    @Override
    public void ancestorRemoved(AncestorEvent event) {
      // TODO Auto-generated method stub
      
    }
    @Override
    public void ancestorMoved(AncestorEvent event) {
      // TODO Auto-generated method stub
      
    }

}
