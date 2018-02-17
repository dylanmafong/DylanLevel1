PImage backgroundImage;
import ddf.minim.*;  
Minim minim;
AudioSample sound;
void draw() {
  background(100, 23, 243);
    image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
  fill(100, 100, 100);
  stroke(255, 75, 38);
  ellipse(X, Y, 100, 100);
  X=X+Xspeed;
  Y=Y+Yspeed;
  
rect(mouseX, 900, 50,15);
  if (X > width) {
    Xspeed=-9;
  }
  if (X < 0) {
    Xspeed=9;
  }
  if (Y > height) {
    Yspeed=-9;
        sound.trigger();
  }
  if (Y < 0) {
    Yspeed=9;
  }
  if (intersects(X,)){
}

int  X =  900;
int  Y =  400;
int Yspeed = 9;
int Xspeed = 9;
void setup() {
  size(1000, 1000);
  minim = new Minim (this);
sound = minim.loadSample("pongSound.wav", 128);
backgroundImage = loadImage("apple.jpg");
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}