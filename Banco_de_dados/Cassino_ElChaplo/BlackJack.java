
import java.util.Random;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lilil
 */
public class BlackJack extends javax.swing.JFrame {

    /**
     * Creates new form BlackJack
     */
    public BlackJack() {
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

        jLabel1 = new javax.swing.JLabel();
        imagemcarta1 = new javax.swing.JLabel();
        imagemcarta2 = new javax.swing.JLabel();
        imagemcarta3 = new javax.swing.JLabel();
        imagemcarta4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("BlackJack");

        imagemcarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13_3.png"))); // NOI18N

        imagemcarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13_3.png"))); // NOI18N

        imagemcarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13_3.png"))); // NOI18N

        imagemcarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13_3.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Jogar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(imagemcarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagemcarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imagemcarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(imagemcarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagemcarta3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemcarta2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagemcarta1)
                            .addComponent(imagemcarta4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random rnd = new Random();
        int carta1 = 0;
        carta1 = ((int)(rnd.nextDouble()*51));
        int carta2 = 0;
        carta2 = ((int)(rnd.nextDouble()*51));
        int carta3 = 0;
        carta3 = ((int)(rnd.nextDouble()*51));
        int carta4 = 0;
        carta4 = ((int)(rnd.nextDouble()*51));
        
        if (carta1==0){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("1_0.png")));
        }
        else if (carta1==1){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("1_1.png")));
        }
        else if (carta1==2){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("1_2.png")));
        }
        else if (carta1==3){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("1_3.png")));
        }
        else if (carta1==4){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("2_0.png")));
        }
        else if (carta1==5){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("2_1.png")));
        }
        else if (carta1==6){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("2_2.png")));
        }
        else if (carta1==7){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("2_3.png")));
        }
        else if (carta1==8){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("3_0.png")));
        }
        else if (carta1==9){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("3_1.png")));
        }
        else if (carta1==10){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("3_2.png")));
        }
        else if (carta1==11){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("3_3.png")));
        }
        else if (carta1==12){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("4_0.png")));
        }
        else if (carta1==13){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("4_1.png")));
        }
        else if (carta1==14){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("4_2.png")));
        }
        else if (carta1==15){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("4_3.png")));
        }
        else if (carta1==16){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("5_0.png")));
        }
        else if (carta1==17){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("5_1.png")));
        }
        else if (carta1==18){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("5_2.png")));
        }
        else if (carta1==19){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("5_3.png")));
        }
        else if (carta1==20){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("6_0.png")));
        }
        else if (carta1==21){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("6_1.png")));
        }
        else if (carta1==22){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("6_2.png")));
        }
        else if (carta1==23){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("6_3.png")));
        }
        else if (carta1==24){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("7_0.png")));
        }
        else if (carta1==25){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("7_1.png")));
        }
        else if (carta1==26){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("7_2.png")));
        }
        else if (carta1==27){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("7_3.png")));
        }
        else if (carta1==28){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("8_0.png")));
        }
        else if (carta1==29){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("8_1.png")));
        }
        else if (carta1==30){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("8_2.png")));
        }
        else if (carta1==31){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("8_3.png")));
        }
        else if (carta1==32){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("9_0.png")));
        }
        else if (carta1==33){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("9_1.png")));
        }
        else if (carta1==34){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("9_2.png")));
        }
        else if (carta1==35){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("9_3.png")));
        }
        else if (carta1==36){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("10_0.png")));
        }
        else if (carta1==37){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("10_1.png")));
        }
        else if (carta1==38){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("10_2.png")));
        }
        else if (carta1==39){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("10_3.png")));
        }
        else if (carta1==40){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("11_0.png")));
        }
        else if (carta1==41){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("11_1.png")));
        }
        else if (carta1==42){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("11_2.png")));
        }
        else if (carta1==43){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("11_3.png")));
        }
        else if (carta1==44){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("12_0.png")));
        }
        else if (carta1==45){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("12_1.png")));
        }
        else if (carta1==46){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("12_2.png")));
        }
        else if (carta1==47){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("12_3.png")));
        }
        else if (carta1==48){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("13_0.png")));
        }
        else if (carta1==49){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("13_1.png")));
        }
        else if (carta1==50){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("13_2.png")));
        }
        else if (carta1==51){
            imagemcarta1.setIcon(new ImageIcon(getClass().getResource("13_3.png")));
        }
        if (carta2==0){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("1_0.png")));
        }
        else if (carta2==1){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("1_1.png")));
        }
        else if (carta2==2){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("1_2.png")));
        }
        else if (carta2==3){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("1_3.png")));
        }
        else if (carta2==4){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("2_0.png")));
        }
        else if (carta2==5){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("2_1.png")));
        }
        else if (carta2==6){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("2_2.png")));
        }
        else if (carta2==7){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("2_3.png")));
        }
        else if (carta2==8){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("3_0.png")));
        }
        else if (carta2==9){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("3_1.png")));
        }
        else if (carta2==10){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("3_2.png")));
        }
        else if (carta2==11){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("3_3.png")));
        }
        else if (carta2==12){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("4_0.png")));
        }
        else if (carta2==13){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("4_1.png")));
        }
        else if (carta2==14){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("4_2.png")));
        }
        else if (carta2==15){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("4_3.png")));
        }
        else if (carta2==16){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("5_0.png")));
        }
        else if (carta2==17){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("5_1.png")));
        }
        else if (carta2==18){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("5_2.png")));
        }
        else if (carta2==19){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("5_3.png")));
        }
        else if (carta2==20){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("6_0.png")));
        }
        else if (carta2==21){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("6_1.png")));
        }
        else if (carta2==22){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("6_2.png")));
        }
        else if (carta2==23){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("6_3.png")));
        }
        else if (carta2==24){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("7_0.png")));
        }
        else if (carta2==25){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("7_1.png")));
        }
        else if (carta2==26){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("7_2.png")));
        }
        else if (carta2==27){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("7_3.png")));
        }
        else if (carta2==28){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("8_0.png")));
        }
        else if (carta2==29){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("8_1.png")));
        }
        else if (carta2==30){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("8_2.png")));
        }
        else if (carta2==31){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("8_3.png")));
        }
        else if (carta2==32){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("9_0.png")));
        }
        else if (carta2==33){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("9_1.png")));
        }
        else if (carta2==34){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("9_2.png")));
        }
        else if (carta2==35){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("9_3.png")));
        }
        else if (carta2==36){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("10_0.png")));
        }
        else if (carta2==37){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("10_1.png")));
        }
        else if (carta2==38){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("10_2.png")));
        }
        else if (carta2==39){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("10_3.png")));
        }
        else if (carta2==40){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("11_0.png")));
        }
        else if (carta2==41){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("11_1.png")));
        }
        else if (carta2==42){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("11_2.png")));
        }
        else if (carta2==43){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("11_3.png")));
        }
        else if (carta2==44){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("12_0.png")));
        }
        else if (carta2==45){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("12_1.png")));
        }
        else if (carta2==46){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("12_2.png")));
        }
        else if (carta2==47){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("12_3.png")));
        }
        else if (carta2==48){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("13_0.png")));
        }
        else if (carta2==49){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("13_1.png")));
        }
        else if (carta2==50){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("13_2.png")));
        }
        else if (carta2==51){
            imagemcarta2.setIcon(new ImageIcon(getClass().getResource("13_3.png")));
        }
        if (carta3==0){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("1_0.png")));
        }
        else if (carta3==1){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("1_1.png")));
        }
        else if (carta3==2){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("1_2.png")));
        }
        else if (carta3==3){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("1_3.png")));
        }
        else if (carta3==4){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("2_0.png")));
        }
        else if (carta3==5){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("2_1.png")));
        }
        else if (carta3==6){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("2_2.png")));
        }
        else if (carta3==7){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("2_3.png")));
        }
        else if (carta3==8){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("3_0.png")));
        }
        else if (carta3==9){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("3_1.png")));
        }
        else if (carta3==10){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("3_2.png")));
        }
        else if (carta3==11){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("3_3.png")));
        }
        else if (carta3==12){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("4_0.png")));
        }
        else if (carta3==13){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("4_1.png")));
        }
        else if (carta3==14){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("4_2.png")));
        }
        else if (carta3==15){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("4_3.png")));
        }
        else if (carta3==16){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("5_0.png")));
        }
        else if (carta3==17){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("5_1.png")));
        }
        else if (carta3==18){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("5_2.png")));
        }
        else if (carta3==19){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("5_3.png")));
        }
        else if (carta3==20){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("6_0.png")));
        }
        else if (carta3==21){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("6_1.png")));
        }
        else if (carta3==22){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("6_2.png")));
        }
        else if (carta3==23){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("6_3.png")));
        }
        else if (carta3==24){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("7_0.png")));
        }
        else if (carta3==25){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("7_1.png")));
        }
        else if (carta3==26){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("7_2.png")));
        }
        else if (carta3==27){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("7_3.png")));
        }
        else if (carta3==28){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("8_0.png")));
        }
        else if (carta3==29){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("8_1.png")));
        }
        else if (carta3==30){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("8_2.png")));
        }
        else if (carta3==31){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("8_3.png")));
        }
        else if (carta3==32){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("9_0.png")));
        }
        else if (carta3==33){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("9_1.png")));
        }
        else if (carta3==34){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("9_2.png")));
        }
        else if (carta3==35){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("9_3.png")));
        }
        else if (carta3==36){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("10_0.png")));
        }
        else if (carta3==37){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("10_1.png")));
        }
        else if (carta3==38){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("10_2.png")));
        }
        else if (carta3==39){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("10_3.png")));
        }
        else if (carta3==40){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("11_0.png")));
        }
        else if (carta3==41){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("11_1.png")));
        }
        else if (carta3==42){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("11_2.png")));
        }
        else if (carta3==43){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("11_3.png")));
        }
        else if (carta3==44){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("12_0.png")));
        }
        else if (carta3==45){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("12_1.png")));
        }
        else if (carta3==46){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("12_2.png")));
        }
        else if (carta3==47){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("12_3.png")));
        }
        else if (carta3==48){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("13_0.png")));
        }
        else if (carta3==49){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("13_1.png")));
        }
        else if (carta3==50){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("13_2.png")));
        }
        else if (carta3==51){
            imagemcarta3.setIcon(new ImageIcon(getClass().getResource("13_3.png")));
        }
        if (carta4==0){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("1_0.png")));
        }
        else if (carta4==1){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("1_1.png")));
        }
        else if (carta4==2){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("1_2.png")));
        }
        else if (carta4==3){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("1_3.png")));
        }
        else if (carta4==4){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("2_0.png")));
        }
        else if (carta4==5){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("2_1.png")));
        }
        else if (carta4==6){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("2_2.png")));
        }
        else if (carta4==7){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("2_3.png")));
        }
        else if (carta4==8){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("3_0.png")));
        }
        else if (carta4==9){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("3_1.png")));
        }
        else if (carta4==10){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("3_2.png")));
        }
        else if (carta4==11){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("3_3.png")));
        }
        else if (carta4==12){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("4_0.png")));
        }
        else if (carta4==13){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("4_1.png")));
        }
        else if (carta4==14){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("4_2.png")));
        }
        else if (carta4==15){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("4_3.png")));
        }
        else if (carta4==16){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("5_0.png")));
        }
        else if (carta4==17){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("5_1.png")));
        }
        else if (carta4==18){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("5_2.png")));
        }
        else if (carta4==19){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("5_3.png")));
        }
        else if (carta4==20){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("6_0.png")));
        }
        else if (carta4==21){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("6_1.png")));
        }
        else if (carta4==22){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("6_2.png")));
        }
        else if (carta4==23){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("6_3.png")));
        }
        else if (carta4==24){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("7_0.png")));
        }
        else if (carta4==25){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("7_1.png")));
        }
        else if (carta4==26){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("7_2.png")));
        }
        else if (carta4==27){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("7_3.png")));
        }
        else if (carta4==28){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("8_0.png")));
        }
        else if (carta4==29){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("8_1.png")));
        }
        else if (carta4==30){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("8_2.png")));
        }
        else if (carta4==31){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("8_3.png")));
        }
        else if (carta4==32){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("9_0.png")));
        }
        else if (carta4==33){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("9_1.png")));
        }
        else if (carta4==34){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("9_2.png")));
        }
        else if (carta4==35){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("9_3.png")));
        }
        else if (carta4==36){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("10_0.png")));
        }
        else if (carta4==37){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("10_1.png")));
        }
        else if (carta4==38){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("10_2.png")));
        }
        else if (carta4==39){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("10_3.png")));
        }
        else if (carta4==40){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("11_0.png")));
        }
        else if (carta4==41){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("11_1.png")));
        }
        else if (carta4==42){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("11_2.png")));
        }
        else if (carta4==43){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("11_3.png")));
        }
        else if (carta4==44){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("12_0.png")));
        }
        else if (carta4==45){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("12_1.png")));
        }
        else if (carta4==46){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("12_2.png")));
        }
        else if (carta4==47){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("12_3.png")));
        }
        else if (carta4==48){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("13_0.png")));
        }
        else if (carta4==49){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("13_1.png")));
        }
        else if (carta4==50){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("13_2.png")));
        }
        else if (carta4==51){
            imagemcarta4.setIcon(new ImageIcon(getClass().getResource("13_3.png")));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagemcarta1;
    private javax.swing.JLabel imagemcarta2;
    private javax.swing.JLabel imagemcarta3;
    private javax.swing.JLabel imagemcarta4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
