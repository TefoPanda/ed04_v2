package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta Clase contiene dos atributos: el nombre del contacto y un listado de teléfonos.
 */

class Persona {

    //Nombre del contacto.
    private String name;

    //Lista de teléfonos del contacto.
    private List<String> phones;

    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    //Obtención del nombre de contacto.
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Obtención de la lista de teléfonos.
    public List<String> getPhones() {
        return this.phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
