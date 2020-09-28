package br.edu.utfpr.dv.sireata.dao.Strategy.ataParticipanteDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import br.edu.utfpr.dv.sireata.dao.ConnectionDAO;
import br.edu.utfpr.dv.sireata.dao.Strategy.ExcluirDAO;

public class ata_excluir implements ExcluirDAO {
	@Override
    public void excluir(int value) throws SQLException{
	   try(
				Connection conn = ConnectionDAO.getInstance().getConnection();
				Statement stmt = conn.createStatement();
			)
		{
			stmt.execute("DELETE FROM ataparticipantes WHERE idAtaParticipante=" + String.valueOf(value));
		}
    }
}   