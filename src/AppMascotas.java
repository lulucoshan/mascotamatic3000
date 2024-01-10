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
        //creamos las instancias de nuestras necesidades para el juego y la condicion de muerte
        Hambre hung = new Hambre();
        Entretenimiento jugar = new Entretenimiento();
        Higiene clean = new Higiene();
        Sueno sleep = new Sueno();
        Muerte deathobj = new Muerte();
        int opcionMascota;
        Scanner esc = new Scanner(System.in);
        opcionMascota = esc.nextInt();
        //seleccionamos nuestra mascota y de aqui el programa empieza el bucle de juego del perro o del gato
        switch (opcionMascota){
            case 1:
                dog.solicitarDatos();
                dog.imprimirDatos();
                int gameloopDog = 0;
                do{
                    System.out.println("selecciona lo que quieres hacer con tu perro");
                    System.out.println("[1].- Alimentar mascota");
                    System.out.println("[2].- jugar con tu mascota");
                    System.out.println("3].- baniar a tu mascota");
                    System.out.println("[4].- dormir");
                    System.out.println("[5].- salir");
                    gameloopDog = esc.nextInt();
                    //acciones que podemos hacer en el juego, nota:son las mismas para el gato
                    switch (gameloopDog){
                        case 1:
                            hung.nes_logica();
                            deathobj.nes_logica();
                            break;
                        case 2:
                            jugar.nes_logica();
                            deathobj.nes_logica();
                            break;
                        case 3:
                            clean.nes_logica();
                            deathobj.nes_logica();
                            break;
                        case 4:
                            sleep.nes_logica();
                            deathobj.nes_logica();
                            break;
                        case 5:
                            System.out.println("Saliendo del mascotamatic 3000 gracias por tu visita");
                            break;
                    }

                }while (gameloopDog != 5);
                return;
            case 2:
                cat.solicitarDatos();
                cat.imprimirDatos();
                int gameLoopCat = 0;
                while (gameLoopCat != 5){
                    System.out.println("selecciona lo que quieres hacer con tu gato");
                    System.out.println("[1].- Alimentar mascota");
                    System.out.println("[2].- jugar con tu mascota");
                    System.out.println("3].- baniar a tu mascota");
                    System.out.println("[4].- dormir");
                    System.out.println("[5].- salir");
                    gameLoopCat= esc.nextInt();
                    switch (gameLoopCat){
                        case 1:
                            hung.nes_logica();
                            deathobj.nes_logica();
                            break;
                        case 2:
                            jugar.nes_logica();
                            deathobj.nes_logica();
                            break;
                        case 3:
                            clean.nes_logica();
                            deathobj.nes_logica();
                            break;
                        case 4:
                            sleep.nes_logica();
                            deathobj.nes_logica();
                            break;
                        case 5:
                            System.out.println("Saliendo del mascotamatic 3000 gracias por tu visita");
                    }
                }
            default:
                System.out.println("selecciona una opcion porfavor");
        }
    }
}

