package Productos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Claseejecutable_Productos {
	static int num;
	static Scanner sc = new Scanner(System.in);
	static Productos[] listProd= new Productos[100];
	
	static Productos p = new Productos();
	static int nProd = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		functionSwitch();
	}
	public static void functionMenu() {
		do {
			System.out.println("Teclee la opción que desee." + "\n1-Introducir nuevo producto.\n2-Visualizar productos."
			        + "\n3-Guardar en archivo de texto.\n4-Leer archivo de texto con productos guardados.\n5-Salir.");
			num=sc.nextInt();
		}while(num<0 || num>5);
	}
	public static void functionSwitch() throws IOException{
		functionMenu();
		
		do {
			switch(num) {
			case 1:
			
                introducirProds();
                functionMenu();

             break;                         
             case 2:

                 visualizarProds();
                 functionMenu();

             break;  
             case 3:
                 guardaProds();
                 functionMenu();

             break;
             case 4:

                 leeProds();
                 functionMenu();

             break;                    
			}
		}while(num !=5);
		
}
	
	public static void introducirProds() {
		int cierreWhile = 0;
		while(nProd<listProd.length && cierreWhile != 1){
            Productos p = new Productos();
            
            System.out.println("Introduzca las variables del nuevo producto."); 
            System.out.println("Código:");      p.setCodigo(sc.nextInt()); 
            System.out.println("Nombre:");      p.setDescripcion(sc.next()); 
            System.out.println("Peso:");        p.setPeso(sc.nextFloat()); 

            System.out.println("¿Quiere dejar de introducir productos? teclee: 1 = si ,0 = no.");
            cierreWhile = sc.nextInt();

            listProd[nProd]= p ;   
            nProd++;

            if(nProd==listProd.length){
                System.out.println("Almacenamiento lleno.");}
	}
	}
	
	  public static void visualizarProds(){
          System.out.println("Productos introducidos en esta sesión: ");
              for(int i=0;i<nProd;i++)
                  System.out.println("Producto "+ listProd[i].getDescripcion() +"; con código: "
                      + listProd[i].getCodigo()+"; y peso: "+ listProd[i].getPeso()+" .");
      }
	  
	  public static void guardaProds() throws IOException{
          System.out.println("Guardando los productos en: Productos.txt");

          File nombreFichero = new File("Productos.txt");
          FileWriter fw = new FileWriter(nombreFichero,true);       
          BufferedWriter bw = new BufferedWriter(fw);        
          PrintWriter pw = new PrintWriter(bw);

          listProd[nProd] = p;

              for (int nProd = 0; nProd < listProd.length; nProd++) {
                  pw.println(p.getCodigo());
                  pw.println(p.getDescripcion());
                  pw.println(p.getPeso());

                      pw.close();
              }
      }
	  public static void leeProds(){
          System.out.println("Estoy dentro del case 4");

      }  
	
	
	
	
}
