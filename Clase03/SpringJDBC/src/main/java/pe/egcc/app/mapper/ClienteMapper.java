package pe.egcc.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pe.egcc.app.domain.Cliente;

public class ClienteMapper implements RowMapper<Cliente> {

	@Override
	public Cliente mapRow(ResultSet arg0, int arg1) throws SQLException {
		Cliente bean=new Cliente();
		bean.setCodigo("chr_cliecodigo");
		bean.setPaterno("vchr_cliepaterno");
		bean.setMaterno("vchr_cliematerno");
		bean.setNombre("vchr_clienombre");
		bean.setDni("chr_cliedni");
		bean.setCiudad("vchr_clieciudad");
		bean.setDireccion("vchr_cliedireccion");
		bean.setTelefono("vchr_clietelefono");
		bean.setEmail("vchr_clieemail");
		
		
		return bean;
	}

}
