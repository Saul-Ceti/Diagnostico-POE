/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagnostico;

public class Avion{
    int numerodeasientos;
    int vuelosrealizados;
    int antiguedad;
    String id;
    String aerolinea;
     
    public void setNumeroDeAsientos(int _numerodeasientos){
        numerodeasientos = _numerodeasientos;        
    }
    public void setVuelosRelizados(int _vuelosrealizados){
        vuelosrealizados = _vuelosrealizados;        
    }
    public void setAntiguedad(int _antiguedad){
        antiguedad = _antiguedad;        
    }
    public void setId(String _id){
        id = _id;        
    }
    public void setAerolinea(String _aerolinea){
        aerolinea = _aerolinea;        
    }
    
    public int getNumeroDeAsientos(){
        return numerodeasientos;
    }
    public int getVuelosRelizados(){
        return vuelosrealizados;
    }
    public int getAntiguedad(){
        return antiguedad;
    }
    public String getId(){
        return id;
    }
    public String getAerolinea(){
        return aerolinea;
    }
}

