package Core;

public abstract class SpecialLokum extends Lokum {


	private static final long serialVersionUID = 1L;
	
	/**
	 *
	 * @ensures the special lokums(the striped, the wrapped, and the colorBomb lokum) become visible
	 */
	public SpecialLokum() {
		
	}
	

	public abstract void explode();
	
	
	public boolean repOK(){
		return false;
		
	}


	public String toString() {
		return "SpecialLokum []";
	}
	




}
