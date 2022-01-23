package se.lexicon.susanne.dao;

import se.lexicon.susanne.AppUser;

import java.util.Collection;

public interface AppUserDAO {

    AppUser persist(AppUser appUser);
    AppUser findByUsername(String userName);
    Collection<AppUser> findAll();
    boolean remove(String userName);


}
