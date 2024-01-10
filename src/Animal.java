import java.util.Scanner;
public abstract class Animal {
    public String nombreMascota;
    public String nombrePropietario;

    public abstract void solicitarDatos();
    public abstract void imprimirDatos();
    public abstract void sonidoAnimal();
}
// la clase se encarga de darle nombre al animal ademas de asignarle un sonido en esta caso woof woof y para el gato
//miau miau virtualmente son similares
class Perro extends Animal{
    public void sonidoAnimal(){
        System.out.println("woof woof!");
    }
    public void solicitarDatos(){
        Scanner lec = new Scanner(System.in);
        System.out.println("cual es tu nombre?");
        nombrePropietario = lec.next();
        System.out.println("oh un perro ah aparecido!");
        System.out.println("cual es el nombre del perro?");
        nombreMascota = lec.next();
    }
    public void imprimirDatos() {
        System.out.println("hola " + nombrePropietario + " ahora eres el propietario de: " + nombreMascota);
        System.out.println("cuida a tu perro muy bien, o morira!!!!");
    }

}

class Gato extends Animal{
    public void sonidoAnimal(){
        System.out.println("meow meow");
    }
    public void solicitarDatos(){
        Scanner lec = new Scanner(System.in);
        System.out.println("cual es tu nombre?");
        nombrePropietario = lec.next();
        System.out.println("oh un gato ah aparecido!");
        System.out.println("cual es el nombre de tu gato?");
        nombreMascota = lec.next();
    }

    public void imprimirDatos() {
        System.out.println("hola " + nombrePropietario + " ahora eres el propietario de: " + nombreMascota);
        System.out.println("cuida a tu gato muy bien, o morira!!!!");
    }

}