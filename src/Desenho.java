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
        int[] vx = {0,largura/2,largura};
        int[] vy = {altura,0,altura};
        g.setColor(Color.BLACK);
        g.fillPolygon(vx,vy,3);
        
        //criaTriangRec(g, largura/4, altura/2, 3*largura/4, altura/2, largura/2, altura);
        criaTriangRec(g, largura/2,0, 0, altura, largura, altura, 3);

    }
    
    private void criaTriangRec(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int contador) {
        if(contador==1){
            return;
        }
        int xMed1=(x1+x2)/2;
        int xMed2=(x1+x3)/2;
        int xMed3=(x3+x2)/2;
        
        int yMed1= (y1+y2)/2;
        int yMed2= (y1+y3)/2;
        int yMed3=(y2+y3)/2;
        

        // int yMed1=y2;
        // int yMed2=(y1+y2)/2;
        // int yMed3=(y1+y2)/2;

        // int xMed1=(x3+x2)/2;
        // int xMed2=(x1+x3)/2;
        // int xMed3=(x1+x2)/2;


        g.setColor(Color.WHITE);
        // if(contador % 2 == 1 ) { g.setColor(Color.RED); }else{g.setColor(Color.BLACK);};
        try {
            Thread.sleep(70);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // int[] vx = {x1,x2,x3};
        // int[] vy = {y1,y2,y3};

        int[] vx = {xMed1, xMed2, xMed3};
        int[] vy = {yMed1, yMed2, yMed3};
        g.fillPolygon(vx,vy,3);

        
        criaTriangRec(g, xMed2,yMed2, xMed3, yMed3, x3,y3, contador-1);
        criaTriangRec(g, x1,y1,xMed1, yMed1, xMed2, yMed2, contador-1);
        criaTriangRec(g, xMed1,yMed1,x2, y2, xMed3, yMed3, contador-1);
    
        

        // System.out.println(g.getColor());
        // if(g.getColor()== Color.RED){
        //     g.setColor(Color.WHITE); 
        // }else{
        //     g.setColor(Color.BLACK);
        // }

        //recursivo que chamava pra cima
        // criaTriangRec(g, (x1+x3)/2, (y3+y1)/2, (x2+x3)/2, (y3+y1)/2,(x1+x2)/2, y1);
        // criaTriangRec(g, (x1+x3)/2, y1/2, (x2+x3)/2, y1/2,(x1+x2)/2, y1);
        
     
    }

}
