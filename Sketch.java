import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
    PImage imgCharacter_Up;
    PImage imgCharacter_Down;
    PImage imgCharacter_Left;
    PImage imgCharacter_Right;
    PImage imgSign;

    float fltPlayerX = 112;
    float fltPlayerY = 112;
    float fltSection = 1;

    String strDirection = "down";

    boolean fltKeyW, fltKeyS, fltKeyA, fltKeyD;
    boolean blnReadSign = false;

    public void settings() {
        size(240, 240);
    }

    public void setup() {
        imgCharacter_Up = loadImage("Images/Player/Character_Up.png");
        imgCharacter_Down = loadImage("Images/Player/Character_Down.png");
        imgCharacter_Left = loadImage("Images/Player/Character_Left.png");
        imgCharacter_Right = loadImage("Images/Player/Character_Right.png");
        imgSign = loadImage("Images/Environment/Sign.png");
    }

    public void draw() {

        background(200, 255, 100);

        movePlayer();
        checkWallCollision();
        signs();
        displayPlayer();

    }

    private void movePlayer() {

        if (fltKeyW) {

            fltPlayerY -= 16;
            fltKeyW = false;
            strDirection = "up";

        } else if (fltKeyS) {

            fltPlayerY += 16;
            fltKeyS = false;
            strDirection = "down";

        } else if (fltKeyA) {

            fltPlayerX -= 16;
            fltKeyA = false;
            strDirection = "left";

        } else if (fltKeyD) {

            fltPlayerX += 16;
            fltKeyD = false;
            strDirection = "right";
        }

    }

    private void checkWallCollision() {

        fltPlayerX = constrain(fltPlayerX, 0, width - 16);
        fltPlayerY = constrain(fltPlayerY, 0, height - 16);

    }

    private void displayPlayer() {

        fill(0, 75); 
        noStroke();

        if (strDirection.equals("up") || strDirection.equals("down")) {

            ellipse(fltPlayerX + 8, fltPlayerY + 16, 16, 8); 

        } else if (strDirection.equals("left") || strDirection.equals("right")) {
            
            ellipse(fltPlayerX + 8, fltPlayerY + 16, 12, 4); 
        
        }

        if (strDirection.equals("up")) {

            image(imgCharacter_Up, fltPlayerX, fltPlayerY);

        } else if (strDirection.equals("down")) {

            image(imgCharacter_Down, fltPlayerX, fltPlayerY);

        } else if (strDirection.equals("left")) {

            image(imgCharacter_Left, fltPlayerX, fltPlayerY);

        } else if (strDirection.equals("right")) {

            image(imgCharacter_Right, fltPlayerX, fltPlayerY);

        }

    }

    public void keyPressed() {

        if (key == 'W' || key == 'w') {

            fltKeyW = true;

        } else if (key == 'S' || key == 's') {

            fltKeyS = true;

        } else if (key == 'A' || key == 'a') {

            fltKeyA = true;

        } else if (key == 'D' || key == 'd') {

            fltKeyD = true;
        }

    }

    public void signs() {
        
        if ((key == 'E' || key == 'e') && (fltPlayerX == 96 && fltPlayerY == 112)) {
            
            imgSign.resize(208,208);
            image(imgSign, 16, 16);

        } else {
            
            imgSign.resize(16,16);
            image(imgSign, 96, 112);

        }

    }
}
