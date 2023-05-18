package ProyectoFinal;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class Pasteleria implements Serializable {
    public static void main(String[] args) {
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("yyyy/MM/dd");   //Aqui tendra el formato del DateTime para el LocalDate
        LocalDate fecha1 = LocalDate.of(1975, 10, 05);
        LocalDate fecha2 = LocalDate.of(1976, 10, 07);//se inicializan variables para objetos
        LocalDate fecha3 = LocalDate.of(1999, 8, 10);
        LocalDate fecha4 = LocalDate.of(2001, 9, 10);
        LocalDate fecha5 = LocalDate.of(2019, 12, 23);
        LocalDate fecha6 = LocalDate.of(2020, 11, 22);
        LocalDate fecha10 = LocalDate.of(2021, 03, 8);
        LocalDate fecha7 = LocalDate.of(2018, 10, 25);
        LocalDate fecha8 = LocalDate.of(2017, 9, 13);
        Material m1 = new Material("Harina Chocolate", 20);
        Material m2 = new Material("Harina Fresa", 20);
        Material m3 = new Material("Harina Vainilla", 20);
        Material m4 = new Material("Harina Red Velvet", 20);
        Material m5 = new Material("Harina Confetti", 20);
        Material m6 = new Material("Aceite", 15);
        Material m7 = new Material("Huevos", 30);
        Material m8 = new Material("Fresa", 7);
        Material m9 = new Material("Durazno", 8);
        Material m10 = new Material("Mango", 5);
        Material m11 = new Material("Kiwi", 10);
        Material m12 = new Material("Nuez", 12);
        Material m13 = new Material("Queso Crema", 9);
        Material[] pastelMilkyWay = new Material[]{m1, m7, m13};//se crean arreglos de objetos
        Material[] pastelBodas = new Material[]{m8,m3,m5};
        Material[] pastelMango = new Material[]{m10,m4,m13};
        Nombre n1 = new Nombre("Ricardo", "Quintanilla", "Contreras");
        Nombre n2 = new Nombre("Eduardo", "Quintanilla", "Contreras");
        Nombre n3 = new Nombre("Ithan", "Mendez", "Macías");
        Nombre n4 = new Nombre("´Pancho", "Villa", "Salazar");
        Nombre n5 = new Nombre("Garen", "Martinez", "De la Torre");
        Nombre n6 = new Nombre("Lux", "Martinez", "De la Torre");
        Nombre n7 = new Nombre("Vanessa", "Limas", "Aguilera");
        Nombre n8 = new Nombre("Andrea", "Ramirez", "Bracamontes");
        Direccion d1 = new Direccion("Calle Juarez", "Colonia Marisol", 1246, 455523, "Escobedo");
        Direccion d2 = new Direccion("Calle Victoria", "Colonia Solari", 4568, 488921, "Moria");
        Direccion d3 = new Direccion("Calle Los Derrotados", "Colonia Espinoza", 3577, 456278, "Juarez");
        Direccion d4 = new Direccion("Calle Rendicion", "Colonia Faunas", 1143, 147066, "San Agustin");
        Direccion d5 = new Direccion("Calle Gonzalez", "Colonia Solitario", 6852, 485241, "Morelo");
        Direccion d6 = new Direccion("Calle La Capa", "Colonia Solar", 0451, 452870, "Fogoso");
        Direccion d7 = new Direccion("Calle Las Espinas", "Colonia Rabadon", 8523, 478523, "Nexo");
        Direccion d8 = new Direccion("Calle Redencion", "Colonia Jungla", 4783, 123456, "Ammumu");
        Cliente c1 = new Cliente(1, false, n1, d1, 810239596, "ricardo.q@gmail.com");
        Cliente c2 = new Cliente(2, true, n2, d2, 810309090, "eduardo.q@gmail.com");
        Cliente c3 = new Cliente(3, false, n3, d3, 80990878, "ithan.mendez@gmail.com");
        Cliente c4 = new Cliente(4, true, n4, d4, 821894598, "pancho.villa@gmail.com");
        Empleado e1 = new Empleado(15648, fecha1, n5, d5, 810265984, "garen@gmail", fecha5);
        Empleado e2 = new Empleado(12536, fecha2, n6, d6, 810145825, "lux@gmail", fecha6);
        Empleado e3 = new Empleado(11518, fecha3, n7, d7, 810147855, "vanni@gmail", fecha7);
        Empleado e4 = new Empleado(45218, fecha4, n8, d8, 810125214, "andrebrac@gmail", fecha8);
        Producto p1 = new Producto("Milky Way", "Star Wars", "Chocolate", "Cajeta", 1, pastelMilkyWay, 300);
        Producto p2 = new Producto("Pastel Boda","Boda","Fresa","Vainilla",5,pastelBodas,2000);
        Producto p3 = new Producto("Tres Leches","NA","Mango","Vainilla",1,pastelMango,350);
        DetallePedido detallePedido = new DetallePedido(1,"Pastel Milky Way",p1,300);
        DetallePedido[] primerEncargo = new DetallePedido[]{detallePedido};
        DetallePedido detallePedido1 = new DetallePedido(1,"Bodas",p2,2000);
        DetallePedido[] segundoEncargo = new DetallePedido[]{detallePedido1};
        Pedido pedido1 = new Pedido(1,1,primerEncargo,300,300,fecha6);
        Pedido pedido2 = new Pedido(2,3,segundoEncargo,2000,2000,fecha10);
        Producto[] productos = new Producto[]{p1,p2,p3};
        Cliente[] clientes = new Cliente[]{c1, c2, c3, c4};
        Empleado[] empleados = new Empleado[]{e1, e2, e3, e4};
        Material[] materials = new Material[]{m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13};
        Pedido[] pedidostotales = new Pedido[]{pedido1,pedido2};
        DetallePedido[] detallePedidos = new DetallePedido[]{detallePedido,detallePedido1};
        Scanner s = new Scanner(System.in);
        int menu = 0;
        int submenu = 0;//empieza a crear el menus y submenus

        do {  // Desplegar el menu para el usuario con sus opciones con tal de que exista dentro de nuestro menu

            System.out.println("Menu");
            System.out.println("1. Realizar pedido");
            System.out.println("2. Revisar pedidos pendientes");
            System.out.println("3. Administracion de la tienda ");
            System.out.println("4. Registro de base de datos");
            System.out.println("5. Agregar al inventario");
            System.out.println("6. Exportar datos");
            System.out.println("7. Salir");
            System.out.println("Opcion : ");
            menu = validar(s);
            switch (menu) {
                case 1://caso para realizar un pedido
                    // System.out.println(" Ingresar ID del cliente");
                    // int IDsolicitadaC = s.nextInt();
                    // Cliente.buscarCliente(clientes, IDsolicitadaC);
                    System.out.println(" Ingresar ID del cliente que busca");
                    int crearCliente = 0;
                    int IDCliente = validar(s);
                    if (Cliente.buscarCliente(clientes, IDCliente) == false)//se busca si el cliente existe
                    {
                        System.out.println("Cliente no existe desea crear");
                        System.out.println("1.Crear cliente");
                        System.out.println("2. Regresar a menu");
                        crearCliente = validar(s);
                        switch (crearCliente){//en caso de no tener un cliente se crea
                            case 1:
                                System.out.println("Nombre: ");
                                String nombreCliente = s.next();
                                System.out.println("Apellido paterno: ");
                                String apellidoPatCliente = s.next();
                                System.out.println("Apellido materno: ");
                                String apellidoMatCliente = s.next();
                                System.out.println("Telefono: ");
                                int telefonoCliente = validar(s);
                                System.out.println("Correo: ");
                                String correoCliente = s.next();
                                System.out.println("Calle: ");
                                String calleCliente = s.next();
                                System.out.println("Colonia: ");
                                String coloniaCliente = s.next();
                                System.out.println("Numero de Colonia: ");
                                int numeroColoniaCliente = validar(s);
                                System.out.println("Codigo Postal: ");
                                int codigoPostalCliente = validar(s);
                                System.out.println("Municipio: ");
                                String municipioCliente = s.next();
                                Nombre nombreC = new Nombre(nombreCliente, apellidoPatCliente, apellidoMatCliente);
                                Direccion direccionC = new Direccion(calleCliente, coloniaCliente, numeroColoniaCliente, codigoPostalCliente, municipioCliente);
                                Cliente cliente = new Cliente(clientes.length + 1, false, nombreC, direccionC, telefonoCliente, correoCliente);
                                clientes = Cliente.agregarLista(cliente, clientes);
                                Cliente.generarCliente(clientes);
                                System.out.println(Arrays.toString(clientes));
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Opcion no valida");
                        }
                    }
                    System.out.println("Cantidad de Pastel: ");//se agrega el pedido
                    int cantidadDePastel = validar(s);
                    System.out.println("Nombre de Pastel");
                    String nombredePastel = s.next();
                    int bandera=0;
                    DetallePedido[] Encargo = new DetallePedido[1];
                    int sumaTotalPesos=0;
                    do {//los compara
                        int j =0;

                        switch (nombredePastel) {
                            case "Bodas", "bodas", "BODAS":
                                DetallePedido productoAnadirBodas = new DetallePedido(cantidadDePastel, nombredePastel, p2, cantidadDePastel * 2000);
                                Encargo[j] = productoAnadirBodas;
                                sumaTotalPesos = sumaTotalPesos+cantidadDePastel*2000;
                                j++;
                                break;
                            case "MilkyWay", "milkyway", "Milkyway", "MILKYWAY":
                                DetallePedido productoAnadirMilky = new DetallePedido(cantidadDePastel,nombredePastel,p1,cantidadDePastel*300);
                                Encargo[j] = productoAnadirMilky;
                                sumaTotalPesos = sumaTotalPesos+cantidadDePastel*300;

                                j++;
                                break;
                            case "TresLeches", "tresleches", "TRESLECHES":
                                DetallePedido productoAnadirMango = new DetallePedido(cantidadDePastel,nombredePastel,p3,cantidadDePastel*350);
                                Encargo[j] = productoAnadirMango;
                                sumaTotalPesos = sumaTotalPesos+cantidadDePastel*350;
                                j++;
                                break;
                        }
                        System.out.println("Desea agregar otro pastel diferente");
                        System.out.println("1.Agregar Otro");
                        System.out.println("2. Orden Completa");
                        incrementarTamano(Encargo);
                        bandera = validar(s);
                    }while(bandera!=2);
                    Pedido pedidoARealizar = new Pedido( pedidostotales.length+1,IDCliente,Encargo,sumaTotalPesos,sumaTotalPesos,LocalDate.now());
                    pedidostotales = Pedido.agregarLista(pedidoARealizar,pedidostotales);
                    System.out.println(Arrays.toString(pedidostotales));


                    break;
                case 2://busca los pedidos pendientes
                    Pedido.buscarPedidosPendientes(pedidostotales);
                    break;
                case 3://para hacer consultas
                    System.out.println("1. Clientes");
                    System.out.println("2. Empleados");
                    System.out.println("3.Salir");
                    System.out.println("Opcion: ");
                    submenu = validar(s); //Variable para leer la respuesta del submenu
                    switch (submenu) {
                        case 1:
                            System.out.println("Ingresar ID del cliente que busca");
                            int IDsolicitadaC = validar(s);
                            Cliente.buscarCliente(clientes, IDsolicitadaC);
                            break;
                        case 2:
                            System.out.println(" Ingresar ID del empleado que busca");
                            int IDsolicitadaE = validar(s);
                            Empleado.buscarEmpleado(empleados, IDsolicitadaE);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Dato erroneo");
                    }
                    break;
                case 4://genera nuevos registros
                    System.out.println("1. Clientes");
                    System.out.println("2. Empleados");
                    System.out.println("3.Salir");
                    System.out.println("Opcion: ");
                    submenu = validar(s); //Variable para leer la respuesta del submenu
                    switch (submenu) {   //Respuesta de submenu para escoger
                        case 1:
                            System.out.println("Nombre: ");
                            String nombreCliente = s.next();
                            System.out.println("Apellido paterno: ");
                            String apellidoPatCliente = s.next();
                            System.out.println("Apellido materno: ");
                            String apellidoMatCliente = s.next();
                            System.out.println("Telefono: ");
                            int telefonoCliente = validar(s);
                            System.out.println("Correo: ");
                            String correoCliente = s.next();
                            System.out.println("Calle: ");
                            String calleCliente = s.next();
                            System.out.println("Colonia: ");
                            String coloniaCliente = s.next();
                            System.out.println("Numero de Colonia: ");
                            int numeroColoniaCliente = validar(s);
                            System.out.println("Codigo Postal: ");
                            int codigoPostalCliente = validar(s);
                            System.out.println("Municipio: ");
                            String municipioCliente = s.next();
                            Nombre nombreC = new Nombre(nombreCliente, apellidoPatCliente, apellidoMatCliente);
                            Direccion direccionC = new Direccion(calleCliente, coloniaCliente, numeroColoniaCliente, codigoPostalCliente, municipioCliente);
                            Cliente cliente = new Cliente(clientes.length + 1, false, nombreC, direccionC, telefonoCliente, correoCliente);
                            clientes = Cliente.agregarLista(cliente, clientes);
                            Cliente.generarCliente(clientes);
                            System.out.println(Arrays.toString(clientes));
                            break;
                        case 2:
                            System.out.println("Nombre: ");
                            String nombreEmpleado = s.next();
                            System.out.println("Apellido paterno: ");
                            String apellidoPatEmpleado = s.next();
                            System.out.println("Apellido materno: ");
                            String apellidoMatEmpleado = s.next();
                            System.out.println("Telefono: ");
                            int telefonoEmpleado = validar(s);
                            System.out.println("Correo: ");
                            String correoEmpleado = s.next();
                            System.out.println("Calle: ");
                            String calleEmpleado = s.next();
                            System.out.println("Colonia: ");
                            String coloniaEmpleado = s.next();
                            System.out.println("Numero de Colonia: ");
                            int numeroColoniaEmpleado = validar(s);
                            System.out.println("Codigo Postal: ");
                            int codigoPostalEmpleado = validar(s);
                            System.out.println("Municipio: ");
                            String municipioEmpleado = s.next();
                            System.out.println("Fecha de Nacimiento: ");
                            LocalDate fechaNacimiento = LocalDate.parse(s.next(), patron);
                            Nombre nombreE = new Nombre(nombreEmpleado, apellidoPatEmpleado, apellidoMatEmpleado);
                            Direccion direccionE = new Direccion(calleEmpleado, coloniaEmpleado, numeroColoniaEmpleado, codigoPostalEmpleado, municipioEmpleado);
                            Empleado empleado = new Empleado(empleados.length + 1, fechaNacimiento, nombreE, direccionE, telefonoEmpleado, correoEmpleado, LocalDate.now());
                            empleados = Empleado.agregarLista(empleado, empleados);
                            Empleado.generarEmpleado(empleados);
                            System.out.println(Arrays.toString(empleados));
                            break;
                        default:
                            System.out.println("Dato Invalido");
                    }
                    break;
                case 5:
                    System.out.println(Arrays.toString(materials));
                    System.out.println("Nombre del Material: ");
                    String materialAbuscar = s.next();
                    System.out.println("Cantidad a Sumar: ");
                    int cantidad = validar(s);
                    Material.anadirInvetario(materials, materialAbuscar, cantidad);
                    break;
                case 6:
                    System.out.println("Cual es la id del pedido del cual quiere realizar ticket");
                    int idPedido = validar(s);
                    Pedido.generarTicket(pedidostotales, idPedido);
                    System.out.println("Se ha terminado de generar su ticket!");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (menu != 7);
    }
    public static int validar(Scanner s){//metodo para validar enteros
        int val;
        while (true){                                   //Validamos que sea entero
            if (s.hasNextInt()) {
                val = s.nextInt();
                break;
            }
            else {
                s.nextLine();
            }
            System.out.println("Numero invalido. Por favor entre un numero valido");
        }
        return val;
    }

    public static void incrementarTamano(DetallePedido[] detalles){//incrementa el tama�o del pedido
        DetallePedido[] temp= new DetallePedido[detalles.length+1];
        for (int i = 0; i < detalles.length; i++) {
            temp[i] = detalles[i];
        }
        detalles = temp;
    }

}

class Pedido implements Serializable{
    private int idPedido;



    private int idcliente;
    private DetallePedido[] detallePedido;
    private double total, subtotal;
    private LocalDate fecha;

    public Pedido(int idPedido, int idcliente, DetallePedido[] detallePedido, double total, double subtotal, LocalDate fecha) {
        setIdPedido(idPedido);
        setIdcliente(idcliente);
        setDetallePedido(detallePedido);
        setTotal(total);
        setSubtotal(subtotal);

        setFecha(fecha);
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }



    public DetallePedido[] getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(DetallePedido[] detallePedido) {
        this.detallePedido = detallePedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        String r = "";
        for (int i = 0; i < detallePedido.length; i++) {
            r = r + detallePedido[i] + "\n";
        }
        return "Pedido " + idPedido +
                "\nID Cliente: " + idcliente +
                "\nCantidad  Descripción  Precio  Total"+
                "\n" + r +
                "\nTotal: $" + total +
                "\nSubtotal: $" + subtotal +
                "\n Fecha: " + fecha;
    }

    public static Pedido[] agregarLista(Pedido pedido, Pedido[] pedidos) {//agrrga pedidos a la lista
        int len = pedidos.length;
        Pedido[] nuevoArr = new Pedido[pedidos.length + 1];
        System.arraycopy(pedidos, 0, nuevoArr, 0, len);
        nuevoArr[len] = pedido;
        return nuevoArr;
    }



    public static void buscarPedidosPendientes(Pedido[] pedidos) {
        boolean found = false;

        for (int i = 0; i < pedidos.length; i++) {
            if (LocalDate.now().isBefore(pedidos[i].fecha)) {
                System.out.println(pedidos[i]);
                found = true;
            }
        }
        if (found== false){
            System.out.println("No se encontro el cliente");
        }

    }

    public static void generarTicket(Pedido[] pedidos,int idPedido){
        try{
            File f = new File("..\\PrograIntProyectoFinal\\Datos\\Ticket.txt");
            FileOutputStream f2 = new FileOutputStream(f);
            PrintStream f3 = new PrintStream(f2);
            f3.println("Ticket");
            f3.println("Fecha:" + LocalDate.parse(LocalDate.now().toString()));
            f3.println("Numero de pedido: " + pedidos[idPedido-1].getIdPedido());
            f3.println("Pastel: " + pedidos[idPedido-1].getDetallePedido()[0].getDescripcion());
            f3.println("Cantidad: " + pedidos[idPedido-1].getDetallePedido()[0].getCantidad());
            f3.println("Subtotal: " +  pedidos[idPedido-1].getSubtotal());
            f3.println("Total: " + pedidos[idPedido-1].getTotal());
            f3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class Persona implements Serializable{

    protected Nombre nombre;
    protected Direccion direccion;
    protected int telefono;
    protected String correo;

    public Persona(Nombre nombre, Direccion direccion, int telefono, String correo) {
        setNombre(nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        setCorreo(correo);
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona" + "\n nombre: " + nombre + "\n direccion:" + direccion + "\n telefono: " + telefono + "\n correo: " + correo;
    }


}

class Direccion implements Serializable{

    private String calle, municipio, colonia;
    private int numeroCol;
    private int codigoPostal;

    public Direccion(String calle, String colonia, int numeroCol, int codigoPostal, String municipio) {
        setCalle(calle);
        setColonia(colonia);
        setNumeroCol(numeroCol);
        setCodigoPostal(codigoPostal);
        setMunicipio(municipio);
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getNumeroCol() {
        return numeroCol;
    }

    public void setNumeroCol(int numeroCol) {
        this.numeroCol = numeroCol;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return  " "+calle +" "+  colonia + "  Numero: " + numeroCol + "\n CodigoPostal: " + codigoPostal + "  Municipio: " + municipio ;
    }

}

class DetallePedido implements Serializable{

    private int cantidad;
    private String descripcion;
    private double totalPrecio;
    private Producto producto;

    public DetallePedido(int cantidad, String descripcion, Producto producto, double totalPrecio) {
        setCantidad(cantidad);
        setDescripcion(descripcion);
        setProducto(producto);
        setTotalPrecio(calcularImporte());
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getTotalPrecio() {
        return totalPrecio;
    }

    public void setTotalPrecio(double totalPrecio) {
        this.totalPrecio = totalPrecio;
    }

    public double calcularImporte() {
        return producto.getPrecio() * cantidad;
    }


    @Override
    public String toString() {
        return "    " + cantidad + "       " + descripcion + "         $" + producto.getPrecio() + "        $" + totalPrecio;
    }

}

class Nombre implements Serializable{

    private String nom;
    private String apellidoPater;
    private String apellidoMater;

    public Nombre(String nom, String apellidoPater, String apellidoMater) {
        setNom(nom);
        setApellidoPater(apellidoPater);
        setApellidoMater(apellidoMater);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApellidoPater(String apellidoPater) {
        this.apellidoPater = apellidoPater;
    }

    public void setApellidoMater(String apellidoMater) {
        this.apellidoMater = apellidoMater;
    }

    public String getNom() {
        return nom;
    }

    public String getApellidoPater() {
        return apellidoPater;
    }

    public String getApellidoMater() {
        return apellidoMater;
    }

    public String toString() {
        return nom + " " + apellidoPater + " " + apellidoMater;
    }
}

class Empleado extends Persona implements Serializable{
    private int idEmpleado;
    private LocalDate fechaNacimiento;
    private LocalDate fechaContratacion;

    public Empleado(int idEmpleado, LocalDate fechaNacimiento, Nombre nombre, Direccion direccion, int telefono, String correo, LocalDate fechaContratacion) {
        super(nombre, direccion, telefono, correo);
        setIdEmpleado(idEmpleado);
        setFechaNacimiento(fechaNacimiento);
        setFechaContratacion(fechaContratacion);
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }


    @Override
    public String toString() {
        return super.toString()+ "\n ID=" + idEmpleado + "\n Fecha de Nacimiento: " + fechaNacimiento;
    }
    public static void generarEmpleado(Empleado[] empleados) {//genera empleados a partir de objetos
        FileOutputStream f1 = null;
        ObjectOutputStream f2 = null;
        try {
            f1 = new FileOutputStream("..\\PrograIntProyectoFinal\\Datos\\Empleados.dat");
            f2 = new ObjectOutputStream(f1);
            for (int i = 0; i < empleados.length; i++) {
                f2.writeObject(empleados[i]);
            }
            f2.close();
            f1.close();
        } catch (IOException e) {
            System.out.println("Existe un error al grabar la informacion en el archivo");
        }
    }

    public static Empleado[] agregarLista(Empleado empleado, Empleado[] empleados) {
        int len = empleados.length;
        Empleado[] nuevoArr = new Empleado[empleados.length + 1];
        System.arraycopy(empleados, 0, nuevoArr, 0, len);
        nuevoArr[len] = empleado;
        return nuevoArr;
    }

    public static boolean buscarEmpleado(Empleado[] empleados, int idEmpleadoBuscar) {
        boolean found = false;
        for (int i = 0; i < empleados.length; i++) {
            if (idEmpleadoBuscar == empleados[i].getIdEmpleado()) {
                System.out.println(empleados[i]);
                found = true;
            } if (found== false){
                System.out.println("No se encontro el empleado");
            }
        }return found;

    }
}

class Cliente extends Persona implements Serializable {

    private int idCliente;
    private boolean clienteFrecuente;


    public Cliente(int idCliente, boolean clienteFrecuente, Nombre nombre, Direccion direccion, int telefono, String correo) {
        super(nombre, direccion, telefono, correo);
        setIdCliente(idCliente);
        setClienteFrecuente(clienteFrecuente);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isClienteFrecuente() {
        return clienteFrecuente;
    }

    public void setClienteFrecuente(boolean clienteFrecuente) {
        this.clienteFrecuente = clienteFrecuente;
    }


    @Override
    public String toString() {
        return super.toString() + "\n ID:" + idCliente + " Cliente Frecuente: " + clienteFrecuente;
    }

    public static void generarCliente(Cliente[] clientes) {
        FileOutputStream f1 = null;
        ObjectOutputStream f2 = null;
        try {
            f1 = new FileOutputStream("..\\PrograIntProyectoFinal\\Datos\\Clientes.dat");
            f2 = new ObjectOutputStream(f1);
            for (int i = 0; i < clientes.length; i++) {
                f2.writeObject(clientes[i]);
            }
            f2.close();
            f1.close();
        } catch (IOException e) {
            System.out.println("Existe un error al grabar la informacion en el archivo");
        }
    }

    public static Cliente[] agregarLista(Cliente cliente, Cliente[] clientes) {
        int len = clientes.length;
        Cliente[] nuevoArr = new Cliente[clientes.length + 1];
        System.arraycopy(clientes, 0, nuevoArr, 0, len);
        nuevoArr[len] = cliente;
        return nuevoArr;
    }

    public static boolean buscarCliente(Cliente[] clientes, int idClienteBuscar) {
        boolean found = false;
        for (int i = 0; i < clientes.length; i++) {
            if (idClienteBuscar == clientes[i].getIdCliente()) {
                System.out.println(clientes[i]);
                found = true;
            }
        } if (found== false){
            System.out.println("No se encontro el cliente");
        }
        return found;

    }


//    public static Cliente[] leerCliente() {
//
//        FileInputStream f1 = null;
//        ObjectInputStream f2 = null;
//        Cliente[] clientes = null;
//        int i = 0;
//        try {
//            DataInputStream d1 = new DataInputStream(new FileInputStream("C:\\Users\\Lenovo\\Documents\\Ricky Escuela\\Tercer semestre\\Prog Int\\Clientes.dat")) ;
//            f2 = new ObjectInputStream(d1);
//            while (true) {
//                i++;
//                clientes[i] = (Cliente) f2.readObject();
//                System.out.println(clientes[i]);
//            }
//
//        } catch (EOFException ex) {
//            System.out.println("");
//        } catch (IOException ex) {
//            System.out.println("error en la lectura del archivo");
//        } catch (ClassNotFoundException ex) {
//            System.out.println("clase incorrecta");
//        } finally {
//            try {
//                f2.close();
//                f1.close();
//            } catch (IOException ex) {
//                System.out.println("error al cerrar el archivo");
//            }
//        }
//        return clientes;
//    }
}


class Material implements Serializable{
    private String nombreMaterial;
    private int cantidad;

    public Material(String nombreMaterial, int cantidad) {
        setNombreMaterial(nombreMaterial);
        setCantidad(cantidad);
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static void generarMaterialReporte(Cliente[] clientes) {
        FileOutputStream f1 = null;
        ObjectOutputStream f2 = null;
        try {
            f1 = new FileOutputStream("..\\PrograIntProyectoFinal\\Datos\\Clientes.dat");
            f2 = new ObjectOutputStream(f1);
            for (int i = 0; i < clientes.length; i++) {
                f2.writeObject(clientes[i]);
            }
            f2.close();
            f1.close();
        } catch (IOException e) {
            System.out.println("Existe un error al grabar la informacion en el archivo");
        }
    }

    public static void anadirInvetario(Material[] materials, String nombreMaterial, int suma) {
        boolean found = false;

        for (int i = 0; i < materials.length; i++) {
            if (nombreMaterial.equalsIgnoreCase(materials[i].getNombreMaterial())) {
                materials[i].setCantidad(materials[i].getCantidad() + suma); ;
                System.out.println(materials[i]);
                found = true;
            }
        }
        if (found== false){
            System.out.println("No se encontro el cliente");
        }

    }

    @Override
    public String toString() {
        return "Material " + nombreMaterial + ", cantidad: " + cantidad;
    }



}

class Producto implements Serializable{
    private String nombreProducto, diseno, sabor, relleno;
    private int piso;
    private Material[] material;
    private double precio;

    public Producto(String nombreProducto, String diseno, String sabor, String relleno, int piso, Material[] material, double precio) {
        setNombreProducto(nombreProducto);
        setDiseno(diseno);
        setSabor(sabor);
        setRelleno(relleno);
        setPiso(piso);
        setMaterial(material);
        setPrecio(precio);
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public Material[] getMaterial() {
        return material;
    }

    public void setMaterial(Material[] material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularTotalRelleno() {

        return 0;
    }

    @Override
    public String toString() {
        return "Producto: " + nombreProducto +
                "\nDiseno: " + diseno +
                "\nSabor: " + sabor +
                "\nRelleno: " + relleno +
                "\nNumero de pisos: " + piso +
                "\nMaterial: " + material +
                "\nPrecio: $" + precio;
    }
}