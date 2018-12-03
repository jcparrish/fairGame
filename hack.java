import javax.swing.*;
import java.awt.Frame;
import java.awt.*;       
import java.awt.event.*;
public class hack extends javax.swing.JFrame implements java.awt.event.ActionListener{
javax.swing.JLabel offense = new javax.swing.JLabel(" Number of previous offenses");
java.awt.Choice numoffense = new java.awt.Choice();
javax.swing.JLabel type = new javax.swing.JLabel("Type of offence");
java.awt.Choice typeoffense = new java.awt.Choice();
javax.swing.JLabel age = new javax.swing.JLabel("Enter age of student");
javax.swing.JTextField numage= new  javax.swing.JTextField(12); 
javax.swing.JLabel motive = new javax.swing.JLabel("Motive");
java.awt.Choice motived = new java.awt.Choice();
javax.swing.JButton button = new javax.swing.JButton("Submit");
javax.swing.JLabel answer = new javax.swing.JLabel("");
javax.swing.JLabel example = new javax.swing.JLabel("");
double offenceScore = 0; 
double agenum = 0;
  javax.swing.JLabel imoffense = new javax.swing.JLabel("Enter impact of offenses");
   javax.swing.JTextField imoffenses = new  javax.swing.JTextField(" ");


  javax.swing.JLabel intention = new javax.swing.JLabel("Enter intention/controllable circumstances ");
   javax.swing.JTextField intentions = new  javax.swing.JTextField(" ");





 
  



public hack() {
   java.awt.Container window = getContentPane(); // this is a GUI space that contains all of the elements
   javax.swing.BoxLayout position =  new javax.swing.BoxLayout(window,javax.swing.BoxLayout.X_AXIS);
       setLayout(new FlowLayout());
   window.add(offense );
   window.add(numoffense);
   numoffense.add("");
   numoffense.add("0");
   numoffense.add("1");
   numoffense.add("2");
   numoffense.add("3 or more");
   window.add(type);
   window.add(typeoffense);
   typeoffense.add("");
   typeoffense.add("Catagory 1");
   typeoffense.add("Catagory 2");
   typeoffense.add("Catagory 3");
   window.add(age);
   window.add(numage);
   window.add(motive);
   window.add(motived);
   motived.add("");
   motived.add("Survival");
   motived.add("Help themselves");
   motived.add("Hurt someone else");
   window.add(button);
   window.add(answer);
   window.add(example);
   button.addActionListener(this);
   setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
   setVisible(true);
   setSize(500,300);
  
}
public void actionPerformed(java.awt.event.ActionEvent thing) {
   double offnum = numoffense.getSelectedIndex();
   double typnum = typeoffense.getSelectedIndex();
   double motnum = motived.getSelectedIndex();
   String ageText = numage.getText();
   if(ageText.equals("")){
   answer.setText("Please enter the student's name" );
   }
   else{
   agenum = Double.parseDouble(ageText);
   }
   if(offnum == 0){
   answer.setText("Please select number of offences" );
   }
   else if(typnum == 0){
   answer.setText("Please select the type of offence" );
   }
   else if(motnum == 0){
   answer.setText("Please select the main motive" );
   }
   else if(agenum <= 0){
   answer.setText("Invalid age" );
   }
   else if(motnum!= 0 && typnum != 0 && offnum != 0){
      offnum--;
      typnum--;
      motnum--;
 
      if(agenum>14){
         agenum -= 13;
         offenceScore = (motnum + typnum + offnum)*(1.0/2.0 *agenum);
      }
      else{
         offenceScore = (motnum + typnum + offnum)*1.5;
      }
  

     
      if (offenceScore<=2){
         answer.setText("For an offence of this magnitude, the student should recieve an academic punishment " );
         example.setText("A good example of a punishment includes a one page essay on what the student did wrong ");
      }
      else if (offenceScore<=4.5){
         answer.setText("For an offence of this magnitude, the student should recieve in-school suspension " );
      }
      else if (offenceScore<=9){
         answer.setText("For an offence of this magnitude, the student should recieve out of school suspension " );
      }
      else if (offenceScore>9){
      answer.setText("For an offence of this magnitude, the student should recieve expulsion " );
      }

  }   
     
     
     
}




   public static void main(String[]args) throws java.io.IOException{
      hack prog = new hack();
    
 
    
    
    
    
      }
      }