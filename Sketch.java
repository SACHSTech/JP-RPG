import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

    // Character
    PImage imgCharacter_Up;
    PImage imgCharacter_Down;
    PImage imgCharacter_Left;
    PImage imgCharacter_Right;


    // Signs
    PImage imgSign;
    PImage imgSignText1;

    // Eric's House
    PImage imgH1_1;
    PImage imgH1_2;
    PImage imgH1_3;
    PImage imgH1_4;
    PImage imgH1_5;
    PImage imgH1_6;
    PImage imgH1_7;
    PImage imgH1_8;
    PImage imgH1_9;
    PImage imgH1_10;
    PImage imgH1_11;
    PImage imgH1_12;
    PImage imgH1_13;
    PImage imgH1_14;
    PImage imgH1_15;
    PImage imgH1_16;
    PImage imgH1_17;
    PImage imgH1_18;
    PImage imgH1_19;
    PImage imgH1_20;
    PImage imgH1_21;
    PImage imgH1_22;
    PImage imgH1_23;
    PImage imgH1_24;
    PImage imgH1_25;
    PImage imgH1_26;
    PImage imgH1_27;
    PImage imgH1_28;
    PImage imgH1_29;
    PImage imgH1_30;

    // Inside Eric's Hose
    PImage imgH1_in1;
    PImage imgH1_in2;
    PImage imgH1_in3;
    PImage imgH1_in4;
    PImage imgH1_in5;
    PImage imgH1_in6;
    PImage imgH1_in7;
    PImage imgH1_in8;
    PImage imgH1_in9;
    PImage imgH1_in10;
    PImage imgH1_in11;
    PImage imgH1_in12;
    PImage imgH1_in13;
    PImage imgH1_in14;
    PImage imgH1_in15;
    PImage imgH1_in16;
    PImage imgH1_in17;
    PImage imgH1_in18;
    PImage imgH1_in19;
    PImage imgH1_in20;
    PImage imgH1_in21;
    PImage imgH1_in22;
    PImage imgH1_in23;
    PImage imgH1_in24;
    PImage imgH1_in25;
    PImage imgH1_in26;
    PImage imgH1_in27;
    PImage imgH1_in28;
    PImage imgH1_in29;
    PImage imgH1_in30;

    // Furniture
    PImage imgBed_1;
    PImage imgBed_2;

    // Terrain
    PImage imgGrass;
    PImage imgFloor_1;

    // Player Position
    float fltPlayerX = 112;
    float fltPlayerY = 128;
    float fltSection = 1;

    // Eric's House Position
    float fltEHouseX = 64;
    float fltEHouseY = 48;

    // Player Direction
    String strDirection = "down";

    // Boolean Values
    boolean blnKeyW, blnKeyS, blnKeyA, blnKeyD;
    boolean blnReadSign = false;
    boolean blnEricHouse = false;
    boolean blnDayTime = true;

    public void settings() {
        size(240, 240);
    }

    public void setup() {
        // Loads Character
        imgCharacter_Up = loadImage("Images/Player/Character_Up.png");
        imgCharacter_Down = loadImage("Images/Player/Character_Down.png");
        imgCharacter_Left = loadImage("Images/Player/Character_Left.png");
        imgCharacter_Right = loadImage("Images/Player/Character_Right.png");
        
        // Load Signs
        imgSign = loadImage("Images/Environment/Sign.png");
        imgSignText1 = loadImage("Images/Environment/Sign_Text/Sign_Text1.png");
        
        // Load & Resize Eric's House
        imgH1_1 = loadImage("Images/Buildings/Eric_House/H1_1.png");
        imgH1_1.resize(16,16);
        imgH1_2 = loadImage("Images/Buildings/Eric_House/H1_2.png");
        imgH1_2.resize(16,16);
        imgH1_3 = loadImage("Images/Buildings/Eric_House/H1_3.png");
        imgH1_3.resize(16,16);
        imgH1_4 = loadImage("Images/Buildings/Eric_House/H1_4.png");
        imgH1_4.resize(16,16);
        imgH1_5 = loadImage("Images/Buildings/Eric_House/H1_5.png");
        imgH1_5.resize(16,16);
        imgH1_6 = loadImage("Images/Buildings/Eric_House/H1_6.png");
        imgH1_6.resize(16,16);
        imgH1_7 = loadImage("Images/Buildings/Eric_House/H1_7.png");
        imgH1_7.resize(16,16);
        imgH1_8 = loadImage("Images/Buildings/Eric_House/H1_8.png");
        imgH1_8.resize(16,16);
        imgH1_9 = loadImage("Images/Buildings/Eric_House/H1_9.png");
        imgH1_9.resize(16,16);
        imgH1_10 = loadImage("Images/Buildings/Eric_House/H1_10.png");
        imgH1_10.resize(16,16);
        imgH1_11 = loadImage("Images/Buildings/Eric_House/H1_11.png");
        imgH1_11.resize(16,16);
        imgH1_12 = loadImage("Images/Buildings/Eric_House/H1_12.png");
        imgH1_12.resize(16,16);
        imgH1_13 = loadImage("Images/Buildings/Eric_House/H1_13.png");
        imgH1_13.resize(16,16);
        imgH1_14 = loadImage("Images/Buildings/Eric_House/H1_14.png");
        imgH1_14.resize(16,16);
        imgH1_15 = loadImage("Images/Buildings/Eric_House/H1_15.png");
        imgH1_15.resize(16,16);
        imgH1_16 = loadImage("Images/Buildings/Eric_House/H1_16.png");
        imgH1_16.resize(16,16);
        imgH1_17 = loadImage("Images/Buildings/Eric_House/H1_17.png");
        imgH1_17.resize(16,16);
        imgH1_18 = loadImage("Images/Buildings/Eric_House/H1_18.png");
        imgH1_18.resize(16,16);
        imgH1_19 = loadImage("Images/Buildings/Eric_House/H1_19.png");
        imgH1_19.resize(16,16);
        imgH1_20 = loadImage("Images/Buildings/Eric_House/H1_20.png");
        imgH1_20.resize(16,16);
        imgH1_21 = loadImage("Images/Buildings/Eric_House/H1_21.png");
        imgH1_21.resize(16,16);
        imgH1_22 = loadImage("Images/Buildings/Eric_House/H1_22.png");
        imgH1_22.resize(16,16);
        imgH1_23 = loadImage("Images/Buildings/Eric_House/H1_23.png");
        imgH1_23.resize(16,16);
        imgH1_24 = loadImage("Images/Buildings/Eric_House/H1_24.png");
        imgH1_24.resize(16,16);
        imgH1_25 = loadImage("Images/Buildings/Eric_House/H1_25.png");
        imgH1_25.resize(16,16);
        imgH1_26 = loadImage("Images/Buildings/Eric_House/H1_26.png");
        imgH1_26.resize(16,16);
        imgH1_27 = loadImage("Images/Buildings/Eric_House/H1_27.png");
        imgH1_27.resize(16,16);
        imgH1_28 = loadImage("Images/Buildings/Eric_House/H1_28.png");
        imgH1_28.resize(16,16);
        imgH1_29 = loadImage("Images/Buildings/Eric_House/H1_29.png");
        imgH1_29.resize(16,16);
        imgH1_30 = loadImage("Images/Buildings/Eric_House/H1_30.png");
        imgH1_30.resize(16,16);

        //Inside Eric's House
        imgH1_in1 = loadImage("Images/Buildings/Eric_House/H1_in1.png");
        imgH1_in1.resize(16,16);
        imgH1_in2 = loadImage("Images/Buildings/Eric_House/H1_in2.png");
        imgH1_in2.resize(16,16);
        imgH1_in3 = loadImage("Images/Buildings/Eric_House/H1_in3.png");
        imgH1_in3.resize(16,16);
        imgH1_in4 = loadImage("Images/Buildings/Eric_House/H1_in4.png");
        imgH1_in4.resize(16,16);
        imgH1_in5 = loadImage("Images/Buildings/Eric_House/H1_in5.png");
        imgH1_in5.resize(16,16);
        imgH1_in6 = loadImage("Images/Buildings/Eric_House/H1_in6.png");
        imgH1_in6.resize(16,16);
        imgH1_in7 = loadImage("Images/Buildings/Eric_House/H1_in7.png");
        imgH1_in7.resize(16,16);
        imgH1_in8 = loadImage("Images/Buildings/Eric_House/H1_in8.png");
        imgH1_in8.resize(16,16);
        imgH1_in9 = loadImage("Images/Buildings/Eric_House/H1_in9.png");
        imgH1_in9.resize(16,16);
        imgH1_in10 = loadImage("Images/Buildings/Eric_House/H1_in10.png");
        imgH1_in10.resize(16,16);
        imgH1_in11 = loadImage("Images/Buildings/Eric_House/H1_in11.png");
        imgH1_in11.resize(16,16);
        imgH1_in12 = loadImage("Images/Buildings/Eric_House/H1_in12.png");
        imgH1_in12.resize(16,16);
        imgH1_in13 = loadImage("Images/Buildings/Eric_House/H1_in13.png");
        imgH1_in13.resize(16,16);
        imgH1_in14 = loadImage("Images/Buildings/Eric_House/H1_in14.png");
        imgH1_in14.resize(16,16);
        imgH1_in15 = loadImage("Images/Buildings/Eric_House/H1_in15.png");
        imgH1_in15.resize(16,16);
        imgH1_in16 = loadImage("Images/Buildings/Eric_House/H1_in16.png");
        imgH1_in16.resize(16,16);
        imgH1_in17 = loadImage("Images/Buildings/Eric_House/H1_in17.png");
        imgH1_in17.resize(16,16);
        imgH1_in18 = loadImage("Images/Buildings/Eric_House/H1_in18.png");
        imgH1_in18.resize(16,16);
        imgH1_in19 = loadImage("Images/Buildings/Eric_House/H1_in19.png");
        imgH1_in19.resize(16,16);
        imgH1_in20 = loadImage("Images/Buildings/Eric_House/H1_in20.png");
        imgH1_in20.resize(16,16);
        imgH1_in21 = loadImage("Images/Buildings/Eric_House/H1_in21.png");
        imgH1_in21.resize(16,16);
        imgH1_in22 = loadImage("Images/Buildings/Eric_House/H1_in22.png");
        imgH1_in22.resize(16,16);
        imgH1_in23 = loadImage("Images/Buildings/Eric_House/H1_in23.png");
        imgH1_in23.resize(16,16);
        imgH1_in24 = loadImage("Images/Buildings/Eric_House/H1_in24.png");
        imgH1_in24.resize(16,16);
        imgH1_in25 = loadImage("Images/Buildings/Eric_House/H1_in25.png");
        imgH1_in25.resize(16,16);
        imgH1_in26 = loadImage("Images/Buildings/Eric_House/H1_in26.png");
        imgH1_in26.resize(16,16);
        imgH1_in27 = loadImage("Images/Buildings/Eric_House/H1_in27.png");
        imgH1_in27.resize(16,16);
        imgH1_in28 = loadImage("Images/Buildings/Eric_House/H1_in28.png");
        imgH1_in28.resize(16,16);
        imgH1_in29 = loadImage("Images/Buildings/Eric_House/H1_in29.png");
        imgH1_in29.resize(16,16);
        imgH1_in30 = loadImage("Images/Buildings/Eric_House/H1_in30.png");
        imgH1_in30.resize(16,16);

        // Load Furntiure
        imgBed_1 = loadImage("Images/Environment/Furniture/Bed_1.png");
        imgBed_1.resize(16,16);
        imgBed_2 = loadImage("Images/Environment/Furniture/Bed_2.png");
        imgBed_2.resize(16,16);

        // Load Terrain
        imgGrass = loadImage("Images/Environment/Terrain/Grass.png");
        imgGrass.resize(16,16);
        imgFloor_1 = loadImage("Images/Environment/Terrain/Floor_1.png");
        imgFloor_1.resize(16,16);
    }

    public void draw() {

        background();

        movePlayer();

        checkCollision();

        // Images Will Be Behind Of Player
        layerOne();     

        displayPlayer();

        // Images Will Be Infront Of Player
        layerTwo();

        displaySigns();

        interactions();
    }

    private void background() {
        if (fltSection == 0) {

            background(0);

        } else  {

            for (int y = 0; y < 240 ; y += 16) {
            
                for (int x = 0; x < 240; x += 16) {

                    image(imgGrass, x, y);

                }

            }

        }
    }

    private void movePlayer() {
        
        if (blnKeyW) {

            fltPlayerY -= 16;
            blnKeyW = false;
            strDirection = "up";

        } else if (blnKeyS) {

            fltPlayerY += 16;
            blnKeyS = false;
            strDirection = "down";

        } else if (blnKeyA) {

            fltPlayerX -= 16;
            blnKeyA = false;
            strDirection = "left";

        } else if (blnKeyD) {

            fltPlayerX += 16;
            blnKeyD = false;
            strDirection = "right";
        }

    }

    private void checkCollision() {

        fltPlayerX = constrain(fltPlayerX, 0, width - 16);
        fltPlayerY = constrain(fltPlayerY, 0, height - 16);

        // Eric House Collision
        if (fltPlayerX == 64 && fltPlayerY == 80 && fltSection == 1 && (key == 'D' || key == 'd')) {
            fltPlayerX -= 16;
        }

        if (fltPlayerX == 64 && fltPlayerY == 96 && fltSection == 1 && (key == 'D' || key == 'd')) {
            fltPlayerX -= 16;
        }


        if (fltPlayerX == 144 && fltPlayerY == 80 && fltSection == 1 && (key == 'A' || key == 'a')) {
            fltPlayerX += 16;
        }

        if (fltPlayerX == 144 && fltPlayerY == 96 && fltSection == 1 && (key == 'A' || key == 'a')) {
            fltPlayerX += 16;
        }

        if (fltPlayerX == 64 && fltPlayerY == 96 && fltSection == 1 && (key == 'W' || key == 'w')) {
            fltPlayerY += 16;
        }
        
        if (fltPlayerX == 80 && fltPlayerY == 96 && fltSection == 1 && (key == 'W' || key == 'w')) {
            fltPlayerY += 16;
        }
    
        if (fltPlayerX == 96 && fltPlayerY == 96 && fltSection == 1 && (key == 'W' || key == 'w')) {
            fltPlayerY += 16;
        }

        if (fltPlayerX == 112 && fltPlayerY == 96 && fltSection == 1 && (key == 'W' || key == 'w')) {
            fltPlayerY += 16;
        }

        if (fltPlayerX == 128 && fltPlayerY == 96 && fltSection == 1 && (key == 'W' || key == 'w')) {
            fltPlayerY += 16;
        }

        if (fltPlayerX == 144 && fltPlayerY == 96 && fltSection == 1 && (key == 'W' || key == 'w')) {
            fltPlayerY += 16;
        }

        if (fltPlayerX == 64 && fltPlayerY == 64 && fltSection == 1 && (key == 'S' || key == 's')) {
            fltPlayerY -= 16;
        }
        
        if (fltPlayerX == 80 && fltPlayerY == 64 && fltSection == 1 && (key == 'S' || key == 's')) {
            fltPlayerY -= 16;
        }
    
        if (fltPlayerX == 96 && fltPlayerY == 64 && fltSection == 1 && (key == 'S' || key == 's')) {
            fltPlayerY -= 16;
        }

        if (fltPlayerX == 112 && fltPlayerY == 64 && fltSection == 1 && (key == 'S' || key == 's')) {
            fltPlayerY -= 16;
        }

        if (fltPlayerX == 128 && fltPlayerY == 64 && fltSection == 1 && (key == 'S' || key == 's')) {
            fltPlayerY -= 16;
        }

        if (fltPlayerX == 144 && fltPlayerY == 80 && fltSection == 1 && (key == 'S' || key == 's')) {
            fltPlayerY -= 16;
        }
    }

    public void layerOne() {

        // Sign
        if (fltSection == 1) {

            image(imgSign, 64, 128);

        }

        //Erics House
        if (fltSection == 1) {

            image(imgH1_13, fltEHouseX, fltEHouseY + 32);
            image(imgH1_14, fltEHouseX + 16, fltEHouseY + 32);
            image(imgH1_15, fltEHouseX + 32, fltEHouseY + 32);
            image(imgH1_16, fltEHouseX + 48, fltEHouseY + 32);
            image(imgH1_17, fltEHouseX + 64, fltEHouseY + 32);
            image(imgH1_19, fltEHouseX, fltEHouseY + 48);
            image(imgH1_20, fltEHouseX + 16, fltEHouseY + 48);
            image(imgH1_21, fltEHouseX + 32, fltEHouseY + 48);
            image(imgH1_22, fltEHouseX + 48, fltEHouseY + 48);
            image(imgH1_23, fltEHouseX + 64, fltEHouseY + 48);
            image(imgH1_24, fltEHouseX + 80, fltEHouseY + 48);
            image(imgH1_25, fltEHouseX, fltEHouseY + 64);
            image(imgH1_26, fltEHouseX + 16, fltEHouseY + 64);
            image(imgH1_27, fltEHouseX + 32, fltEHouseY + 64);
            image(imgH1_28, fltEHouseX + 48, fltEHouseY + 64);
            image(imgH1_29, fltEHouseX + 64, fltEHouseY + 64);
            image(imgH1_30, fltEHouseX + 80, fltEHouseY + 64);
        
        }

        // Inside Eric's House
        if (blnEricHouse = true && fltSection == 0) {

            for (int y = 64; y < 128 ; y += 16) {
            
                for (int x = 64; x < 160; x += 16) {

                    image(imgFloor_1, x, y);

                }

            }

            // Eric's Bed
            image(imgBed_1, 128, 80);
            image(imgBed_2, 128, 96);

        } else {

        }
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

            blnKeyW = true;

        } else if (key == 'S' || key == 's') {

            blnKeyS = true;

        } else if (key == 'A' || key == 'a') {

            blnKeyA = true;

        } else if (key == 'D' || key == 'd') {

            blnKeyD = true;
        }

    }

    public void layerTwo() {

        // Eric House
        if (fltSection == 1) {

            image(imgH1_1, fltEHouseX, fltEHouseY);
            image(imgH1_2, fltEHouseX + 16, fltEHouseY);
            image(imgH1_3, fltEHouseX + 32, fltEHouseY);
            image(imgH1_4, fltEHouseX + 48, fltEHouseY);
            image(imgH1_5, fltEHouseX + 64, fltEHouseY);
            image(imgH1_6, fltEHouseX + 80, fltEHouseY);
            image(imgH1_7, fltEHouseX, fltEHouseY + 16);
            image(imgH1_8, fltEHouseX + 16, fltEHouseY + 16);
            image(imgH1_9, fltEHouseX + 32, fltEHouseY + 16);
            image(imgH1_10, fltEHouseX + 48, fltEHouseY + 16);
            image(imgH1_11, fltEHouseX + 64, fltEHouseY + 16);
            image(imgH1_12, fltEHouseX + 80, fltEHouseY + 16);
            image(imgH1_18, fltEHouseX + 80, fltEHouseY + 32);
        
        }

        if (blnEricHouse = true && fltSection == 0) {

            // Eric's House Interior Walls
            image(imgH1_in1, 48, 48);
            image(imgH1_in2, 64, 48);
            image(imgH1_in3, 80, 48);
            image(imgH1_in3, 96, 48);
            image(imgH1_in3, 112, 48);
            image(imgH1_in3, 128, 48);
            image(imgH1_in4, 144, 48);
            image(imgH1_in5, 160, 48);
            image(imgH1_in6, 48, 64);
            image(imgH1_in7, 64, 64);
            image(imgH1_in8, 80, 64);
            image(imgH1_in8, 96, 64);
            image(imgH1_in8, 112, 64);
            image(imgH1_in8, 128, 64);
            image(imgH1_in9, 144, 64);
            image(imgH1_in10, 160, 64);
            image(imgH1_in11, 48, 80);
            image(imgH1_in12, 64, 80);
            image(imgH1_in13, 80, 80);
            image(imgH1_in13, 96, 80);
            image(imgH1_in13, 112, 80);
            image(imgH1_in13, 128, 80);
            image(imgH1_in14, 144, 80);
            image(imgH1_in15, 160, 80);
            image(imgH1_in11, 48, 96);
            image(imgH1_in12, 64, 96);
            image(imgH1_in13, 80, 96);
            image(imgH1_in13, 96, 96);
            image(imgH1_in13, 112, 96);
            image(imgH1_in13, 128, 96);
            image(imgH1_in14, 144, 96);
            image(imgH1_in15, 160, 96);
            image(imgH1_in16, 48, 112);
            image(imgH1_in17, 64, 112);
            image(imgH1_in26, 80, 112);
            image(imgH1_in27, 96, 112);
            image(imgH1_in28, 112, 112);
            image(imgH1_in18, 128, 112);
            image(imgH1_in19, 144, 112);
            image(imgH1_in20, 160, 112);
            image(imgH1_in21, 48, 128);
            image(imgH1_in22, 64, 128);
            image(imgH1_in29, 80, 128);
            image(imgH1_in30, 96, 128);
            image(imgH1_in29, 112, 128);
            image(imgH1_in23, 128, 128);
            image(imgH1_in24, 144, 128);
            image(imgH1_in25, 160, 128);

        } else {

        }

    }

    public void displaySigns() {
        
        if ((key == 'E' || key == 'e') && (fltPlayerX == 64 && fltPlayerY == 128) && fltSection == 1) {
            
            image(imgSignText1, 16, 16);

        } else {

        }
        System.out.println("(" + fltPlayerX + "'" + fltPlayerY + ")");
    }

    public void interactions() {

        if ((key == 'E' || key == 'e') && ((fltPlayerX == 80 || fltPlayerX == 96) && fltPlayerY == 112) && fltSection == 1) {

            fltSection = 0;
            blnEricHouse = true;
            fltPlayerX = 96;

        }

        if ((key == 'S' || key == 's') && (fltPlayerX == 96) && (fltPlayerY == 128) && fltSection == 0 && blnEricHouse == true) {

            fltSection = 1;
            blnEricHouse = false;

        }

    }

}
