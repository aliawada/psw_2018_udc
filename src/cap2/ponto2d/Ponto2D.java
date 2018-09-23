package cap2.ponto2d;

public class Ponto2D {
	private float x;
	private float y;
	
	public Ponto2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "("+ x +","+ y+")";
	}


	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
}
