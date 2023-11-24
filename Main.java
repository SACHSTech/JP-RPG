import processing.core.PApplet;

/**
 * Main class to execute sketch
 * @author 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
    PlayMusic myMusic = new PlayMusic();
	  PApplet.runSketch(processingArgs, mySketch);
   
  }
  
}