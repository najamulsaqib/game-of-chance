package GameOfChance;
public class Results extends javax.swing.JFrame {
    int n1,n2,s,p;
    String rzl;
    public void sette(int n1, int n2,int s,int p, String rzl){
        this.n1=n1;
        this.n2=n2;
        this.s=s;
        this.p=p;
        this.rzl=rzl;
        switch(n1){
            case 1:
                lumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice1.png")));
                break;
            case 2:
                lumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice2.png")));
                break;
            case 3:
                lumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice3.png")));
                break;
            case 4:
                lumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice4.png")));
                break;
            case 5:
                lumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice5.png")));
                break;
            case 6:
                lumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice6.png")));
                break;
        }
        switch(n2){
            case 1:
                lumber2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice1.png")));
                break;
            case 2:
                lumber2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice2.png")));
                break;
            case 3:
                lumber2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice3.png")));
                break;
            case 4:
                lumber2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice4.png")));
                break;
            case 5:
                lumber2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice5.png")));
                break;
            case 6:
                lumber2.setIcon(new javax.swing.ImageIcon(getClass().getResource("dice6.png")));
                break;
        }
        sum.setText(String.valueOf(s));
        pointz.setText(String.valueOf(p));
        winlose.setText(rzl);
    }
    public Results() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lumber2 = new javax.swing.JLabel();
        lumber1 = new javax.swing.JLabel();
        pointz = new javax.swing.JLabel();
        sum = new javax.swing.JLabel();
        winlose = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 18, 55));
        jLabel2.setText("Your Points are : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(61, 310, 119, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 18, 55));
        jLabel3.setText("Sum is : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 330, 60, 14);

        lumber2.setFont(new java.awt.Font("Bauhaus 93", 0, 175)); // NOI18N
        lumber2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lumber2);
        lumber2.setBounds(300, 160, 110, 100);

        lumber1.setFont(new java.awt.Font("Bauhaus 93", 0, 175)); // NOI18N
        lumber1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lumber1);
        lumber1.setBounds(170, 160, 110, 100);

        pointz.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pointz.setForeground(new java.awt.Color(233, 18, 55));
        jPanel1.add(pointz);
        pointz.setBounds(190, 310, 60, 20);

        sum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sum.setForeground(new java.awt.Color(233, 18, 55));
        jPanel1.add(sum);
        sum.setBounds(190, 330, 60, 20);

        winlose.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        winlose.setForeground(new java.awt.Color(233, 18, 55));
        jPanel1.add(winlose);
        winlose.setBounds(80, 90, 274, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameOfChance/playagain.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 380, 135, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameOfChance/exit.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(420, 380, 140, 50);

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
        Play LinkPlay = new Play();
        LinkPlay.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lumber1;
    private javax.swing.JLabel lumber2;
    private javax.swing.JLabel pointz;
    private javax.swing.JLabel sum;
    private javax.swing.JLabel winlose;
    // End of variables declaration//GEN-END:variables
}
