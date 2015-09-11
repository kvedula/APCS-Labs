import gpdraw.*;
/**
 * Kamesh Vedula
 * Time: 40 min
 * Description:This lab took some time as it had us make more than one thing. I did not have much time so
 * I ended up hardcoding the Muller illusion and then for the Ponzo I searched up different versions of it 
 * and looking into the math behind the illusion which I used to draw mine. It took some time to put
 * together the equation that I came up with. 
 */
public class P3_Vedula_Kamesh_Illusions
{
    public static void main(String[] args){
        P3_Vedula_Kamesh_Muller muller = new P3_Vedula_Kamesh_Muller();
        muller.drawMuller();
        
        P3_Vedula_Kamesh_Ponzo ponzo = new P3_Vedula_Kamesh_Ponzo();
        ponzo.drawLines(50, 100, 20);
       
    }
}

//Draw the Muller Illusion
class P3_Vedula_Kamesh_Muller{
    public void drawMuller(){
        SketchPad pad = new SketchPad(500, 500);
        DrawingTool pen = new DrawingTool(pad);
        
        pen.up();
        pen.move(-100, 50);
        pen.setDirection(0);
        pen.down();
        pen.move(200);
        pen.up();
        pen.move(-100, -50);
        pen.setDirection(0);
        pen.down();
        pen.move(200);
        pen.up();
        
        pen.move(-100, 50);
        pen.down();
        pen.setDirection(135);
        pen.move(30);
        pen.setDirection(pen.getDirection() + 180);
        pen.move(30);
        pen.setDirection(225);
        pen.move(30);
        pen.up();
        
        pen.move(-100, -50);
        pen.down();
        pen.setDirection(45);
        pen.move(30);
        pen.setDirection(pen.getDirection() + 180);
        pen.move(30);
        pen.setDirection(315);
        pen.move(30);
        pen.up();
        
        pen.move(100, 50);
        pen.down();
        pen.setDirection(45);
        pen.move(30);
        pen.setDirection(pen.getDirection() + 180);
        pen.move(30);
        pen.setDirection(315);
        pen.move(30);
        pen.up();
        
        pen.move(100, -50);
        pen.down();
        pen.setDirection(135);
        pen.move(30);
        pen.setDirection(pen.getDirection() + 180);
        pen.move(30);
        pen.setDirection(225);
        pen.move(30);
        pen.up();
    }
}

//Draw the Ponzo illusion
class P3_Vedula_Kamesh_Ponzo{
    SketchPad paper = new SketchPad(500, 500);
    DrawingTool pen = new DrawingTool(paper);
    
    public void drawLines(int x, int l, int numLines){
        //Draw the vertical lines
        pen.up();
        pen.move(-x / 2, l / 2);
        pen.setDirection(270);
        pen.down();
        pen.move(l);
        pen.up();
        pen.move(x / 2, l / 2);
        pen.setDirection(270);
        pen.down();
        pen.move(l);
        
        //Draw the diagonal lines
        for (int i = 0; i <= numLines; i++){
            pen.up();
            pen.move(-250, numLines * 5 / 2 - i * 5);
            pen.down();
            pen.move(250, (numLines * 5 / 2 - i * 5) * 2);
        }
    }
    
}

