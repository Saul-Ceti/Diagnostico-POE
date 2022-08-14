package diagnostico;
import java.util.Scanner;

/*Saúl Hernández - 21310395*/
public class Diagnostico{ 
    public static void main(String[] args) {        
        int opcion;
        int opcionsubmenu;
        Scanner entrada = new Scanner(System.in);        
        
        do{
            //MENU PRINCIPAL
            System.out.println("Menu de opciones///////////////////: ");
            System.out.println("1. Piloto ");
            System.out.println("2. Avion ");
            System.out.println("3. Salir ");
            opcion = entrada.nextInt();
            Piloto Piloto1 = new Piloto();   
            Avion Avion1 = new Avion();
            
            switch (opcion) {
                case 1:
                    do{                                                
                        System.out.println("Opciones piloto///////////////////: ");
                        System.out.println("1. Registrar ");
                        System.out.println("2. Imprimir ");
                        System.out.println("3. Regresar ");
                        opcionsubmenu = entrada.nextInt();
                        
                        switch (opcionsubmenu) {
                            case 1:
                                String nombre;
                                String nacionalidad;
                                int edad;
                                int tiempodevuelo;
                                String aerolinea;                                
                                
                                System.out.println("Registrando piloto+++++++++++++: ");
                                System.out.println("Nombre: ");
                                nombre = entrada.nextLine();
                                
                                System.out.println("Nacionalidad: ");
                                nacionalidad = entrada.nextLine();
                                
                                System.out.println("Edad: ");
                                edad = entrada.nextInt();
                                
                                System.out.println("Tiempo de vuelo: ");
                                tiempodevuelo = entrada.nextInt();
                                
                                System.out.println("Aerolinea: ");
                                aerolinea = entrada.nextLine();
                                
                                Piloto1.setPiloto(nombre, nacionalidad, edad, tiempodevuelo, aerolinea);
                                
                                break;
                            case 2:
                                System.out.println("Imprimir piloto///////////////////: ");          
                                System.out.println("Datos del piloto------------------/ ");
                                System.out.println("Nombre: " + Piloto1.getNombre());
                                System.out.println("Nacionalidad: " + Piloto1.getNacionalidad());
                                System.out.println("Edad: " + Piloto1.getEdad() + " años");
                                System.out.println("Tiempo de vuelo: " + Piloto1.getTiempoDeVuelo() + " horas de vuelo");
                                System.out.println("Aerolinea: " + Piloto1.getAerolinea());
                                
                                break;
                            case 3:
                                System.out.println("Regresando al menu////////////////: ");
                                break;
                        }
                    }while(opcionsubmenu != 3);
                    break;
                
                case 2:
                    do{                                                
                        System.out.println("Opciones piloto///////////////////: ");
                        System.out.println("1. Registrar ");
                        System.out.println("2. Imprimir ");
                        System.out.println("3. Regresar ");
                        opcionsubmenu = entrada.nextInt();
                        
                        switch (opcionsubmenu) {
                            case 1:
                                int numerodeasientos;
                                int vuelosrealizados;
                                int antiguedad;
                                String id;
                                String aerolinea;
                                
                                System.out.println("Registrando avion++++++++++++++: ");
                                System.out.println("Numero de asientos: ");
                                numerodeasientos = entrada.nextInt();
                                Avion1.setNumeroDeAsientos(numerodeasientos);
                                
                                System.out.println("Vuelos realizados: ");
                                vuelosrealizados = entrada.nextInt();
                                Avion1.setVuelosRelizados(vuelosrealizados);
                                
                                System.out.println("Antiguedad: ");
                                antiguedad = entrada.nextInt();
                                Avion1.setAntiguedad(antiguedad);
                                
                                System.out.println("Id: ");
                                id = entrada.nextLine();
                                Avion1.setId(id);
                                                                
                                System.out.println("Aerolinea: ");
                                aerolinea = entrada.nextLine();
                                Avion1.setAerolinea(aerolinea);                                                                
                                
                                break;
                            case 2:
                                System.out.println("Imprimir avion/////////////////////: ");          
                                System.out.println("Datos del avion--------------------/ ");
                                System.out.println("Numero de asientos: " + Avion1.getNumeroDeAsientos() + " asientos");
                                System.out.println("Vuelos realizados: " + Avion1.getVuelosRelizados() + " viajes terminados");
                                System.out.println("Antiguedad: " + Avion1.getAntiguedad() + " años en funcionamiento");
                                System.out.println("Id: " + Avion1.getId());
                                System.out.println("Aerolinea: " + Avion1.getAerolinea());
                                
                                break;
                            case 3:
                                System.out.println("Regresando al menu////////////////: ");
                                break;
                        }
                    }while(opcionsubmenu != 3);                    
                    break;
                
                case 3:
                    
                    break;
            }
                
        }while(opcion != 3);      
    }
}
    

    


