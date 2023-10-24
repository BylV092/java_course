<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de Producto</title>
</head>
<body>
    <h1>Registro de Producto</h1>
    <form action="/webapp-form-tarea2/crear" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" required>
       <% if (nombreError != null) { %>
           <span class="error"><%= nombreError %></span>
       <% } %>

        <label for="precio">Precio:</label>
        <input type="number" name="precio" required>
        <% if (precioError != null) { %>
            <span class="error"><%= nombreError %></span>
        <% } %>

        <label for="fabricante">Fabricante:</label>
        <input type="text" name="fabricante" required minlength="4" maxlength="10">
        <% if (fabricanteError != null) { %>
            <span class="error"><%= nombreError %></span>
        <% } %>
        <input type="submit" value="Registrar">
    </form>
</body>
</html>
