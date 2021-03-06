/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sickill.off.common;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextArea;

public class OffOptionsPanel extends javax.swing.JPanel implements KeyListener {
    protected Settings s;

    public OffOptionsPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    smartMatch = new javax.swing.JRadioButton();
    normalMatch = new javax.swing.JRadioButton();
    minPatternLength = new javax.swing.JSpinner();
    matchFromStart = new javax.swing.JCheckBox();
    jLabel3 = new javax.swing.JLabel();
    searchDelay = new javax.swing.JSpinner();
    jLabel6 = new javax.swing.JLabel();
    clearOnOpen = new javax.swing.JCheckBox();
    jLabel7 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    lessPriorityMask = new javax.swing.JTextArea();
    jScrollPane2 = new javax.swing.JScrollPane();
    ignoreMask = new javax.swing.JTextArea();
    jLabel8 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    morePriorityMask = new javax.swing.JTextArea();
    jLabel9 = new javax.swing.JLabel();

    jLabel1.setText("Matching mode:");

    jLabel2.setText("Minimum pattern length:");

    jLabel4.setText("Wait");

    jLabel5.setText("Hide files matching:");

    buttonGroup1.add(smartMatch);
    smartMatch.setText("smart");

    buttonGroup1.add(normalMatch);
    normalMatch.setText("normal");

    minPatternLength.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

    matchFromStart.setText("Match from start of filename");
    matchFromStart.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        matchFromStartActionPerformed(evt);
      }
    });

    jLabel3.setText("char(s)");

    searchDelay.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.1f)));

    jLabel6.setText("(sec) before searching");

    clearOnOpen.setText("Clear search pattern on dialog open");

    jLabel7.setText("Increase rank of files matching:");

    lessPriorityMask.setColumns(20);
    lessPriorityMask.setRows(5);
    lessPriorityMask.setToolTipText("<html>One glob per line.<br>use * as substitute for any number of chars");
    jScrollPane1.setViewportView(lessPriorityMask);

    ignoreMask.setColumns(20);
    ignoreMask.setRows(5);
    ignoreMask.setToolTipText("<html>One glob per line.<br>use * as substitute for any number of chars");
    jScrollPane2.setViewportView(ignoreMask);

    jLabel8.setText("Decrease rank of files matching:");

    morePriorityMask.setColumns(20);
    morePriorityMask.setRows(5);
    morePriorityMask.setToolTipText("<html>One glob per line.<br>\nuse * as substitute for any number of chars");
    jScrollPane3.setViewportView(morePriorityMask);

    jLabel9.setText("<html>These three boxes take globs:<br><ul><li>one per line<li>use * to match anything");

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(jLabel7)
              .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 244, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(18, 18, 18)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(jLabel8)
              .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
          .add(layout.createSequentialGroup()
            .add(jLabel1)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(smartMatch)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(normalMatch))
          .add(layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(minPatternLength, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3))
              .add(layout.createSequentialGroup()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(searchDelay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel6)))
            .add(18, 18, 18)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(matchFromStart)
              .add(clearOnOpen)))
          .add(jLabel5)
          .add(layout.createSequentialGroup()
            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(18, 18, 18)
            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(smartMatch)
          .add(jLabel1)
          .add(normalMatch))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
              .add(jLabel2)
              .add(minPatternLength, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(jLabel3))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
              .add(jLabel4)
              .add(searchDelay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .add(jLabel6)
              .add(clearOnOpen)))
          .add(matchFromStart))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
        .add(jLabel5)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(18, 18, 18)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(jLabel7)
          .add(jLabel8))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(25, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void matchFromStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchFromStartActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_matchFromStartActionPerformed

    public void load() {
        // TODO read settings and initialize GUI
        // Example:        
        // someCheckBox.setSelected(Preferences.userNodeForPackage(TazPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(TazPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        if (s.isSmartMatch()) {
            smartMatch.setSelected(true);
        } else {
            normalMatch.setSelected(true);
        }
        minPatternLength.setValue(s.getMinPatternLength());
        searchDelay.setValue(s.getSearchDelay());
        ignoreMask.setText(s.getIgnoreMask().toString());
        matchFromStart.setSelected(s.isMatchFromStart());
        clearOnOpen.setSelected(s.isClearOnOpen());
        lessPriorityMask.setText(s.getLessPriorityMask());
        morePriorityMask.setText(s.getMorePriorityMask());

        ignoreMask.addKeyListener(this);
        lessPriorityMask.addKeyListener(this);
        morePriorityMask.addKeyListener(this);
    }

    public void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(TazPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(TazPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());
        s.setSmartMatch(smartMatch.isSelected());
        s.setMinPatternLength((Integer)minPatternLength.getValue());
        s.setSearchDelay((Float)searchDelay.getValue());
        s.setIgnoreMask(ignoreMask.getText());
        s.setMatchFromStart(matchFromStart.isSelected());
        s.setClearOnOpen(clearOnOpen.isSelected());
        s.setLessPriorityMask(lessPriorityMask.getText());
        s.setMorePriorityMask(morePriorityMask.getText());
    }

    public boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JCheckBox clearOnOpen;
  private javax.swing.JTextArea ignoreMask;
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
  private javax.swing.JTextArea lessPriorityMask;
  private javax.swing.JCheckBox matchFromStart;
  private javax.swing.JSpinner minPatternLength;
  private javax.swing.JTextArea morePriorityMask;
  private javax.swing.JRadioButton normalMatch;
  private javax.swing.JSpinner searchDelay;
  private javax.swing.JRadioButton smartMatch;
  // End of variables declaration//GEN-END:variables

    public void keyTyped(KeyEvent e) {
    }

    // workaround for JEdit's option pane closing on ENTER
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            JTextArea a = (JTextArea)e.getSource();
            a.insert("\n", a.getCaretPosition());
            e.consume();
        }
    }

    public void keyReleased(KeyEvent e) {
    }
}
