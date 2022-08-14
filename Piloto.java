package diagnostico;

public class Piloto extends Trabajador{
    int tiempodevuelo;
    String aerolinea;
     
    public void setPiloto(String _nombre, String _nacionalidad, int _edad, int _tiempodevuelo, String _aerolinea){
        nombre = _nombre;
        nacionalidad = _nacionalidad;
        edad = _edad;
        tiempodevuelo = _tiempodevuelo;
        aerolinea = _aerolinea;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public int getEdad(){
        return edad;
    }
    public int getTiempoDeVuelo(){
        return tiempodevuelo;
    }
    public String getAerolinea(){
        return aerolinea;
    }
}
