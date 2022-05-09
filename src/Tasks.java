/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softproj;

/**
 *
 * @author Yahia Arafat
 */
public class Tasks extends javax.swing.JPanel {

    /**
     * Creates new form Tasks
     */
    public Tasks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignOut = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        SearchText = new javax.swing.JTextField();
        Meeting = new javax.swing.JButton();
        Holiday = new javax.swing.JButton();
        Tasks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TasksTable = new javax.swing.JTable();
        MOJY = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 0, 0));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignOut.setBackground(new java.awt.Color(153, 0, 0));
        SignOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SignOut.setText("Sign Out");
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });
        add(SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 25, 111, 48));

        SearchButton.setBackground(new java.awt.Color(102, 102, 102));
        SearchButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchButton.setText("Search...");
        add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 25, 114, 48));

        SearchText.setBackground(new java.awt.Color(204, 204, 204));
        SearchText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTextActionPerformed(evt);
            }
        });
        add(SearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 25, 273, 48));

        Meeting.setBackground(new java.awt.Color(102, 102, 102));
        Meeting.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Meeting.setText("Meeting");
        Meeting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeetingActionPerformed(evt);
            }
        });
        add(Meeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 139, 57));

        Holiday.setBackground(new java.awt.Color(102, 102, 102));
        Holiday.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Holiday.setText("Holiday");
        add(Holiday, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 60));

        Tasks.setBackground(new java.awt.Color(102, 102, 102));
        Tasks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Tasks.setText("Tasks");
        Tasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasksActionPerformed(evt);
            }
        });
        add(Tasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 139, 57));

        TasksTable.setBackground(new java.awt.Color(255, 51, 51));
        TasksTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TasksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Type", "Deadline"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TasksTable);
        if (TasksTable.getColumnModel().getColumnCount() > 0) {
            TasksTable.getColumnModel().getColumn(0).setHeaderValue("Number");
            TasksTable.getColumnModel().getColumn(1).setHeaderValue("Type");
            TasksTable.getColumnModel().getColumn(2).setHeaderValue("Deadline");
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 550, 280));

        MOJY.setFont(new java.awt.Font("Cooper Black", 1, 55)); // NOI18N
        MOJY.setText("MOJY");
        add(MOJY, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Yahia Arafat\\Documents\\NetBeansProjects\\SoftProj\\11.jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 1050, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignOutActionPerformed

    private void MeetingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeetingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MeetingActionPerformed

    private void TasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TasksActionPerformed

    private void SearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Holiday;
    private javax.swing.JLabel MOJY;
    private javax.swing.JButton Meeting;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchText;
    private javax.swing.JButton SignOut;
    private javax.swing.JButton Tasks;
    private javax.swing.JTable TasksTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
