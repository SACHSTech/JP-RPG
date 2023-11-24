import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {

    // Character
    PImage imgCharacter_Up;
    PImage imgCharacter_Down;
    PImage imgCharacter_Left;
    PImage imgCharacter_Right;

    PImage[] imgCharacter_Up_Attack;
    PImage[] imgCharacter_Down_Attack;
    PImage[] imgCharacter_Left_Attack;
    PImage[] imgCharacter_Right_Attack;

    // Enemy 
    PImage imgSkeleton_Up;
    PImage imgSkeleton_Down;
    PImage imgSkeleton_Left;
    PImage imgSkeleton_Right;

    // Start Menu
    PImage imgStartMenu;

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

    // Border?
    PImage imgBush;

    // Mouse
    PImage imgMouse;
    PImage imgMouse_IR;
    PImage imgMouse_OOR;

    // Player Range
    int intRange = 1;

    // Player Position
    float fltPlayerX = 96;
    float fltPlayerY = 128;
    float fltSection = 1;

    // Skeleton Position
    float fltS1_X;
    float fltS1_Y;

    // Eric's House Position
    float fltEHouseX = 64;
    float fltEHouseY = 48;

    // Character Lives
    int intPlayerLives = 10;
    int intS1_Lives = 0;
    
    // Character Attack Animation Frames
    int attackFrame = 0;
    int totalFrames = 5; 

    // Skeleton Movement Delay
    int skeletonMoveDelay = 60;

    // Character Directions
    String strPDirection = "down";
    String strSDirection = "down";

    // Boolean Values
    boolean blnKeyW, blnKeyS, blnKeyA, blnKeyD;
    boolean blnReadSign = false;
    boolean blnEricHouse = false;
    boolean blnDayTime = true;
    boolean blnS1_Initialize = false;
    boolean blnIsAttacking = false;
    boolean blnGameOver = false;
    boolean blnStartMenu = true;
    boolean blnSetting = false;

    public void settings() {
        size(240, 240);
    }

    public void setup() {
        // Load Character
        imgCharacter_Up = loadImage("Images/Player/Character_Up.png");
        imgCharacter_Down = loadImage("Images/Player/Character_Down.png");
        imgCharacter_Left = loadImage("Images/Player/Character_Left.png");
        imgCharacter_Right = loadImage("Images/Player/Character_Right.png");

        // Load Character Animation
        imgCharacter_Up_Attack = new PImage[totalFrames];
        imgCharacter_Down_Attack = new PImage[totalFrames];
        imgCharacter_Left_Attack = new PImage[totalFrames];
        imgCharacter_Right_Attack = new PImage[totalFrames];

        for (int i = 0; i < totalFrames; i++) {
            imgCharacter_Up_Attack[i] = loadImage("Images/Player/Character_Up_Attack" + i + ".png");
        }

        for (int i = 0; i < totalFrames; i++) {
            imgCharacter_Down_Attack[i] = loadImage("Images/Player/Character_Down_Attack" + i + ".png");
        }

        for (int i = 0; i < totalFrames; i++) {
            imgCharacter_Left_Attack[i] = loadImage("Images/Player/Character_Left_Attack" + i + ".png");
        }

        for (int i = 0; i < totalFrames; i++) {
            imgCharacter_Right_Attack[i] = loadImage("Images/Player/Character_Right_Attack" + i + ".png");
        }
        
        // Load Enemy

        imgSkeleton_Up = loadImage("Images/Enemy/Skeleton_Up.png");
        imgSkeleton_Down = loadImage("Images/Enemy/Skeleton_Down.png");
        imgSkeleton_Left = loadImage("Images/Enemy/Skeleton_Left.png");
        imgSkeleton_Right = loadImage("Images/Enemy/Skeleton_Right.png");

        // Load Start Menu

        imgStartMenu = loadImage("Images/Start_Menu.png");

        // Load Signs
        imgSign = loadImage("Images/Environment/Sign.png");
        imgSignText1 = loadImage("Images/Environment/Sign_Text/Sign_Text1.png");
        
        // Load & Resize Eric's House (Preston Sucks)
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

        // Load Border?
        imgBush = loadImage("Images/Environment/Bush.png");
        imgBush.resize(16,16);

        // Load Mouse
        imgMouse = loadImage("Images/Mouse/Mouse.png");
        imgMouse.resize(16,16);
        imgMouse_OOR = loadImage("Images/Mouse/Mouse_OOR.png");
        imgMouse_OOR.resize(16,16);
        imgMouse_IR = loadImage("Images/Mouse/Mouse_IR.png");
        imgMouse_IR.resize(16,16);
    }

    public void draw() {

        if (!blnGameOver) {

            if (blnStartMenu == false) {

            startGame();

            movePlayer();

            checkCollision();

            // Images Will Be Behind Of Player
            layerOne();
            
            mouse();

            displayPlayer();

            // Images Will Be Infront Of Player
            layerTwo();

            displaySigns();

            enemies();

            interactions();

            gameOver();

            } else {

                startMenu();
                
                selectCharacter();

                if (blnSetting) {

                    setting();

                }

            }

        } else {

            background(255, 255, 255);

        }

    }

    private void startMenu() {

        image(imgStartMenu, 0, 0); 

        if ((mouseX > 50 && mouseX < 185) && (mouseY > 110 && mouseY < 135) && mousePressed) {
            
            blnStartMenu = false;
        
        } else if ((mouseX > 75 && mouseX < 165) && (mouseY > 145 && mouseY < 165) && mousePressed) {
        
            blnSetting = true;
        
        } else {

        }

    }

    private void selectCharacter() {



    }
    
    private void startGame() {

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

    private void setting() {

        

    }

    private void movePlayer() {
        
        if (blnKeyW) {

            fltPlayerY -= 16;
            blnKeyW = false;
            strPDirection = "up";

        } else if (blnKeyS) {

            fltPlayerY += 16;
            blnKeyS = false;
            strPDirection = "down";

        } else if (blnKeyA) {

            fltPlayerX -= 16;
            blnKeyA = false;
            strPDirection = "left";

        } else if (blnKeyD) {

            fltPlayerX += 16;
            blnKeyD = false;
            strPDirection = "right";

        }

    }

    private void checkCollision() {

        if (fltSection == 1) {

            fltPlayerX = constrain(fltPlayerX, 16, width - 32);
            fltPlayerY = constrain(fltPlayerY, 16, height - 16);
        
        } else if (fltSection == 2) {

            fltPlayerX = constrain(fltPlayerX, 0, width - 32);
            fltPlayerY = constrain(fltPlayerY, 0, height - 32);

        }

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


        // Eric's Interior House Collision
        if (fltPlayerX > 128 && fltPlayerY == 96 && fltSection == 0 && blnEricHouse == true && (key == 'D' || key == 'd')) {
            
            fltPlayerX -= 16;

        }

        if (fltPlayerX > 128 && fltPlayerY == 80 && fltSection == 0 && blnEricHouse == true && (key == 'D' || key == 'd')) {
            
            fltPlayerX -= 16;

        }

        if (fltPlayerX < 80 && fltPlayerY == 96 && fltSection == 0 && blnEricHouse == true && (key == 'A' || key == 'a')) {
            
            fltPlayerX += 16;

        }

        if (fltPlayerX < 80 && fltPlayerY == 80 && fltSection == 0 && blnEricHouse == true && (key == 'A' || key == 'a')) {
            
            fltPlayerX += 16;

        }

        if (fltPlayerX == 128 && fltPlayerY < 80 && fltSection == 0 && blnEricHouse == true && (key == 'W' || key == 'w')) {
            
            fltPlayerY += 16;

        }

        if (fltPlayerX == 112 && fltPlayerY < 80 && fltSection == 0 && blnEricHouse == true && (key == 'W' || key == 'w')) {
            
            fltPlayerY += 16;

        }

        if (fltPlayerX == 96 && fltPlayerY < 80 && fltSection == 0 && blnEricHouse == true && (key == 'W' || key == 'w')) {
            
            fltPlayerY += 16;

        }

        if (fltPlayerX == 80 && fltPlayerY < 80 && fltSection == 0 && blnEricHouse == true && (key == 'W' || key == 'w')) {
            
            fltPlayerY += 16;

        }

        if (fltPlayerX == 128 && fltPlayerY > 96 && fltSection == 0 && blnEricHouse == true && (key == 'S' || key == 's')) {
            
            fltPlayerY -= 16;

        }

        if (fltPlayerX == 112 && fltPlayerY > 96 && fltSection == 0 && blnEricHouse == true && (key == 'S' || key == 's')) {
            
            fltPlayerY -= 16;

        }

        if (fltPlayerX == 80 && fltPlayerY > 96 && fltSection == 0 && blnEricHouse == true && (key == 'S' || key == 's')) {
            
            fltPlayerY -= 16;

        }

        if (fltPlayerX < 96 && fltPlayerY == 112 && fltSection == 0 && blnEricHouse == true && (key == 'A' || key == 'a')) {
            
            fltPlayerX += 16;

        }

        if (fltPlayerX > 96 && fltPlayerY == 112 && fltSection == 0 && blnEricHouse == true && (key == 'D' || key == 'd')) {
            
            fltPlayerX -= 16;

        }
        
        // Section 1 Bush Collision
        if ((fltPlayerX < 64 || fltPlayerX > 96) && fltPlayerY > 208 && fltSection == 1 && (key == 'S' || key == 's')) {
            
            fltPlayerY -= 16;

        }

        if (fltPlayerX == 112 && fltPlayerY == 224 && fltSection == 1 && (key == 'D' || key == 'd')) {
            
            fltPlayerX -= 16;

        }

        if (fltPlayerX == 48  && fltPlayerY == 224 && fltSection == 1 && (key == 'A' || key == 'a')) {
            
            fltPlayerX += 16;

        }

        // Section 2 Bush Collision
        if (fltPlayerX == 112 && fltPlayerY == 0 && fltSection == 2 && (key == 'D' || key == 'd')) {
            
            fltPlayerX -= 16;

        }

        if (fltPlayerX == 48  && fltPlayerY == 0 && fltSection == 2 && (key == 'A' || key == 'a')) {
            
            fltPlayerX += 16;

        }

        if ((fltPlayerX < 64 || fltPlayerX > 96) && fltPlayerY < 16 && fltSection == 2 && (key == 'W' || key == 'w')) {
            
            fltPlayerY += 16;

        }

        if (fltPlayerX == 0 && fltPlayerY < 176 && fltSection == 2 && (key == 'A' || key == 'a')) {
            
            fltPlayerX += 16;

        }

        if (fltPlayerX == 0 && fltPlayerY < 176 && fltSection == 2 && (key == 'W' || key == 'w')) {
            
            fltPlayerY += 16;

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

    private void mouse() {

        if (dist(((mouseX / 16) * 16), ((mouseY / 16) * 16), fltPlayerX, fltPlayerY) <= (intRange * 16)) {
            
            if (mousePressed) {
                
                image(imgMouse_IR, ((mouseX / 16) * 16), ((mouseY / 16) * 16));

                if ((mouseX / 16) * 16 > fltPlayerX) {

                    strPDirection = "right";

                } else if ((mouseX / 16) * 16 < fltPlayerX) {
                   
                    strPDirection = "left";

                } else {
                    
                }
            
                if ((mouseY / 16) * 16 > fltPlayerY) {
                    
                    strPDirection = "down";

                } else if ((mouseY / 16) * 16 < fltPlayerY) {

                    strPDirection = "up";

                }
            
            } else {

                image(imgMouse, ((mouseX / 16) * 16), ((mouseY / 16) * 16));

            }

        } else {

            image(imgMouse_OOR, ((mouseX / 16) * 16), ((mouseY / 16) * 16));

        }
    }

    void displayPlayer() {
        if (blnIsAttacking) {

          // Implement attack animation logic
          if (strPDirection.equals("up")) {

            image(imgCharacter_Up_Attack[attackFrame], fltPlayerX, fltPlayerY);

          } else if (strPDirection.equals("down")) {

            image(imgCharacter_Down_Attack[attackFrame], fltPlayerX, fltPlayerY);

          } else if (strPDirection.equals("left")) {

            image(imgCharacter_Left_Attack[attackFrame], fltPlayerX, fltPlayerY);

          } else if (strPDirection.equals("right")) {

            image(imgCharacter_Right_Attack[attackFrame], fltPlayerX, fltPlayerY);
          }
      
          // Attack Animation
          attackFrame = (attackFrame + 1) % totalFrames;
        
        } else {

            // Display the regular character
            if (strPDirection.equals("up")) {
                
                image(imgCharacter_Up, fltPlayerX, fltPlayerY);

            } else if (strPDirection.equals("down")) {

                image(imgCharacter_Down, fltPlayerX, fltPlayerY);

            } else if (strPDirection.equals("left")) {

                image(imgCharacter_Left, fltPlayerX, fltPlayerY);

            } else if (strPDirection.equals("right")) {

                image(imgCharacter_Right, fltPlayerX, fltPlayerY);

            }
        }
    }
      
      public void mousePressed() {
        
        attackFrame = 0;
        blnIsAttacking = true;
        frameRate(15);

      }
      
      public void mouseReleased() {
        
        blnIsAttacking = false;
        frameRate(60);

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
        
        if (fltSection == 0) {

        } else if (fltSection == 1) {

            for (int y = 0; y < 240 ; y += 16) {
                image(imgBush, 0, y);
            }

            for (int y = 0; y < 240 ; y += 16) {
                image(imgBush, 224, y);
            }

            for (int x = 0; x < 240 ; x += 16) {
                image(imgBush, x, 0);
            }

            for (int x = 112; x < 240 ; x += 16) {
                image(imgBush, x, 224);
            }

            for (int x = 0; x < 64 ; x += 16) {
                image(imgBush, x, 224);
            }

        } else if (fltSection == 2) {

            for (int y = 0; y < 240 ; y += 16) {
                image(imgBush, 224, y);
            }

            for (int x = 0; x < 240 ; x += 16) {
                image(imgBush, x, 224);
            }

            for (int x = 112; x < 240 ; x += 16) {
                image(imgBush, x, 0);
            }

            for (int x = 0; x < 64 ; x += 16) {
                image(imgBush, x, 0);
            }

            for (int y = 0; y < 176 ; y += 16) {
                image(imgBush, 0, y);
            }

        }

    }

    public void enemies() {
        
        if (fltSection == 2) {

            if (!blnS1_Initialize) {

                intS1_Lives = 3; // or any other value you desire
                fltS1_X = 128;
                fltS1_Y = 128;
                blnS1_Initialize = true;
            
            }

            if (intS1_Lives > 0) {

                skeletonMoveDelay--;

                if (skeletonMoveDelay <= 0) {

                    skeletonMoveDelay = 30;
            
                    if (abs(fltS1_X - fltPlayerX) > abs(fltS1_Y - fltPlayerY)) {
                    
                        if (fltS1_X < fltPlayerX) {
                            
                            fltS1_X += 16;
                            strSDirection = "right";

                        } else if (fltS1_X > fltPlayerX) {
                            
                            fltS1_X -= 16;
                            strSDirection = "left";
                        }

                    } else {

                        if (fltS1_Y < fltPlayerY) {
                            
                            fltS1_Y += 16;
                            strSDirection = "down";

                        } else if (fltS1_Y > fltPlayerY) {
                            
                            fltS1_Y -= 16;
                            strSDirection = "up";
                        }

                        if (fltS1_X < 16) {

                            fltS1_X += 16;

                        } else if (fltS1_X > 224) {

                            fltS1_X -= 16;

                        } else if (fltS1_Y < 16) {
                    
                            fltS1_Y += 16;

                        } else if (fltS1_Y < 16) {
                     
                            fltS1_Y -= 16; 

                        }

                        if (dist(fltS1_X, fltS1_Y, fltPlayerX, fltPlayerY) < 16) { 
                        
                            intPlayerLives--;
                
                        }

                    }

                }

                if (strSDirection.equals("up")) {

                        image(imgSkeleton_Up, fltS1_X, fltS1_Y);

                    } else if (strSDirection.equals("down")) {

                        image(imgSkeleton_Down, fltS1_X, fltS1_Y);

                    } else if (strSDirection.equals("left")) {

                        image(imgSkeleton_Left, fltS1_X, fltS1_Y);

                    } else if (strSDirection.equals("right")) {

                        image(imgSkeleton_Right, fltS1_X, fltS1_Y);

                }

                if (dist(((mouseX / 16) * 16), ((mouseY / 16) * 16), fltPlayerX, fltPlayerY) <= (intRange * 16)) {
                    
                    if (mousePressed && ((mouseX / 16) * 16 == (fltS1_X / 16) * 16) && ((mouseY / 16) * 16 == (fltS1_Y / 16) * 16)) {

                        intS1_Lives = intS1_Lives - 1;
        

                    }

                }

            } else {

            }

        }

    }
    

    public void displaySigns() {
        
        if ((key == 'E' || key == 'e') && (fltPlayerX == 64 && fltPlayerY == 128) && fltSection == 1) {
            
            image(imgSignText1, 16, 16);

        } else {

        }
       
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

        if ((key == 'E' || key == 'e') && (fltPlayerX == 128) && (fltPlayerY == 96 || fltPlayerY == 80) && fltSection == 0 && blnEricHouse == true) {

            blnDayTime = true;

        }

        if ((fltPlayerX >= 64 && fltPlayerX < 112) && fltPlayerY == 224 && fltSection == 1 && (key == 'S' || key == 's')) {
            
            fltSection += 1;
            fltPlayerY = 0;

        }

        if ((fltPlayerX >= 64 && fltPlayerX < 112) && fltPlayerY == 0 && fltSection == 2 && (key == 'W' || key == 'w')) {
            
            fltSection -= 1;
            fltPlayerY = 224;

        }

    }

    public void gameOver() {

        if (intPlayerLives <= 0) {

            blnGameOver = true;

        }

    }

}


