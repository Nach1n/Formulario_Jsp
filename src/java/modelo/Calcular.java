/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author luisignacio
 */




public class Calcular {
    
    public boolean validar_rut(){
        String a = this.getRut();
 
        a = a.toUpperCase();
        a = a.replace(".", "");
        a = a.replace("-", "");
        int rutAux = Integer.parseInt(a.substring(0, a.length() - 1));
 
        char dv = a.charAt(a.length() - 1);
    
        if(!(rutAux>9 && rutAux<99999999)) return false;
        else if(!(Character.isDigit(dv)|| dv!='k')) return false;
        else return true;
    }
    
    public boolean validar_nombre(){
        String b = this.getNombre();
        if(b.length()>39)return false;
        char[] chars = b.toCharArray();        
        for (char c : chars) {
        if(!(Character.isLetter(c) || c==' ' || c=='-' || c=='"' || Character.isDigit(c))) {
            return false;
        }
    }
    return true;
    }
    
    public boolean validar_apellido_p(){
        String ap = this.getApellido_p();
        
        if(ap.length()>39)return false;
        char[] chars = ap.toCharArray();        
        for (char c : chars) {
        if(!(Character.isLetter(c) || c==' ' || c=='-' || c=='"' || Character.isDigit(c))) {
            return false;
        }
    }
    return true;
    }
    
    public boolean validar_apellido_m(){
        String am = this.getApellido_m();
        
        if(am.length()>39)return false;
        char[] chars = am.toCharArray();        
        for (char c : chars) {
        if(!(Character.isLetter(c) || c==' ' || c=='-' || c=='"' || Character.isDigit(c))) {
            return false;
        }
    }
    return true;
    }
    
    public boolean validar_email(){
        String em = this.getEmail();
        
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(em);

        if(mat.matches()){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean validar_telefono(){
        int tel = this.getTelefono();
        if(tel>0 && tel<999999999)return true;
        else return false;
    }
    
    public boolean validar_monto(){
        int mont = this.getMonto();
        if(mont>199999 && mont<100000000)return true;
        else return false;
    }
    
    public boolean validar_plazo(){
        int plazo = this.getPlazo();
        if(plazo>=6 && plazo<49)return true;
        else return false;
    }
    /*
    public boolean validar_fecha_pago(){
        String fecha = this.getFecha_p();
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        int ano = Integer.parseInt(fecha.substring(6, fecha.length()));
        int mes = Integer.parseInt(fecha.substring(3, 4));
        
        int anoac = Calendar.getInstance().get(Calendar.YEAR);
        int mesac = Calendar.getInstance().get(Calendar.MONTH);
        
        if(ano==anoac){
            if( (mes==mesac+1) || (mesac+2==mes)){         
            return true;
        }}
        return false;
      }*/
    public boolean validar_fecha_pago() {
        String fecha = this.getFecha_p();
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return true;
        }
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String newdate = df.format(fecha);

        int ano = Integer.parseInt(newdate.substring(6, newdate.length()));
        int mes = Integer.parseInt(newdate.substring(3, 4));

        int anoac = Calendar.getInstance().get(Calendar.YEAR);
        int mesac = Calendar.getInstance().get(Calendar.MONTH);

        if(ano==anoac){
            if( (mes==mesac+1) || (mesac+2==mes)){
            return true;
        }}
        return false;
      }
    
    public boolean validar_fecha_nacimiento(){
        String fecha = this.getFecha_n();
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return true;
        }
        int ano = Integer.parseInt(fecha.substring(6, fecha.length()));
        int anoac = Calendar.getInstance().get(Calendar.YEAR);
        
        
        if((anoac-ano)<=81){
            return true;
        }
        else return false;
      }
    
    public void subir(){
        try{
                Connection conn = null; 
                conn = DBConnection.connect();

                String send = "INSERT INTO Sujetos "+"VALUE ('"+this.getRut()+"', '"+this.getNombre()+"', '"+this.getApellido_p()+"', '"+this.getApellido_m()+"', '"+this.getEmail()+"', '"+this.getTelefono()+"', '"+this.getMonto()+"', '"+this.getPlazo()+"', '"+this.getFecha_p()+"', '"+this.getFecha_n()+"')";

                Statement stmt = conn.createStatement();
                 stmt.executeUpdate(send);

                conn.close();
                stmt.close();
                 }
                catch (Exception e)
                           {
                     System.err.println("Got an exception!");
                     System.err.println(e.getMessage());
                       }
    }
    /*
    public void subir(String rut, String Nom,String AP, String AM, String em, int tel, int money, int ncuotas, String fechaP, String fechaN){
        try{
                Connection conn = null; 
                conn = DBConnection.connect();

                String send = "INSERT INTO Sujetos "+"VALUE ('"+rut+"', '"+Nom+"', '"+AP+"', '"+AM+"', '"+em+"', '"+tel+"', '"+money+"', '"+ncuotas+"', '"+fechaP+"', '"+fechaN+"')";

                Statement stmt = conn.createStatement();
                 stmt.executeUpdate(send);

                conn.close();
                stmt.close();
                 }
                catch (Exception e)
                           {
                     System.err.println("Got an exception!");
                     System.err.println(e.getMessage());
                       }
    }
    */
    
    
    /**
     * @return the rut
     */
    public String getRut() {
        return rut;
    }
    

    /**
     * @param rut the rut to set
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido_p
     */
    public String getApellido_p() {
        return apellido_p;
    }

    /**
     * @param apellido_p the apellido_p to set
     */
    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    /**
     * @return the apellido_m
     */
    public String getApellido_m() {
        return apellido_m;
    }

    /**
     * @param apellido_m the apellido_m to set
     */
    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    /**
     * @return the fecha_p
     */
    public String getFecha_p() {
        return fecha_p;
    }

    /**
     * @param fecha_p the fecha_p to set
     */
    public void setFecha_p(String fecha_p) {
        this.fecha_p = fecha_p;
    }

    /**
     * @return the fecha_n
     */
    public String getFecha_n() {
        return fecha_n;
    }

    /**
     * @param fecha_n the fecha_n to set
     */
    public void setFecha_n(String fecha_n) {
        this.fecha_n = fecha_n;
    }


    
    private String rut;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private String email;
    private int telefono;
    private int monto;
    private int plazo;
    private String fecha_p;
    private String fecha_n;
   
    public Calcular(){
        this.rut="";
        this.nombre="";
        this.apellido_p="";
        this.apellido_m="";
        this.email="";
        this.telefono=0;
        this.monto=0;
        this.plazo=0;
        this.fecha_p="";
        this.fecha_n="";
    }
    
    
}
