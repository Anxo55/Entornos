class Pajaro{
  float x=70, y=height/2;
  float velocidad;
  float aceleracion = 0.6f; // TODO esto podria ser una constante
  final static int CANTIDAD_SALTO = -10;
  int miColor;
  // TODO sprites
  boolean vivo = true;
  PImage pajaro;

  public Pajaro(){
    pajaro = loadImage("pajaro.png");
    pajaro.resize(32,32);
  }
  void saltar(){
    velocidad = CANTIDAD_SALTO;
  }  
  void dibujar(){
    fill(214, 240, 43); // Amarillo
    final int ANCHO_PAJARO = 32;
    //ellipse(x, y, ANCHO_PAJARO, ANCHO_PAJARO);
    image(pajaro, x-ANCHO_PAJARO/2, y-ANCHO_PAJARO/2);
  }
  void actualizarPosicion(){
    
    velocidad = velocidad + aceleracion;
    y = y + velocidad;
    
    if(y > height){
       y = height;
       velocidad = 0;
    }
  }
}
class Tuberia{
  float x;
  int espacioEntreTubos = 150; //TODO esto podria ser una constante
  int posicionEspacio;
  final static float VELOCIDAD = 6;
  final static int ANCHO = 50;
  
  private int top, bottom;
  public Tuberia(){
    posicionEspacio = 
      (int)random(espacioEntreTubos, height-espacioEntreTubos);
    top = (int)(posicionEspacio - espacioEntreTubos/2.0f);
    bottom = posicionEspacio + espacioEntreTubos/2; // == top + espacioEntreTubos
    //bottom = top+espacioEntreTubos;
    x = width;
  }
  
  void dibujar(){
    fill(0,255,0);
    rect(x, 0, ANCHO, top);
    rect(x, bottom, ANCHO, height-bottom);
    
    // dibujo las tapas de la tuberia
    rect(x-5, top-30, ANCHO+5+5, 30);
    rect(x-5, bottom, ANCHO+5+5, 30);
  }
  void actualizarPosicion(){
    x = x - VELOCIDAD;
  }
  boolean calcularColision(Pajaro pajaro){
    if(pajaro.y < top || pajaro.y > bottom){
      if(pajaro.x > x && pajaro.x < x+ANCHO){
        return true;
      }
    }
    if(pajaro.y >= height){
      return true;    
    }
    return false;
  }
  boolean isFueraEscena(){
    return false;
  }
}

Pajaro pajaro;
ArrayList<Tuberia> tuberias;
int puntuacion; 
boolean stop = true;
PImage cielo;
PImage suelo;
int posSuelo = 0;

void setup(){
  textSize(32);
  size(640, 480);
  pajaro = new Pajaro();
  tuberias = new ArrayList();
  cielo = loadImage("cielo.jpg");
  suelo = loadImage("suelo.png");
  
}

void draw(){
  final int FRECUENCIA_APARICION = 100;
  background(0);
  
  // dibujamos el cielo
  image(cielo, 0, 0);
  cielo.resize(width, height);
  
  // dibujar suelo
  image(suelo, posSuelo, height - suelo.height); 
  image(suelo, posSuelo+suelo.width, height - suelo.height);
  image(suelo, posSuelo+suelo.width*2, height - suelo.height);
  
  // mover el suelo
  posSuelo -= Tuberia.VELOCIDAD;
  if(posSuelo < -suelo.width){
    posSuelo = 0;
  }
  mostrarPuntuacion();
  dibujarObjetos();
  if(frameCount % FRECUENCIA_APARICION == 0){
    tuberias.add(new Tuberia());
    puntuacion++;
  }
  actualizarPosicionObjetos();
  calcularColisiones();
  borrarTuberiasFueraEscena();
}

void reiniciarJuego(){ 
  puntuacion = 0;
  stop = true;
  tuberias.clear();
  pajaro = new Pajaro();
}
void mostrarPuntuacion(){
  fill(255,255,255);
  text(puntuacion, width-100, 35);
}
void mostrarLeaderBoard(){ }

void dibujarObjetos(){
  pajaro.dibujar();
  for(int i=0;i<tuberias.size();i++){
    tuberias.get(i).dibujar();
  }
}
void actualizarPosicionObjetos() {
  if(stop == false){
    pajaro.actualizarPosicion();
  }
  for(int i=0;i<tuberias.size();i++){
    tuberias.get(i).actualizarPosicion();
  }
}
void borrarTuberiasFueraEscena(){ }
void calcularColisiones() { 
  for(int i=0;i<tuberias.size();i++){
    if( tuberias.get(i).calcularColision(pajaro) ){
      reiniciarJuego();
    }
  }
}
void keyPressed() { 
  if(key == ' '){
    stop = false;
    pajaro.saltar();
  }
}
