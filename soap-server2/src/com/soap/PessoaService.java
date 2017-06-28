package com.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.bean.Pessoa;

	
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PessoaService {

	@WebMethod
	public boolean addPessoa(Pessoa p);
	
	@WebMethod
	public boolean deletePessoa(int id);
	
	@WebMethod
	public Pessoa getPessoa(int id);
	
	@WebMethod
	public Pessoa[] getAllPessoas();
}