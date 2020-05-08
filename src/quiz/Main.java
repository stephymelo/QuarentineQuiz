package quiz;



import processing.core.PApplet;

public class Main extends PApplet {

	private Cuadrado[][] matriz;
	private int row,col;
	private int r,g,b;


	private boolean tocarMatriz,vovilsteTocar;
	public static void main(String[] args) {
		PApplet.main("quiz.Main");

	}

	public void settings() {
		size(600,400);




	}
	public void setup() {
		

		row = 10;
		col = 6;
		tocarMatriz=false;
		vovilsteTocar=false;
		
		matriz= new Cuadrado[row][col]; 





		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if((i%2)==0) {
					matriz[i][j] = new Cuadrado(this,100+(20)* i, 80+(40) * j, color(r=0,g=0,b=0));
				}else {
					matriz[i][j] = new Cuadrado(this,100+(20) * i,100+(40) * j,color(r=255,g=255,b=255));
				}



			}
		}
	}

	public void draw() {
		background(173, 173, 173);



		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				matriz[i][j].pintarCuadricula();
			
				

			}

		}
		if(tocarMatriz==true) {
		mov();
	}
	}






	public void mov() {
		
		
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					
					if((i%2)==0) {
					 matriz[i][j].movimiento();
					 vovilsteTocar=true;
				
					
				}
			}
		}
	
	}







	public void matrix ()throws Exceptionn {

				if(vovilsteTocar==true) {
					throw new Exceptionn("no puedes volver a tocar este cuadrado");
				}else {
					vovilsteTocar=false;
				}

	}

	public void mouseClicked() {
		try {
			
			matrix();
			
		}catch(Exceptionn e) {
			System.out.print(e.getMessage());
		}

	
//
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				

			
				if(dist(mouseX,mouseY,matriz[i][j].getPosX()+20,matriz[i][j].getPosY())<100) {
				
					matriz[i][j].setColor(color(255,0,0));
					tocarMatriz=true;
					matriz[i][j].setClicky(true);
					System.out.println("entro"); 
					
					return;
				}

				
				//con este deberia parar pero no// 
				
				if(dist(mouseX,mouseY,matriz[i][j].getPosX(),matriz[i][j].getPosY())<100&&(i%2)==0) {
					tocarMatriz=false;
					matriz[i][j].setClicky(false);
					return;
				}

			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(dist(mouseX,mouseY,matriz[i][j].getPosX(),matriz[i][j].getPosY())<100&&matriz[i][j].getColor()==color(255,0,0)) {
					vovilsteTocar=true;
				}
			}
		}
		
					
			






	}
}