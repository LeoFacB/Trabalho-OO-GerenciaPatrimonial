package modelo;
import java.util.ArrayList;
import java.util.List;
public class Funcionario{
    private String nome;
    private String cpf;
    private String cargo;
	private String telefone;
    private List<Bem> patrimonios;

    public Funcionario(String nome, String cpf, String cargo, String telefone) {
        //super(nomeFilial, enderecoFilial);
	    this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.telefone = telefone;
        this.patrimonios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void anexarPatrimonioFuncionario(Bem patrimonio) {
    	patrimonios.add(patrimonio);
    }
    public void listarBemFuncionario() {
    	for(Bem patrimonios: patrimonios) {
    		System.out.println("O patrimonio em posse do funcionario "+getNome()  +" é "+ patrimonios.getNome());
    	}
    }
    @Override
	public String toString() {
		return this.nome+" "+this.cpf+" "+this.cargo+" "+this.telefone+" "+this.patrimonios;
	}
    }
