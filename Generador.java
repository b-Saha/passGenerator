package passGenerator;

import java.util.Scanner;

//la password debe contener caracteres en mayusculas, algun numero y algun simbolo, menos el arroba
//IDEAS: dividir el string y usar su clase. No es necesario meter los caracteres en un array. 
//Intentar desde la clase string directamente 

public class Generador {
    String password;
    String confirmarPassword;

    // introduzco contraseña segura
    public void introducirPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una contraseña segura");
        password = sc.nextLine();
        sc.close();
        // si no está vacía, la compruebo
        if (!password.isEmpty()) {
            comprobarPassword(password);
        } else {
            System.out.println("Introduce una pass correcta.");
            // volver a introducir password porque está vacía
        }
    }

    // Función para comprobar los requisitos:
    // 1º No puede tener un @
    // 2º Debe incluir una máyuscula (mínimo), y varios números y símbolos
    public void comprobarPassword(String passProvisional) {
        System.out.println("Comprobando contraseña...");
        /* int /* arroba = 0, */ /*
                                  * chMayus = 0, chMinus = 0, totalMayus = 0, totalMinus = 0;
                                  * boolean mayusOK = false, minusOK = false, numSimOK = false;
                                  */
        char[] caracteres = passProvisional.toCharArray();

        for (char caracter : caracteres) {
            if (caracter == '@') {
                System.out.println("Hay un arroba");
                // El usuario debe tener la posibilidad de volver a introducir una contraseña
                // válida.
                // en un software real, la ventana de advertencia se cerraría y el user podría
                // volver a escribir una contraseña
                System.exit(0);
            } else {

                passwordCorrecta(caracter);
                /*
                 * for (int i = 65; i <= 90; i++) {
                 * chMayus = (char) i;
                 * if (chMayus == caracter) {
                 * totalMayus++;
                 * }
                 * }
                 * for (int j = 97; j <= 122; j++) {
                 * chMinus = (char) j;
                 * if (chMinus == caracter) {
                 * totalMinus++;
                 * }
                 * }
                 * //32-63
                 * for(int sim = 32; sim <= 63; sim++) {
                 * 
                 * }
                 */
            }
        }

        /*
         * if (totalMayus == 0) {
         * System.out.println("La contraseña debe incluir alguna mayúsculas");
         * } else {
         * System.out.println("Hay un número de adecuado de mayúsculas");
         * mayusOK = true;
         * }
         * 
         * if (totalMinus == 0) {
         * System.out.println("La contraseña debe incluir alguna minúscula");
         * } else {
         * System.out.println("Hay un número adecuado de minúsculas");
         * minusOK = true;
         * }
         */
        /*
         * System.out.println(mayusOK);
         * System.out.println(minusOK);
         */
    }

    public boolean passwordCorrecta(char caracterAComprobar) {

        int chprov = 0;
        boolean sim = false, mayusOK = false, minusOK = false;
        // recorrer for y escoger horquilla de valores (32-63 para símbolos y números
        // 65-90 para mayúsculas y 97-122 para minúsculas. 64 no vale (es arroba))
        for (int i = 32; i <= 122; i++) {
            chprov = (char) i; // muestra todos los ascii desde esos dos valores
            switch(i){
                case 1: 
                break;
            }
            
            if (chprov == caracterAComprobar) {
                System.out.println(caracterAComprobar);
            }
        }

        return false;
    }
}
