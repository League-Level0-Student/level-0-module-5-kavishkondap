int xOne = 600;
int xTwo = 200;
void setup() {
  size(800,800);
}

void draw() {
   background (#958F8F);
  // Go to the recipe to run the demonstration before starting this program
  for(int i=0;i<50;i++){ 
    noFill();
    ellipse(xTwo,400,400-10*i,400-10*i);
  ellipse(xOne,400,400-10*i,400-10*i); 
}
  xTwo ++;
  xOne --;
 for (int j= 0; j<50;j++){
  if (xOne==0){
   xOne=800;
   xTwo=0;
  }
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  
  When the rings hit the side of the sketch, make them reverse their direction.
  */
  }}
