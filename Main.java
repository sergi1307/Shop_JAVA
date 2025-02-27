import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Articulo> articulos = new ArrayList<>();
        int opc;

        do {
            System.out.println("-".repeat(50));
            System.out.println("MENÚ");
            System.out.println("-".repeat(50));
            System.out.println("1. Alta artículo.");
            System.out.println("2. Baja artículo.");
            System.out.println("3. Modificar artículo.");
            System.out.println("4. Aumentar cantidad de artículo.");
            System.out.println("5. Vender cantidad de artículo.");
            System.out.println("6. Ver el PVP del artículo.");
            System.out.println("7. Ver el PVP con descuento del artículo.");
            System.out.println("8. Mostrar 1 artículo.");
            System.out.println("9. Mostrar todos los artículos.");
            System.out.println("10. Ejecutar código de prueba.");
            System.out.println("0. Salir");

            opc = Leer.leerEntero("Introduzca que quiere hacer: ");

            switch (opc) {
                case 0:
                    System.out.println("\nSaliendo del programa...");
                    break;
                case 1:
                    int decA;
                    Articulo articulo;

                    System.out.println("\n¿Qué producto quiere dar de alta?");
                    System.out.println("1. Artículo.");
                    System.out.println("2. Libro.");
                    System.out.println("3. Mobiliario.");
                    System.out.println("4. Oficina.");

                    do {
                        decA = Leer.leerEntero("Elija una opción: ");
                    } while (decA < 1 || decA > 4);

                    if (decA == 1) {
                        articulo = new Articulo(Leer.leerTexto("Introduzca el código del artículo a introducir: "),
                                Leer.leerDouble("Introduzca el precio del articulo: "),
                                Leer.leerEntero("Introduzca el IVA del articulo: "),
                                Leer.leerEntero("Introduzca la cantidad en stock: ")
                        );
                        articulos.add(articulo);

                    } else if (decA == 2) {
                        articulo = new Libros(Leer.leerTexto("Introduzca el código del libro: "),
                                Leer.leerDouble("Introduzca el precio del libro: "),
                                Leer.leerEntero("Introduzca el IVA del libro: "),
                                Leer.leerEntero("Introduzca la cantidad en stock: "),
                                Leer.leerTexto("Introduzca el título del libro: "),
                                Leer.leerTexto("Introduzca el código de autor: "),
                                Leer.leerTexto("Introduzca el ISBN del libro: ")
                                );
                        articulos.add(articulo);

                    } else if (decA == 3) {
                        articulo = new Mobiliario(Leer.leerTexto("Introduzca el código del mobiliario: "),
                                Leer.leerDouble("Introduzca el precio del mobiliario: "),
                                Leer.leerEntero("Introduzca el IVA del mobiliario: "),
                                Leer.leerEntero("Introduzca la cantidad en stock: "),
                                Leer.leerTexto("Introduzca el material del mobiliario: "),
                                Leer.leerTexto("Introduzca el código del fabricante: "),
                                Leer.leerEntero("Introduzca las años de garantía: ")
                        );
                        articulos.add(articulo);

                    } else {
                        articulo = new Oficina(Leer.leerTexto("Introduzca el código del artículo de oficina: "),
                                Leer.leerDouble("Introduzca el precio del artículo de oficina: "),
                                Leer.leerEntero("Introduzca el IVA del artículo: "),
                                Leer.leerEntero("Introduzca la cantidad en stock: "),
                                Leer.leerTexto("Introduzca la descripción del producto de oficina: ")
                        );
                        articulos.add(articulo);

                    }

                    break;
                case 2:
                    String codigo;

                    codigo = Leer.leerTexto("\nIntroduce el código del artículo a dar de baja: ");

                    for (int i = 0; i < articulos.size(); i++) {
                        if (articulos.get(i).getCodigo().equals(codigo)) {
                            articulos.remove(i);
                            System.out.println("\nArtículo encontrado y dado de baja.");
                            i--;
                        }
                    }
                    break;
                case 3:
                    int decM;

                    System.out.println("\n¿Qué producto quiere dar de alta?");
                    System.out.println("1. Artículo.");
                    System.out.println("2. Libro.");
                    System.out.println("3. Mobiliario.");
                    System.out.println("4. Oficina.");

                    do {
                        decM = Leer.leerEntero("\nElija un número: ");
                    } while (decM < 1 || decM > 4);

                    if (decM == 1) {
                        int decArt;

                        System.out.println("\n¿Que quiere modificar?");
                        System.out.println("1. Todo.");
                        System.out.println("2. Código.");
                        System.out.println("3. Precio.");
                        System.out.println("4. IVA.");
                        System.out.println("5. Stock");

                        do {
                            decArt = Leer.leerEntero("Elija un número: ");
                        } while (decArt < 1 || decArt > 5);

                        if (decArt == 1) {

                        }
                    }

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    System.out.println("\nError. Número introducido no válido, vuelva a probar.\n");
            }

        } while (opc != 0);

        /*Articulo[] articulos = new Articulo[4];
        int n;
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
                                   Leer.leerEntero("Introduzca el IVA del libro: "),
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
        }*/
    }
}