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
                    String code;

                    for (Articulo art : articulos) {
                        art.mostrar();
                    }

                    code = Leer.leerTexto("Introduzca el código del artículo a modificar: ");

                    for (int i = 0; i < articulos.size(); i++) {
                        if (articulos.get(i).getCodigo().equals(code)) {
                            if (articulos.get(i) instanceof Libros) {
                                articulos.get(i).setCodigo(Leer.leerTexto("Introduzca el nuevo código: "));
                                articulos.get(i).setPrecio(Leer.leerDouble("Introduzca el nuevo precio: "));
                                articulos.get(i).setIva(Leer.leerEntero("Introduzca el nuevo IVA: "));
                                articulos.get(i).setStock(Leer.leerEntero("Introduzca el nuevo stock: "));
                                ((Libros) articulos.get(i)).setTitulo(Leer.leerTexto("Introduzca el nuevo título: "));
                                ((Libros) articulos.get(i)).setCodigoAutor(Leer.leerTexto("Introduzca el nuevo código de autor: "));
                                ((Libros) articulos.get(i)).setIsbn(Leer.leerTexto("Introduzca el nuevo ISBN: "));
                            } else if (articulos.get(i) instanceof Mobiliario) {
                                articulos.get(i).setCodigo(Leer.leerTexto("Introduzca el nuevo código: "));
                                articulos.get(i).setPrecio(Leer.leerDouble("Introduzca el nuevo precio: "));
                                articulos.get(i).setIva(Leer.leerEntero("Introduzca el nuevo IVA: "));
                                articulos.get(i).setStock(Leer.leerEntero("Introduzca el nuevo stock: "));
                                ((Mobiliario) articulos.get(i)).setMaterial(Leer.leerTexto("Introduzca el nuevo material: "));
                                ((Mobiliario) articulos.get(i)).setCodigoFabric(Leer.leerTexto("Introduzca el nuevo código de fabricante: "));
                                ((Mobiliario) articulos.get(i)).setGarantia(Leer.leerEntero("Introduzca la nueva garantía: "));
                            } else if (articulos.get(i) instanceof Oficina) {
                                articulos.get(i).setCodigo(Leer.leerTexto("Introduzca el nuevo código: "));
                                articulos.get(i).setPrecio(Leer.leerDouble("Introduzca el nuevo precio: "));
                                articulos.get(i).setIva(Leer.leerEntero("Introduzca el nuevo IVA: "));
                                articulos.get(i).setStock(Leer.leerEntero("Introduzca el nuevo stock: "));
                                ((Oficina) articulos.get(i)).setDescripcion(Leer.leerTexto("Introduzca la nueva descripción: "));
                            } else {
                                articulos.get(i).setCodigo(Leer.leerTexto("Introduzca el nuevo código: "));
                                articulos.get(i).setPrecio(Leer.leerDouble("Introduzca el nuevo precio: "));
                                articulos.get(i).setIva(Leer.leerEntero("Introduzca el nuevo IVA: "));
                                articulos.get(i).setStock(Leer.leerEntero("Introduzca el nuevo stock: "));
                            }
                        }
                    }

                    break;
                case 4:
                    String codig;

                    codig = Leer.leerTexto("Introduzca el código del artículo a vender: ");

                    for (Articulo art : articulos) {
                        if (art.getCodigo().equals(codig)) {
                            if (art.almacenar(Leer.leerEntero("Introduzca la cantidad de productos a aumentar: "))) {
                                System.out.println("Artículo aumentado.");
                            } else {
                                System.out.println("No se puede aumentar esa cantidad.");
                            }
                        }
                    }
                    break;
                case 5:
                    String codi;

                    codi = Leer.leerTexto("Introduzca el código del artículo a vender: ");

                    for (Articulo art : articulos) {
                        if (art.getCodigo().equals(codi)) {
                            if (art.vender(Leer.leerEntero("Introduzca la cantidad de productos a vender: "))) {
                                System.out.println("Artículo vendido.");
                            } else {
                                System.out.println("No se puede vender esa cantidad.");
                            }
                        }
                    }
                    break;
                case 6:
                    for (Articulo art : articulos) {
                        art.mostrar();
                        System.out.println(art.getPVP());
                    }
                    break;
                case 7:
                    for (Articulo art : articulos) {
                        art.mostrar();
                        System.out.println(art.getPVPDescuento(Leer.leerDouble("Introduzca el descuento para este artículo: ")));
                    }
                    break;
                case 8:
                    String cod;

                    for(Articulo art : articulos) {
                        art.mostrar();
                    }

                    cod = Leer.leerTexto("Introduzca el código del producto a mostrar: ");

                    for (Articulo art : articulos) {
                        if (art.getCodigo().equals(cod)) {
                            art.imprimir();
                        }
                    }
                    break;
                case 9:
                    for (Articulo art : articulos) {
                        art.imprimir();
                    }
                    break;
                case 10:
                    Articulo[] articulos2 = new Articulo[4];
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
                    articulos2[0] = articulo1;
                    articulos2[1] = libro1;
                    articulos2[2] = mobiliario1;
                    articulos2[3] = oficina1;

                    System.out.println("\nIMPRIMIMOS CON MÉTODO IMPRIMIR");
                    articulo1.imprimir();
                    libro1.imprimir();
                    mobiliario1.imprimir();
                    oficina1.imprimir();

                    System.out.println("\nIMPRIMIMOS CON MÉTODO TOSTRING");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(articulos2[i]);
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
                        articulos2[i].imprimir();
                        articulos2[i].getPVP();
                        articulos2[i].getPVPDescuento(descuento);
                    }
                    break;
                default:
                    System.out.println("\nError. Número introducido no válido, vuelva a probar.\n");
            }

        } while (opc != 0);
    }
}