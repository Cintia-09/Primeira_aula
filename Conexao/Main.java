package Conexao;


import Conexao.ConexaoSqlite;
import Conexao.CrudCliente;
import java.sql.Statement;
import java.sql.SQLException;

public class Main{
    public static void main(String args[])throws Exception{
        ConexaoSqlite conexao = new ConexaoSqlite();
        conexao.abrirConexao();
        CrudCliente crud = new CrudCliente(conexao.getConnection());
        
        //Inserindo cadastros no banco
        //crud.create(1234567891, "Cintia Vasconcelos");
        //crud.create(1234,1234567891);
        //crud.create(4321,1234567890);
        //crud.create(4321,123456783);
        //crud.create(123456789, "Larissa Alves");
        //crud.create(1234567834, "Rebeca Sousa");

        //Consultando uma linha no banco 
        //crud.read(123456789);
        
        
        //Alterando um registro no banco
        //crud.update(123456789, "Cintia Sousa");
        
        //Deletando um registro no banco
        //crud.delete(1234567834);
        
        
        //boolean resposta;
        //resposta = crud.create(123456789, "Cintia de Sousa Barros");
        //System.out.println(resposta);
    
        
        
        conexao.fecharConexao();     
        
        
    }
}