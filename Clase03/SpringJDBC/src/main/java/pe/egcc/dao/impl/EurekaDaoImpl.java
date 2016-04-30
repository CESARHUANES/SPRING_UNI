package pe.egcc.dao.impl;

import org.springframework.stereotype.Repository;

import pe.egcc.dao.especificacion.EurekaDaoEspec;



@Repository
public class EurekaDaoImpl extends AbstractDao implements EurekaDaoEspec {

	@Override
	public double getSaldoCuenta(String cuenta) {
		double saldo = 0;
		try {
			String sql = "select dec_cuensaldo from cuenta where chr_cuencodigo=?";
			Object[] paras = { cuenta };
			saldo = jdbcTemplate.queryForObject(sql, paras, Double.class);

		} catch (Exception e) {
			throw new RuntimeException("Cuenta no existe");
		}
		return saldo;
	}

}
