package test3;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame {
    Button b1;
    public MyFrame() {
       setTitle("My Button Application");
       setSize(300, 200);
       setLayout(new FlowLayout());
       b1 = new Button("start");
       add(b1);
       addWindowListener(new MyWindowAdapter());
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}

public class MyWinApp1n {
    public static void main(String[] args) {
       MyFrame f = new MyFrame();
       f.setVisible(true);
    }
}