public class Main {
    public static void main(String[] args) {
        Articulo[] articulos = new Articulo[4];
        int n, opc;
        double descuento;

        //Declaramos e iniciamos los objetos con sus atributos
        Articulo articulo1 = new Articulo(Leer.leerTexto("Introduzca el código del artículo a introducir: "),
                              Leer.leerDouble("Introduzca el precio del articulo: "),
                              Leer.leerEntero("Introduzca el IVA del articulo: "),
                              Leer.leerEntero("Introduzca la cantidad en stock: ")
                             );
        System.out.println();
        Libros libro1 = new Libros(Leer.leerTexto("Introduzca el código del libro: "),
                                   Leer.leerDouble("Introduzca el precio del libro: "),
                                   Leer.leerEntero("Introduzca el IVA del libro: "),063
                                   Leer.leerEntero("Introduzca la cantidad en stock: "),
                                   Leer.leerTexto("Introduzca el título del libro: "),
                                   Leer.leerTexto("Introduzca el código de autor: "),
                                   Leer.leerTexto("Introduzca el ISBN del libro: ")
                            );
        System.out.println();
        Mobiliario mobiliario1 = new Mobiliario(Leer.leerTexto("Introduzca el código del mobiliario: "),
                                                Leer.leerDouble("Introduzca el precio del mobiliario: "),
                                                Leer.leerEntero("Introduzca el IVA del mobiliario: "),
                                                Leer.leerEntero("Introduzca la cantidad en stock: "),
                                                Leer.leerTexto("Introduzca el material del mobiliario: "),
                                                Leer.leerTexto("Introduzca el código del fabricante: "),
                                                Leer.leerEntero("Introduzca las años de garantía: ")
                                            );
        System.out.println();
        Oficina oficina1 = new Oficina(Leer.leerTexto("Introduzca el código del artículo de oficina: "),
                                        Leer.leerDouble("Introduzca el precio del artículo de oficina: "),
                                        Leer.leerEntero("Introduzca el IVA del artículo: "),
                                        Leer.leerEntero("Introduzca la cantidad en stock: "),
                                        Leer.leerTexto("Introduzca la descripción del producto de oficina: ")
                                );
        System.out.println();

        //Guardamos objetos y los mostramos por pantalla
        articulos[0] = articulo1;
        articulos[1] = libro1;
        articulos[2] = mobiliario1;
        articulos[3] = oficina1;

        System.out.println("\nIMPRIMIMOS CON MÉTODO IMPRIMIR");
        articulo1.imprimir();
        libro1.imprimir();
        mobiliario1.imprimir();
        oficina1.imprimir();

        System.out.println("\nIMPRIMIMOS CON MÉTODO TOSTRING");
        for (int i = 0; i < 4; i++) {
            System.out.println(articulos[i]);
        }

        //Vender artículos
        System.out.println("1. Articulo, 2. Libro, 3. Mobiliario, 4. Oficina");
        opc = Leer.leerEntero("Que tipo de artículo desea vender: ");
        n = Leer.leerEntero("Introduzca la cantidad de productos a vender: ");

        if (opc == 1) {
            if (articulo1.vender(n)) {
                articulo1.imprimir();
            } else {
                System.out.println("Error, no se ha podido vender.");
            }
        } else if (opc == 2) {
            if (libro1.vender(n)) {
                libro1.imprimir();
            } else {
                System.out.println("Error, no se ha podido vender.");
            }
        } else if (opc == 3) {
            if (mobiliario1.vender(n)) {
                mobiliario1.imprimir();
            } else {
                System.out.println("Error, no se ha podido vender.");
            }
        } else if (opc == 4) {
            if (oficina1.vender(n)) {
                oficina1.imprimir();
            } else {
                System.out.println("Error, no se ha podido vender.");
            }
        } else {
            System.out.println("Número introducido no válido.");
        }

        //Almacenar valores de los artículos
        System.out.println("1. Articulo, 2. Libro, 3. Mobiliario, 4. Oficina");
        opc = Leer.leerEntero("Que tipo de artículo desea almacenar: ");
        n = Leer.leerEntero("Introduzca la cantidad de productos a almacenar: ");

        if (opc == 1) {
            if (articulo1.almacenar(n)) {
                articulo1.imprimir();
            } else {
                System.out.println("Error, no se ha podido almacenar.");
            }
        } else if (opc == 2) {
            if (libro1.almacenar(n)) {
                libro1.imprimir();
            } else {
                System.out.println("Error, no se ha podido almacenar.");
            }
        } else if (opc == 3) {
            if (mobiliario1.almacenar(n)) {
                mobiliario1.imprimir();
            } else {
                System.out.println("Error, no se ha podido almacenar.");
            }
        } else if (opc == 4) {
            if (oficina1.almacenar(n)) {
                oficina1.imprimir();
            } else {
                System.out.println("Error, no se ha podido almacenar.");
            }
        } else {
            System.out.println("Número introducido no válido.");
        }

        //Recorrer array y mostrar precio de venta, y precio de venta con descuento
        for (int i = 0; i < 4; i++) {
            descuento = Leer.leerDouble("Introduce el descuento a aplicar: ");
            System.out.println("Articulo " + i + ": ");
            articulos[i].imprimir();
            articulos[i].getPVP();
            articulos[i].getPVPDescuento(descuento);
        }
    }
}