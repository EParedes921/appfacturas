package org.eparedes.appfacturas.objectscasting;

public class Repartidor extends Empleado {

    private String zona;

    public Repartidor(String nombre, String apellido, int edad, double salario, String zona) {
        super(nombre, apellido, edad, salario);
        this.zona = zona;
    }

    @Override
    public boolean plus(double plus) {
        boolean aumento = false;
        if (edad > 40 && zona.equals("zona 3")) {
            salario += plus;
            aumento = true;
        }
        return aumento;
    }

    public void metodoRepartidor(){
        System.out.println("Estoy en la clase repartidor");
    }

    @Override
    public void metodo(){
        System.out.println("Con Polimorfismo - Estoy en la clase repartidor");
    }
}