package ReproductorMusica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JList;
import javax.swing.Timer;

public class Flow extends javax.swing.JFrame {

    JMenuBar menu = new JMenuBar();
    ArrayList<String> dirs = new ArrayList();
    ArrayList<String> nombres = new ArrayList();
    DefaultListModel<String> lista = new DefaultListModel<>();
    private String archivopath;
    private String nombrearchivo;
    private Clip reproductor;
    private int posactual;
    private int contador;
    private int songactual;
    private boolean pausado;
    private boolean reproduciendo;
    private boolean reproducciontotal;
    
    public Flow() {
        initComponents();
        setLocationRelativeTo(null);
        songactual=0;
        pausado=false;
        reproduciendo=false;
        contador=0;
        reproducciontotal=false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AgregarCancionBtn = new javax.swing.JButton();
        NombreArchivo = new javax.swing.JLabel();
        ProgresoCancion = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaCanciones = new javax.swing.JList<>();
        SeleccionarCancionBtn = new javax.swing.JButton();
        ReproductorBtn = new javax.swing.JButton();
        SiguienteCancionBtn = new javax.swing.JButton();
        AnteriorCancionBtn = new javax.swing.JButton();
        ReproducirTodoBtn = new javax.swing.JButton();
        TiempoActual = new javax.swing.JLabel();
        TiempoTotal = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarCancionBtn.setText("Agregar");
        AgregarCancionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCancionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarCancionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        NombreArchivo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NombreArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(NombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 270, 20));
        jPanel1.add(ProgresoCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 390, 20));

        ListaCanciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(ListaCanciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 370, 150));

        SeleccionarCancionBtn.setText("Seleccionar");
        SeleccionarCancionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarCancionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SeleccionarCancionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        ReproductorBtn.setText(">");
        ReproductorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproductorBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReproductorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 50, 40));

        SiguienteCancionBtn.setText(">>");
        SiguienteCancionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteCancionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SiguienteCancionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 30));

        AnteriorCancionBtn.setText("<<");
        AnteriorCancionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnteriorCancionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AnteriorCancionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 50, 30));

        ReproducirTodoBtn.setText("Reproducir todo");
        ReproducirTodoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproducirTodoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ReproducirTodoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        TiempoActual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TiempoActual.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TiempoActual.setText("00:00");
        jPanel1.add(TiempoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, -1));

        TiempoTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TiempoTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TiempoTotal.setText("00:00");
        jPanel1.add(TiempoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 60, -1));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 370));

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

    private void AgregarCancionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCancionBtnActionPerformed
        AgregarCancion();
    }//GEN-LAST:event_AgregarCancionBtnActionPerformed

    private void ReproductorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproductorBtnActionPerformed
        if(reproduciendo==false){
            if(archivopath!=null){
            ReproducirCancion();
            }
        } else{
            Pausar();
        }
    }//GEN-LAST:event_ReproductorBtnActionPerformed

    private void SiguienteCancionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SiguienteCancionBtnActionPerformed
        SiguienteAnteriorCancion(true);
    }//GEN-LAST:event_SiguienteCancionBtnActionPerformed

    private void SeleccionarCancionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarCancionBtnActionPerformed
        Seleccionar();
    }//GEN-LAST:event_SeleccionarCancionBtnActionPerformed

    private void AnteriorCancionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnteriorCancionBtnActionPerformed
        SiguienteAnteriorCancion(false);
    }//GEN-LAST:event_AnteriorCancionBtnActionPerformed

    private void ReproducirTodoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproducirTodoBtnActionPerformed
        ReproducirTodaLaLista();
    }//GEN-LAST:event_ReproducirTodoBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCancionBtn;
    private javax.swing.JButton AnteriorCancionBtn;
    private javax.swing.JLabel Fondo;
    private javax.swing.JList<String> ListaCanciones;
    private javax.swing.JLabel NombreArchivo;
    private javax.swing.JProgressBar ProgresoCancion;
    private javax.swing.JButton ReproducirTodoBtn;
    private javax.swing.JButton ReproductorBtn;
    private javax.swing.JButton SeleccionarCancionBtn;
    private javax.swing.JButton SiguienteCancionBtn;
    private javax.swing.JLabel TiempoActual;
    private javax.swing.JLabel TiempoTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    public void AgregarCancion(){
        ActionListener[] actionListeners = AgregarCancionBtn.getActionListeners();
        for (ActionListener listener : actionListeners) {
            AgregarCancionBtn.removeActionListener(listener);
        }
        AgregarCancionBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser selectorsong = new JFileChooser();
                FileNameExtensionFilter filtrar = new FileNameExtensionFilter("Archivos de Audio", "wav");
                
                selectorsong.setFileFilter(filtrar);
                
                int eleccion = selectorsong.showOpenDialog(menu);
                if (eleccion==selectorsong.APPROVE_OPTION) {
                    File fichero = selectorsong.getSelectedFile();
                    
                    if(!BuscarCancion(fichero.getAbsolutePath())){
                        dirs.add(fichero.getAbsolutePath());
                        nombres.add(fichero.getName());
                        lista.addElement((contador+1)+" - "+fichero.getName());
                        contador++;
                        ListaCanciones.setModel(lista);
                        setElementoSeleccionado(ListaCanciones,(songactual+1)+" - "+nombrearchivo);
                    }
                }
            };
        });
    }
    
    public void ReproducirCancion(){
        if(archivopath!=null){
            try{
                File audio = new File(archivopath);
                AudioInputStream adminaudio = AudioSystem.getAudioInputStream(audio);
                try{
                    reproductor = AudioSystem.getClip();
                    reproductor.open(adminaudio);
                    if(posactual==0){
                        reproduciendo=true;
                        reproductor.start();
                        ConectarProgreso();
                    }else{
                        ReproductorBtn.setText("||");
                        Reanudar();
                    }
                }catch(Exception e){

                }
            }catch(Exception e){

            }
        }
    }
    
    public void Parar(){
        if(reproductor!=null){
           reproductor.close();
           ReproductorBtn.setText(">");
           posactual=0;
           reproduciendo=false;
           pausado=false;
        }
    }
    public void Pausar(){
        if (reproductor != null){
            ReproductorBtn.setText(">");
            posactual=reproductor.getFramePosition();
            reproductor.stop();
            reproduciendo=false;
            pausado=true;
        }
    }
    
    public void Reanudar(){
        if(reproductor != null && pausado) {
            ReproductorBtn.setText("||");
            reproductor.setFramePosition(posactual);
            reproductor.start();
            reproduciendo = true;
            pausado = false;
        }
    }
    
    public void ConectarProgreso() {
        if(reproductor != null && reproduciendo) {
            Timer timer = new Timer(100, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int duracion = reproductor.getFrameLength();
                    int posicion = reproductor.getFramePosition();
                    double porcentaje = (double) posicion/duracion*100;
                    ProgresoCancion.setValue((int)porcentaje);
                    int possegundos = (int)(posicion/reproductor.getFormat().getFrameRate());
                    int minutos = possegundos/60;
                    int segundoss = possegundos%60;
                    TiempoActual.setText(String.format("%02d:%02d", minutos, segundoss));
                    
                    if(porcentaje>=100){
                        posactual=0;
                        reproduciendo=false;
                        pausado=false;
                        if(reproducciontotal){
                            if(songactual<dirs.size()){
                                songactual++;
                                SiguienteAnteriorCancion(true);
                            }else
                                reproducciontotal=false;
                        }
                    }
                }
            });
            timer.start();
        }
    }
    
    public void Seleccionar(){
        String pos = ListaCanciones.getSelectedValue();
        if(pos!=null){
            String[] separador = pos.split("\\s+");
            int indice = Integer.valueOf(separador[0])-1;
            songactual=indice+1;
            archivopath=dirs.get(indice);
            nombrearchivo=nombres.get(indice);
            NombreArchivo.setText(nombrearchivo);
            reproducciontotal=false;
            Parar();
                try{
                    File audio = new File(archivopath);
                    AudioInputStream adminaudio = AudioSystem.getAudioInputStream(audio);
                    reproductor = AudioSystem.getClip();
                    reproductor.open(adminaudio);
                    int duracion = (int)((reproductor.getFrameLength())/reproductor.getFormat().getFrameRate());
                    int minutos = duracion/60;
                    int segundoss = duracion%60;
                    TiempoTotal.setText(String.format("%02d:%02d", minutos,segundoss));
                }catch(Exception e){
                    
                }
            if(reproduciendo==true){
                reproductor.close();
                ProgresoCancion.setValue(0);
                posactual=0;
                TiempoActual.setText("00:00");
            }
        }
    }
    
    public boolean BuscarCancion(String path){
        boolean esta=false;
        for(String dir:dirs){
            if(dir.equals(path))
                esta=true;
        }
        return esta;
    }
    
    public void SiguienteAnteriorCancion(boolean siguiente){
        for(int i=0; i<dirs.size();i++){
            if(archivopath.equals(dirs.get(i))){
                if(siguiente){
                    if(siguiente && (i+1<dirs.size())){
                        Parar();
                        archivopath=dirs.get(i+1);
                        nombrearchivo=nombres.get(i+1);
                        setElementoSeleccionado(ListaCanciones,(i+2)+" - "+nombrearchivo);
                    }
                } else{
                    if(!siguiente && (i-1>-1)){
                        Parar();
                        archivopath=dirs.get(i-1);
                        nombrearchivo=nombres.get(i-1);
                        setElementoSeleccionado(ListaCanciones,(i)+" - "+nombrearchivo);
                    }
                }
                if((siguiente && (i+1<dirs.size())) || (!siguiente && (i-1>-1))){
                NombreArchivo.setText(nombrearchivo);
                try{
                    File audio = new File(archivopath);
                    AudioInputStream adminaudio = AudioSystem.getAudioInputStream(audio);
                    reproductor = AudioSystem.getClip();
                    reproductor.open(adminaudio);
                    int duracion=(int)((reproductor.getFrameLength())/reproductor.getFormat().getFrameRate());
                    int minutos=duracion/60;
                    int segundoss=duracion%60;
                    TiempoTotal.setText(String.format("%02d:%02d", minutos,segundoss));
                    ReproducirCancion();
                }catch(Exception e){
                    
                }
                }
            }
        }
    }
    
    public void setElementoSeleccionado(JList<String> listacanciones, String cancion) {
        DefaultListModel<String> modelo = (DefaultListModel)listacanciones.getModel();
        int indice=-1;
        for (int i=0; i<modelo.getSize(); i++) {
            if (modelo.getElementAt(i).equals(cancion)) {
                indice=i;
            }
        }
        ListaCanciones.setSelectedIndex(indice);
    }
    
    public void ReproducirTodaLaLista(){
        if(!dirs.isEmpty()){
            Parar();
            ListaCanciones.setSelectedIndex(0);
            archivopath=dirs.get(0);
            nombrearchivo=nombres.get(0);
            NombreArchivo.setText(nombrearchivo);
            songactual=0;
            reproducciontotal=true;
            ReproducirCancion();
        }
    }
}
