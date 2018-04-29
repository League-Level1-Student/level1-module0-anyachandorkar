int y = 30;
 int randomNumber =(int) random(10,490);
int score = 0;
void setup() {
size(500,500);
background(225,225,225);
}

void draw(){
  y=y+2;
  background(225,225,225);
    fill(0,0,225);
  stroke(141,171,222);
  ellipse(randomNumber,y,15,30);
  if(y>500){
  y=30;
  randomNumber =(int) random(10,490);
  }
  fill(0,0,0);
  rect(mouseX, 490, 50,100);
  
  if(randomNumber==mouseX && y==490){
    score = score+1;
  }
  
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}