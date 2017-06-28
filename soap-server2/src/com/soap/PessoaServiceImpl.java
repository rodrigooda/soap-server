package com.soap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

import com.bean.Pessoa;


@WebService(endpointInterface = "com.soap.PessoaService")  
public class PessoaServiceImpl implements PessoaService {

	private static Map<Integer,Pessoa> Pessoas = new HashMap<Integer,Pessoa>();
	
	@Override
	public boolean addPessoa(Pessoa p) {
		if(Pessoas.get(p.getId()) != null) return false;
		Pessoas.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deletePessoa(int id) {
		if(Pessoas.get(id) == null) return false;
		Pessoas.remove(id);
		return true;
	}

	@Override
	public Pessoa getPessoa(int id) {
		return Pessoas.get(id);
	}

	@Override
	public Pessoa[] getAllPessoas() {
		Set<Integer> ids = Pessoas.keySet();
		Pessoa[] p = new Pessoa[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = Pessoas.get(id);
			i++;
		}
		return p;
	}

}