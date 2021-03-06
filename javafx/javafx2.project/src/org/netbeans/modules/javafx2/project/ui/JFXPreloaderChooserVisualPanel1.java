/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.javafx2.project.ui;

import javax.swing.JPanel;
import org.netbeans.modules.javafx2.project.JFXProjectProperties;
import org.openide.util.NbBundle;

public final class JFXPreloaderChooserVisualPanel1 extends JPanel {

    /** Creates new form JFXPreloaderChooserVisualPanel1 */
    public JFXPreloaderChooserVisualPanel1() {
        initComponents();
    }

    @Override
    public String getName() {
        return NbBundle.getMessage(JFXPreloaderChooserVisualPanel1.class, "JFXPreloaderChooserVisualPanel1.name"); // NOI18N
    }

    public JFXProjectProperties.PreloaderSourceType getSelectedType() {
        if(radioButtonProject.isSelected()) {
            return JFXProjectProperties.PreloaderSourceType.PROJECT;
        }
        return JFXProjectProperties.PreloaderSourceType.JAR;
    }

    public void setSelectedType(JFXProjectProperties.PreloaderSourceType selectedType) {
        if(selectedType == JFXProjectProperties.PreloaderSourceType.PROJECT) {
            radioButtonProject.setSelected(true);
        } else {
            radioButtonJAR.setSelected(true);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonSourceType = new javax.swing.ButtonGroup();
        radioButtonProject = new javax.swing.JRadioButton();
        radioButtonJAR = new javax.swing.JRadioButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));

        setLayout(new java.awt.GridBagLayout());

        buttonSourceType.add(radioButtonProject);
        radioButtonProject.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(radioButtonProject, org.openide.util.NbBundle.getMessage(JFXPreloaderChooserVisualPanel1.class, "JFXPreloaderChooserVisualPanel1.radioButtonProject.text")); // NOI18N
        radioButtonProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonProjectActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        add(radioButtonProject, gridBagConstraints);

        buttonSourceType.add(radioButtonJAR);
        org.openide.awt.Mnemonics.setLocalizedText(radioButtonJAR, org.openide.util.NbBundle.getMessage(JFXPreloaderChooserVisualPanel1.class, "JFXPreloaderChooserVisualPanel1.radioButtonJAR.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        add(radioButtonJAR, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 0.1;
        add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        add(filler2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

private void radioButtonProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonProjectActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_radioButtonProjectActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonSourceType;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JRadioButton radioButtonJAR;
    private javax.swing.JRadioButton radioButtonProject;
    // End of variables declaration//GEN-END:variables
}
