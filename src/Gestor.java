
public class Gestor {
	
    
        private static Gestor gestor = null; 
        
        
	private String nome;

        private String endereço;
        
        private float salario;
	
		
	/*
	 *Não existe construtor público num Singleton
	 */
	private Gestor() {}    //  Inibe o construtor padrão
        
        
	
	private Gestor(String nome, String endereço, float salario) {
		this.nome = nome;
		this.endereço = endereço;
                this.salario = salario;
	}
        
        
	
	/*public static Gestor criaInstancia() {
		if (gestor == null) {
			gestor = new Gestor(); 
		} 
		return gestor; 
	} */

	public static Gestor criaInstancia(String nome, String endereço, float salario) {
		if (gestor == null) {
			gestor = new Gestor(nome, endereço, salario); 
		} 
		return gestor; 
	} 

    
        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
	
	
	public String toString() {
		return "Nome: " + nome + " endereço: " + endereço + "salario: " + salario;
	}
}






