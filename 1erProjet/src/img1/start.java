package img1;



import javax.swing.*;
import java.io.IOException;
import java.net.URL;

public class start

{
        public static void main(String... args) throws IOException
    {
            System.out.println(ProcessHandle.current().pid());

            JFrame jf = new JFrame("Gotcha!");
            jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            jf.add(new JLabel(new ImageIcon(new URL("https://www.jds.fr/medias/image/0-42179800-1496335948-64638-685-0.jpg"))));
            jf.pack();
            jf.setVisible(true);
    }

}
