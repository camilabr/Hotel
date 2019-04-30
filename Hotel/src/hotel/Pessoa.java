package hotel;

import java.util.Date;

public abstract class Pessoa {
    protected int CPFPessoa;
    protected String nomePessoa;
    protected String enderecoPessoa;
    protected String telefonePessoa;
    protected Date dataNascimentoPessoa;
    protected Date dataCadastro;
    
    public abstract void atualizarCadastro();
    public abstract void consultar();
    
}
