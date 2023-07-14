
package com.estudio.sprintjavam4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ETIAN PARRA
 */
public class Contenedor {
    private List<Asesoria> as = new ArrayList<>();
    private List<Capacitacion> cap = new ArrayList<>();
    private List<Accidente> acc = new ArrayList<>();
    private List<VisitaTerreno>visit = new ArrayList<>();
    private List<Revision> rev = new ArrayList<>();
    Scanner ver = new Scanner(System.in);
    public Contenedor() {
    }

    
    //GETTER Y SETTER
    public List<Asesoria> getAs() {
        return as;
    }

    public void setAs(List<Asesoria> as) {
        this.as = as;
    }

    public List<Capacitacion> getCap() {
        return cap;
    }

    public void setCap(List<Capacitacion> cap) {
        this.cap = cap;
    }

    public List<Accidente> getAcc() {
        return acc;
    }

    public void setAcc(List<Accidente> acc) {
        this.acc = acc;
    }

    public List<VisitaTerreno> getVisit() {
        return visit;
    }

    public void setVisit(List<VisitaTerreno> visit) {
        this.visit = visit;
    }

    public List<Revision> getRev() {
        return rev;
    }

    public void setRev(List<Revision> rev) {
        this.rev = rev;
    }
    
    
    
    //METODOS SOLICITADOS
    
    public void almacenarRevision(Revision revision){
        rev.add(revision);
    }
    
    public void almacenarVisitaTerreno(VisitaTerreno visita){
        visit.add(visita);
    }
    
    public void almacenarAccidente(Accidente accidente){
        acc.add(accidente);
    }
    
    
    public void almacenarCliente(Asesoria cliente) {
        as.add(cliente);
    }

    public void almacenarProfesional(Asesoria profesional) {
        as.add(profesional);
    }

