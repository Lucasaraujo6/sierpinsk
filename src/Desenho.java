import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
public class Desenho extends Canvas{

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        criaTriangulo(g);
        // int largura = getWidth();
        // int altura = getHeight();
        // int[] vx = {0,largura/2,largura};
        // int[] vy = {altura,0,altura};
        // g.fillPolygon(vx,vy,3);
        

    }

    private void criaTriangulo(Graphics g) {
        int largura = getWidth()-5;
        int altura = getHeight()-5;
        criaTriangRec(g, 0, altura, largura/2, 0, largura, altura);
        // g.setColor(new Color(254, 254, 254));
    }
    
    private void criaTriangRec(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int[] vx = {x1,x2,x3};
        int[] vy = {y1,y2,y3};
        g.fillPolygon(vx,vy,3);
        System.out.println(g.getColor());
        if(g.getColor()== Color.BLACK){
            g.setColor(Color.RED);
        }else{
            g.setColor(Color.BLACK);
        }
        criaTriangRec(g, x1+x3*3/8, y1/4,x1+ x3*5/8, y1/4,x1+ x3/2, y1/2);
        // criaTriangRec(g, (x1+x2)/2, (y1+y2)/2, (x2+x3)/2, (y2+y3)/2, (x3+x1)/2, (y3+y1)/2);
        // criaTriangRec(g, (x1+x2)/2, (y1+y2)/2, (x2+x3)/2, (y2+y3)/2, (x3+x1)/2, (y3+y1)/2);
    }

}
