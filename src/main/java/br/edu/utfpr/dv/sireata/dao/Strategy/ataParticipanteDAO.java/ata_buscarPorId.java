package br.edu.utfpr.dv.sireata.dao.Strategy.ataParticipanteDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import br.edu.utfpr.dv.sireata.dao.ConnectionDAO;
import br.edu.utfpr.dv.sireata.dao.Strategy.BuscarPorIdDAO;
import br.edu.utfpr.dv.sireata.model.AtaParticipante;

public class ata_buscarPorId implements BuscarPorIdDAO<AtaParticipante> {
	@Override
    public Set<? extends AtaParticipante> buscarPorId(int value) throws SQLException{
   
	    AtaParticipanteCarregarObjetoDAO ataParticipanteCarregarObjeto;
	    ataParticipanteCarregarObjeto = new AtaParticipanteCarregarObjetoDAO();
	    
		try (
				Connection conn = ConnectionDAO.getInstance().getConnection();
				PreparedStatement stmt = conn.prepareStatement("SELECT ataparticipantes.*, usuarios.nome AS nomeParticipante FROM ataparticipantes " +
						"INNER JOIN usuarios ON usuarios.idUsuario=ataparticipantes.idUsuario " +
						"WHERE idAtaParticipante = ?");
			)
		{
			stmt.setInt(1, value);
			try(ResultSet rs = stmt.executeQuery();)
			{
				if(rs.next()){
					return (Set<? extends AtaParticipante>)ataParticipanteCarregarObjeto.carregarObjeto(rs);
				}else{
					return null;
				}
			}
		}
    }
}