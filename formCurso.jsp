<!DOCTYPE html>
<html>
<head>
    <title>Formulario de Curso</title>
    <<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Formulario de Curso</h1>
        <form action="guardar-curso" method="post">
            <input type="hidden" name="id" value="${curso.id}">
            <div class="form-group">
                <label for="nombre">Nombre del Curso:</label>
                <input type="text" class="form-control" name="nombre" value="${curso.nombre}" required>
            </div>
            <div class="form-group">
                <label for="descripcion">Descripción:</label>
                <textarea class="form-control" name="descripcion" required>${curso.descripcion}</textarea>
            </div>
            <button type="submit" class="btn btn-primary">Guardar</button>
        </form>
        <br>
        <a href="listar-cursos" class="btn btn-secondary">Volver al Listado de Cursos</a>
    </div>

        <!-- Agregar la referencia a jQuery y Bootstrap JS al final del cuerpo para que funcione Bootstrap -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
    </html>
