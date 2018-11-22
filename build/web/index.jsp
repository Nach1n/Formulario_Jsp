<%-- 
    Document   : index
    Created on : 21-11-2018, 16:46:41
    Author     : luisignacio
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="modelo.Calcular"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Snippet - Bootsnipp.com</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
<style>body{
    background: -webkit-linear-gradient(left, #0072ff, #00c6ff);
}
.contact-form{
    background: #fff;
    margin-top: 10%;
    margin-bottom: 5%;
    width: 70%;
}
.contact-form .form-control{
    border-radius:1rem;
}
.contact-image{
    text-align: center;
}
.contact-image img{
    border-radius: 6rem;
    width: 11%;
    margin-top: -3%;
    transform: rotate(29deg);
}
.contact-form form{
    padding: 14%;
}
.contact-form form .row{
    margin-bottom: -7%;
}
.contact-form h3{
    margin-bottom: 8%;
    margin-top: -10%;
    text-align: center;
    color: #0062cc;
}
.contact-form .btnContact {
    width: 50%;
    border: none;
    border-radius: 1rem;
    padding: 1.5%;
    background: #dc3545;
    font-weight: 600;
    color: #fff;
    cursor: pointer;
}
.btnContactSubmit
{
    width: 50%;
    border-radius: 1rem;
    padding: 1.5%;
    color: #fff;
    background-color: #0062cc;
    border: none;
    cursor: pointer;
}</style>
<script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script type="text/javascript"></script>
</head>
                            
<body>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container contact-form">
            <div class="contact-image">
                <img src="https://image.ibb.co/kUagtU/rocket_contact.png" alt="rocket_contact">
            </div>
            <form action="Controlador" method="post">
            <% 
                Calcular obj = new Calcular();
                obj = (Calcular)request.getAttribute("ObjetoJava");
                
            %>
                <h3>Formulario</h3>
               <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Rut" name="rut" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_rut())){
                                    out.println("Rut incorrecto");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Nombre" name="nombre" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_nombre())){
                                    out.println("Nombre incorrecto");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Apellido Paterno" name="apellido_p" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_apellido_p())){
                                    out.println("Apellido paterno incorrecto");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="text"  class="form-control" placeholder="Apellido Materno" name="apellido_m" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_apellido_m())){
                                    out.println("Apellido materno incorrecto");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Email" name="email" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_email())){
                                    out.println("Email incorrecto");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-control" placeholder="Telefono de contacto" name="telefono" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_telefono())){
                                    out.println("Telefono incorrecto");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-control" placeholder="Monto a solicitar" name="monto" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_monto())){
                                    out.println("Monto incorrecto");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="number" class="form-control" placeholder="Plazo" name="plazo" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_plazo())){
                                    out.println("Plazo incorrecto");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="date" class="form-control" placeholder="Fecha primer vencimiento" name="fecha_p" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_fecha_pago())){
                                    out.println("Fecha primer pago incorrecta");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="date" class="form-control" placeholder="Fecha de nacimiento" name="fecha_n" value="">
                            <% 
                                if(obj != null){
                                //out.println(obj.validar_rut());
                                if (!(obj.validar_fecha_nacimiento())){
                                    out.println("Fecha nacimiento incorrecta");   
                                }
                            }
                            %> 
                        </div>
                        <div class="form-group">
                            <input type="submit" name="btnSubmit" class="btnContact" value="Enviar">
                        </div>
                        <%
                            try { 
            String url = "jdbc:mysql://localhost:3306/SimRipl"; 
            Connection conn = DriverManager.getConnection(url,"root",""); 
            Statement st = conn.createStatement(); 
            st.executeUpdate("INSERT INTO Sujetos "+"VALUE ('192086167', 'Bastian', 'Cornejo', 'Peralta', 'email@gmail.com', '12345678', '300000', '7', '22/12/2019', '02/02/1990')");

            conn.close(); 
        } catch (Exception e) { 
            System.err.println("Got an exception! "); 
            System.err.println(e.getMessage()); 
        } 


                        
                        
                        %>
                    </div>
                </div>
            </form>
</div>                    
</body>
</html>
