import gpdraw.*;
import java.awt.Color;
import java.util.Scanner;



public class Sphere {
    DrawingTool pen;
    SketchPad paper;
    
    
    int xPos;
    int yPos;
    
    Color currentColor;
    
    int red;
    int green; 
    int blue;

    int diameter;

    public Sphere(int r, int g, int b, int radius, int x, int y){
        paper = new SketchPad(700, 700, 25);
        pen = new DrawingTool(paper);
        pen.fillRect(700, 700);
        
        setRed(r);
        setGreen(g);
        setBlue(b);
        
        setDiameter(radius*2);
        
        setPosition(x, y);
        
        pen.up();
        pen.move(this.xPos, this.yPos);
        pen.down();

        
    }
    
    public void drawIt() {
        pen.setColor(new Color(this.red, this.green, this.blue));
        for(int i = 0 ; i < 150; i++){
            pen.fillCircle(diameter);
            prepPen();
            pen.fillCircle(diameter);
        }
        
        
    }
    
    public void prepPen(){
        pen.up();
        //move up diagonal right
        pen.move(pen.getXPos() + 1 , pen.getYPos());
        
        //if color is not white, make it one value higher
        if(this.red < 255){
            this.red++;
        }
        
        if(this.green < 255){
            this.green++;
        }
        
        if(this.blue < 255){
            this.blue++;
        }

        diameter--;
        pen.setColor(new Color(this.red, this.green, this.blue));
        pen.down();
        
        
    }
    
    public void setDiameter(int d){
        this.diameter = d;
    }
    
    public void setRed(int r){
        this.red = r;
    }
    
    public void setGreen(int g){
        this.green = g;
    }
    
    public void setBlue(int b){
        this.blue = b;
    }
    
    public void setPosition(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }
    
    
    //34, 139, 34, 75, -350, 350

        
    
    public static void main (String [] args){
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("PLEASE ENTER RED VALUE. (0-255) ");
        int rojo = s.nextInt();
        System.out.println("");
        
        System.out.print("PLEASE ENTER GREEN VALUE. (0-255) ");
        int verde = s.nextInt();
        System.out.println("");
        
        System.out.print("PLEASE ENTER BLUE VALUE. (0-255)  ");
        int azul = s.nextInt();
        System.out.println("")
        ;
        System.out.print("PLEASE ENTER RADIUS (IDEAL: 50) ");
        int radio = s.nextInt();
        System.out.println("");
        
        System.out.print("PLEASE ENTER X POSITION ");
        int gorda = s.nextInt();
        System.out.println("");
        
        System.out.print("PLEASE ENTER Y POSITION ");
        int alta = s.nextInt();
        System.out.println("");
        
        Sphere x = new Sphere(rojo, verde, azul, radio, gorda, alta);
        x.drawIt();
        
   
    }
}

