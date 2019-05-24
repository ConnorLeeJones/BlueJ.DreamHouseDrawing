
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Square window2;
    private Triangle roof;
    private Square chimney;
    private Circle sun;
    private Circle moon;
    private Square sky;
    private Triangle mountain;
    private Triangle mountain2;
    private Triangle mountain3;
    private Square treeTrunk;
    private Triangle treeLeaves;
    private Triangle treeLeaves2;
    private boolean night = false;
    
   
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        this.draw();
        // nothing to do... instance variables are automatically set to null
    
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        if (night == false){
        sky.changeColor("blue");
    } else {
        sky.changeColor("black");
    }
        sky.changeSize(1000);
        sky.moveVertical(-100);
        sky.moveHorizontal(-100);
        sky.makeVisible();
        
        
        sun = new Circle();
          if (night == false){
        sun.changeColor("yellow");
    } else {
        sun.changeColor("black");
    }
        sun.moveHorizontal(180);
        sun.moveVertical(-50);
        sun.changeSize(60);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(-100);
        moon.moveVertical(-50);
        moon.changeSize(60);
        moon.makeVisible();
      
        mountain = new Triangle();
        mountain.changeSize(350, 600);
        mountain.makeVisible();
        mountain.moveVertical(70);
        mountain.makeVisible();
        
        mountain2 = new Triangle();
        mountain2.changeSize(200, 500);
        mountain2.moveVertical(150);
        mountain2.moveHorizontal(150);
        mountain2.makeVisible();
        
        mountain3 = new Triangle();
        mountain3.changeSize(200, 300);
        mountain3.moveVertical(200);
        mountain3.moveHorizontal(250);
        mountain3.makeVisible();
       
        treeTrunk = new Square();
        treeTrunk.changeColor("black");
        treeTrunk.moveVertical(145);
        treeTrunk.moveHorizontal(89);
        treeTrunk.changeSize(10);
        treeTrunk.makeVisible();
        
        
        treeLeaves = new Triangle();
        treeLeaves.changeColor("green");
        treeLeaves.changeSize(30, 30);
        treeLeaves.moveHorizontal(103);
        treeLeaves.moveVertical(150);
        treeLeaves.makeVisible();
        
        treeLeaves2 = new Triangle();
        treeLeaves2.changeColor("green");
        treeLeaves2.changeSize(30, 30);
        treeLeaves2.moveHorizontal(103);
        treeLeaves2.moveVertical(135);
        treeLeaves2.makeVisible();
        
        
        
        chimney = new Square();
        chimney.changeColor("black");
        chimney.moveVertical(110);
        chimney.changeSize(10);
        chimney.makeVisible();
        
        
        wall = new Square();
        wall.changeColor("magenta");
        wall.moveVertical(120);
        wall.changeSize(50);
        wall.makeVisible();

        
        window = new Square();
        window.changeColor("black");
        window.changeSize(10);
        window.moveHorizontal(8);
        window.moveVertical(140);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("black");
        window2.changeSize(10);
        window2.moveHorizontal(30);
        window2.moveVertical(140);
        window2.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(30, 70);
        roof.moveHorizontal(35);
        roof.moveVertical(133);
        roof.makeVisible();
        

    }

    //sunset
    public void sunset()
    {
        if(wall != null)
        {
            sun.slowMoveHorizontal(150);
            night = true;
            this.draw();
            setBlackAndWhite();
            moon.slowMoveHorizontal(300);
        }
        
    }
    
    
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            window2.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
