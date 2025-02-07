public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();
        
        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();
        
        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();
        
        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();
        
        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
