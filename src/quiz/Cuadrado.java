package quiz;


import processing.core.PApplet;

public class Cuadrado extends Thread {
	
	private PApplet app;
	private int posX,posY,color;
	private int tamX,tamY;
	private boolean clicky;
	private int dir;
	
	public Cuadrado(PApplet app,int posX,int posY,int tamX,int tamY,int color){
		this.app=app;
		this.color=color;
		this.posX=posX;
		this.posY=posY;
		this.tamX=tamX;
		this.tamY=tamY;
		this.dir=1;
		this.clicky=false;
		//20 tam
	}
	
	
	
	public void run() {
		while(clicky==true) {

			
			try {
				
					Thread.sleep(1000);
					movimiento();
					
				
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	
	
	
	
	
	public void pintarCuadricula() {
		app.fill(this.color);
		app.rect(this.posX,this.posY,this.tamX,this.tamY);
		
	}
	
	public void movimiento() {
	
		this.posY+=dir;
		if(this.posY>=300) {
			this.dir*=-1;
		}
		if(this.posY<=60) {
			this.dir*=-1;
		}
		
		
		
		

		
	
		
		
		
	}



	public int getPosX() {
		return posX;
	}



	public void setPosX(int posX) {
		this.posX = posX;
	}



	public int getPosY() {
		return posY;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}



	public int getColor() {
		return color;
	}



	public void setColor(int color) {
		this.color = color;
	}



	public int getTamX() {
		return tamX;
	}



	public void setTamX(int tamX) {
		this.tamX = tamX;
	}



	public int getTamY() {
		return tamY;
	}



	public void setTamY(int tamY) {
		this.tamY = tamY;
	}



	public boolean isClicky() {
		return clicky;
	}



	public void setClicky(boolean clicky) {
		this.clicky = clicky;
	}

	
}
