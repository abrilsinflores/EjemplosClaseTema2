package es.upm.aled.recursion.backtrack;

public class Coordinate {
	
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if(obj==null)
				return false;
		if(this.getClass() )
		
		Coordinate other = (Coordinate) obj; // hacemos casting xq Java no sabe de qué clase es el objeto
		return((this.x == other.x) && (this.y == other.y));
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
