import javax.swing.*;
import java.awt.*;

public class MyImagePanel extends JPanel {
    private Image image=null;
    private int iWidth2;
    private int iHeiglt2;
    public MyImagePanel(Image image) {
        this.image = image;
        this.iWidth2 = image.getWidth(this) / 2;
        this.iHeiglt2 = image.getHeight(this) / 2;
    }
    public void paintComponent(Graphics g ){
        super.paintComponent(g);
        if(image !=null){
            int x=this.getParent().getWidth()/2-iWidth2;
            int y=this.getParent().getHeight()/2-iHeiglt2;
            g.drawImage(image,x,y,this);

        }
        
    }

}
