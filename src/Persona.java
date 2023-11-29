
public class Persona {
  private String nombre;
  private String apellidos;
  private int edad;
  
  public Persona(String nombre,String apellidos, int edad)
  {
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;
  }
  public int Cumpleaños() {
    edad=edad+1;
    return edad;
  }
  public void DatosPersona() {
    System.out.println("El nombre de la persona es "+nombre);
    System.out.println("Los apellidos de la persona son "+apellidos);
    System.out.println("La edad de la persona es "+edad);
  }
}
