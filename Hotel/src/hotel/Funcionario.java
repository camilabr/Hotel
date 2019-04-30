package hotel;

import java.util.Date;

public class Funcionario extends Pessoa {
    private int idFuncionario;
    private String cargo;
    
     public Funcionario(String nome, int CPF, String endereco, String telefone, Date dataNascimento, Date dataCad, String carg, int id){
        nomePessoa=nome;
        CPFPessoa=CPF;
        enderecoPessoa=endereco;
        telefonePessoa=telefone;
        dataNascimentoPessoa=dataNascimento;
        idFuncionario=id;
        dataCadastro=dataCad;
        cargo=carg;
    }
     
    /**
     *
     */
    @Override
    public void atualizarCadastro(){
        
    }
    
    @Override
    public void consultar(){
    }
}
