package pe.egcc.demo04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Control {



private Math math;

public int sumar(int n1,int n2){
	return math.sumar(n1, n2);
}

@Autowired
public void setMath(Math math) {
	this.math = math;
}




}
