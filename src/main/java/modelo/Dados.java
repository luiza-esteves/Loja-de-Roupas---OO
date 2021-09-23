
package modelo;
import java.util.*;

public class Dados {
    
     private Calca[] calca = new Calca[50];
     private int qtdCalca ;
     private Camisa[] camisa = new Camisa[50];
     private int qtdCamisa;
     private Camiseta[] camiseta = new Camiseta[50];
     private int qtdCamiseta;
     private Casaco[] casaco = new Casaco[50];
     private int qtdCasaco;
     private Cinto[] cinto = new Cinto[50];
     private int qtdCinto;
     private Cropped[] cropped = new Cropped[50];
     private int qtdCropped;
     private Macacao[] macacao = new Macacao[50];
     private int qtdMacacao;
     private Saia[] saia = new Saia[50];
     private int qtdSaia;
     private Shorte[] shorte = new Shorte[50];
     private int qtdShorte;
     private Cliente[] cliente = new Cliente[50];
     private int qtdCliente;
     private Venda[] venda = new Venda[50];
     private int qtdVenda;
     private Telefone[] telefone = new Telefone[50];
     private int qtdTelefone;
     private Endereco[] endereco = new Endereco[50];
     private int qtdEndereco;
     private Departamento[] departamento = new Departamento[50];
     private int qtdDepartamento;
     private Estoque[] estoque = new Estoque[50];
     private int qtdEstoque;
     private Funcionario[] funcionario = new Funcionario[50];
     private int qtdFuncionario;
     
     
     public void fillWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		for(int i = 0; i < 5; i++) {
			telefone[i] = new Telefone((i+1)*100, (i+1)*1000000);
                        endereco[i] = new Endereco("cidade"+i,"estado"+i,"bairro"+i,11111111+i,i+2,i,i+1);
                        calca[i] = new Calca("Tipo de calça"+i,"Cos"+i,"lavagem"+i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        camisa[i] = new Camisa("Modelagem"+i,"Manga"+i,"Gola"+i,"Botão"+i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        
                        camiseta[i] = new Camiseta("Modelagem"+i,"Decote"+i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        
                        casaco[i] = new Casaco("Capuz"+i,"Zíper"+i,"Gola"+i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        
                        cinto[i] = new Cinto("Ocasião"+i,i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        
                        cropped[i] = new Cropped("Estilo"+i,"Modelagem"+i,"Manga"+i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        
                        macacao[i] = new Macacao("Modelagem"+i,"Lavagem"+i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        
                        saia[i] = new Saia("Modelagem"+i,"Tipo de cintura"+i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        
                        shorte[i] = new Shorte("Tipo de short"+i,"Tipo de boca"+i,i,"nome"+i,"P",
                                "cor "+i, "material"+i,"marca"+i,"categoria"+i,"genero"+i,
                        "estampa"+i,i,i);
                        
			cliente[i] = new Cliente(0,"Nome: "+i,000000000+i,telefone[i],endereco[i],"data"+i);
                        
                        funcionario[i] = new Funcionario(i*608.21,"Nome: "+i,000000044+i,telefone[i],endereco[i],"data"+i);
                        
                        estoque[i] = new Estoque(macacao[i],2);
                        
                        venda[i]=new Venda(i,50*i,"Cartão",funcionario[i],cliente[i],calca[i]);
                        
				
		}
		
		qtdCalca= 5;
		qtdCamisa = 5;
		qtdCamiseta = 5;
		qtdCasaco = 5;
		qtdCinto = 5;
                qtdCliente =5; 
                qtdCropped =5; 
                qtdDepartamento =5; 
                qtdEndereco =5; 
                qtdEstoque =5; 
                qtdFuncionario =5; 
                qtdMacacao =5; 
                qtdSaia =5; 
                qtdShorte =5; 
                qtdTelefone =5; 
                qtdVenda =5;
                
                
	}
     
    public void inserirEditarCliente(Cliente c, int pos) {
		this.cliente[pos] = c;
		if(pos == qtdCliente) qtdCliente++;
    }
     
    public void inserirEditarFuncionario(Funcionario f, int pos) {
		this.funcionario[pos] = f;
		if(pos == qtdFuncionario) qtdFuncionario++;
    }
    
    public void inserirEditarCalca(Calca c, int pos) {
		this.calca[pos] = c;
		if(pos == qtdCalca) qtdCalca++;
    }
    
    public void inserirEditarCamisa(Camisa c, int pos) {
		this.camisa[pos] = c;
		if(pos == qtdCamisa) qtdCamisa++;
    }
    
    public void inserirEditarCamiseta(Camiseta c, int pos) {
		this.camiseta[pos] = c;
		if(pos == qtdCamiseta) qtdCamiseta++;
    }
    
    public void inserirEditarCasaco(Casaco c, int pos) {
		this.casaco[pos] = c;
		if(pos == qtdCasaco) qtdCasaco++;
    }
    
    public void inserirEditarCinto(Cinto c, int pos) {
		this.cinto[pos] = c;
		if(pos == qtdCinto) qtdCinto++;
    }
    
    public void inserirEditarCropped(Cropped c, int pos) {
		this.cropped[pos] = c;
		if(pos == qtdCropped) qtdCropped++;
    }
    
    public void inserirEditarMacacao(Macacao c, int pos) {
		this.macacao[pos] = c;
		if(pos == qtdMacacao) qtdMacacao++;
    }
    
    public void inserirEditarSaia(Saia c, int pos) {
		this.saia[pos] = c;
		if(pos == qtdSaia) qtdSaia++;
    }
    
    public void inserirEditarShorte(Shorte c, int pos) {
		this.shorte[pos] = c;
		if(pos == qtdShorte) qtdShorte++;
    }
     

    public Calca[] getCalca() {
        return calca;
    }

    public void setCalca(Calca[] calca) {
        this.calca = calca;
    }

    public int getQtdCalca() {
        return qtdCalca;
    }

    public void setQtdCalca(int qtdCalca) {
        this.qtdCalca = qtdCalca;
    }

    public Camisa[] getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa[] camisa) {
        this.camisa = camisa;
    }

    public int getQtdCamisa() {
        return qtdCamisa;
    }

    public void setQtdCamisa(int qtdCamisa) {
        this.qtdCamisa = qtdCamisa;
    }

    public Camiseta[] getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(Camiseta[] camiseta) {
        this.camiseta = camiseta;
    }

    public int getQtdCamiseta() {
        return qtdCamiseta;
    }

    public void setQtdCamiseta(int qtdCamiseta) {
        this.qtdCamiseta = qtdCamiseta;
    }

    public Casaco[] getCasaco() {
        return casaco;
    }

    public void setCasaco(Casaco[] casaco) {
        this.casaco = casaco;
    }

    public int getQtdCasaco() {
        return qtdCasaco;
    }

    public void setQtdCasaco(int qtdCasaco) {
        this.qtdCasaco = qtdCasaco;
    }

    public Cinto[] getCinto() {
        return cinto;
    }

    public void setCinto(Cinto[] cinto) {
        this.cinto = cinto;
    }

    public int getQtdCinto() {
        return qtdCinto;
    }

    public void setQtdCinto(int qtdCinto) {
        this.qtdCinto = qtdCinto;
    }

    public Cropped[] getCropped() {
        return cropped;
    }

    public void setCropped(Cropped[] cropped) {
        this.cropped = cropped;
    }

    public int getQtdCropped() {
        return qtdCropped;
    }

    public void setQtdCropped(int qtdCropped) {
        this.qtdCropped = qtdCropped;
    }

    public Macacao[] getMacacao() {
        return macacao;
    }

    public void setMacacao(Macacao[] macacao) {
        this.macacao = macacao;
    }

    public int getQtdMacacao() {
        return qtdMacacao;
    }

    public void setQtdMacacao(int qtdMacacao) {
        this.qtdMacacao = qtdMacacao;
    }

    public Saia[] getSaia() {
        return saia;
    }

    public void setSaia(Saia[] saia) {
        this.saia = saia;
    }

    public int getQtdSaia() {
        return qtdSaia;
    }

    public void setQtdSaia(int qtdSaia) {
        this.qtdSaia = qtdSaia;
    }

    public Shorte[] getShorte() {
        return shorte;
    }

    public void setShorte(Shorte[] shorte) {
        this.shorte = shorte;
    }

    public int getQtdShorte() {
        return qtdShorte;
    }

    public void setQtdShorte(int qtdShorte) {
        this.qtdShorte = qtdShorte;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public int getQtdCliente() {
        return qtdCliente;
    }

    public void setQtdCliente(int qtdCliente) {
        this.qtdCliente = qtdCliente;
    }

    public Venda[] getVenda() {
        return venda;
    }

    public void setVenda(Venda[] venda) {
        this.venda = venda;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public Telefone[] getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone[] telefone) {
        this.telefone = telefone;
    }

    public int getQtdTelefone() {
        return qtdTelefone;
    }

    public void setQtdTelefone(int qtdTelefone) {
        this.qtdTelefone = qtdTelefone;
    }

    public Endereco[] getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco[] endereco) {
        this.endereco = endereco;
    }

    public int getQtdEndereco() {
        return qtdEndereco;
    }

    public void setQtdEndereco(int qtdEndereco) {
        this.qtdEndereco = qtdEndereco;
    }

    public Departamento[] getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento[] departamento) {
        this.departamento = departamento;
    }

    public int getQtdDepartamento() {
        return qtdDepartamento;
    }

    public void setQtdDepartamento(int qtdDepartamento) {
        this.qtdDepartamento = qtdDepartamento;
    }

    public Estoque[] getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque[] estoque) {
        this.estoque = estoque;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    public int getQtdFuncionario() {
        return qtdFuncionario;
    }

    public void setQtdFuncionario(int qtdFuncionario) {
        this.qtdFuncionario = qtdFuncionario;
    }
     
    
    
     
    
}
