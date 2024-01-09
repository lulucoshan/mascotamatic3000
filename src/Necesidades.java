public abstract class Necesidades{
    public int muerte;
    public int valorHambre;
    public int valorSueno;
    public int valorHigiene;
    public int valorEntretenimiento;

    Necesidades(){
        muerte = 0;
        valorHambre = 5;
        valorSueno = 5;
        valorHigiene = 5;
        valorEntretenimiento = 5;
    }
    public abstract void nes_logica();
}

class Hambre extends Necesidades{
public void nes_logica(){
    if(valorHambre == 10){
        System.out.println("tu mascota esta llena");
    }else{
        valorHambre ++;
        valorHigiene --;
        System.out.println("tu mascota comio");
        System.out.println("hambre: "+ valorHambre+ " sueno: "+ valorSueno + " higiene: "+ valorHigiene+
                "entretenimiento:"+ valorEntretenimiento);
    }
}
}

class Sueno extends Necesidades{
public void nes_logica(){
    if(valorSueno == 10){
        System.out.println("tu mascota esta totalmente descanzada");
    }else{
        valorSueno ++;
        valorHigiene --;
        System.out.println("tu mascota ah dormido");
        System.out.println("hambre: "+ valorHambre+ " sueno: "+ valorSueno + " higiene: "+ valorHigiene+
                "entretenimiento:"+ valorEntretenimiento);
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
                    "entretenimiento:"+ valorEntretenimiento);
        }
    }

}

class Entretenimiento extends Necesidades{
    public void nes_logica(){
        if(valorEntretenimiento == 10){
            System.out.println("tu mascota no esta aburrida");
        }else {
            valorEntretenimiento ++;
            valorHigiene--;
            System.out.println("jugaste en el parque con tu mascota");
            System.out.println("hambre: "+ valorHambre+ " sueno: "+ valorSueno + " higiene: "+ valorHigiene+
                    "entretenimiento:"+ valorEntretenimiento);
        }
    }
}