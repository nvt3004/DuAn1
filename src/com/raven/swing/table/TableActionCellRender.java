package com.raven.swing.table;

import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author RAVEN
 */
public class TableActionCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSeleted, boolean bln1, int row, int column) {
        Component com = super.getTableCellRendererComponent(jtable, o, isSeleted, bln1, row, column);
        PanelAc action = new PanelAc();
        if (isSeleted == false 
//                && row % 2 == 0
                ) {
            action.setBackground(Color.white);
        } else {
            action.setBackground(com.getBackground());
        }
        return action;
    }
}
