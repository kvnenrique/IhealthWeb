<%-- 
    Document   : dir_medico
    Created on : 2/03/2020, 08:44:55 PM
    Author     : tealflipper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<%@ include file="/WEB-INF/navbar.html" %>

  <div class="card" style="width: 300px;">
    <img src="/ihealth_v2/assets/imagenes/generic-doctor-m.png" class="card-img-top rounded-circle"  alt="imagen médico">
    <div class="card-body">
      <h5 class="card-title">Nombre médico</h5>
      <h6 class="card-text">Departamento</h6>
      <h7 class="card-text">Instalación</h7> <br>
      <a href="#collapsedContact" class="btn btn-primary" data-toggle="collapse"role="button" aria-expanded="false" aria-controls="collapsedContact">Contactar</a>
      <a href="#collapsedInfo" class="btn btn-primary" data-toggle="collapse"role="button" aria-expanded="false" aria-controls="collapsedInfo">Ver más</a>
      <div class="collapse" id="collapsedInfo">
        <div class="card card-body">
          <h6 class="card-text">Especialidad: mi especialidad</h6>
          <h6 class="card-text">Subespecialidad: mi subespecialidad</h6>
          <h6 class="card-text">Licenciatura: mi licenciatura</h6>
          <h6 class="card-text">Idiomas: mis idiomas</h6>
        </div>
      </div>
      <div class="collapse" id="collapsedContact">
        <div class="card card-body">
          <h6 class="card-text">email: </h6>
          <h6 class="card-text">Telefono: </h6>
        </div>
      </div>
    </div>
  </div>
<%@ include file="/WEB-INF/footer.jsp" %>
</body>
</html>