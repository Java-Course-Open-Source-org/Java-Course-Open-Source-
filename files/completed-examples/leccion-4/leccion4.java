// 1. Creación de una clase (El "molde")
class Personaje {
    // Encapsulación: atributos privados
    private String nombre;
    private int hp;
    
    // Constructor
    public Personaje(String nombre, int hp) {
        this.nombre = nombre;
        this.hp = hp;
    }
    
    // Getters para poder leer los datos protegidos
    public String getNombre() { return nombre; }
    public int getHp() { return hp; }
    
    // 2. Métodos (comportamientos)
    public void recibirDano(int cantidad) {
        this.hp = this.hp - cantidad;
        if (this.hp < 0) {
            this.hp = 0; // Nunca bajará de cero
        }
        System.out.println(this.nombre + " recibe " + cantidad + " de daño.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        // 3. Instanciación: Creamos los objetos a partir de la clase
        Personaje heroe = new Personaje("Arthur", 100);
        Personaje monstruo = new Personaje("Dragón", 50);
        
        System.out.println("¡Combate: " + heroe.getNombre() + " VS " + monstruo.getNombre() + "!");
        
        // Usamos los métodos en lugar de cambiar variables sueltas
        monstruo.recibirDano(20);
        System.out.println("HP del Dragón: " + monstruo.getHp());
        
        heroe.recibirDano(15);
        System.out.println("Tu HP: " + heroe.getHp());
        
        // (En el video, el alumno puede meter este código dentro 
        // del bucle while de la versión 2 para ver cómo funciona junto).
    }
}
