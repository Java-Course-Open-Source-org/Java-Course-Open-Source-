public class Main {
    public static void main(String[] args) {
        
        // 1. Sintaxis básica y tipos de datos (int, String)
        String nombreHeroe = "Arthur";
        int hp = 100;
        int ataqueBase = 15;
        
        // Mensaje de bienvenida (Salida en consola)
        System.out.println("¡Bienvenido al Calabozo, " + nombreHeroe + "!");
        System.out.println("Tus Puntos de Vida (HP) son: " + hp);
        System.out.println("--------------------------------");
        
        System.out.println("¡Un Orco salvaje te ha golpeado por sorpresa!");
        
        // 2. Operadores y expresiones
        // Restamos 20 al HP actual
        hp = hp - 20; 
        
        System.out.println("¡Ouch! Tu vida bajó.");
        System.out.println("HP restante: " + hp);
        
        // Operación matemática simple
        int danoDoble = ataqueBase * 2;
        System.out.println("¡Contraatacas con un golpe crítico de " + danoDoble + " puntos!");
    }
}
