package stableant;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        makeTable();
    }
    
//**Dolgozók lista létrehozása és feltöltése*/
        public  void makeTable(){
            //Importálni kell ALT+ENTER vagy CTRL + Space /
            ArrayList <Employee> empList = new ArrayList <>();
            empList.add(new Employee(
            1, "Erős István", "Szeged", 389.
            
            ));
            empList.add(new Employee(
            2, "Felhő Béla", "Szeged", 392.
            
            ));
            empList.add(new Employee(
            3, "Gyenge Viola", "Szeged", 325.
            
            ));
            //Importálni kell ALT+ENTER vagy CTRL + Space /
            DefaultTableModel model = new DefaultTableModel();
            table.setModel(model);
            Object[] fields = {
                "Azonosító",
                "Név",
                "Város",
                "Fizetés"
        };
            model.setColumnIdentifiers(fields);
            for ( Employee emp : empList ) { 
                Vector<String> row = new Vector<>();
                row.add(emp.id.toString());
                row.add(emp.name);
                row.add(emp.city);
                row.add(emp.salary.toString());
                model.addRow(row);
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
