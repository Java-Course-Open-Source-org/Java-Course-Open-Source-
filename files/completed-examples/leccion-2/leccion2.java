import java.util.Scanner; // Importar herramienta de entrada

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedimos datos al usuario
        System.out.print("Ingresa el nombre de tu héroe: ");
        String nombreHeroe = scanner.nextLine();
        
        int hp = 100;
        int hpMonstruo = 50;
        
        System.out.println("¡Un Orco aparece y comienza el combate!");
        
        // 1. Bucle while: Repetir mientras ambos estén vivos
        while (hp > 0 && hpMonstruo > 0) {
            System.out.println("\nTu HP: " + hp + " | HP Orco: " + hpMonstruo);
            System.out.println("¿Qué haces? (1 = Atacar, 2 = Huir): ");
            
            int opcion = scanner.nextInt();
            
            // 2. Estructuras condicionales if-else
            if (opcion == 1) {
                System.out.println("¡Atacas al Orco con tu espada!");
                hpMonstruo = hpMonstruo - 20;
                
                if (hpMonstruo > 0) {
                    System.out.println("¡El Orco contraataca!");
                    hp = hp - 15;
                }
            } else if (opcion == 2) {
                System.out.println("¡Huyes del combate como un cobarde!");
                break; // Rompe el bucle
            } else {
                System.out.println("Opción inválida. ¡Pierdes tu turno!");
            }
        }
        
        if (hp > 0 && hpMonstruo <= 0) {
            System.out.println("\n🏆 ¡Has derrotado al Orco, " + nombreHeroe + "!");
        }
    }
}
