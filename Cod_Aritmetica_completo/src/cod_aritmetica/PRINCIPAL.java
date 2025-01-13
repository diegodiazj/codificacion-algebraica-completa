/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_aritmetica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Color;

public class PRINCIPAL extends javax.swing.JFrame {

    public PRINCIPAL() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mensaje = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        decod = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cod = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NumOriginal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BinCorte = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Tasa = new javax.swing.JLabel();
        simular = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        alfa = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Codificación Aritmética");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 44, -1, -1));

        jLabel2.setText("Digite mensaje: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 145, -1, -1));

        mensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajeActionPerformed(evt);
            }
        });
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 142, 173, -1));

        decod.setColumns(20);
        decod.setRows(5);
        jScrollPane1.setViewportView(decod);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 170, 266, 203));

        cod.setColumns(20);
        cod.setRows(5);
        jScrollPane2.setViewportView(cod);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 170, 266, 203));

        jLabel4.setText("Codificación:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 141, -1, -1));

        jLabel5.setText("Decodificación:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(977, 141, -1, -1));

        jLabel7.setText("Numero en Binario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));
        getContentPane().add(NumOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 470, 20));

        jLabel9.setText("Valor del corte:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));
        getContentPane().add(BinCorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 410, 20));

        jLabel8.setText("Tasa de compresión");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));
        getContentPane().add(Tasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 440, 20));

        simular.setText("Simular");
        simular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simularActionPerformed(evt);
            }
        });
        getContentPane().add(simular, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 141, -1, -1));

        alfa.setColumns(20);
        alfa.setRows(5);
        jScrollPane3.setViewportView(alfa);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 213, 401, 160));

        jLabel3.setText("Alfabeto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 193, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Mesa de trabajo 1.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajeActionPerformed

    private void simularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simularActionPerformed

        String mensaje1 = mensaje.getText();
        if (mensaje1.length() < 5 || mensaje1.length() > 10) {
            if (mensaje1.length() < 5) {
                JOptionPane.showMessageDialog(this, "El mensaje debe ser mayor a 5 caracteres");
            } else {
                JOptionPane.showMessageDialog(this, "El mensaje debe ser menor a 10 caracteres");
            }
        } else {

            char mensaje2[] = mensaje1.toCharArray();
            ArrayList<pareja> alfabeto = new ArrayList<pareja>();
            double n = 0;
            char mensaje3[] = mensaje1.toCharArray();
            cod.setText("");
            decod.setText("");
            alfa.setText("");

            double probabilidad = 0;

            for (int i = 0; i < mensaje2.length; i++) {
                if (mensaje2[i] != '*') {
                    for (int j = i + 1; j < mensaje2.length; j++) {
                        if (mensaje2[i] == mensaje2[j]) {
                            mensaje2[j] = '*';
                        }
                    }
                    do {
                        String proba = JOptionPane.showInputDialog("Ingrese la probabilidad del caracter '" + mensaje2[i] + "'\n Asegurese que la probablilidad total de 1");
                        probabilidad = isNumeric(proba);
                        if (probabilidad < 1 || probabilidad > 0) {
                            break;
                        }
                    } while (true);
                    n += probabilidad;
                    alfabeto.add(new pareja(mensaje2[i], probabilidad));
                }
            }
            if (n != 1) {
                JOptionPane.showMessageDialog(this, "La suma de las probabilidades es mayor o menor a 1, por favor intentelo nuevamente");
            } else {
                ArrayList<Double> recta = new ArrayList<Double>();
                recta.add(0.0);
                for (int i = 0; i < alfabeto.size(); i++) {
                    recta.add(alfabeto.get(i).proba + recta.get(i));
                    alfabeto.get(i).tramo[0] = recta.get(i);
                    alfabeto.get(i).tramo[1] = recta.get(i + 1);
                    alfa.append(alfabeto.get(i).getCaracter() + " : [" + String.format("%.5f", alfabeto.get(i).tramo[0]) + "," + String.format("%.5f", alfabeto.get(i).tramo[1]) + " )\n");
                }
                double codigo = codificacion(alfabeto, mensaje3);
                NumOriginal.setText(binario(codigo));
                decodificacion(codigo, alfabeto, mensaje3);
                codigo=arreglo(codigo);
                
                int x=0;
                String corte="";
                String comparacion="";
                String binario1= binario(base10(codigo+"", 10));
                while (true){
                    int contadora = 2;
                    corte="";
                    String anterior= comparacion;
                    char corte1[] = binario1.toCharArray();
                    char original[] =(codigo+"").toCharArray();
                    for(int i=0; i<x; i++){
                        corte+= corte1[i] + "";
                    }
                    comparacion=baseDiferente(base10(corte,2), 10, original.length);
                    char corte2[] = comparacion.toCharArray();
                                        
                    for(int i=2; i<original.length; i++){
                        if(Character.getNumericValue(original[i])  == Character.getNumericValue(corte2[i])){
                            contadora+=1;
                        }                       
                    }                    
                    if(contadora == original.length){
                        BinCorte.setText(corte);
                        System.out.println(corte);
                        //binAn.setText(anterior);
                        //binCor.setText(comparacion + " / " +corte);
                        break;
                    }else{
                        x+= 1;
                    }                   
                }
                fondo(alfabeto);
                tasaCompresion(mensaje1, corte);
            }
        }
        

        //abcdccbc
    }//GEN-LAST:event_simularActionPerformed

    private static double isNumeric(String codigo) {
        double numero = 0;
        try {
            numero = Double.parseDouble(codigo);
            return numero;
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    public double codificacion(ArrayList<pareja> alfabeto, char mensaje[]) {
        double vector[] = {0, 1};
        double Aact = 0;
        double Bact = 0;
        for (int i = 0; i < mensaje.length; i++) {
            for (int j = 0; j < alfabeto.size(); j++) {
                if (mensaje[i] == alfabeto.get(j).getCaracter()) {
                    Aact = vector[0] + (vector[1] - vector[0]) * alfabeto.get(j).tramo[0];
                    Bact = vector[0] + (vector[1] - vector[0]) * alfabeto.get(j).tramo[1];
                    vector[0] = Aact;
                    vector[1] = Bact;
                    cod.append(mensaje[i] + " = [ " + String.format("%.9f", vector[0]) + " , " + String.format("%.9f", vector[1]) + " ) \n");
                }
            }
        }
        cod.append("Código = " + arreglo(vector[0]));
        return vector[0];
    }

    public double arreglo(double numero) {
        String numero1 = numero + "";
        char arreglo1[] = numero1.toCharArray();
        int n = 0;
        int pos = 3;
        boolean verificar = true;
        String numeroBien = "";

        while (verificar) {
            if (Character.getNumericValue(arreglo1[pos]) == 0) {
                if (Character.getNumericValue(arreglo1[pos + 1]) == 0) {
                    if (Character.getNumericValue(arreglo1[pos + 2]) == 0) {
                        if (Character.getNumericValue(arreglo1[pos + 3]) == 0) {
                            n = pos;
                            verificar = false;
                        }
                    }
                }
            }
            pos += 1;
        }
        for (int i = 0; i < n; i++) {
            numeroBien += arreglo1[i];
        }
        return Double.parseDouble(numeroBien);
    }
    
     public void decodificacion(double codigo, ArrayList<pareja> alfabeto, char mensaje[]) {
        double a0 = codigo;
        double vector[] = new double[2];
        int n = 0;
        int conta = 1;
        for (int i = 0; i < alfabeto.size(); i++) {
            if (a0 >= alfabeto.get(i).tramo[0] && a0 < alfabeto.get(i).tramo[1]) {
                n = i;
                vector[0] = alfabeto.get(i).tramo[0];
                vector[1] = alfabeto.get(i).tramo[1];
            }
        }
        decod.append("a0 = " + String.format("%.9f", a0) + " Pertenece a: " + alfabeto.get(n).getCaracter() + "\n");
        while (conta < mensaje.length) {
            a0 = (a0 - vector[0]) / (vector[1] - vector[0]);
            for (int i = 0; i < alfabeto.size(); i++) {
                if (a0 >= alfabeto.get(i).tramo[0] && a0 < alfabeto.get(i).tramo[1]) {
                    n = i;
                    vector[0] = alfabeto.get(i).tramo[0];
                    vector[1] = alfabeto.get(i).tramo[1];
                }
            }
            decod.append("a" + (conta) + " = " + String.format("%.9f", a0) + " Pertenece a: " + alfabeto.get(n).getCaracter() + "\n");
            conta++;
        }
    }
    
    public void tasaCompresion(String mensaje, String corte){
        char mensaje1[]=mensaje.toCharArray();
        char corte1[]= corte.toCharArray();
        
        System.out.println(mensaje1.length);
        System.out.println(corte1.length);
        
        double parte1=((mensaje1.length*8-(corte1.length-2)));
        double parte2=(mensaje1.length*8);
        double tasa=(parte1/parte2)*100;
        
        Tasa.setText(tasa+"");
    }
    
    public String binario(double numero) {
        String binario = "0.";
        double a = 0;
        double parteEntera = 0;
        double parteDecimal = 0;
        for (int i = 0; i < 50; i++) {
            a = numero * 2;
            parteDecimal = a % 1;
            parteEntera = a - parteDecimal;
            binario += (int) (parteEntera) + "";
            numero = parteDecimal;
        }
        return binario;
    }
    
    public double base10(String numero, int base){
        char mensaje2[] = numero.toCharArray();
        int n=1;
        double conv=0;        
           for(int i=2; i<mensaje2.length; i++){
               conv+= Character.getNumericValue(mensaje2[i])*Math.pow(base,n*-1);   
               n+=1;
           }
           return conv;
    }
    
    public String baseDiferente(double numero, int base, int tamaño){
        String numBase ="0.";
        double a=0;
        double parteEntera=0;
        double parteDecimal=0;
        for(int i=2; i<tamaño; i++){
            a= numero*base;
            parteDecimal= a % 1;
            parteEntera =a - parteDecimal;
            if(i==tamaño-1){
                if(parteDecimal > 0.5){
                    numBase+= (int) (parteEntera+1);
                }else{
                    numBase+=(int)(parteEntera)+"";
                }
            }else{
                numBase+= (int)(parteEntera)+"";
                numero= parteDecimal;
            } 
        }
        //redon.setText(a + "");
        
        return numBase;
    }
    
    public void fondo(ArrayList<pareja> alfabeto) {
        Color[] colores = {Color.GRAY, Color.BLUE, Color.GREEN, Color.RED, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.CYAN, Color.DARK_GRAY, Color.YELLOW};
        Graphics g = getGraphics();
        int x1 = 0;
        int x2 = 0;
        super.paintComponents(g);
        for (int i = 0; i < alfabeto.size(); i++) {

            x1 = 100 + (int) (alfabeto.get(i).tramo[0] * 1000);
            x2 = 100 + (int) (alfabeto.get(i).tramo[1] * 1000);
            g.setColor(colores[i]);
            g.fillRect(x1, 600, x2 - x1, 25);
        }
        /*g.setColor(colores[ alfabeto.size() - 1]);
        g.fillRect(100 + (int)(alfabeto.get(alfabeto.size() - 1).tramo[0]*1000), 600, 1100, 25);*/
    }

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
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BinCorte;
    private javax.swing.JLabel NumOriginal;
    private javax.swing.JLabel Tasa;
    private javax.swing.JTextArea alfa;
    private javax.swing.JTextArea cod;
    private javax.swing.JTextArea decod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mensaje;
    private javax.swing.JButton simular;
    // End of variables declaration//GEN-END:variables
}
