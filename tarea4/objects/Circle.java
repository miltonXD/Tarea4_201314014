package gt.edu.usac.ipc1a.objects;



import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	
	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float gravity;
	public float jumpImpulse;

	public Circle()
	{
		size = 20;
		gravity = 0;
	}
	
	public void Update()
	{
		
                AplicarVelocidad();
		WallDerecha();
                WallIzquierda();
		ActualizarPosicion();
	}
	
	public void ActualizarPosicion()
	{
		positionX = (int)velocityX;
		positionY = (int)velocityY;
	}
	
	public void WallDerecha(){
		if(positionX+size > 785)
			{
			System.out.println("detecte pared");
			}
	}
        
	public void WallIzquierda(){
		if(positionX+size == 0)
		{
			System.out.println("detecte pared");
	       }
	}
	
	public void AplicarVelocidad()
	{
		  velocityX=velocityX+0.4f;
              
	}
        
 	public void Draw (Graphics g){		 
 		
 		 g.setColor(Color.RED);
		 g.fillOval(positionX,positionY,size,size);
 	}

}