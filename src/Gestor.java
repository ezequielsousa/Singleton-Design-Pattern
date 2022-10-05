
public class Gestor {
	
    
        private static Gestor gestor = null; 
        
        
	private String nome;

        private String endere�o;
        
        private float salario;
	
		
	/*
	 *N�o existe construtor p�blico num Singleton
	 */
	private Gestor() {}    //  Inibe o construtor padr�o
        
        
	
	private Gestor(String nome, String endere�o, float salario) {
		this.nome = nome;
		this.endere�o = endere�o;
                this.salario = salario;
	}
        
        
	
	/*public static Gestor criaInstancia() {
		if (gestor == null) {
			gestor = new Gestor(); 
		} 
		return gestor; 
	} */

	public static Gestor criaInstancia(String nome, String endere�o, float salario) {
		if (gestor == null) {
			gestor = new Gestor(nome, endere�o, salario); 
		} 
		return gestor; 
	} 

    
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndere�o() {
        return endere�o;
    }

    public void setEndere�o(String endere�o) {
        this.endere�o = endere�o;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
	
	
	public String toString() {
		return "Nome: " + nome + " endere�o: " + endere�o + "salario: " + salario;
	}
}






