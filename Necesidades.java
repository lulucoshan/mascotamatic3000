public abstract class Necesidades{
    //delcaracion de nuestras variables
    public int muerte;
    public int valorHambre;
    public int valorSueno;
    public int valorHigiene;
    public int valorEntretenimiento;

    //inicializacion de las variables.
    Necesidades(){
        muerte = 0;
        valorHambre = 5;
        valorSueno = 5;
        valorHigiene = 5;
        valorEntretenimiento = 5;
    }
    public abstract void nes_logica();
}
//declaracion de los metodos para aumentar y bajar las necesidades hambre suenio entretenimiento y higiene de la mascota
class Hambre extends Necesidades{
public void nes_logica(){
    if(valorHambre == 10){
        System.out.println("tu mascota esta llena");
    }else{
        valorHambre ++;
        valorHigiene --;
        System.out.println("tu mascota comio");
        System.out.println("hambre: "+ valorHambre+ " sueno: "+ valorSueno + " higiene: "+ valorHigiene+
                " entretenimiento:"+ valorEntretenimiento);
    }
}
}

class Sueno extends Necesidades{
public void nes_logica(){
    if(valorSueno == 10){
        System.out.println("tu mascota esta totalmente descanzada");
    }else{
        valorSueno ++;
        valorHambre --;
        valorEntretenimiento --;
        System.out.println("tu mascota ah dormido");
        System.out.println("hambre: "+ valorHambre+ " sueno: "+ valorSueno + " higiene: "+ valorHigiene+
                " entretenimiento:"+ valorEntretenimiento);
    }
}
}

class Higiene extends Necesidades{
    public void nes_logica(){
        if(valorHigiene == 10){
            System.out.println("tu mascota esta limpia");
        }else{
            valorHigiene ++;
            valorEntretenimiento --;
            System.out.println("tu mascota esta bañada");
            System.out.println("hambre: "+ valorHambre+ " sueno: "+ valorSueno + " higiene: "+ valorHigiene+
                    " entretenimiento:"+ valorEntretenimiento);
        }
    }

}

class Entretenimiento extends Necesidades{
    public void nes_logica(){
        if(valorEntretenimiento == 10){
            System.out.println("tu mascota no esta aburrida");
        }
        else{
            System.out.println("tu mascota jugo mucho tiempo contigo");
            System.out.println("hambre: "+ valorHambre+ " sueno: "+ valorSueno + " higiene: "+ valorHigiene+
                    " entretenimiento:"+ valorEntretenimiento);
            valorEntretenimiento ++;
            valorHigiene --;
            valorSueno --;
        }
    }
}

//nota: la muerte no funciona y no tengo idea de porque
//TODO arreglar esta funcion
class Muerte extends Necesidades{
    public void nes_logica(){
        if (valorEntretenimiento == 0 || valorHambre == 0 || valorHigiene == 0 || valorSueno == 0){
            System.out.println("tu mascota a muerto");
            System.out.println("fin del juego :(");
            System.exit(0);
        }
    }
}