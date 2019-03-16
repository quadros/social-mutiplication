/**
 * 
 */
package microservices.book.socialmutiplication.domain;

/**
 * @author quadros
 *
 */
public class Multiplication {
	
	
	private int factorA;
	
	private int factorB;
	
	private int result;
	
	

	public Multiplication(int factorA, int factorB) {
		super();
		this.factorA = factorA;
		this.factorB = factorB;
		this.result = this.factorA * this.factorB;
				
				
	}

	public int getFactorA() {
		return factorA;
	}

	public void setFactorA(int factorA) {
		this.factorA = factorA;
	}

	public int getFactorB() {
		return factorB;
	}
	
	
	public void setFactorB(int factorB) {
		this.factorB = factorB;
	}

	public int getResult() {
		return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "factorA:"+factorA+"*factorB:"+factorB+" = "+result;
	}

}
