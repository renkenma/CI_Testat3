// Testklasse, testet Calculator und gitb Ergebnisse in Konsole aus
public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Test 1: Addieren
        int sumResult = calc.add(2, 3);
        if(sumResult == 5) {
            System.out.println("Additionstest bestanden");
        } else {
            System.out.println("Additionstest fehlgeschlagen");
        }

        // Test 2: Multiplizieren
        int mulResult = calc.multiply(4, 5);
        if(mulResult == 20) {
            System.out.println("Multiplikatinstest bestanden");
        } else {
            System.out.println("Multiplikatinstest fehlgeschlagen");
        }
    }
}