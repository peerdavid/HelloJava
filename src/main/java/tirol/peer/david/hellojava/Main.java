package tirol.peer.david.hellojava;

/**
 * Created by david on 03.10.15.
 * Example project for continuous integration with:
 * Java, Gradle, GitHub, Dockerhub, CircleCi etc.
 */
public class Main {

   /**
    * Hello World
    * @param args - No Arguments required
    */
   public static void main(String[] args){
      Math math = new Math();
      int x = math.add(7, 9);

      System.out.println("Hello World = " + x);
   }
}
