
void setup(){
    size(640, 480);
}

void draw() {
  background(0);
  fill(0, 255, 0);
  textSize(50);
  text("hola", 100, 40);
  fill(255, 0, 0);
  noStroke();
  circle(mouseX, mouseY, 20);
}
