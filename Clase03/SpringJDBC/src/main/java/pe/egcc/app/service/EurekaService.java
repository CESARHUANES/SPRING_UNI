package pe.egcc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.egcc.dao.especificacion.EurekaDaoEspec;

@Service
public class EurekaService {
@Autowired	
private EurekaDaoEspec eurekaDaoEspec;
public double getSaldoCuenta(String cuenta){
return eurekaDaoEspec.getSaldoCuenta(cuenta);
}
}
