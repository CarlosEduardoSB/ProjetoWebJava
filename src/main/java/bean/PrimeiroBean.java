package bean;

import javax.faces.bean.ManagedBean;

import entidade.Usuario;

@ManagedBean
public class PrimeiroBean {
	
	private Usuario usuario = new Usuario();
	
	public String cadastrar() {
		System.out.println("Cadastro realizado com sucesso!");
		System.out.println("Nome cadastrado : " + usuario.getNome());
		System.out.println("Email cadastrado : " + usuario.getEmail());
		System.out.println("CPF cadastrado : " + usuario.getCpf());
		System.out.println("Telefone cadastrado : " + usuario.getTelefone());
		System.out.println("Senha cadastrada : " + usuario.getSenha());
		return null;
		
	}

	public Usuario getUsuario () {
		return usuario;
	}
	
	public void setUsuario (Usuario usuario) {
			this.usuario = usuario;
	}
	
	
}
