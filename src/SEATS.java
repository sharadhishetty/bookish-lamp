
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


import java.lang.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SEATS extends javax.swing.JFrame {
    static ArrayList<String> seats=new ArrayList<String>();
   static int i=0;
   static int ticket_id;
   static int flag=0;
   static int[] ticket_set=new int[10];
   static int n;
   static int j;
   static int ticket;
   static int value;
  static ArrayList<String> tickets=new ArrayList<String>();
  static int f;
public int getTicket(){
    return ticket_id;
}   
     public ArrayList<String> getSeats(){
            return(seats);
        }
    public ArrayList<String> getTickets(){
        for(int i=0;i<f;i++){
            tickets.add(i, String.valueOf(ticket_set[i]));
        }
        return tickets;
    }
    public int getSeatSize(){
        return(f);
    }
    

    /**
     * Creates new form SEATS
     */
    public SEATS() {
      
        initComponents();
        this.setSize(1203, 788);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEAT");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 3, 14)); // NOI18N
        jLabel1.setText("Enter the number of seats");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 140, 170, 27);

        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(560, 140, 145, 22);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("S1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 200, 90, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("S2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 200, 90, 50);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("S3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(660, 200, 90, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SILVER ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 170, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GOLD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 260, 80, 30);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("S4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(360, 290, 90, 50);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("S5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(510, 290, 90, 50);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("S6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(660, 290, 90, 50);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("S7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(360, 380, 90, 50);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("S8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(510, 380, 90, 50);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("S9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(660, 380, 90, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PLATINUM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 350, 310, 20);

        jButton10.setText("PROCEED");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(870, 520, 230, 50);

        jButton11.setText("BACK");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(870, 610, 230, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngtree-an-illustration-of-the-interior-of-a-cinema-movie-theatre-with-png-image_4199545.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -80, 1200, 1000);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            jButton4.setBackground(Color.GRAY);
            seats.add(i, "S4");
            i=i+1;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jButton1.setBackground(Color.GRAY);
    seats.add(i, "S1");
    i=i+1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            jButton2.setBackground(Color.GRAY);
             seats.add(i, "S2");
               i=i+1;

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             jButton3.setBackground(Color.GRAY);
             seats.add(i, "S3");
              i=i+1;

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
            jButton5.setBackground(Color.GRAY);
            seats.add(i, "S5");
              i=i+1;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
            jButton6.setBackground(Color.GRAY);
            seats.add(i, "S6");
              i=i+1;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
            jButton7.setBackground(Color.GRAY);
            seats.add(i, "S7");
              i=i+1;

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
            jButton8.setBackground(Color.GRAY);
            seats.add(i, "S8");
              i=i+1;

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
            jButton9.setBackground(Color.GRAY);
            seats.add(i, "S9");
              i=i+1;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
       
        if(seats.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Please pick 1 seat atleast to proceed!!!");

        }
        else{ticket_id=1000;
             int Price=200;
               if(n==seats.size()){
                    try{  f=seats.size();
                          SHOW_TIMING S=new SHOW_TIMING();
                          CHOICE C=new CHOICE();
                          Class.forName("com.mysql.jdbc.Driver");
                          Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviebooking", "root", "" );
                          Statement s=c.createStatement();
                         // ResultSet r=s.executeQuery("select * from ticket");
                          
                          /*ResultSet r2=s.executeQuery("select * from ticket");
                          while(r2.next()){
                              String a=r2.getString(6);
                          
                              if("S2".equals(a)         && ())
                              {
                                  jButton2.setEnabled(false);
                              }
                              else if("S1".equals(a))
                              {
                                  jButton1.setVisible(false);
                              }
                              else if("S3".equals(a))
                              {
                                  jButton3.setVisible(false);
                              }
                              else if("S4".equals(a))
                              {
                                  jButton4.setVisible(false);
                              }
                              else if("S5".equals(a))
                              {
                                  jButton5.setVisible(false);
                              }
                              else if("S6".equals(a))
                              {
                                  jButton6.setVisible(false);
                              }
                              else if("S7".equals(a))
                              {
                                  jButton7.setVisible(false);
                              }
                               else if("S8".equals(a))
                              {
                                  jButton8.setVisible(false);
                              }
                              else if("S9".equals(a))
                              {
                                  jButton9.setVisible(false);
                              }
                          }*/                         
                                                                            
                          ResultSet r=s.executeQuery("select * from ticket order by ticket_id");
                          if(r.next()==false){
                              ticket_id=1000;
                              if(seats.size()==1){
                                  ticket_id=1000;
                                  s.executeUpdate("insert into ticket values('"+ticket_id+"','"+Price+"','"+S.getTheatre()+"','"+S.getShowId()+"','"+C.getMovieName()+"','"+seats.get(0)+"')");       
                                  seats.removeAll(seats);
                                  n=0;
                              }
                              else{
                                  for(int i=0;i<seats.size();i++){
                                      ticket_set[i]=ticket_id+i;
                                      s.executeUpdate("insert into ticket values('"+ticket_set[i]+"','"+Price+"','"+S.getTheatre()+"','"+S.getShowId()+"','"+C.getMovieName()+"','"+seats.get(i)+"')");
                                  } 
                                  seats.removeAll(seats);
                                  n=0;
                                  
                               }
                              TICKET T=new TICKET();
                              T.setVisible(true);
                            }
                           else{
                                 while(r.next()){
                                                /* for(int i=0;i<seats.size();i++){
                                                   ResultSet r2=s.executeQuery("select * from ticket where show_id='"+S.getShowId()+"' and movie_name='"+C.getMovieName()+"' and t_name='"+S.getTheatre()+"' and seat_no='"+seats.get(i)+"'");
                                                 if(flag3==0){
                                                     if(r2.next()==true){
                                                          flag3=1;
                                                        }
                                                   }
                                                   
                                                }
                                     r=s.executeQuery("select MAX(ticket_id) from ticket");*/
                                                                                 
                                  }
                                   r.previous();
                                   ticket=r.getInt(1);                                      
                                   if(seats.size()==1){
                                       ticket_id=ticket+1;   
                                       s.executeUpdate("insert into ticket values('"+ticket_id+"','"+Price+"','"+S.getTheatre()+"','"+S.getShowId()+"','"+C.getMovieName()+"','"+seats.get(0)+"')");
                                     seats.removeAll(seats);
                                        n=0;
                                   }
                                   else{
                                       for(int i=0;i<seats.size();i++){
                                       ticket_set[i]=ticket+i+1;
                                       s.executeUpdate("insert into ticket values('"+ticket_set[i]+"','"+Price+"','"+S.getTheatre()+"','"+S.getShowId()+"','"+C.getMovieName()+"','"+seats.get(i)+"')");

                                      }
                                        seats.removeAll(seats);

                                       n=0;
                                    
                                   }
                                   TICKET T=new TICKET();
                                   T.setVisible(true);
                                }
                   }
                   catch(Exception e)
                   {
                        JOptionPane.showMessageDialog(null,e);

                   }
                
              }
               else{
                         JOptionPane.showMessageDialog(null,"Number of Selected seats doesn't match with number of seats booked");

               }
        }
        
        
   
            
    }//GEN-LAST:event_jButton10ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
        n= Integer.valueOf(t1.getText());
            try{
            Class.forName("com.mysql.jdbc.Driver");
                          Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviebooking", "root", "" );
                          Statement s=c.createStatement();
                         // ResultSet r=s.executeQuery("select * from ticket");
                          
                          ResultSet r2=s.executeQuery("select * from ticket");
                          while(r2.next()){
                              String a=r2.getString(6);
                              String theatre=r2.getString(3);
                              int showID=r2.getInt(4);
                              String movie=r2.getString(5);
                              SHOW_TIMING S=new SHOW_TIMING();
                              CHOICE C=new CHOICE();
                              if("S2".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton2.setEnabled(false);
                              }
                              if("S1".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton1.setEnabled(false);
                              }
                              if("S3".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton3.setEnabled(false);
                              }
                               else if("S4".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton4.setEnabled(false);
                              }
                              else if("S5".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton5.setEnabled(false);
                              }
                              else if("S6".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton6.setEnabled(false);
                              }
                              else if("S7".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton7.setEnabled(false);
                              }
                               else if("S8".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton8.setEnabled(false);
                              }
                              else if("S9".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton9.setEnabled(false);
                              }
                                
                   }
        }
        catch(Exception e){
                         JOptionPane.showMessageDialog(null,e);

        }
        
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        SHOW_TIMING S=new SHOW_TIMING();
        S.setVisible(true);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        // TODO add your handling code here:
     /*   try{
            Class.forName("com.mysql.jdbc.Driver");
                          Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/moviebooking", "root", "" );
                          Statement s=c.createStatement();
                         // ResultSet r=s.executeQuery("select * from ticket");
                          
                          ResultSet r2=s.executeQuery("select * from ticket");
                          while(r2.next()){
                              String a=r2.getString(6);
                              String theatre=r2.getString(3);
                              int showID=r2.getInt(4);
                              String movie=r2.getString(5);
                              SHOW_TIMING S=new SHOW_TIMING();
                              CHOICE C=new CHOICE();
                              if("S2".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton2.setEnabled(false);
                              }
                              if("S1".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton1.setEnabled(false);
                              }
                              if("S3".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton3.setEnabled(false);
                              }
                               else if("S4".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton4.setEnabled(false);
                              }
                              else if("S5".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton5.setEnabled(false);
                              }
                              else if("S6".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton6.setEnabled(false);
                              }
                              else if("S7".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton7.setEnabled(false);
                              }
                               else if("S8".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton8.setEnabled(false);
                              }
                              else if("S9".equals(a)&&S.getShowId()==showID&&S.getTheatre().equals(theatre)&&C.getMovieName().equals(movie))
                              {
                                  jButton9.setEnabled(false);
                              }
                                
                   }
        }
        catch(Exception e){
                         JOptionPane.showMessageDialog(null,e);

        }*/
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_t1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SEATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEATS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
