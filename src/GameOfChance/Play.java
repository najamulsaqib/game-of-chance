package GameOfChance;
public class Play extends javax.swing.JFrame {
    Dice dice = new Dice();
    public Play() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game OF Chance");
        setMinimumSize(new java.awt.Dimension(809, 449));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(226, 242, 251));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 18, 55));
        jLabel1.setText("Game Of Chance");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(272, 35, 274, 54);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameOfChance/rollit.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 250, 140, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameOfChance/dice 2.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 810, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(825, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Play2 P2 = new Play2();
        Results results = new Results();
        int n1 = dice.random1();
        int n2 = dice.random2();
        int s= n1+n2;
        String rzl;
        switch (s) {
            case 7:
            case 11:
            {
                rzl="Hurrah! You Win."; 
                results.sette(n1,n2,s,s,rzl);
                results.setVisible(true);
                this.dispose();
                break;
            }
            case 2:
            case 3:
            case 12:
            {
                rzl="Oops! You Lose.";
                results.sette(n1,n2,s,s,rzl);
                results.setVisible(true);
                this.dispose();
                break;
            }
            default:
            P2.sette(n1,n2,s);
            P2.setVisible(true);
            this.dispose();
            break;
        }
    }//GEN-LAST:event_jLabel4MouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Play().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
