// EL PROGRAMA NO HIZO EL CAMBIO A ARRAYLIST, SE MANTUVO UNICAMENTE CON ARREGLOS DE 10
// *****
// *****
import java.util.Scanner;
public class PrincipalPrograma {

    public static void main(String[] args) {
    	
        int ctrl = 0;
        Scanner leer = new Scanner(System.in);
      
        Object publicacion [] = new Object[10]; 
        int opc = 0;
        do {
	        System.out.println("_-_- PUBLICACIONES BY OLIVERSSV -_-_");
	        System.out.println("(1) DAR DE ALTA UNA PUBLICACION");
	        System.out.println("(2) CONSULTAR");
	        System.out.println("(3) SALIR");
	        System.out.print("INGRESA LO QUE DESEA HACER: ");
	        opc = leer.nextInt();
	        
	        switch (opc) {
	        case 1:
	        	int sel = 0;
	        	System.out.println();
	        	System.out.println("------ DAR DE ALTA ------");
	        	System.out.println("(1) LIBRO");
	        	System.out.println("(2) PERIODICO");
	        	System.out.println("(3) REVISTA");
	        	System.out.print("SELECCIONE LA PUBLICACION QUE DESEA DAR DE ALTA: ");
	        	sel = leer.nextInt();
	        	if(sel == 1) {
	        		System.out.println("------ LIBRO ------");
	        		LibroPublicacion libro = new LibroPublicacion();
	        		leer.nextLine();
               System.out.println("FAVOR DE INGRESAR: ");
	        		System.out.println("TITULO DEL LIBRO: ");
	        		libro.setTitulo(leer.nextLine());
               
	        		System.out.println("PRECIO DEL LIBRO: ");
	        		libro.setPrecio(leer.nextDouble());
               
	        		System.out.println("NUMERO DE PAGINAS DEL LIBRO: ");
	        		libro.setNumpag(leer.nextInt());
               
	        		System.out.println("ISBN DEL LIBRO: ");
	        		leer.nextLine();
	        		libro.setISBN(leer.nextLine());
               
	        		System.out.println("EDICION DEL LIBRO: ");
	        		libro.setEdicion(leer.nextLine());
               
	        		System.out.println("AUTOR DEL LIBRO: ");
	        		libro.setAutor(leer.nextLine());
	        		publicacion[ctrl] = libro;
	        		ctrl++;
	        		
	        	}
	        	else if(sel == 2) {
	        		System.out.println();
	        		System.out.println("------ PERIODICO ------");
	        		leer.nextLine();
               
	        		Peri periodico = new Peri();
               
               System.out.println("FAVOR DE INGRESAR: ");
	        		System.out.println("TITULO DEL PERIODICO: ");
	        		periodico.setTitulo(leer.nextLine());
               
	        		System.out.println("PRECIO DEL PERIODICO: ");
	        		periodico.setPrecio(leer.nextDouble());
               
	        		System.out.println("NUMERO DE PAGINAS DEL PERIODICO: ");
	        		periodico.setNumpag(leer.nextInt());
	        		leer.nextLine();
               
	        		System.out.println("SECCIONES DEL PERIODICO: ");
	        		periodico.setSecciones(leer.nextLine());
               
	        		System.out.println("EDITOR DEL PERIODICO: ");
	        		periodico.setEditor(leer.nextLine());
	        		publicacion[ctrl] = periodico;
	        		ctrl++;
	        	}
	        	else if (sel == 3) {
               System.out.println();
               System.out.println("------ REVISTA ------");
	        		Rev revista = new Rev();
	        		leer.nextLine();
               
               System.out.println("POR FAVOR INGRESA: ");
	        		System.out.println("EL ISSN: ");
	        		revista.setISSN(leer.nextLine());
               
	        		System.out.println("EL TITULO DE LA REVISTA: ");
	        		revista.setTitulo(leer.nextLine());
               
	        		System.out.println("EL PRECIO DE LA REVISTA: ");
	        		revista.setPrecio(leer.nextDouble());
               
	        		System.out.println("EL NUMERO DE LA REVISTA : ");
	        		revista.setNumero(leer.nextInt());
               
	        		System.out.println("EL ANO DE LA REVISTA: ");
	        		revista.setAno(leer.nextInt());
               
	        		System.out.println("EL NUMERO DE PAGINAS DE LA REVISTA: ");
	        		revista.setNumpag(leer.nextInt());
	        		publicacion[ctrl] = revista;
	                ctrl++;
	        	}
	        	
	    	break;
	    	
	        case 2:
	        	for(int i = 0; i < ctrl; i ++ ){
	                
                   
	                if(publicacion[i] instanceof Rev){
		                Rev rev = new Rev();
		                rev = (Rev)publicacion[i];
		                System.out.println();
		                System.out.println("----REVISTA----");
		                System.out.println("TITULO: " + rev.getTitulo());
		                System.out.println("ISSN: " + rev.getISSN());
	                  
	                }
	                else if(publicacion[i] instanceof Peri) {
	                	Peri per = new Peri();
	                	per = (Peri)publicacion[i];
	                	System.out.println();
	                	System.out.println("======PERIODICO=====");
	                	System.out.println(" TITULO: " + per.getTitulo());
		                System.out.println(" SECCIONES: " + per.getSecciones());
	                }
	                else if (publicacion [i] instanceof LibroPublicacion ){
		                LibroPublicacion lib = new LibroPublicacion();
		                lib = (LibroPublicacion)publicacion[i];
		                System.out.println();
		                System.out.println("======LIBRO======");
		                System.out.println("TITULO: " + lib.getTitulo());
		                System.out.println("ISBN: " + lib.getISBN());
                   }
	          }
        	break;
        	
	        case 3:
	        	System.out.println(" GRACIAS POR USAR MI PROGRAMA ");
        	break;
        	
        	default:
        		System.out.println(" ERROR VALOR NO ESTA EN RANGO ");
    		break;
	        }
        }while(opc != 3);
        
        
        
        
        
     }
   }