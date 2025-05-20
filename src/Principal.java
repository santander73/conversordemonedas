import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion !=8){
            System.out.println("**********************\n" +
                    "Gracias por usar este conversor de monedas\n\n" +
                    "Ingresa la conversion que desees realizar\n\n" +
                    "1. Dólar(USD) a Peso Chileno(CLP)\n" +
                    "2. Peso Chileno(CLP) a Dólar(USD)\n" +
                    "3. Dólar(USD) a Peso Argentino(ARS)\n" +
                    "4. Peso Argentino(ARS) a Dólar(USD)\n" +
                    "5. Dólar(USD) a Sol Peruano(PEN)\n" +
                    "6. Sol Peruano(PEN) a Dólar(USD)\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","CLP", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("CLP", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "PEN", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("PEN", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("👋 Saliendo del conversor...");
                    break;

                default:
                    System.out.println("❌ Opción no válida");
                    break;
            }
        }
    }
}