    public void almacenarAdministrativo(Asesoria administrativo) {
        as.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        cap.add(capacitacion);
    }

    
    //ELIMINAR USUARIOS
    public void eliminarUsuario(int rut) {
        Iterator<Asesoria> iterator = as.iterator();
        while (iterator.hasNext()) {
            Asesoria asesoria = iterator.next();
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                if (usuario instanceof Cliente && ((Cliente) usuario).getRut() == rut) {
                    iterator.remove();
                    System.out.println("CLIENTE ELIMINADO : " + usuario.getNombre());
                } else if (usuario instanceof Profesional && ((Profesional) usuario).getRun() == rut) {
                    iterator.remove();
                    System.out.println("PROFESIONAL ELIMINADO : " + usuario.getNombre());
                } else if (usuario instanceof Administrativo && ((Administrativo) usuario).getRun() == rut) {
                    iterator.remove();
                    System.out.println("ADMINISTRADOR ELIMINADO : " + usuario.getNombre());
                }
            }
        }
    }
   
   //LISTAR USUARIOS
   public void listarUsuarios() {
        for (Asesoria ase : as) {
            if (ase instanceof Usuario) {
                Usuario usuario = (Usuario) ase;
                System.out.println(usuario);
            }
                
        }
    }
   
   //LISTAR USUARIOS POR TIPO
    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria asesor : as) {
            if (asesor instanceof Usuario) {
                Usuario usuario = (Usuario) asesor;
                if (usuario.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                    System.out.println(usuario);
                }
            }
        }
    }
   
    //LISTAR CAPACITACIONES
     public void listarCapacitaciones() {
        for (Capacitacion capacit : cap) {
            System.out.println(capacit);
        }
    }
     
     //CREAR CLIENTES
        public void crearCliente() {
            Cliente cliente = new Cliente();

            //NOMBRE CLIENTE
            do {
                System.out.println("INGRESE NOMBRE DEL CLIENTE : ");
                String nombre = ver.nextLine();
                if (nombre.length() >= 5 && nombre.length() <= 30) {
                    cliente.setNombres(nombre);
                } else {
                    System.out.println("SOLO DE 5 A 30 CARACTERES");
                }
            } while (cliente.getNombres().length() < 5);

            //APELLIDO CLIENTE
            do {
                System.out.println("INGRESE APELLIDO DEL CLIENTE : ");
                String apellido = ver.nextLine();
                if (apellido.length() >= 5 && apellido.length() <= 30) {
                    cliente.setApellidos(apellido);
                } else {
                    System.out.println("SOLO DE 5 A 30 CARACTERES");
                }
            } while (cliente.getApellidos().length() < 5);

            //RUT CLIENTE          
            do {
                System.out.println("INGRESE RUT DEL CLIENTE : ");
                while (!ver.hasNextInt()) {
                    System.out.println("QUE PORFIADO...INGRESE SOLO NUMEROS");
                    ver.next();
                }
                int rut = ver.nextInt();
                ver.nextLine();
                if (rut < 99999999) {
                    cliente.setRut(rut);
                } else {
                    System.out.println("RUN DEBE SER MENOR A 99.999.999");
                }
            } while (cliente.getRut() < 0 || cliente.getRut() > 99999999);

            //TELEFONO CLIENTE        
            do {
                System.out.println("INGRESE TELEFONO DEL CLIENTE : ");
                while (!ver.hasNextInt()) {
                    System.out.println("QUE PORFIADO...INGRESE SOLO NUMEROS");
                    ver.next();
                }
                String fono = ver.nextLine();
                if (fono.length() <= 9) {
                    cliente.setTelefono(fono);

                } else {
                    System.out.println("FONO DEBE <= 9 DIGITOS");
                }
            } while (cliente.getTelefono().length() < 0 || cliente.getTelefono().length() > 9);

            //AFP  VALIDACION       
            do {
                System.out.println("INGRESE AFP DEL CLIENTE : ");
                String afp = ver.nextLine();
                if (afp.length() >= 4 && afp.length() <= 30) {
                    cliente.setAfp(afp);
                } else {
                    System.out.println("DEBE TENER ENTRE 4 Y 30 CARACTERES");
                }
            } while (cliente.getAfp().length() < 4);

            //SISTEMA DE SALUD    
            do {
                System.out.println("INGRESE SISTEMA 1=FONASA 2=ISAPRE 3=NO SABE: ");
                System.out.println("SOLO  NUMERO 1-2-3");
                int s = ver.nextInt();
                if (s >= 1 && s <= 3) {
                    cliente.setSistSalud(s);
                }
                ver.nextLine();
            } while (cliente.getSistSalud() < 1 || cliente.getSistSalud() > 3);

            //DIRECCION CLIENTE    
            do {
                System.out.println("INGRESE DIRECCION DEL CLIENTE : ");
                String direc = ver.nextLine();
                if (direc.length() <= 70) {
                    cliente.setDireccion(direc);
                }
            } while (cliente.getDireccion().length() < 1);

            //COMUNA CLIENTE    
            do {
                System.out.println("INGRESE COMUNA DEL CLIENTE : ");
                String com = ver.nextLine();
                if (com.length() <= 50) {
                    cliente.setComuna(com);
                }
            } while (cliente.getComuna().length() < 1);

            // EDAD DEL CLIENTE    
            do {
                System.out.println("INGRESE EDAD DEL CLIENTE: ");
                int e = ver.nextInt();
                if (e < 150) {
                    cliente.setEdad(e);
                }
            } while (cliente.getEdad() < 0);
                
                almacenarCliente(cliente);
                ver.nextLine();
        }
     
     
     public void crearProfesional(){
                    Profesional prof = new Profesional();
                //NOMBRE PROFESIONAL
                    do{
                    System.out.println("- INGRESE NOMBRE PROFESIONAL -");
                    String nombre =  ver.nextLine();
                    if(nombre.length()>=10 && nombre.length()<=50){
                        prof.setNombre(nombre);
                    }
                    
                    }while(prof.getNombre().length()<10);
                    
                    
                //TITULO PROFESIONAL    
                    do{
                        System.out.println("- INGRESE TITULO PROFESIONAL -");
                        String titulo =  ver.nextLine();
                        if(titulo.length()>=10 && titulo.length()<=50){
                             prof.setTitulo(titulo);
                        }
                       }while(prof.getTitulo().length()<10);
                    
                //FECHA DE INGRESO
                    do{
                    System.out.println("- INGRESE FECHA INGRESO PROFESIONAL -");
                    System.out.println("FORMATO DIA/MES/AÑO");
                    String f =  ver.nextLine();
                    SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yy");
                    SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yy");
                    try {
                            Date date = inputFormat.parse(f);
                            String forma = outputFormat.format(date);
                            prof.setFechaIng(forma);
                        } catch (ParseException e) {
                            System.out.println("FECHA NO VALIDA: dia/mes/año");
                        }
                    
                    }while(prof.getFechaIng().length()<8);
                    
                    almacenarProfesional(prof);
     }
     
     
     public void crearAdministrativo() {
        Administrativo admin = new Administrativo();
        //NOMBRE ADMINISTRATIVO
        do {
            System.out.println("- INGRESE NOMBRES ADMINISTRATIVO -");
            String nombre = ver.nextLine();
            if (nombre.length() >= 10 && nombre.length() <= 50) {
                admin.setNombre(nombre);
            }
        } while (admin.getNombre().length() < 10);

        //AREA DEL ADMINISTRATIVO
        do {
            System.out.println("- INGRESE AREA ADMINISTRATIVA -");
            String area = ver.nextLine();
            if (area.length() <= 20) {
                admin.setArea(area);
            }
        } while (admin.getArea().length() < 5);

        //EXPERIENCIA DEL ADMINISTRATIVO
        do {
            System.out.println("- INGRESE  EXPERIENCIA -");
            String a = ver.nextLine();
            if (a.length() <= 100) {
                admin.setExperiencia(a);
            }

        } while (admin.getExperiencia().length() < 10);

        //RUT DEL ADMINISTRATIVO
        do {

            System.out.println("- INGRESE RUT -");
            int n = ver.nextInt();
            if (n < 99999999) {
                admin.setRun(n);
            }
            ver.nextLine();
        } while (admin.getRun() < 2);
        
        almacenarAdministrativo(admin);
        
    }
     
     
      public void crearCapacitacion(){
        Capacitacion capa = new Capacitacion();
        
            //CODIGO DE CAPACITACION
                    do{
                    System.out.println("INGRESE CODIGO NUMERICO CAPACITACION : ");
                    int nu = ver.nextInt();
                    if(nu>0){
                       capa.setIdentificador(nu); 
                    }
                    }while(capa.getIdentificador()<=0);
                    ver.nextLine();
                    
            //RUT DEL CLIENTE        
                    do{
                    System.out.println("INGRESE RUT DEL CLIENTE : ");
                    int rut = ver.nextInt();
                    if(rut<99999999){
                        capa.setRutCliente(rut);
                    }
                    }while(capa.getRutCliente()<=0);
                    ver.nextLine();
                    
             //DIA DE LA SEMANA       
                    do{
                    System.out.println("INGRESE DIA DE CAPACITACION : ");
                    String d = ver.nextLine();
                    String dia = d.toLowerCase();
                    if(validarDia(dia)){
                    capa.setDia(dia);
                    }
                    }while(capa.getDia().length()<=4);
              
             //HORA DE LA CAPACITACION
                    do{
                    System.out.println("INGRESE HORA DE CAPACITACION : ");
                    System.out.println("FORMATO HH:MN");
                    String h = ver.nextLine();
                    if(validarHora(h)){
                        capa.setHora(h);
                    }
                    }while(capa.getHora().length()<4);
                    
                    do{
                    System.out.println("INGRESE LUGAR DE CAPACITACION : ");
                    System.out.println("MINIMO 10 CARACTERES");
                    String lu = ver.nextLine();
                    if(lu.length()<=50){
                        capa.setLugar(lu);
                    }
                    }while(capa.getLugar().length()<10);
                    
                    do{
                    System.out.println("INGRESE DURACION DE CAPACITACION : ");
                    System.out.println("EN PALABRAS");
                    String mi = ver.nextLine();
                    if(mi.length()<=70){
                    capa.setDuracion(mi);
                    }
                    }while(capa.getDuracion().length()<10);
                    
                    do{
                    System.out.println("INGRESE CANTIDAD ASISTENTES : ");
                    int asist = ver.nextInt();
                    if(asist<1000){
                    capa.setCantidadAsistentes(asist);
                    }
                    }while(capa.getCantidadAsistentes()<=0);
                    
                    almacenarCapacitacion(capa);
                    ver.nextLine();
    } 
      
      
      public void crearAccidente(){
        Accidente ac = new Accidente();
        
            //CODIGO DE ACCIDENTE
                    do{
                    System.out.println("INGRESE CODIGO NUMERICO ACCIDENTE : ");
                    int nu = ver.nextInt();
                    if(nu>0){
                       ac.setIdentificador(nu); 
                    }
                    }while(ac.getIdentificador()<=0);
                    ver.nextLine();
                    
            //RUT DEL CLIENTE        
                    do{
                    System.out.println("INGRESE RUT DEL CLIENTE : ");
                    int rut = ver.nextInt();
                    if(rut<99999999){
                        ac.setRutCliente(rut);
                    }
                    }while(ac.getRutCliente()<=0);
                    ver.nextLine();
                    
             //DIA DE LA SEMANA       
                    do{
                    System.out.println("INGRESE DIA DEL ACCIDENTE (lunes a domingo): ");
                    String d = ver.nextLine();
                    String dia = d.toLowerCase();
                    if(validarDia(dia)){
                    ac.setDia(dia);
                    }
                    }while(ac.getDia().length()<=4);
              
             //HORA DE LA ACCIDENTE
                    do{
                    System.out.println("INGRESE HORA DEL ACCIDENTE : ");
                    System.out.println("FORMATO HH:MN");
                    String h = ver.nextLine();
                    if(validarHora(h)){
                        ac.setHora(h);
                    }
                    }while(ac.getHora().length()<4);
             
             //LUGAR DEL ACCIDENTE
                    do{
                    System.out.println("INGRESE LUGAR DEL ACCIDENTE : ");
                    System.out.println("MINIMO 10 CARACTERES");
                    String lu = ver.nextLine();
                    if(lu.length()<=50){
                        ac.setLugar(lu);
                    }
                    }while(ac.getLugar().length()<10);
                    
              //ORIGEN DEL ACCIDENTE      
                    do{
                    System.out.println("INGRESE ORIGEN DEL ACCIDENTE : ");
                    System.out.println("EN PALABRAS");
                    String mi = ver.nextLine();
                    if(mi.length()<=100){
                    ac.setOrigen(mi);
                    }
                    }while(ac.getOrigen().length()<10);
                    
              //CONSECUENCIAS DEL ACCIDENTE      
                    do{
                    System.out.println("INGRESE CONSECUENCIA DEL ACCIDENTE : ");
                    String asist = ver.nextLine();
                    if(asist.length()<100){
                    ac.setConsecuencias(asist);
                    }
                    }while(ac.getConsecuencias().length()<=10);
                    
                    almacenarAccidente(ac);
                    
    } 
      
      
      
      public void crearVisitaTerreno(){
        VisitaTerreno vs = new VisitaTerreno();
        
            //CODIGO DE VISITA
                    do{
                    System.out.println("INGRESE CODIGO NUMERICO VISITA : ");
                    int nu = ver.nextInt();
                    if(nu>0){
                       vs.setIdentVisita(nu); 
                    }
                    }while(vs.getIdentVisita()<=0);
                    ver.nextLine();
                    
            //RUT DEL CLIENTE        
                    do{
                    System.out.println("INGRESE RUT DEL CLIENTE : ");
                    int rut = ver.nextInt();
                    if(rut<99999999){
                        vs.setRutCliente(rut);
                    }
                    }while(vs.getRutCliente()<=0);
                    ver.nextLine();
                    
             //DIA DE LA SEMANA       
                    do{
                    System.out.println("INGRESE DIA DE VISITA : ");
                    System.out.println("lunes a domingo");
                    String d = ver.nextLine();
                    String dia = d.toLowerCase();
                    if(validarDia(dia)){
                    vs.setDia(dia);
                    }
                    }while(vs.getDia().length()<=4);
              
             //HORA DE VISITAS
                    do{
                    System.out.println("INGRESE HORA DE VISITA : ");
                    System.out.println("FORMATO HH:MN");
                    String h = ver.nextLine();
                    if(validarHora(h)){
                        vs.setHora(h);
                    }
                    }while(vs.getHora().length()<4);
             
             //LUGAR DE VISITAS
                    do{
                    System.out.println("INGRESE LUGAR DE VISITA : ");
                    System.out.println("MINIMO 10 CARACTERES");
                    String lu = ver.nextLine();
                    if(lu.length()<=50){
                        vs.setLugar(lu);
                    }
                    }while(vs.getLugar().length()<10);
                    
                    
              //COMENTARIOS DE LA VISITA     
                    do{
                    System.out.println("INGRESE COMENTARIOS : ");
                    String asist = ver.nextLine();
                    if(asist.length()<100){
                    vs.setComentarios(asist);
                    }
                    }while(vs.getComentarios().length()<=10);
                    
                    almacenarVisitaTerreno(vs);
                    
    } 
      
      public void crearRevision(){
        Revision re = new Revision();
        
            //CODIGO DE REVISION
                    do{
                    System.out.println("INGRESE CODIGO NUMERICO REVISION : ");
                    int nu = ver.nextInt();
                    if(nu>0){
                       re.setNumRevision(nu); 
                    }
                    }while(re.getNumRevision()<=0);
                    ver.nextLine();
                    
                    
             //CODIGO VISITA EN TERRENO       
                     do{
                    System.out.println("INGRESE CODIGO DE LA VISITA : ");
                    int nu = ver.nextInt();
                    if(nu>0){
                       re.setVisitaTerreno(nu); 
                    }
                    }while(re.getVisitaTerreno()<=0);
                    ver.nextLine();
                    
             //NOMBRE DE REVISION       
                    do{
                    System.out.println("INGRESE NOMBRE DE LA REVISION : ");
                    System.out.println("MINIMO 10 CARACTERES");
                    String nombre = ver.nextLine();
                    if(nombre.length()<=50){
                        re.setNombreRevision(nombre);
                    }
                    }while(re.getNombreRevision().length()<10);
                    
              //DETALLE REVISION      
                    do{
                    System.out.println("INGRESE DETALLE A REVISAR : ");
                    System.out.println("EN PALABRAS");
                    String de = ver.nextLine();
                    if(de.length()<=100){
                    re.setDetalleRevisar(de);
                    }
                    }while(re.getDetalleRevisar().length()<10);
                    
                    do{
                    System.out.println("INGRESE ESTADO :");
                        System.out.println("1=SIN PROBLEMAS");
                        System.out.println("2=CON OBSERVACIONES");
                        System.out.println("3=NO APRUEBA");
                    int num = ver.nextInt();
                    if(num >0 && num<=3){
                    re.setEstado(num);
                    }
                    }while(re.getEstado()<=0 || re.getEstado()>=4);
                    
                    almacenarRevision(re);
                    ver.nextLine();
    } 
      
      
      
     
     public void buscarEliminar(){
                    int run =0;
                    System.out.print("INGRESE EL RUN PARA ELIMINAR: ");
                    run=ver.nextInt();
                    eliminarUsuario(run);
                    ver.nextLine();
     } 
      
     public void listarTipos(){
                    System.out.print("INGRESE TIPO USUARIO");
                    System.out.println("Cliente - Administrativo - Profesional");
                    String tipoUsuario = ver.nextLine();
                    if(tipoUsuario.equalsIgnoreCase("cliente")||tipoUsuario.equalsIgnoreCase("administrativo")||tipoUsuario.equalsIgnoreCase("profesional")){
                        listarUsuariosPorTipo(tipoUsuario);
                    }else{
                        System.out.println("OPCION NO VALIDA...");
                    }
                    
     }
     
     
     public static boolean validarDia(String dia) {
        String diaSemana = dia.toLowerCase();

        return diaSemana.equals("lunes")
                || diaSemana.equals("martes")
                || diaSemana.equals("miercoles")
                || diaSemana.equals("jueves")
                || diaSemana.equals("viernes")
                || diaSemana.equals("sabado")
                || diaSemana.equals("domingo");
    }
     
     
     public static boolean validarHora(String hora) {
        String mitad[] = hora.split(":");
        if (mitad.length != 2) {
            return false;
        }

        try {
            int horas = Integer.parseInt(mitad[0]);
            int minutos = Integer.parseInt(mitad[1]);

            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

     
     
     public void cargarSistema(){
        Cliente c = new Cliente ("Ana","Toorraja",45258,"888888",
                "afpTERROBO",2,"Aldunate 75","Santiasko",25,"FALABELLA","12-12-1960",7800000);
        Cliente c2 = new Cliente ("Rosamel","Toluka",857854,"555485",
                "afpVENDIO",1,"Nativos 96","La Pintana",35,"ALMACENES POR AHI","20-12-1980",9600085);
        Administrativo admin = new Administrativo("Tesoreria","10 años","Daniel","20-08-1998",854525);
        Administrativo admin2 = new Administrativo("Contabilidad","5 años","Jaime","21-05-1978",158785);
        Profesional pro = new Profesional("Experto en Minas","05-02-2010","Arturito","16-03-1978",478785);
        Profesional pro2 = new Profesional("Experta en Minos","02-02-2009","Califa","15-06-2000",966996);
        Capacitacion ca = new Capacitacion(10,1452545,"martes","18:00","Puerto Varas","120 min",70);
        Capacitacion ca2 = new Capacitacion(11,1345258,"jueves","20:00","Pucon","60 min",50);
        almacenarCliente(c);
        almacenarCliente(c2);
        almacenarAdministrativo(admin);
        almacenarAdministrativo(admin2);
        almacenarProfesional(pro);
        almacenarProfesional(pro2);
        almacenarCapacitacion(ca);
        almacenarCapacitacion(ca2);
     }
     
     
}
  
    

