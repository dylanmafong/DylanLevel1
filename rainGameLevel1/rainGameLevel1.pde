void draw() {
  background(20, 100, 255);
  fill(20, 100, 0);
stroke(20, 10, 255);
ellipse( randomNumber, raindropsY, 23, 47);
raindropsY = raindropsY + 9;
rect(mouseX, 900,  100, 30);
  
if(raindropsY > 1000){
  raindropsY = 0;
  randomNumber = (int) random(1000);

}
if(raindropsY > 900&&raindropsY < 910){
  checkCatch(randomNumber);
}
}
  void setup() {
    size(1000, 1000);
  
  }
  int score = 0;
  int raindropsY = 100;
int Y = 0;
int randomNumber = (int) random(1000);
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }
     fill(100, 100, 100);
textSize(16);
text("Score: " + score, 20, 20);