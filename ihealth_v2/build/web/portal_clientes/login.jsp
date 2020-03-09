<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@ page import="javax.servlet.http.HttpServletRequest" %>
<html>
    
    <%@ include file="/WEB-INF/navbar2.html" %>
    <head>
        <link href="login.css" rel="stylesheet" id="bootstrap-css">
    </head>
    <body>
        <br>
        <br>
        
      
        
        
        <div class="login-wrap">
	
        <!--Para el action hay que agregar el contexto(ruta completa) provista por META-INF/context.xml -->
        <form action="/ihealth_v2/servletLoginCliente" method="post">  
            <div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Ingresar</label>
		<input id="tab-2" type="radio" name="tab" class="for-pwd"><label for="tab-2" class="tab">Olvide mi contraseña</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="usuario" class="label">Usuario</label>
					<input name="usuario" id="usuario" type="text" class="input">
				</div>
				<div class="group">
					<label  for="contrasenia" class="label">Contraseña</label>
					<input name="contrasenia" id="contrasenia" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Ingresar">
				</div>
				<div class="hr"></div>
			</div>
			<div class="for-pwd-htm">
				<div class="group">
					<label for="user" class="label">Usuario o email</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Restaurar contraseña">
				</div>
				<div class="hr"></div>
			</div>
		</div>
            </div>
        </form>
        
        </div>
        
        
    </body>
    <br>
    <br>
    <br>
    <br>
    <%@ include file="/WEB-INF/footer.jsp" %>
   
    
  
</html>
