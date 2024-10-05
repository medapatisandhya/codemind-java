import javax.swing.*;
import javax.swing.table.DefaultTableModel;

//import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.FlowLayout;


public class owntask {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create and set up the main frame
            JFrame mainFrame = new JFrame("Main frame");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(new BoxLayout(mainFrame.getContentPane(), BoxLayout.Y_AXIS));
            mainFrame.setLayout(new FlowLayout());

            // Create buttons
            JButton codingButton = new JButton("Coding");
            JButton infraButton = new JButton("Infra");
            JButton designButton = new JButton("Design");
            JButton developmentButton = new JButton("Development");
            JButton operatorButton = new JButton("Operations");
            JButton viewdataButton = new JButton("ViewData");
            codingButton.setFont(new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 15));
            infraButton.setFont(new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 15));
            designButton.setFont(new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 15));
            developmentButton.setFont(new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 15));
            operatorButton.setFont(new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 15));
            viewdataButton.setFont(new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 20));
            codingButton.setBackground(Color.yellow);
            infraButton.setBackground(Color.green);
            designButton.setBackground(Color.magenta);
            developmentButton.setBackground(Color.orange);
            operatorButton.setBackground(Color.pink);
            viewdataButton.setBackground(Color.white);

            // Add action listeners to the buttons
            codingButton.addActionListener(new ButtonClickListener("Coding"));
            infraButton.addActionListener(new ButtonClickListener("Infra"));
            designButton.addActionListener(new ButtonClickListener("Design"));
            developmentButton.addActionListener(new ButtonClickListener("Development"));
            operatorButton.addActionListener(new ButtonClickListener("Operations"));
            viewdataButton.addActionListener(new ButtonClickListener("ViewData"));

            // Add buttons to the main frame
            mainFrame.add(codingButton);
            mainFrame.add(infraButton);
            mainFrame.add(designButton);
            mainFrame.add(developmentButton);
            mainFrame.add(operatorButton);
            mainFrame.add(viewdataButton);


            // Set main frame properties
            mainFrame.setSize(600, 500);
            mainFrame.setLocationRelativeTo(null);
            mainFrame.setVisible(true);
        });
    }

    private static class ButtonClickListener implements ActionListener {
        private final String buttonName;
        private final Map<String, Object[][]> buttonData;

        public ButtonClickListener(String buttonName) {
            this.buttonName = buttonName;

            // Initialize button data (replace with your actual data)
            buttonData = new HashMap<>();
            buttonData.put("Coding", new Object[][]{
                    {"4201", "Pavan", "Manager","8074218833"},
                    {"4202", "Saikala", "Lead","9347188860"},
                    {"4203", "Rajesh", "Supporting","9014523425"}
            });
            buttonData.put("Infra", new Object[][]{
                    {"4204", "Samual", "Manager","6744083246"},
                    {"4205", "Rambabu", "Administrator","7347982654"},
                    {"4206", "Sunil", "Supporting","8500004563"}
            });
            buttonData.put("Design", new Object[][]{
                    {"4207", "Kiran", "Manager","789564321"},
                    {"4208", "Divya", "Lead","6276542986"},
                    {"4209", "Siva","Supporting", "8543298761"}
            });
            buttonData.put("Development", new Object[][]{
                    {"42010", "Ashok", "Manager","9959694947"},
                    {"42011", "Prasad", "Lead","8949675642"},
                    {"42012", "Kumar", "Supporting","7969495939"}
            });

            buttonData.put("Operations", new Object[][]{
                    {"42013", "Swapna","Manager", "7656463626"},
                    {"42014", "Saikumar","Lead", "8765439872"},
                    {"42015", "Sukumar","Supporting", "9979643278"}
            });
            buttonData.put("ViewData", new Object[][]{
                    {"4201", "Pavan", "Manager","8074218833"},
                    {"4202", "Saikala", "Lead","9347188860"},
                    {"4203", "Rajesh", "Supporting","9014523425"},
                    {"4204", "Samual", "Manager","6744083246"},
                    {"4205", "Rambabu", "Administrator","7347982654"},
                    {"4206", "Sunil", "Supporting","8500004563"},
                    {"4207", "Kiran", "Manager","789564321"},
                    {"4208", "Divya", "Lead","6276542986"},
                    {"4209", "Siva","Supporting", "8543298761"},
                    {"42010", "Ashok", "Manager","9959694947"},
                    {"42011", "Prasad", "Lead","8949675642"},
                    {"42012", "Kumar", "Supporting","7969495939"},
                    {"42013", "Swapna","Manager", "7656463626"},
                    {"42014", "Saikumar","Lead", "8765439872"},
                    {"42015", "Sukumar","Supporting", "9979643278"}
            });
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Create and set up the second frame
            JFrame infoFrame = new JFrame(buttonName + " Information");
            infoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close, so it doesn't exit the entire application

            // Get the data for the clicked button
            Object[][] data = buttonData.get(buttonName);

            // Create table column names
            String[] columnNames = {"Id", "Name", "Role","PhNo"};

            // Create a table model
            DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

            // Create a JTable using the table model
            JTable table = new JTable(tableModel);

            // Create a scroll pane to hold the table
            JScrollPane scrollPane = new JScrollPane(table);

            // Add the scroll pane to the frame
            infoFrame.getContentPane().add(scrollPane);

            // Set frame properties
            infoFrame.setSize(400, 300);
            infoFrame.setLocationRelativeTo(null);
            infoFrame.setVisible(true);
        }
    }
}
