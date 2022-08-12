import java.awt.event.*;

import javax.swing.*;

public class Ebdemo extends JFrame implements ActionListener, ItemListener {
JTextField t1,t2,t3,t4;
JLabel l1,l2,l3,l4,res,res1,box;
JButton b1,b2,b3;
JComboBox<String>bill;
Ebdemo()
{
setLayout(null);
try {
DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
String eb[]= {"Residential", "Commercial", "Industrial","None of these"};
for(int i=0; i<=eb.length;i++)
{
dcbm.addElement(eb[i]);
}
bill = new JComboBox<String>();
bill.setModel(dcbm);

bill.addItemListener(this);
bill.setBounds(100, 200, 200, 30);
}
catch (Exception e) {

}
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();

l1 = new JLabel("Enter Previous Unit: ");
l2 = new JLabel("Enter Current Unit: ");
l3 = new JLabel("Enter Bill Amount: ");
l4 = new JLabel("Cost:");
res = new JLabel("........");
res1 = new JLabel("........");
box = new JLabel();


b1 = new JButton("Amount");
b2 = new JButton();
b3 = new JButton();
b1.addActionListener(this);
//b2.addActionListener(this);
//b3.addActionListener(this);

l1.setBounds(100,150,100,40);
l2.setBounds(100,200,100,40);
l3.setBounds(100,250,100,40);
l4.setBounds(100,300,100,40);
res.setBounds(100,400,100,40);
res1.setBounds(100,450,100,40);

t1.setBounds(200,150,100,30);
t2.setBounds(200,200,100,30);
t3.setBounds(200,250,100,30);
t4.setBounds(200,300,100,30);

b1.setBounds(300,500,100,50);
b2.setBounds(300,550,100,50);
b3.setBounds(300,600,100,50);

add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);
add(res);add(b1);add(res1);add(bill);add(box);
}

public static void main(String[] args) {
// TODO Auto-generated method stub
           JFrame f1 = new Ebdemo();
           f1.setSize(600, 500);
           f1.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
int a1 = Integer.parseInt(t1.getText());
int a2 = Integer.parseInt(t2.getText());
int a3 = Integer.parseInt(t3.getText());
int a4 = Integer.parseInt(t4.getText());

int tot = a1*a2+a3+a4;
res.setText("TOTAL "+(tot));

if(tot>=200) {
res1.setText("Pay Full Amount");
}
else
{
res1.setText("Free Of Cost");
}
}

@Override
public void itemStateChanged(ItemEvent e) {
// TODO Auto-generated method stub
if ((bill.getSelectedItem()+"").equals("Residential")) {
box.setText("Free of Cost");
}
else
{
box.setText("Pay GST");
}
}
}