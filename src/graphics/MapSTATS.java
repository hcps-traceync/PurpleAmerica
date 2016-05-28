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
import map.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rob
 */
public class MapSTATS extends javax.swing.JFrame {
    
    Selection select = new Selection();
    RegionBuilder build = new RegionBuilder();
    List<File> fileList = new ArrayList<>();
    List<Region> regionList = new ArrayList<>();
    
    public MapSTATS() {
        /**
         * ****************************** Variables **********************************
         */
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
        jPanel1 = new javax.swing.JPanel();
        drawAmerica = new javax.swing.JButton();
        americaCounties = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        yearData = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        openMapData = new javax.swing.JMenuItem();
        saveImg = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        colorPalette = new javax.swing.JMenuItem();
        mapProjection = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MapSTATS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("MapSTATS"); // NOI18N

        drawButton.setText("State");
        drawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawButtonActionPerformed(evt);
            }
        });

        RegionList.setToolTipText("");
        RegionList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RegionList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegionListActionPerformed(evt);
            }
        });

        drawAmerica.setText("America");
        drawAmerica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawAmericaActionPerformed(evt);
            }
        });

        americaCounties.setText("America + Counties");
        americaCounties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                americaCountiesActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Note: When a region is drawn a voter \nturnout graph will appear showing \nthe trend of voter turnout percent \n(ratio of registered voters to \npeople who actually voted) over time");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Purple America");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(drawAmerica, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addComponent(americaCounties, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 135, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(americaCounties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawAmerica, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
        );

        yearData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Year to map data", "1960", "1964", "1968", "1972", "1976", "1980", "1984", "1988", "1992", "1996", "2000", "2004", "2008", "2012" }));

        jLabel2.setText("Select a state and year then press a button");

        jLabel3.setText("Select your data folder with ctrl + shift + m");

        file.setText("File");

        openMapData.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        openMapData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/images/ic_folder.png"))); // NOI18N
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
        saveImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/images/ic_save.png"))); // NOI18N
        saveImg.setText("Save image");
        saveImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImgActionPerformed(evt);
            }
        });
        file.add(saveImg);
        file.add(jSeparator1);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/images/ic_exit_to_app.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        Menu.add(file);

        viewMenu.setText("View");

        colorPalette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/images/ic_color_lens.png"))); // NOI18N
        colorPalette.setText("Color Palette");
        colorPalette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorPaletteActionPerformed(evt);
            }
        });
        viewMenu.add(colorPalette);

        mapProjection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graphics/images/ic_map.png"))); // NOI18N
        mapProjection.setText("Projection");
        mapProjection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapProjectionActionPerformed(evt);
            }
        });
        viewMenu.add(mapProjection);

        Menu.add(viewMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegionList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drawButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearData, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RegionList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(drawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMapDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMapDataActionPerformed
        fileList = select.selectFolder();
        regionList = build.regionBuilder(fileList);
        for(int i = 0; i < regionList.size(); i++){
            try {
                RegionList.addItem(regionList.get(i).getRegionNameConv(regionList.get(i)));
            } catch (Exception e) {
                System.out.println(regionList.get(i).getRegionName(regionList.get(i)));
            }
        }
    }//GEN-LAST:event_openMapDataActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Exit the program?", "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void saveImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImgActionPerformed
        System.out.println("Unsupported");
    }//GEN-LAST:event_saveImgActionPerformed

    private void drawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawButtonActionPerformed
        Object itemNumber = RegionList.getSelectedItem();
        String state = itemNumber.toString();
        System.out.println(itemNumber);
        int yearNumber = yearData.getSelectedIndex();
        int year = 1956 + (yearNumber * 4);
        System.out.println(year);
        try {
            DrawState draw = new DrawState(state, year);
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found");
        }
    }//GEN-LAST:event_drawButtonActionPerformed

    private void colorPaletteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorPaletteActionPerformed
        System.out.println("Unsupported.");
    }//GEN-LAST:event_colorPaletteActionPerformed

    private void mapProjectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapProjectionActionPerformed
        System.out.println("Unsupported.");
    }//GEN-LAST:event_mapProjectionActionPerformed

    private void drawAmericaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawAmericaActionPerformed
        int yearNumber = yearData.getSelectedIndex();
        int year = 1956  + (yearNumber * 4);
        System.out.println(year);
        try {
            DrawUSA draw = new DrawUSA(String.valueOf(year));
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found");
        }
    }//GEN-LAST:event_drawAmericaActionPerformed

    private void americaCountiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_americaCountiesActionPerformed
        int yearNumber = yearData.getSelectedIndex();
        int year = 1956 + (yearNumber * 4);
        System.out.println(year);
        try {
            DrawUSACounties draw = new DrawUSACounties(String.valueOf(year));
        } catch (FileNotFoundException ex) {
            System.err.println("File Not Found");
        } 
    }//GEN-LAST:event_americaCountiesActionPerformed

    private void RegionListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegionListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegionListActionPerformed

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
    private javax.swing.JButton americaCounties;
    private javax.swing.JMenuItem colorPalette;
    private javax.swing.JButton drawAmerica;
    private javax.swing.JButton drawButton;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem mapProjection;
    private javax.swing.JMenuItem openMapData;
    private javax.swing.JMenuItem saveImg;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JComboBox<String> yearData;
    // End of variables declaration//GEN-END:variables
}
