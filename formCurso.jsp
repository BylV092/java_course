<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Curso</title>
</head>
<body>
    <h1>Formulario de Curso</h1>
    <form action="guardar-curso" method="post">
        <input type="hidden" name="id" value="${curso.id}">
        <label for="nombre">Nombre del Curso:</label>
        <input type="text" name="nombre" value="${curso.nombre}" required><br>
        <label for="descripcion">Descripción:</label>
        <textarea name="descripcion" required>${curso.descripcion}</textarea><br>
        <input type="submit" value="Guardar">
    </form>
    <br>
    <a href="listar-cursos">Volver al Listado de Cursos</a>
</body>
</html>
