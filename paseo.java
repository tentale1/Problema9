import java.util.Scanner;

/**
 * Programa para hallar la capacidad calorica
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class paseo
{
    public static void main(String[] args)
    {
        double capb=60,estfl,estgo,sfl=1,sgo=2,costpc=10000,cgo=5,cfl=3,caph=4,costph=25000,dpas; 
        double sillb,cantb,cantp,costtc,canth,costtphd,costtphv;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Cuantos días durará el paseo?");
        dpas = Teclado.nextDouble();
        
        System.out.println("Este bus tiene capacidad para 60 personas, favor hubicarse comodamente");
                
        System.out.println("Cuantos estudiantes gordos hay?");
        estgo = Teclado.nextDouble();
        
        System.out.println("Cuantos estudiantes flacos hay?");
        estfl = Teclado.nextDouble();
        
        sillb = (estfl*sfl)+(estgo*sgo) ; //sillas utilizadas bus
        cantb = Math.ceil(sillb/capb); //cantidad de buses
        cantp = ((estfl*cfl)+(estgo*cgo))*dpas; // cantidad de platos en todo el paseo
        costtc = cantp*costpc; // costo total de todos los platos en todo el paseo
        canth = Math.ceil((estfl+estgo)/caph); // cantidad de habitaciones
        costtphd = canth*costph; // costo de habitación al día
        costtphv = costtphd*dpas; // costo de las habitaciones para todo el paseo
                       
        System.out.println("El numero de buses necesarios en en cada vuelta son " + cantb);
        System.out.println("La cantidad de platos de comida que se servira es " + cantp);
        System.out.println("El costo total de todos los platos de comida en el paseo es " + "$" + costtc + " CoP");
        System.out.println("El número total de habitaciones necesarias es de " + canth);
        System.out.println("Todas las habitaciones al día tendrán un costo de " + "$" + costtphd + " CoP");
        System.out.println("El costo total de las habitaciones para todo el paseo es de " + "$" + costtphv + " CoP");
    }
}
