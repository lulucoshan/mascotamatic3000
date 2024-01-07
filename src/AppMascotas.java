import java.util.Scanner;

public class AppMascotas{
    public static void main(String[] args){
        Perro dog = new Perro();
        Gato cat = new Gato();
        String titulo = " ##   ##    ##       ####     ####    ####    #######    ##     ##   ##    ##     #######   ####      ####            ##  ##    ####     ####     ####   \n" +
                " #######   ####     ##  ##   ##  ##  ##  ##     ##      ####    #######   ####      ##       ##      ##  ##           ##  ##   ##  ##   ##  ##   ##  ##  \n" +
                " #######   ## ##   ##       ##       ##   ##    ##      ## ##   #######   ## ##     ##       ##     ##                ##  ##   ##  ##   ##  ##   ##  ##  \n" +
                " ## # ##  ##   ##   #####   ##       ##   ##    ##     ##   ##  ## # ##  ##   ##    ##       ##     ##                ##  ##   ##  ##   ##  ##   ##  ##  \n" +
                " ##   ##  #######       ##  ##   ##  ##   ##    ##     #######  ##   ##  #######    ##       ##     ##   ##           ######   ##  ##   ##  ##   ##  ##  \n" +
                " ##   ##  ##   ##  ##   ##  ##  ##   ##   ##    ##     ##   ##  ##   ##  ##   ##    ##       ##     ##  ##                ##   ##  ##   ##  ##   ##  ##  \n" +
                " ##   ##  ##   ##   #####    ####     #####     ##     ##   ##  ##   ##  ##   ##    ##      ####     ####                 ##    ####     ####     ####   \n" +
                "                                                                                                                                                         \n";
        System.out.println(titulo);
        System.out.println("bienvenido al mascotamatic 4000!!!");
        System.out.println("selecciona tu mascota!! 1.-perro 2.-gato");
        int opcionMascota;
        Scanner esc = new Scanner(System.in);
        opcionMascota = esc.nextInt();
        switch (opcionMascota){
            case 1:
                dog.solicitarDatos();
                dog.imprimirDatos();
                int gameloopDog = 0;
                while (gameloopDog != 6){
                    System.out.println("selecciona lo que quieres hacer con tu perro");
                    gameloopDog ++;
                }
                return;
            case 2:
                cat.solicitarDatos();
                cat.imprimirDatos();
                int gameLoopCat = 0;
                while (gameLoopCat != 6){
                    System.out.println("selecciona lo que quieres hacer con tu perro");
                    gameLoopCat ++;
                }
                return;
        }
    }
}

