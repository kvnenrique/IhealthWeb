<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        
    </head>
    <body>
        <%@ include file="/WEB-INF/navbar.html" %>
        <br>
        <h2 class="text-info">Bienvenido al portal para pacientes Ihealth</h2>
        <br>
        <!--
        Carrucel de assets/imagenes
        -->
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
              <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
              <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
              <div class="carousel-item active">
                <img class="d-block w-100" src="assets/imagenes/ABC1.jpg" alt="First slide">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Centro Santa Fe</h5>
                    <p>Hospitales de alta especialidad en CDMX</p>
                </div>
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="assets/imagenes/ABC2.jpg" alt="Second slide">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Centro Interlomas</h5>
                    <p>Hospitales de alta especialidad en CDMX</p>
                </div>
              </div>
              <div class="carousel-item">
                <img class="d-block w-100" src="assets/imagenes/ABC3.jpg" alt="Third slide">
                <div class="carousel-caption d-none d-md-block">
                    <h5>Centro del alta especialidad</h5>
                    <p>Hospitales de alta especialidad en CDMX</p>
                </div>
              </div>
            </div>
            <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
        </div>
        
        <div class="container center">
            <h1 class = "text-info">¿Qué es coronavirus?</h1>
            <p class="text-secondary">Los coronavirus son una familia de virus que se descubrió en la década de los 60 pero cuyo
                origen es todavía desconocido. Sus diferentes tipos provocan distintas enfermedades, desde un resfriado hasta 
                un síndrome respiratorio grave (una forma grave de neumonía).
            </p>
        </div>

        <div class="container">
          <div class="row">
             <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="assets/imagenes/eventos.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Eventos</h5>
                    <p class="card-text">Consulta los eventos que prepatamos preparados para ti.</p>
                    <a href="portal_clientes/eventos.html" class="btn btn-info">Consultar!</a>
                  </div>
              </div>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
              <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="assets/imagenes/hospital.jpg" alt="Card image cap">
                <div class="card-body">
                  <h5 class="card-title">Instalaciones</h5>
                  <p class="card-text">Conoce nuestras instalaciones.</p>
                  <a href="/ihealth_v2/servletInstalaciones" class="btn btn-info">Consultar!</a>
                </div>
            </div>
          </div>
        </div>
        
        


        
        <br>
        <br>
        <br>

            
    </body>
    
<%@ include file="/WEB-INF/footer.jsp" %>
</html>
