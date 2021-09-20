package mygroup.myproject.model;

public class Cars {
   String firstcar;
   String secondcar;
public Cars() {}

public Cars(String firstcar, String secondcar) {
	super();
	this.firstcar = firstcar;
	this.secondcar = secondcar;
}

public String getFirstcar() {
	return firstcar;
}
public void setFirstcar(String firstcar) {
	this.firstcar = firstcar;
}
public String getSecondcar() {
	return secondcar;
}
public void setSecondcar(String secondcar) {
	this.secondcar = secondcar;
}
}
