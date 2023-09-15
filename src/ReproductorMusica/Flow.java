package ReproductorMusica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.player.Player;

public class Flow extends javax.swing.JFrame {

    JMenuBar menu = new JMenuBar();
    private String archivopath;
    private Player reproductor;
    
    public Flow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AgregarCancionBtn = new javax.swing.JButton();
        NombreArchivo = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarCancionBtn.setText("jButton1");
        jPanel1.add(AgregarCancionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        NombreArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NombreArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreArchivo.setText("Nombre");
        jPanel1.add(NombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 270, -1));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 390, 20));

        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 370, 150));

        jButton2.setText("jButton2");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCancionBtn;
    private javax.swing.JLabel NombreArchivo;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void AgregarCancion(){
    AgregarCancionBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser selectorsong = new JFileChooser();
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Audio", "mp3");
                
                selectorsong.setFileFilter(filtro);
                
                int eleccion = selectorsong.showOpenDialog(menu);
                if (eleccion==selectorsong.APPROVE_OPTION) {
                    File fichero = selectorsong.getSelectedFile();
                    
                    fichero.getAbsolutePath();
                }
            };
        });
    }
}
