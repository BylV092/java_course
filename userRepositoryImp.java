package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class userRepositoryImp implements Repository<user> {
    @Override
    public user buscarPorId(int id) {
        Connection conexion = connectionToDataBase.obtenerConexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        user usuario = null;

        try {
            String consulta = "SELECT * FROM usuarios WHERE id = ?";
            preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                usuario = new user();
                usuario.setId(resultSet.getInt("id"));
                usuario.setUsername(resultSet.getString("username"));
                usuario.setPassword(resultSet.getString("password"));
                usuario.setEmail(resultSet.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                connectionToDataBase.cerrarConexion(conexion);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuario;
    }


    @Override
    public List<user> listarTodos() {
        Connection conexion = connectionToDataBase.obtenerConexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<user> usuarios = new ArrayList<>();

        try {
            String consulta = "SELECT * FROM usuarios";
            preparedStatement = conexion.prepareStatement(consulta);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                user usuario = new user();
                usuario.setId(resultSet.getInt("Id"));
                usuario.setUsername(resultSet.getString("username"));
                usuario.setPassword(resultSet.getString("password"));
                usuario.setEmail(resultSet.getString("email"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                connectionToDataBase.cerrarConexion(conexion);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuarios;
    }


    public boolean crear(user usuario) {
        Connection conexion = connectionToDataBase.obtenerConexion();
        PreparedStatement preparedStatement = null;

        try {
            String consulta = "INSERT INTO usuarios (username, password, email) VALUES (?, ?, ?)";
            preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setString(1, usuario.getUsername());
            preparedStatement.setString(2, usuario.getPassword());
            preparedStatement.setString(3, usuario.getEmail());

            int filasAfectadas = preparedStatement.executeUpdate();

            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                connectionToDataBase.cerrarConexion(conexion);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public boolean actualizar(user usuario) {
        Connection conexion = connectionToDataBase.obtenerConexion();
        PreparedStatement preparedStatement = null;

        try {
            String consulta = "UPDATE usuarios SET username = ?, password = ?, email = ? WHERE id = ?";
            preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setString(1, usuario.getUsername());
            preparedStatement.setString(2, usuario.getPassword());
            preparedStatement.setString(3, usuario.getEmail());
            preparedStatement.setInt(4, usuario.getId());

            int filasAfectadas = preparedStatement.executeUpdate();

            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                connectionToDataBase.cerrarConexion(conexion);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public boolean eliminar(int id) {
        Connection conexion = connectionToDataBase.obtenerConexion();
        PreparedStatement preparedStatement = null;

        try {
            String consulta = "DELETE FROM usuarios WHERE id = ?";
            preparedStatement = conexion.prepareStatement(consulta);
            preparedStatement.setInt(1, id);

            int filasAfectadas = preparedStatement.executeUpdate();

            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                connectionToDataBase.cerrarConexion(conexion);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

