package pw.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pw.Model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Optional<Usuario> findUsuarioByLogin(String login);
}