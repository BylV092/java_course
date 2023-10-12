package org.example;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int opcionIndice = 0;
        connectionToDataBase conexionBaseDatos = new connectionToDataBase();
        userRepositoryImp usuarioRepositorio = new userRepositoryImp();

        do {
            Map<String, Integer> operaciones = new HashMap<>();
            operaciones.put("Actualizar", 1);
            operaciones.put("Eliminar", 2);
            operaciones.put("Agregar", 3);
            operaciones.put("Listar", 4);
            operaciones.put("Salir", 5);

            Object[] opArreglo = operaciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Operación",
                    "Mantenedor de Usuarios",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = operaciones.get(opcion.toString());
                ejecutarOperacion(opcionIndice, usuarioRepositorio);
            }
        } while (opcionIndice != 5);

        connectionToDataBase.cerrarConexion();
    }


    public static void ejecutarOperacion(int opcion, userRepositoryImp usuarioRepositorio) {
        switch (opcion) {
            case 1: // Actualizar
                int idParaActualizar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario a actualizar:"));
                user usuarioParaActualizar = usuarioRepositorio.buscarPorId(idParaActualizar);

                if (usuarioParaActualizar != null) {
                    usuarioParaActualizar.setUsername(JOptionPane.showInputDialog("Nuevo nombre de usuario:"));
                    usuarioParaActualizar.setPassword(JOptionPane.showInputDialog("Nueva contraseña:"));
                    usuarioParaActualizar.setEmail(JOptionPane.showInputDialog("Nuevo correo electrónico:"));

                    boolean exito = usuarioRepositorio.actualizar(usuarioParaActualizar);

                    if (exito) {
                        JOptionPane.showMessageDialog(null, "Usuario actualizado exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar el usuario.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
                }
                break;

            case 2: // Eliminar
                int idParaEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario a eliminar:"));

                boolean exito = usuarioRepositorio.eliminar(idParaEliminar);

                if (exito) {
                    JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el usuario o usuario no encontrado.");
                }
                break;

            case 3: // Agregar
                user nuevoUsuario = new user();
                nuevoUsuario.setUsername(JOptionPane.showInputDialog("Ingrese el nombre de usuario:"));
                nuevoUsuario.setPassword(JOptionPane.showInputDialog("Ingrese la contraseña:"));
                nuevoUsuario.setEmail(JOptionPane.showInputDialog("Ingrese el correo electrónico:"));

                exito = usuarioRepositorio.crear(nuevoUsuario);

                if (exito) {
                    JOptionPane.showMessageDialog(null, "Usuario creado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al crear el usuario.");
                }
                break;

            case 4: // Listar
                List<user> usuarios = usuarioRepositorio.listarTodos();

                if (!usuarios.isEmpty()) {
                    StringBuilder listaUsuarios = new StringBuilder();

                    for (user usuario : usuarios) {
                        listaUsuarios.append("ID: ").append(usuario.getId()).append("\n");
                        listaUsuarios.append("Usuario: ").append(usuario.getUsername()).append("\n");
                        listaUsuarios.append("Correo electrónico: ").append(usuario.getEmail()).append("\n\n");
                    }

                    JOptionPane.showMessageDialog(null, listaUsuarios.toString(), "Lista de Usuarios", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron usuarios.");
                }
                break;


            case 5: // Salir
                JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                connectionToDataBase.cerrarConexion(); // Cierra la conexión antes de salir
                System.exit(0); // Finaliza la ejecución del programa
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
                break;
        }
    }
}
