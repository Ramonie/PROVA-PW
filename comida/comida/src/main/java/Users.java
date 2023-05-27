import java.util.Collection;

import pw.comida.GrantedAuthority;
import pw.comida.UserDetails;

public class Users implements UserDetails {

    private String username;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public void UserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
    }

    /**
     * @return
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Implemente a lógica adequada para verificar se a conta está expirada
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Implemente a lógica adequada para verificar se a conta está bloqueada
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Implemente a lógica adequada para verificar se as credenciais estão expiradas
    }

    @Override
    public boolean isEnabled() {
        return true; // Implemente a lógica adequada para verificar se o usuário está habilitado
    }
}
