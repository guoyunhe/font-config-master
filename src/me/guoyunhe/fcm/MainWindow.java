/*
 * Copyright (C) 2015 Guo Yunhe <guoyunhebrave@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package me.guoyunhe.fcm;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guo Yunhe <guoyunhebrave@gmail.com>
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        subpixelTestDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logoutNoticeDialog = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        closeNoticeButton = new javax.swing.JButton();
        tabbedPanel = new javax.swing.JTabbedPane();
        fontFamilyPanel = new javax.swing.JScrollPane();
        fontTypeContentPanel = new javax.swing.JPanel();
        sansLabel = new javax.swing.JLabel();
        serifLabel = new javax.swing.JLabel();
        monoLabel = new javax.swing.JLabel();
        westLabel = new javax.swing.JLabel();
        sansComboBox = new javax.swing.JComboBox();
        serifComboBox = new javax.swing.JComboBox();
        monoComboBox = new javax.swing.JComboBox();
        zhLabel = new javax.swing.JLabel();
        zhSansComboBox = new javax.swing.JComboBox();
        zhSerifComboBox = new javax.swing.JComboBox();
        zhMonoComboBox = new javax.swing.JComboBox();
        jaLabel = new javax.swing.JLabel();
        koLabel = new javax.swing.JLabel();
        jaSansComboBox = new javax.swing.JComboBox();
        jaSerifComboBox = new javax.swing.JComboBox();
        jaMonoComboBox = new javax.swing.JComboBox();
        koSansComboBox = new javax.swing.JComboBox();
        koSerifComboBox = new javax.swing.JComboBox();
        koMonoComboBox = new javax.swing.JComboBox();
        fontRenderPanel = new javax.swing.JScrollPane();
        fontRenderContentPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        antialiasCheckBox = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        subpixelComboBox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        hintingCheckBox = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        hintStyleComboBox = new javax.swing.JComboBox();
        subpixelTestButton = new javax.swing.JButton();
        fontAliasPanel = new javax.swing.JScrollPane();
        fontAliasContentPanel = new javax.swing.JPanel();
        aliasTableScrollPanel = new javax.swing.JScrollPane();
        aliasTable = new javax.swing.JTable();
        fontAliasActionPanel = new javax.swing.JPanel();
        originalFontLabel = new javax.swing.JLabel();
        originalFontTextField = new javax.swing.JTextField();
        fontAliasLabel = new javax.swing.JLabel();
        fontAliasComboBox = new javax.swing.JComboBox();
        newAliasButton = new javax.swing.JButton();
        deleteAliasButton = new javax.swing.JButton();
        aboutPanel = new javax.swing.JScrollPane();
        aboutContentPanel = new javax.swing.JPanel();
        appTitlePanel = new javax.swing.JPanel();
        appNameLabel = new javax.swing.JLabel();
        appVersionLabel = new javax.swing.JLabel();
        appInfoPanel = new javax.swing.JPanel();
        freeSoftwareLabel = new javax.swing.JLabel();
        licenseLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        homepageLabel = new javax.swing.JLabel();
        saveButtonPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        subpixelTestDialog.setTitle("Subpixel Render: Test Your Screen");
        subpixelTestDialog.setMinimumSize(new java.awt.Dimension(600, 450));
        subpixelTestDialog.setType(java.awt.Window.Type.UTILITY);
        subpixelTestDialog.getContentPane().setLayout(new javax.swing.BoxLayout(subpixelTestDialog.getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/me/guoyunhe/fcm/img/subpixel.png"))); // NOI18N
        subpixelTestDialog.getContentPane().add(jLabel1);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Please Take Off Your Glasses!");
        subpixelTestDialog.getContentPane().add(jLabel2);

        logoutNoticeDialog.setTitle("Logout or restart needed");
        logoutNoticeDialog.setLocation(new java.awt.Point(0, 0));
        logoutNoticeDialog.setMinimumSize(new java.awt.Dimension(240, 150));
        logoutNoticeDialog.setResizable(false);
        logoutNoticeDialog.setType(java.awt.Window.Type.UTILITY);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>\n<p><center>Please <strong>logout</strong> and login again, or <strong>restart</strong> system, to make new configuration take effects!</center></p>\n</html>");
        logoutNoticeDialog.getContentPane().add(jLabel3, java.awt.BorderLayout.CENTER);

        closeNoticeButton.setText("Close");
        closeNoticeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeNoticeButtonActionPerformed(evt);
            }
        });
        logoutNoticeDialog.getContentPane().add(closeNoticeButton, java.awt.BorderLayout.SOUTH);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Font Config Master");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        tabbedPanel.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPanel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        fontTypeContentPanel.setOpaque(false);
        java.awt.GridBagLayout fontTypeContentPanelLayout = new java.awt.GridBagLayout();
        fontTypeContentPanelLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        fontTypeContentPanelLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        fontTypeContentPanel.setLayout(fontTypeContentPanelLayout);

        sansLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        sansLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sansLabel.setText("Sans Serif");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        fontTypeContentPanel.add(sansLabel, gridBagConstraints);

        serifLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        serifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serifLabel.setText("Serif");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        fontTypeContentPanel.add(serifLabel, gridBagConstraints);

        monoLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        monoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monoLabel.setText("Monospace");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        fontTypeContentPanel.add(monoLabel, gridBagConstraints);

        westLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        westLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        westLabel.setText("Western fonts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        fontTypeContentPanel.add(westLabel, gridBagConstraints);

        sansComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        sansComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sansComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        fontTypeContentPanel.add(sansComboBox, gridBagConstraints);

        serifComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        serifComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        serifComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        fontTypeContentPanel.add(serifComboBox, gridBagConstraints);

        monoComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        monoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        monoComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        fontTypeContentPanel.add(monoComboBox, gridBagConstraints);

        zhLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        zhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        zhLabel.setText("Chinese fonts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        fontTypeContentPanel.add(zhLabel, gridBagConstraints);

        zhSansComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        zhSansComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        zhSansComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        fontTypeContentPanel.add(zhSansComboBox, gridBagConstraints);

        zhSerifComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        zhSerifComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        zhSerifComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        fontTypeContentPanel.add(zhSerifComboBox, gridBagConstraints);

        zhMonoComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        zhMonoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        zhMonoComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        fontTypeContentPanel.add(zhMonoComboBox, gridBagConstraints);

        jaLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jaLabel.setText("Japanese fonts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        fontTypeContentPanel.add(jaLabel, gridBagConstraints);

        koLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        koLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        koLabel.setText("Korean fonts");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        fontTypeContentPanel.add(koLabel, gridBagConstraints);

        jaSansComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jaSansComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jaSansComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        fontTypeContentPanel.add(jaSansComboBox, gridBagConstraints);

        jaSerifComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jaSerifComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jaSerifComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        fontTypeContentPanel.add(jaSerifComboBox, gridBagConstraints);

        jaMonoComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jaMonoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jaMonoComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        fontTypeContentPanel.add(jaMonoComboBox, gridBagConstraints);

        koSansComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        koSansComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        koSansComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        fontTypeContentPanel.add(koSansComboBox, gridBagConstraints);

        koSerifComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        koSerifComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        koSerifComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        fontTypeContentPanel.add(koSerifComboBox, gridBagConstraints);

        koMonoComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        koMonoComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        koMonoComboBox.setMaximumSize(new java.awt.Dimension(100, 32767));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        fontTypeContentPanel.add(koMonoComboBox, gridBagConstraints);

        fontFamilyPanel.setViewportView(fontTypeContentPanel);

        tabbedPanel.addTab("Font Family", fontFamilyPanel);

        java.awt.GridBagLayout fontRenderContentPanelLayout = new java.awt.GridBagLayout();
        fontRenderContentPanelLayout.columnWidths = new int[] {0, 5, 0, 5, 0};
        fontRenderContentPanelLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        fontRenderContentPanel.setLayout(fontRenderContentPanelLayout);

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setText("Antialias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        fontRenderContentPanel.add(jLabel8, gridBagConstraints);

        antialiasCheckBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        fontRenderContentPanel.add(antialiasCheckBox, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setText("Hinting");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        fontRenderContentPanel.add(jLabel9, gridBagConstraints);

        subpixelComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        subpixelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "RGB", "BGR", "Vertical RGB", "Vertical BGR" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        fontRenderContentPanel.add(subpixelComboBox, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel10.setText("Subpixel render");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        fontRenderContentPanel.add(jLabel10, gridBagConstraints);

        hintingCheckBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        fontRenderContentPanel.add(hintingCheckBox, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel11.setText("Hint style");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        fontRenderContentPanel.add(jLabel11, gridBagConstraints);

        hintStyleComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        hintStyleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Slight", "Medium", "Full" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        fontRenderContentPanel.add(hintStyleComboBox, gridBagConstraints);

        subpixelTestButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        subpixelTestButton.setText("Test");
        subpixelTestButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subpixelTestButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        fontRenderContentPanel.add(subpixelTestButton, gridBagConstraints);

        fontRenderPanel.setViewportView(fontRenderContentPanel);

        tabbedPanel.addTab("Font Render", fontRenderPanel);

        fontAliasContentPanel.setLayout(new javax.swing.BoxLayout(fontAliasContentPanel, javax.swing.BoxLayout.Y_AXIS));

        aliasTableScrollPanel.setPreferredSize(new java.awt.Dimension(456, 250));

        aliasTable.setAutoCreateRowSorter(true);
        aliasTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        aliasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Original font", "Font alias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        aliasTableScrollPanel.setViewportView(aliasTable);

        fontAliasContentPanel.add(aliasTableScrollPanel);

        fontAliasActionPanel.setMaximumSize(new java.awt.Dimension(32767, 30));
        fontAliasActionPanel.setMinimumSize(new java.awt.Dimension(408, 30));
        fontAliasActionPanel.setPreferredSize(new java.awt.Dimension(100, 38));

        originalFontLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        originalFontLabel.setText("Font");
        fontAliasActionPanel.add(originalFontLabel);

        originalFontTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        originalFontTextField.setAlignmentX(0.0F);
        originalFontTextField.setPreferredSize(new java.awt.Dimension(136, 28));
        fontAliasActionPanel.add(originalFontTextField);

        fontAliasLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fontAliasLabel.setText("Alias");
        fontAliasActionPanel.add(fontAliasLabel);

        fontAliasComboBox.setEditable(true);
        fontAliasComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fontAliasComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fontAliasComboBox.setAlignmentX(0.0F);
        fontAliasComboBox.setPreferredSize(new java.awt.Dimension(136, 28));
        fontAliasActionPanel.add(fontAliasComboBox);

        newAliasButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        newAliasButton.setText("New");
        newAliasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAliasButtonActionPerformed(evt);
            }
        });
        fontAliasActionPanel.add(newAliasButton);

        deleteAliasButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        deleteAliasButton.setText("Delete");
        fontAliasActionPanel.add(deleteAliasButton);

        fontAliasContentPanel.add(fontAliasActionPanel);

        fontAliasPanel.setViewportView(fontAliasContentPanel);

        tabbedPanel.addTab("Font Alias", fontAliasPanel);

        aboutContentPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        aboutContentPanel.setPreferredSize(new java.awt.Dimension(300, 300));
        aboutContentPanel.setLayout(new javax.swing.BoxLayout(aboutContentPanel, javax.swing.BoxLayout.Y_AXIS));

        appTitlePanel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20);
        flowLayout1.setAlignOnBaseline(true);
        appTitlePanel.setLayout(flowLayout1);

        appNameLabel.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        appNameLabel.setText("Font Config Master");
        appTitlePanel.add(appNameLabel);

        appVersionLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        appVersionLabel.setText("0.1.1");
        appTitlePanel.add(appVersionLabel);

        aboutContentPanel.add(appTitlePanel);

        appInfoPanel.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        freeSoftwareLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        freeSoftwareLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        freeSoftwareLabel.setText("Free and Open Source Software");
        appInfoPanel.add(freeSoftwareLabel);

        licenseLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        licenseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        licenseLabel.setText("GNU GPL version 3 or later");
        appInfoPanel.add(licenseLabel);

        authorLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        authorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        authorLabel.setText("Created by Guo \"IceRabbit\" Yunhe");
        appInfoPanel.add(authorLabel);

        homepageLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        homepageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homepageLabel.setText("<html><a href=\"https://github.com/guoyunhe/font-config-master\">https://github.com/guoyunhe/font-config-master</a></html>");
        homepageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homepageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepageLabelMouseClicked(evt);
            }
        });
        appInfoPanel.add(homepageLabel);

        aboutContentPanel.add(appInfoPanel);

        aboutPanel.setViewportView(aboutContentPanel);

        tabbedPanel.addTab("About", aboutPanel);

        getContentPane().add(tabbedPanel);

        saveButtonPanel.setMaximumSize(new java.awt.Dimension(32767, 35));

        okButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        saveButtonPanel.add(okButton);

        cancelButton.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        saveButtonPanel.add(cancelButton);

        getContentPane().add(saveButtonPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        saveConfig();
        logoutNoticeDialog.setVisible(true);
    }//GEN-LAST:event_okButtonActionPerformed

    private void closeNoticeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeNoticeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeNoticeButtonActionPerformed

    private void subpixelTestButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subpixelTestButtonMouseClicked
        subpixelTestDialog.setVisible(true);
    }//GEN-LAST:event_subpixelTestButtonMouseClicked

    private void homepageLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageLabelMouseClicked
        String link = "https://github.com/guoyunhe/font-config-master";
        try {
            Desktop.getDesktop().browse(new URI(link));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homepageLabelMouseClicked

    private void newAliasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAliasButtonActionPerformed
        String font = originalFontTextField.getText().trim();
        String alias = ((String)fontAliasComboBox.getSelectedItem()).trim();
        this.aliasTableModel.addRow(new String[]{font, alias});
    }//GEN-LAST:event_newAliasButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        MainWindow mw;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainWindow mw = new MainWindow();
                mw.setVisible(true);
                mw.refreshFontList();
                mw.openConfig();
                mw.adjustUI();
            }
        });

    }

    public void adjustUI() {
        logoutNoticeDialog.setLocationRelativeTo(this);
        subpixelTestDialog.setLocationRelativeTo(this);
    }

    public void refreshFontList() {
        FontList fontlist = new FontList();
        String[] list = fontlist.get();
        sansComboBox.setModel(new DefaultComboBoxModel(list));
        serifComboBox.setModel(new DefaultComboBoxModel(list));
        monoComboBox.setModel(new DefaultComboBoxModel(list));
        zhSansComboBox.setModel(new DefaultComboBoxModel(list));
        zhSerifComboBox.setModel(new DefaultComboBoxModel(list));
        zhMonoComboBox.setModel(new DefaultComboBoxModel(list));
        jaSansComboBox.setModel(new DefaultComboBoxModel(list));
        jaSerifComboBox.setModel(new DefaultComboBoxModel(list));
        jaMonoComboBox.setModel(new DefaultComboBoxModel(list));
        koSansComboBox.setModel(new DefaultComboBoxModel(list));
        koSerifComboBox.setModel(new DefaultComboBoxModel(list));
        koMonoComboBox.setModel(new DefaultComboBoxModel(list));
        fontAliasComboBox.setModel(new DefaultComboBoxModel(list));
    }
    
    public void openConfig() {
        fontconfig = new FontConfigXML();
        // TODO: set UI components to configuration data
        sansComboBox.setSelectedItem(fontconfig.getSans());
        serifComboBox.setSelectedItem(fontconfig.getSerif());
        monoComboBox.setSelectedItem(fontconfig.getMono());
        zhSansComboBox.setSelectedItem(fontconfig.getZhSans());
        zhSerifComboBox.setSelectedItem(fontconfig.getZhSerif());
        zhMonoComboBox.setSelectedItem(fontconfig.getZhMono());
        jaSansComboBox.setSelectedItem(fontconfig.getJaSans());
        jaSerifComboBox.setSelectedItem(fontconfig.getJaSerif());
        jaMonoComboBox.setSelectedItem(fontconfig.getJaMono());
        koSansComboBox.setSelectedItem(fontconfig.getKoSans());
        koSerifComboBox.setSelectedItem(fontconfig.getKoSerif());
        koMonoComboBox.setSelectedItem(fontconfig.getKoMono());

        antialiasCheckBox.setSelected(fontconfig.getAntiAlias());
        hintingCheckBox.setSelected(fontconfig.getHinting());
        hintStyleComboBox.setSelectedIndex(fontconfig.getHintStyle());
        subpixelComboBox.setSelectedIndex(fontconfig.getSubpixel());
        
        aliasTableModel = new javax.swing.table.DefaultTableModel(
                new String[][]{}, // TODO: Read from fontconfig
                new String[]{
                    "Original font", "Font alias"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
        List<String[]> aliasList = fontconfig.getAliasList();
        for (String[] alias : aliasList) {
            aliasTableModel.addRow(alias);
        }
        aliasTable.setModel(aliasTableModel);
    }
    
    public void saveConfig() {
        // TODO: write configuration from UI components
        fontconfig.setSans((String)sansComboBox.getSelectedItem());
        fontconfig.setSerif((String)serifComboBox.getSelectedItem());
        fontconfig.setMono((String)monoComboBox.getSelectedItem());
        fontconfig.setZhSans((String)zhSansComboBox.getSelectedItem());
        fontconfig.setZhSerif((String)zhSerifComboBox.getSelectedItem());
        fontconfig.setZhMono((String)zhMonoComboBox.getSelectedItem());
        fontconfig.setJaSans((String)jaSansComboBox.getSelectedItem());
        fontconfig.setJaSerif((String)jaSerifComboBox.getSelectedItem());
        fontconfig.setJaMono((String)jaMonoComboBox.getSelectedItem());
        fontconfig.setKoSans((String)koSansComboBox.getSelectedItem());
        fontconfig.setKoSerif((String)koSerifComboBox.getSelectedItem());
        fontconfig.setKoMono((String)koMonoComboBox.getSelectedItem());
        
        fontconfig.setAntiAlias(antialiasCheckBox.isSelected());
        fontconfig.setHinting(hintingCheckBox.isSelected());
        fontconfig.setHintStyle(hintStyleComboBox.getSelectedIndex());
        fontconfig.setSubpixel(subpixelComboBox.getSelectedIndex());
        
        fontconfig.writeConfig();
    }
    
    private FontConfigXML fontconfig;
    private DefaultTableModel aliasTableModel;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutContentPanel;
    private javax.swing.JScrollPane aboutPanel;
    private javax.swing.JTable aliasTable;
    private javax.swing.JScrollPane aliasTableScrollPanel;
    private javax.swing.JCheckBox antialiasCheckBox;
    private javax.swing.JPanel appInfoPanel;
    private javax.swing.JLabel appNameLabel;
    private javax.swing.JPanel appTitlePanel;
    private javax.swing.JLabel appVersionLabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton closeNoticeButton;
    private javax.swing.JButton deleteAliasButton;
    private javax.swing.JPanel fontAliasActionPanel;
    private javax.swing.JComboBox fontAliasComboBox;
    private javax.swing.JPanel fontAliasContentPanel;
    private javax.swing.JLabel fontAliasLabel;
    private javax.swing.JScrollPane fontAliasPanel;
    private javax.swing.JScrollPane fontFamilyPanel;
    private javax.swing.JPanel fontRenderContentPanel;
    private javax.swing.JScrollPane fontRenderPanel;
    private javax.swing.JPanel fontTypeContentPanel;
    private javax.swing.JLabel freeSoftwareLabel;
    private javax.swing.JComboBox hintStyleComboBox;
    private javax.swing.JCheckBox hintingCheckBox;
    private javax.swing.JLabel homepageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jaLabel;
    private javax.swing.JComboBox jaMonoComboBox;
    private javax.swing.JComboBox jaSansComboBox;
    private javax.swing.JComboBox jaSerifComboBox;
    private javax.swing.JLabel koLabel;
    private javax.swing.JComboBox koMonoComboBox;
    private javax.swing.JComboBox koSansComboBox;
    private javax.swing.JComboBox koSerifComboBox;
    private javax.swing.JLabel licenseLabel;
    private javax.swing.JDialog logoutNoticeDialog;
    private javax.swing.JComboBox monoComboBox;
    private javax.swing.JLabel monoLabel;
    private javax.swing.JButton newAliasButton;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel originalFontLabel;
    private javax.swing.JTextField originalFontTextField;
    private javax.swing.JComboBox sansComboBox;
    private javax.swing.JLabel sansLabel;
    private javax.swing.JPanel saveButtonPanel;
    private javax.swing.JComboBox serifComboBox;
    private javax.swing.JLabel serifLabel;
    private javax.swing.JComboBox subpixelComboBox;
    private javax.swing.JButton subpixelTestButton;
    private javax.swing.JDialog subpixelTestDialog;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JLabel westLabel;
    private javax.swing.JLabel zhLabel;
    private javax.swing.JComboBox zhMonoComboBox;
    private javax.swing.JComboBox zhSansComboBox;
    private javax.swing.JComboBox zhSerifComboBox;
    // End of variables declaration//GEN-END:variables
}
