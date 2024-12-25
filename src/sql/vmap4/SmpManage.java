package sql.vmap4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SmpManage extends JFrame implements ActionListener {
    int row;
    JTabbedPane tab = new JTabbedPane();
    JPanel mainPanel = new JPanel();
    JScrollPane viewListScroll;
    JScrollPane viewScroll;
    JPanel updatePanel = new JPanel();
    GetGermplasmInfo smpInfo1 = new GetGermplasmInfo();
    GetGermplasmInfo smpInfo2 = new GetGermplasmInfo();
    JPanel queryPanel = new JPanel();
    JButton dataButton = new JButton("delete");
    JTextField queryTextFile = new JTextField(10);
    Object data[][], data1[][], data2[][];
    Object colName[] = {"GID", "G_repeat", "Bam", "Accession", "Chinese_name", "Taxonomy", "Dataset"};
    JTable smpTable, queryTable, queryList;
    JButton addButton = new JButton("Add");
    JButton modifyButton = new JButton("Modify");
    JButton queryButton = new JButton("Query");
    JButton updateButton = new JButton("Update data");
    String sGID;
    JTextField snoText = new JTextField(10);
    public SmpManage() {
        super("Germplasm manage system");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // Add data
    public void addData(){
        JButton addClear = new JButton("Clear");
        mainPanel.add(smpInfo1);
        addButton.addActionListener(this);
        smpInfo1.add(addButton);
        smpInfo1.add(addClear);
        addClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent d) {
                smpInfo1.GID.setText("");
                smpInfo1.GRepeat.setText("");
                smpInfo1.bam.setText("");
                smpInfo1.accession.setText("");
                smpInfo1.ChineseName.setText("");
                smpInfo1.taxa.setText("");
                smpInfo1.dataSet.setText("");
            }
        });
        tab.add("Add data", smpInfo1);
    }
    // Modify data
    public void modifyData(){
        JButton updateClear = new JButton("Modify");
        mainPanel.add(smpInfo2);
        smpInfo2.add(modifyButton);
        smpInfo2.add(queryButton);
        queryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent d) {
                smpInfo2.GID.setEditable(false);
                smpInfo2.GRepeat.setEditable(true);
                smpInfo2.bam.setEditable(true);
                smpInfo2.accession.setEditable(true);
                smpInfo2.ChineseName.setEditable(true);
                smpInfo2.taxa.setEditable(true);
                smpInfo2.dataSet.setEditable(true);
                sGID = smpInfo2.GID.getText();
                if (smpInfo2.GID.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "GID cannot be empty!");
                else
                    try{
                        ResultSet rs;
                        Connection conn = new GetConnection().getConn();
                        Statement stmt = conn.createStatement();
                        String sql = "select * from main_list where GID="+sGID;
                        rs = stmt.executeQuery(sql);
                        while (rs.next()) {
                            smpInfo2.GRepeat.setText(rs.getString(2));
                            smpInfo2.bam.setText(rs.getString(3));
                            smpInfo2.accession.setText(rs.getString(4));
                            smpInfo2.ChineseName.setText(rs.getString(5));
                            smpInfo2.taxa.setText(rs.getString(6));
                            smpInfo2.dataSet.setText(rs.getString(7));
                        }
                        queryTable.setVisible(false);
                        queryTable.setVisible(true);
                        rs.close();
                        conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        });
        smpInfo2.add(modifyButton);
        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent d) {
                if (smpInfo2.GID.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "GID cannot be empty!");
                else
                    try {
                        smpInfo2.GRepeat.setEditable(false);
                        smpInfo2.bam.setEditable(false);
                        smpInfo2.accession.setEditable(false);
                        smpInfo2.ChineseName.setEditable(false);
                        smpInfo2.taxa.setEditable(false);
                        smpInfo2.dataSet.setEditable(false);
                        String GID = smpInfo2.GID.getText();
                        String GRepeat = smpInfo2.GRepeat.getText();
                        String bam = smpInfo2.bam.getText();
                        String accession = smpInfo2.accession.getText();
                        String ChineseName = smpInfo2.ChineseName.getText();
                        String taxa = smpInfo2.taxa.getText();
                        String dataSet = smpInfo2.dataSet.getText();
                        Connection conn = new GetConnection().getConn();
                        Statement stmt = conn.createStatement();
                        String sql = "update main_list set " +
                                "GRepeat='"+GRepeat+"'," +
                                "bam='"+bam+"'," +
                                "accession='"+accession+"'," +
                                "ChineseName='"+ChineseName+"'," +
                                "taxa='"+taxa+"'," +
                                "dataSet='"+dataSet+"' where GID='"+GID+"'";
                        stmt.executeUpdate(sql);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
