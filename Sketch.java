import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
    PImage imgCharacter_Up;
    PImage imgCharacter_Down;
    PImage imgCharacter_Left;
    PImage imgCharacter_Right;

    float fltPlayerX = 112;
    float fltPlayerY = 112;

    String strDirection = "down";

    boolean keyW, keyS, keyA, keyD;

    public void settings() {
        size(240, 240);
    }

    public void setup() {
        imgCharacter_Up = loadImage("Images/Player/Character_Up.png");
        imgCharacter_Down = loadImage("Images/Player/Character_Down.png");
        imgCharacter_Left = loadImage("Images/Player/Character_Left.png");
        imgCharacter_Right = loadImage("Images/Player/Character_Right.png");
    }

    public void draw() {

        background(200, 212, 93);

        movePlayer();
        checkWallCollision();
        displayPlayer();

    }

    private void movePlayer() {

        if (keyW) {

            fltPlayerY -= 16;
            keyW = false;
            strDirection = "up";

        } else if (keyS) {

            fltPlayerY += 16;
            keyS = false;
            strDirection = "down";

        } else if (keyA) {

            fltPlayerX -= 16;
            keyA = false;
            strDirection = "left";

        } else if (keyD) {

            fltPlayerX += 16;
            keyD = false;
            strDirection = "right";
        }
    }

    private void checkWallCollision() {

        fltPlayerX = constrain(fltPlayerX, 0, width - 16);
        fltPlayerY = constrain(fltPlayerY, 0, height - 16);

    }

    private void displayPlayer() {

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

            keyW = true;

        } else if (key == 'S' || key == 's') {

            keyS = true;

        } else if (key == 'A' || key == 'a') {

            keyA = true;

        } else if (key == 'D' || key == 'd') {

            keyD = true;
        }
    }
}
