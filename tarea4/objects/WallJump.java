package gt.edu.usac.ipc1a.objects;

import java.awt.Color;
import java.awt.Graphics;


public class WallJump extends Circle{
    Color color;
	public WallJump(){
		
		size = 70;
		color = Color.GREEN;
	}
        
    @Override
	public void WallDerecha(){
		if(positionX+size > 785)
			{
				CambiarDireccion();
                                CambiarColor();
			}
	}
        
    @Override
	public void WallIzquierda(){
		if(positionX+size == 0)
		{
			velocityX=velocityX+0.4f;
			}
        }
        public void CambiarDireccion(){
                
		velocityX=-0.4f;
	}
	
	public void CambiarColor()
	{
		color = Color.blue;
	}
	
	@Override
 	public void Draw (Graphics g){		 
		 g.setColor(color);
		 g.fillOval(positionX,positionY,size,size);
	}
}
