package se.lexicon.susanne;

import java.util.Objects;

public class AppUser {

    private  String username;
    private  String password;
    private  AppRole role;

    public AppUser() {
    }

    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.equals(""))
            throw new IllegalArgumentException("Username can not be null/empty.");

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.equals(""))
            throw new IllegalArgumentException("Password can not be null/empty.");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null)
            throw new IllegalArgumentException("Role can not be null.");
        this.role = role;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return username.equals(appUser.username) && role.equals(appUser.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }
}
