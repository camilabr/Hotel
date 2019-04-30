package hotel;

import java.util.Date;

public class Hospede extends Pessoa {
    private int idHospede;
    
    public Hospede(String nome, int CPF, String endereco, String telefone, Date dataNascimento, Date dataCad, int id){
        nomePessoa=nome;
        CPFPessoa=CPF;
        enderecoPessoa=endereco;
        telefonePessoa=telefone;
        dataNascimentoPessoa=dataNascimento;
        idHospede=id;
        dataCadastro=dataCad;
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
