package se.lexicon.susanne.dao;

import se.lexicon.susanne.Person;

import java.util.Collection;

public class PersonDAOCollection implements PersonDAO{

    private Collection<Person> persons;
    Person person = new Person();

    @Override
    public Person persist(Person person) {
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person temp : persons ) {
            if (temp.getId() == id)
                person = temp;
        }
        return person;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person temp : persons ) {
            if (temp.getEmail().equals(email))
                person=temp;
        }
        return person;
    }

    @Override
    public Collection<Person> findAll() {
        return persons;
    }

    @Override
    public void remove(int id) {
        persons.removeIf(temp -> temp.getId() == id);
    }
}
