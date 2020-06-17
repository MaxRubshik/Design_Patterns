package src.Proxy2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD cover viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        cds.put("Ambient for airports", "https://images-na.ssl-images-amazon.com/images/I/71cT9pXHBWL._SX522_.jpg");
        cds.put("Another Green World", "https://images-na.ssl-images-amazon.com/images/I/61KTcMeG50L._SX522_.jpg");
        cds.put("Rough and Rowdy Ways", "https://images-na.ssl-images-amazon.com/images/I/81G8m4fTYyL._SX522_.jpg");

        URL initialURL = new URL((String) cds.get("Ambient for airports"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favourite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy
                            (getCDUr1(event.getActionCommand())));
                    frame.repaint();
                }
            });
        }


        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
    }
}
