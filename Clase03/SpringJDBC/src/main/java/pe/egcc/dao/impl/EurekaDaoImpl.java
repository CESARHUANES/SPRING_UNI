package pe.egcc.dao.impl;

import org.springframework.stereotype.Repository;

import pe.egcc.dao.especificacion.EurekaDaoEspec;
@Repository
public class EurekaDaoImpl extends AbstractDao implements EurekaDaoEspec {

	@Override
	public double getSaldoCuenta(String cuenta) {
		String sql="selectc dec_cuensaldo"
				+"from  cuenta where chr_cuencodigo=?";
		Object[] paras={cuenta};
		double saldo= jdbcTemplate.queryForObject(sql, paras,Double.class);
		return saldo;
	}

}
