package modelo;
import java.util.ArrayList;
import java.util.List;

	public class Filial {
	    private String nome;
	    private String endereco;
	    private List<Funcionario> funcionarios;
	    private List<Bem> bensFilial;

	    public Filial(String nome, String endereco) {
	        this.nome = nome;
	        this.endereco = endereco;
	        this.funcionarios = new ArrayList<>();
	        this.bensFilial= new ArrayList<>();
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }

	    public List<Funcionario> getFuncionarios() {
	        return funcionarios;
	    }

	    public void setPatrimonios(List<Funcionario> funcionarios) {
	        this.funcionarios = funcionarios;
	    }

	    public void listarPatrimonioFilial() {
        	for(Bem bensFilial: bensFilial ) {
        		System.out.println("Patrimonios da filial "+getNome()+": "+bensFilial.getNome()+"\n");
        	}
        }
	    public void anexarFuncionarioFilial(Funcionario funcionario) {
        	funcionarios.add(funcionario);
        	}
	    public void anexarBemFilial(Bem patrimonio) {
	    	bensFilial.add(patrimonio);
	    }
	    @Override
		public String toString() {
			return this.nome+" "+this.endereco+" "+this.funcionarios+" "+this.bensFilial;
		}
	}
	        