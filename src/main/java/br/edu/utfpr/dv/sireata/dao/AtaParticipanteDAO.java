package br.edu.utfpr.dv.sireata.dao;
import br.edu.utfpr.dv.sireata.dao.Strategy.BuscarPorIdDAO;
import br.edu.utfpr.dv.sireata.dao.Strategy.CarregarObjetoDAO;
import br.edu.utfpr.dv.sireata.dao.Strategy.ExcluirDAO;
import br.edu.utfpr.dv.sireata.dao.Strategy.ListarPorAtaDAO;
import br.edu.utfpr.dv.sireata.dao.Strategy.SalvarDAO;
import br.edu.utfpr.dv.sireata.model.AtaParticipante;

//Toda classe está implementada na pasta ataParticipanteDAO.java
//Transformando os métodos em classes facilita a busca caso necessário alguma alteração de código

public class AtaParticipanteDAO extends Teste<AtaParticipante>{
	
    BuscarPorIdDAO<AtaParticipante> buscarPorIdDAO;
    CarregarObjetoDAO<AtaParticipante> carregarObjetoDAO;
    ExcluirDAO excluirDAO;
    ListarPorAtaDAO<AtaParticipante> listarPorAtaDAO;
    SalvarDAO<AtaParticipante> salvarDAO;
	
    public AtaParticipanteDAO(
	BuscarPorIdDAO<AtaParticipante> buscar,
        CarregarObjetoDAO<AtaParticipante> carregar,
        ExcluirDAO excluir,
        ListarPorAtaDAO<AtaParticipante> listar,
	SalvarDAO<AtaParticipante> salvar
     ){
        this.buscarPorIdDAO = buscar;
        this.carregarObjetoDAO = carregar;
        this.excluirDAO = excluir;
        this.listarPorAtaDAO = listar;
        this.salvarDAO = salvar;
    }

}
