void draw(){
  image(pictureOfRecord, 10, 1);//in draw method

}
void setup (){
  size (1000,1000);
  pictureOfRecord= loadImage("record.jpg");  //in setup method  

}
PImage pictureOfRecord;  //as member variable