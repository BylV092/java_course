<!DOCTYPE html>
<html>
<head>
    <title>Listado de Cursos</title>
</head>
<body>
    <h1>Listado de Cursos</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Descripción</th>
            <th>Acciones</th>
        </tr>
        <c:forEach items="${cursos}" var="curso">
            <tr>
                <td>${curso.id}</td>
                <td>${curso.nombre}</td>
                <td>${curso.descripcion}</td>
                <td>
                    <a href="curso-form?id=${curso.id}">Editar</a> |
                    <a href="curso-eliminar?id=${curso.id}">Eliminar</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="curso-form">Agregar Curso</a>
</body>
</html>
