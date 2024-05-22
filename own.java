import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class own extends JFrame {
    private DefaultTableModel combinedTableModel;
    public own() {
        initializeUI();
        createButtons();
        createViewDataButton();
    }
    private void initializeUI() 
    {
        setTitle("GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
    }
    private void createButtons() {
        String[] buttonLabels={"coding", "infra", "development", "design", "operator"};
        for (String label:buttonLabels) {
            JButton button=new JButton(label);
            button.addActionListener(new ButtonClickListener());
            add(button);}
    }
    private void createViewDataButton() {
        JButton viewDataButton=new JButton("View Data");
        viewDataButton.addActionListener(new ViewDataButtonClickListener());
        add(viewDataButton);}
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton=(JButton) e.getSource();
            String buttonLabel=sourceButton.getText();
            displayTableData(buttonLabel);}
    }
    private class ViewDataButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            displayCombinedData();}
    }
    private void displayTableData(String tableName) {
        Connection connection=connectToDatabase();
        if (connection!=null) {
            try {
                Statement statement=connection.createStatement();
                ResultSet resultSet=statement.executeQuery("SELECT * FROM " + tableName);
                JFrame resultFrame=new JFrame(tableName+"Table Data");
                resultFrame.setSize(400, 300);
                resultFrame.setLocationRelativeTo(null);
                resultFrame.setLayout(new BorderLayout());
                DefaultTableModel tableModel=new DefaultTableModel();
                JTable dataTable=new JTable(tableModel);
                for (int i=1;i<=resultSet.getMetaData().getColumnCount();i++) {
                    tableModel.addColumn(resultSet.getMetaData().getColumnName(i));}
                while (resultSet.next()) {
                    Object[] rowData=new Object[resultSet.getMetaData().getColumnCount()];
                    for (int i=1;i<=resultSet.getMetaData().getColumnCount();i++) {
                        rowData[i-1]=resultSet.getObject(i);}
                    tableModel.addRow(rowData);
                }
                JScrollPane scrollPane=new JScrollPane(dataTable);
                resultFrame.add(scrollPane, BorderLayout.CENTER);
                resultFrame.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (!connection.isClosed()) {
                        connection.close();
                        System.out.println("Connection closed");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();}
            }
        } else {
            System.out.println("Failed to connect to the database.");}
    }
    private void displayCombinedData() {
        Connection connection=connectToDatabase();
        if (connection!=null) {
            try {
                combinedTableModel=new DefaultTableModel();
                JFrame combinedFrame=new JFrame("Combined Data");
                combinedFrame.setSize(600,400);
                combinedFrame.setLocationRelativeTo(null);
                JTable combinedDataTable=new JTable(combinedTableModel);
                JScrollPane scrollPane=new JScrollPane(combinedDataTable);
                combinedFrame.add(scrollPane);
                for (String label:new String[]{"coding", "infra", "development", "design", "operator"}) {
                    Statement statement=connection.createStatement();
                    ResultSet resultSet=statement.executeQuery("SELECT * FROM " + label);
                    if (combinedTableModel.getColumnCount()==0) {
                        for (int i=1;i<=resultSet.getMetaData().getColumnCount();i++) {
                            combinedTableModel.addColumn(resultSet.getMetaData().getColumnName(i));}
                    }
                    while (resultSet.next()) {
                        Object[] rowData=new Object[resultSet.getMetaData().getColumnCount()];
                        for (int i=1;i<=resultSet.getMetaData().getColumnCount();i++) {
                            rowData[i-1]=resultSet.getObject(i);
                        }
                        combinedTableModel.addRow(rowData);}
                }
                combinedFrame.setVisible(true);
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (!connection.isClosed()) {
                        connection.close();
                        System.out.println("Connection closed");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();}
            }
        } else {
            System.out.println("Failed to connect to the database.");}
    }
    private Connection connectToDatabase() {
        Connection connection=null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/taskdb";
            String user="root";
            String password="sandhya";
            connection=DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();}
        return connection;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new own().setVisible(true));}
}
