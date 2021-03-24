package GameOfChance;
public class Play2 extends javax.swing.JFrame {
    int res,num1,num2;
    public void sette(int a, int b, int c){
        num1=a;
        num2= b;
        res= c;
        switch(num1){
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
        switch(num2){
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
        pointz.setText(String.valueOf(res));
    }
    Dice dice = new Dice();
    int n1,n2,s,point;
    String rzl;
    public Play2() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lumber1 = new javax.swing.JLabel();
        lumber2 = new javax.swing.JLabel();
        pointz = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game OF Chance");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(809, 449));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(226, 242, 251));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 18, 55));
        jLabel1.setText("Game Of Chance");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(272, 35, 274, 54);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(233, 18, 55));
        jLabel2.setText("Your Points are : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 320, 110, 17);

        lumber1.setFont(new java.awt.Font("Bauhaus 93", 0, 175)); // NOI18N
        lumber1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lumber1);
        lumber1.setBounds(160, 170, 110, 100);

        lumber2.setFont(new java.awt.Font("Bauhaus 93", 0, 175)); // NOI18N
        lumber2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lumber2);
        lumber2.setBounds(300, 170, 110, 100);

        pointz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pointz.setForeground(new java.awt.Color(233, 18, 55));
        jPanel1.add(pointz);
        pointz.setBounds(250, 320, 70, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameOfChance/rollit.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 370, 140, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameOfChance/dice 2.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 810, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(825, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        point = num1 + num2;
        n1 = dice.random1();
        n2 = dice.random2();
        s= n1+n2;
        Results results = new Results();
        if(s==point){
            rzl ="Hurrah! You Win.";
            results.sette(n1,n2,s,res,rzl);
            results.setVisible(true);
            this.dispose();
        }
        else{
            rzl = "Oops! You Lose.";
            results.sette(n1,n2,s,res,rzl);
            results.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel4MouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Play2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lumber1;
    private javax.swing.JLabel lumber2;
    private javax.swing.JLabel pointz;
    // End of variables declaration//GEN-END:variables
}
