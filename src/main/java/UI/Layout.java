package UI;

import Util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Layout implements MouseListener, Constants {

    String[] labelButtons = {"Customers Management", "Import Management", "Invoice", "Statistical"};
    String[] iconItemMenu = {"customer.png", "boxes.png", "invoice.png", "analysis.png"};
    static JPanel listButton[], currentClick, westPanel, eastPanel, northPanel;
    JFrame frame = new JFrame();
    ImportProductUI importProductUI = new ImportProductUI();

    public Layout() {
        listButton = new JPanel[labelButtons.length];
        renderLayout();
    }

    public void renderLayout() {
        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BorderLayout(Hgap, Vgap));
        westPanel = westSide();
        eastPanel = eastSide();
        northPanel = northSide();
        rootPanel.add(northPanel, BorderLayout.NORTH);
        rootPanel.add(westPanel, BorderLayout.WEST);
        rootPanel.add(eastPanel, BorderLayout.EAST);
        frame.add(rootPanel);
        frame.setSize(Frame_Width, Frame_Height);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public JPanel northSide() {
        JPanel panel = new JPanel();
        JLabel title = new JLabel("Quản lý bán hàng");
        title.setFont(new Font("Verdana", Font.PLAIN, 18));
        title.setForeground(Color.white);
        title.setBorder(new EmptyBorder(8, 0, 0, 0));
        panel.setPreferredSize(new Dimension(0, North_Height));
        panel.add(title);
        panel.setBackground(Color.decode("#00695A"));
        return panel;
    }

    public JPanel westSide() {
        JPanel panel = new JPanel();
        Panel btnPanel = new Panel();
        btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.Y_AXIS));
        for (int i = 0; i < labelButtons.length; i++) {
            listButton[i] = customButton(labelButtons[i], getImage(iconItemMenu[i], 30));
            btnPanel.add(listButton[i]);
        }
        panel.setLayout(new BorderLayout(Hgap, Vgap));
        panel.add(btnPanel, BorderLayout.CENTER);
        panel.add(getImage("man.png", 180), BorderLayout.NORTH);
        panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(new EmptyBorder(10, 0, 0, 0));
        panel.setPreferredSize(new Dimension(West_Width, 500));
        return panel;
    }

    public JPanel eastSide() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(Hgap, Vgap));
        panel.setBackground(Color.BLUE);
        panel.setPreferredSize(new Dimension(East_Width, 0));
        return panel;
    }

    private JPanel customButton(String value, JLabel icon) {
        // resize icon label
        icon.setBorder(new EmptyBorder(0, 10, 0, 10));

        JPanel panel = new JPanel();
        JLabel labelText = new JLabel(value);
        labelText.setForeground(Color.white);
        labelText.setFont(new Font("Verdana", Font.PLAIN, 14));
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.decode("#004D40"));
        panel.add(labelText, BorderLayout.CENTER);
        panel.add(icon, BorderLayout.WEST);
        panel.setName(value);
        panel.addMouseListener(this);
        panel.setMaximumSize(new Dimension(West_Width, 50));
        return panel;
    }

    public JLabel getImage(String name, int size) {
        JLabel picLabel;
        ImageIcon imageIcon = new ImageIcon("src/main/java/UI/image/" + name);
        System.out.println(imageIcon);
        ImageIcon scaleIconUser = new ImageIcon(imageIcon.getImage().getScaledInstance(size, size, Image.SCALE_SMOOTH));
        picLabel = new JLabel(scaleIconUser, JLabel.CENTER);
        return picLabel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < labelButtons.length; i++) {
            listButton[i].setBackground(Color.decode("#004D40"));
        }
        currentClick = (JPanel) e.getSource();
        currentClick.setBackground(Color.decode("#009688"));
        switch (e.getComponent().getName()) {
//            case "Customers Management":
//                eastPanel.removeAll();
//                eastPanel.add(new CustomerManagementUI().getContentPane());
//                eastPanel.repaint();
//                eastPanel.revalidate();
//                break;

            case "Import Management":
                eastPanel.removeAll();
                eastPanel.add(importProductUI.getContentPane());
                eastPanel.repaint();
                eastPanel.revalidate();
                break;

//            case "Invoicing":
//                eastPanel.removeAll();
//                eastPanel.add(new InvoiceUI().getContentPane());
//                eastPanel.repaint();
//                eastPanel.revalidate();
//                break;
//            case "Statistical":
//                eastPanel.removeAll();
//                eastPanel.add(new StatisticalUI().getContentPane());
//                eastPanel.repaint();
//                eastPanel.revalidate();
//                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        for (int i = 0; i < labelButtons.length; i++) {
            if (e.getComponent().getName() == labelButtons[i]) {
                listButton[i].setBackground(Color.decode("#009688"));
                break;
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JPanel hover = (JPanel) e.getSource();
        if (hover != currentClick) {
            hover.setBackground(Color.decode("#004D40"));
        }
    }

    public static void main(String s[]) {

        Layout lo = new Layout();
        
    }

}
