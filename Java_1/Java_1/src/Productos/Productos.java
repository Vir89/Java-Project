package Productos;

public class Productos {
	//Atributos
	private int codigo;
	private String descripcion;
	private double peso;
	
	
	//Métodos
	 public Productos(int codigo, String descripcion, double peso) {
		 this.codigo=codigo;
		 this.descripcion=descripcion;
		 this.peso=peso; 
	 }
	 
	 public Productos() {
		 this.codigo=0;
		 this.descripcion=descripcion;
		 this.peso=0;
	 }
	 
	 public int getCodigo() {
		 return codigo;
	 }
	 
	 public void setCodigo(int codigo) {
		 this.codigo=codigo;
	 }
	 
	 public String getDescripcion() {
		 return descripcion;
	 }
	 
	 public void setDescripcion(String descripcion) {
		 this.descripcion=descripcion;
	 }
	 
	 public double getPeso() {
		 return peso;
	 }
	 
	 public void setPeso(double peso) {
		 this.peso=peso;
	 }	

}
