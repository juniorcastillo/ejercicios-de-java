/**

* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
   y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
   oportunidades quedan y si el número introducido es menor o mayor que el número secreto.

*  junior castillo
**/

public class EjercicioAleatorio6 {
    
  public static void main(String[] args) {
  
    int alturapiramide=8;
    int numSecreto=0;
    int numIntro;
    int oportunidades;
          
    numSecreto = (int)(Math.random()* 101);
    
    for( oportunidades = 5; oportunidades > 0; oportunidades--) {
      
      
     
      System.out.println("adivina cual es el numero: " );
      numIntro = Integer.parseInt(System.console().readLine());
   
      if ( numIntro == numSecreto) {
        
            System.out.println("felicidades , adivinaste" );
            oportunidades= 0;
      }     else {
              System.out.println("oportunidades--> " + oportunidades); 
            } 
            
            
      if ( numIntro > numSecreto)  {
             System.out.println ( "El numero introduccido es mayor  que el numero secreto "); 
      }   
      if ( numIntro < numSecreto){
               System.out.println("El numero es menor que el numero secreto");
   
            }
    }
    
    if ( oportunidades  < 1 ){ 
      System.out.println("El numero secreto es " + numSecreto);
    }
         
           
  }
}
