package se.lexicon.susanne.dao;

import se.lexicon.susanne.AppUser;

import java.util.Collection;

public class AppUserDAOCollection implements AppUserDAO {

    private Collection<AppUser> appUsers;
    AppUser appUser = new AppUser();

    @Override
    public AppUser persist(AppUser appUser) {
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String userName) {
        for (AppUser temp : appUsers ) {
            if(temp.getUsername().equals(userName))
                appUser=temp;
        }
        return appUser;
    }

    @Override
    public Collection<AppUser> findAll() {
        return appUsers;
    }

    @Override
    public boolean remove(String userName) {
        for (AppUser temp : appUsers ) {
            if(temp.getUsername().equals(userName)) {
                appUsers.remove(temp);
                return true;
            }
        }
        return false;
    }

}
