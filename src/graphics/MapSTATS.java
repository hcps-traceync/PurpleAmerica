/* 
 * Political Map Project
 * Name: Robbie, Ethan, Nigel
 * Block: 7
 * 
 * Program Purpose:
 * 
 * Algorithm:
 * 
 * Future/possible improvements:
 *
 */
package graphics;

/**
 * ***************************** Imports *********************************
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import map.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rob
 */
public class MapSTATS extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public MapSTATS() {
        /**
         * ****************************** Variables **********************************
         */
                Selection select = new Selection();
                RegionBuilder build = new RegionBuilder();
                List<File> fileList = new ArrayList<>();
                List<Region> regionList = new ArrayList<>();
        /**
         * **************************** Look and Feel ********************************
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println("There was an error in identifying your operating system, so java look and feel will be used. " + e);
        }
        /**
         * **************************** User interface ********************************
         */
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawButton = new javax.swing.JButton();
        RegionList = new javax.swing.JComboBox<>();
        map = new javax.swing.JPanel();
        dataSet = new javax.swing.JTextField();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        openMapData = new javax.swing.JMenuItem();
        saveImg = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        window = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MapSTATS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("MapSTATS"); // NOI18N

        drawButton.setText("Draw");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mapLayout = new javax.swing.GroupLayout(map);
        map.setLayout(mapLayout);
        mapLayout.setHorizontalGroup(
            mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );
        mapLayout.setVerticalGroup(
            mapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        file.setText("File");

        openMapData.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        openMapData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/ic_folder.png"))); // NOI18N
        openMapData.setText("Open Map Data");
        openMapData.setToolTipText("Select the data directory to make a new map.");
        openMapData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMapDataActionPerformed(evt);
            }
        });
        file.add(openMapData);
        openMapData.getAccessibleContext().setAccessibleDescription("Allows user to select a folder to parse the data from.");

        saveImg.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/ic_save.png"))); // NOI18N
        saveImg.setText("Save image");
        saveImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImgActionPerformed(evt);
            }
        });
        file.add(saveImg);
        file.add(jSeparator1);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/ic_exit_to_app.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        Menu.add(file);
        Menu.add(window);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drawButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(RegionList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataSet)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RegionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183)
                .addComponent(dataSet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMapDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMapDataActionPerformed
            Selection select = new Selection();
            RegionBuilder build = new RegionBuilder();
            List<File> fileList = new ArrayList<>();
            List<Region> regionList = new ArrayList<>();
        try {
            fileList = select.selectFolder();
        } catch (Exception e) {

        }
        regionList = build.regionBuilder(fileList);
        for(int i = 0; i < regionList.size(); i++){
            RegionList.addItem(regionList.get(i).getRegionName(regionList.get(i)));
        }
    }//GEN-LAST:event_openMapDataActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void saveImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImgActionPerformed
        System.out.println("Currently you cannot save the image, try again in a later update. ");
    }//GEN-LAST:event_saveImgActionPerformed

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        List<Region> regionList = new ArrayList<>();
        try {
        dataSet.setText(RegionList.getSelectedItem().toString());
        } catch (Exception e) {
            System.out.println("No region has been found, the data may be corrupted. ");
        }
    }//GEN-LAST:event_drawButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MapSTATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapSTATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapSTATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapSTATS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MapSTATS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JComboBox<String> RegionList;
    private javax.swing.JTextField dataSet;
    private javax.swing.JButton drawButton;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPanel map;
    private javax.swing.JMenuItem openMapData;
    private javax.swing.JMenuItem saveImg;
    private javax.swing.JMenu window;
    // End of variables declaration//GEN-END:variables
}
