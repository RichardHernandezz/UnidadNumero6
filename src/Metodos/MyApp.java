package Metodos;


import javax.swing.JOptionPane;

import ed.ito.ExcepcionDeListaLlena;
import ed.ito.ExcepcionDeListaVacia;
import ed.ito.ListaEstatica;
import ed.ito.ListaOrdenada;



	public class MyApp {
		static ListaOrdenada<Docente>[] hashTable;
	    static final int LIMITE = 150;

	    static void inicializa() {
	        hashTable = new ListaOrdenada[LIMITE];
	        for (int i = 0; i < LIMITE; i++) {
	            hashTable[i] = new ListaOrdenada<>();
	        }
	    }

	    static void agregaMaestro(Docente m) {
	        try {

	            hashTable[m.hashCodeYourCedula()].add(m);

	        } catch (Exception e) {

	        }
	    }

	    static void eliminarMaestro(Docente m) {
	        try {
	            hashTable[m.hashCodeYourCedula()].delete(m);
	        } catch (Exception e) {

	        }
	    }

	    static Docente buscaMaestro(int cedula) {
	        Docente m = null;
	        int i = 0;
	        ListaOrdenada<Docente> lista = hashTable[Docente.hashCode(cedula)];
	        try {
	            for (i = 0; i < lista.size(); i++) {
	                if (lista.getItem(i).getCedula() == cedula) {
	                    m = lista.getItem(i);
	                    break;
	                }
	            }
	        } catch (Exception e) {

	        }
	        return m;
	    }

	    static void imprimeTabla() {
	        try {
	            for (int i = 0; i < LIMITE; i++) {
	                ListaOrdenada<Docente> l = hashTable[i];
	                for (int j = 0; j < l.size(); j++) {
	                    System.out.println(l.getItem(j));
	                }
	            }
	        } catch (Exception e) {

	        }
	    }

	    static void run() {
	    	
	        inicializa();
	        Docente m = new Docente(890948, "MARIO", "DOCENTE", 1994, 1342.3f, "MAESTRO");
	        agregaMaestro(m);
	        m = new Docente(99789, "PEDRO", "DOCENTE", 2002, 2134.3f, "MAESTRO");
	        agregaMaestro(m);
	        m = new Docente(54695, "FERNANDA", "", 1992, 4134.3f, "SECRETARIO");
	        agregaMaestro(m);
	        m = new Docente(58769, "FERNANDO", "DOCENTE", 2000, 1434.3f, "MAESTRO");
	        agregaMaestro(m);
	        m = new Docente(2153659, "VANIA", "DOCENTE", 2003, 1634.3f, "MAESTRO");
	        agregaMaestro(m);
	        m = new Docente(763476328, "ROBERT", "DOCENTE", 1989, 8134.3f, "ADMINISTRADOR");
	        agregaMaestro(m);
	        m = new Docente(968273469, "AYLYN", "DOCENTE", 1997, 7134.3f, "COORDINADOR");
	        agregaMaestro(m);
	        m = new Docente(141229, "JALIL", "DOCENTE", 2002, 1234.3f, "ASESOR");
	        agregaMaestro(m);
	        m = new Docente(134263, "KARYNA", "DOCENTE", 2001, 8134.3f, "MAESTRO");
	        agregaMaestro(m);
	        m = new Docente(2789545, "MARIO", "DOCENTE", 2011, 1384.3f, "MAESTRO");
	        agregaMaestro(m);
	        m = new Docente(3998542, "RODRIGO", "DOCENTE", 2008, 1434.3f, "ASESOR");
	        agregaMaestro(m);
	        m = new Docente(7894561, "FELIPE", "DOCENTE", 2021, 3134.3f, "GERENTE");
	        agregaMaestro(m);
	        imprimeTabla();
	        
	       System.out.println("\n");
	       System.out.println(buscaMaestro(1234));

	    }
	    public static void main(String[] args) {
	    	run();
	    }
	}
	   /* public static void main(String[] args) throws ExcepcionDeListaLlena, ExcepcionDeListaVacia {
	    	ListaEstatica<Integer> l = new ListaEstatica<>(150);
	    	int a, b = 0;
			do {
				a = Integer.parseInt(
						JOptionPane.showInputDialog("ESCOGA UNA DE LAS SIGUIENTES OPCIONES: \n" 
								+ "1.-Ingresar un nuevo docente. \n"
								+ "2.-Buscar un docente. \n" + "3.-Mostrar el ultimo elemento de la lista. \n"
								+ "4.-Eliminar un docente. \n"
								+ "5.-Imprimir docentes. \n"
								+ "6.-Salir."));

				switch (a) {
				
	 //       run();
				case 1:
					b = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un docente "));
					l.add(b);
					JOptionPane.showMessageDialog(null,"¡El elemento se ha guardado con exito! \n");
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Eliminar un docente " + l.deleteFirst());
					JOptionPane.showMessageDialog(null,"¡El docente se ha eliminado con exito! \n");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Ultimo elemento de la lista: " + l.last());
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Cantidad de elemento contenidos: " + l.size());
					break;
				case 5:
					b = Integer.parseInt(JOptionPane.showInputDialog("¡El primer elemento de la lista fue eliminado!"));
					l.search(b);
					JOptionPane.showMessageDialog(null,"Cantidad de elemento contenidos: "+b);
					
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Salida");

					break;
				default:
					JOptionPane.showMessageDialog(null, "La opcion que has ingresado es invalida");
					break;

				}
				} while (a != 7);
		}

					
				}*/
			
	   
	
	
	    

