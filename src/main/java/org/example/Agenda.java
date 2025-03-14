package org.example;

import java.util.*;

/**
 * La clase Agenda contiene una lista de contactos.
 * Se puede añadir, eliminar o modificar los contactos en la agenda.
 */

public class Agenda implements AgendaInterfaz {

    //Lista de Contactos
    private List<Persona> contacts;

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    //Añadir Nuevo contacto.
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    // Eliminar Contacto
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();
        while (it.hasNext()) {
            Persona c = it.next();
            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    // Modificar Teléfono
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();
                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}
