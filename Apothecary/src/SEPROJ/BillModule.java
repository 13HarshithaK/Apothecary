/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEPROJ;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.RowFilter;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Harshitha
 */
public class BillModule extends javax.swing.JFrame {
DefaultTableModel model; 
DBclass db;
    /**
     * Creates new form BillModule
     */
    public BillModule() {
        initComponents();
        //setUndecorated(true);
        this.setDefaultCloseOperation(0);
        model = (DefaultTableModel) jTable1.getModel();
        db=new DBclass();
//        testcase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfSrch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        btBillAdd = new javax.swing.JButton();
        lbName2 = new javax.swing.JLabel();
        lbQuant2 = new javax.swing.JLabel();
        lbPrice2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btNewBill = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btRemoveFromBill = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        btCheck = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        lbQuant = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        btUpdatePay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tfSrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSrchActionPerformed(evt);
            }
        });

        jLabel1.setText("Item:");

        lbStatus.setText("---> ");

        btBillAdd.setText("Add to bill");
        btBillAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBillAddActionPerformed(evt);
            }
        });

        lbName2.setText("Item name");

        lbQuant2.setText("Quantity");

        lbPrice2.setText("Price");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Price per unit (G)", "Price (G)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("BILL:");

        btNewBill.setText("New Bill");
        btNewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewBillActionPerformed(evt);
            }
        });

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btRemoveFromBill.setText("Remove From Bill");
        btRemoveFromBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveFromBillActionPerformed(evt);
            }
        });

        btCheck.setText("Check");
        btCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckActionPerformed(evt);
            }
        });

        btUpdatePay.setText("Paid");
        btUpdatePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdatePayActionPerformed(evt);
            }
        });

        jLabel2.setText("Total amount:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(47, 47, 47)
                                            .addComponent(tfSrch, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbName2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbQuant2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(btBillAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btRemoveFromBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(btNewBill)
                                .addGap(98, 98, 98)
                                .addComponent(btUpdatePay, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfSrch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbName2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbQuant2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbPrice2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btBillAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btRemoveFromBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btNewBill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btUpdatePay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfSrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSrchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfSrchActionPerformed

    private void btBillAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBillAddActionPerformed
        // TODO add your handling code here:
        int i=1;
        int loc=0;
        int cnt=0;
        int c=Integer.parseInt(lbQuant.getText());
        boolean err=false;
        if(lbName.getText().equals("") || c<=0 || lbPrice.getText().equals("") ||lbName.getText().equals("Not Found"))
        {
           lbStatus.setText("No item selected to add to bill or item unavailable");
        }
        else if(err!=false)
        {
           lbStatus.setText("Item quantity now zero");
        }
        else
        {
           int p=Integer.parseInt(lbPrice.getText());
           for(int j=0;j<jTable1.getRowCount();j++)
           {
               if(jTable1.getValueAt(j,0).equals(lbName.getText()))
               { 
                   i=Integer.parseInt(jTable1.getValueAt(j,1).toString())+1;
                   loc=j;
                   cnt++;
               }           
           }           
           if (cnt>0)
           {
               jTable1.setValueAt(""+i,loc,1);
               jTable1.setValueAt(""+i*p,loc,3);
               c=c-i;
               if(c==0)
                   err=true;
               
           }
           else
           {
             Object[] row = {lbName.getText(),""+i,lbPrice.getText(),""+p*i};
             model.addRow(row);
             c=c-1;
             lbQuant.setText(""+c);

           }
        }    

        int sum=0;
        for(int k=0;k<jTable1.getRowCount(); k++)
        {
            sum=sum+Integer.parseInt(jTable1.getValueAt(k,3).toString());
        }
        lbTotal.setText(sum+" G");        
    }//GEN-LAST:event_btBillAddActionPerformed

    private void btRemoveFromBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveFromBillActionPerformed
        //to select and remove entries getselrow returns the indices of sel rows
        int[] selectedRows = jTable1.getSelectedRows();
        if (selectedRows.length > 0) {
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                model.removeRow(selectedRows[i]);
            }
        } 
    }//GEN-LAST:event_btRemoveFromBillActionPerformed

    private void btNewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewBillActionPerformed
        // TODO add your handling code here:
        clr();
    }//GEN-LAST:event_btNewBillActionPerformed

    public void clr()
    {
        model.setRowCount(0);
        tfSrch.setText("");
        lbStatus.setText("--->");
        lbName.setText("");
        lbQuant.setText("");
        lbPrice.setText("");
        lbTotal.setText("");    
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckActionPerformed
        // TODO add your handling code here:
        lbStatus.setText("");
        String[] row= new String[3];
        String nameitem= tfSrch.getText().toLowerCase();
        int loc;
        String quant;
        if(nameitem.equals(""))
            lbStatus.setText("ERROR: Enter all details");
        else
            row=db.srchItem(nameitem, lbStatus);
            quant=row[1];
            for(int j=0;j<jTable1.getRowCount();j++)
           {
               if(jTable1.getValueAt(j,0).equals(row[0]))
               { 
                   loc=j;
                   int c=Integer.parseInt(jTable1.getValueAt(j,1).toString());
                   int d=Integer.parseInt(row[1]);
                   int e=d-c;
                   quant=""+e;
               }           
           } 
            lbName.setText(row[0]);
            lbQuant.setText(quant);
            lbPrice.setText(row[2]);
    }//GEN-LAST:event_btCheckActionPerformed

    private void btUpdatePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdatePayActionPerformed
        // TODO add your handling code here:
        int YesOrNo = JOptionPane.showConfirmDialog(null,"Inventory has changed, do you want to Update Inventory?","Inventory Alert", JOptionPane.YES_NO_OPTION);
        if(YesOrNo == 0)
        {
            int n=jTable1.getRowCount();
            String[] itemName=new String[n];
            int[] itemAmt=new int[n];            
            int[] itemTotalP=new int[n];
            for(int i=0;i<n;i++)
            {
                itemName[i]=jTable1.getValueAt(i,0).toString();
                itemAmt[i]=Integer.parseInt(jTable1.getValueAt(i,1).toString());
                itemTotalP[i]=Integer.parseInt(jTable1.getValueAt(i,3).toString());
            }
            db.updateInv(itemName, itemAmt);
            db.updateLog(itemName, itemAmt, itemTotalP);
            clr();
        }
        else
        {
               
        }
        
    }//GEN-LAST:event_btUpdatePayActionPerformed

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
            java.util.logging.Logger.getLogger(BillModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillModule().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBillAdd;
    private javax.swing.JButton btCheck;
    private javax.swing.JButton btNewBill;
    private javax.swing.JButton btRemoveFromBill;
    private javax.swing.JButton btUpdatePay;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbName2;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbPrice2;
    private javax.swing.JLabel lbQuant;
    private javax.swing.JLabel lbQuant2;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextField tfSrch;
    // End of variables declaration//GEN-END:variables
}
