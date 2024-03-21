package org.eparedes.appfacturas.objectscasting;

public class Casting_objetos {
    public static void main(String[] args) {
        //Casting de objetos con Objetos Personalizados
        Comercial e1 = new Comercial("fer", "ure", 60, 1000, 150);
        Repartidor e2 = new Repartidor("fer", "ure", 50, 1000, "zona 3");
        Empleado e3 = new Empleado("fer", "ure", 42, 1000);

        Empleado[] empleados = {e1, e2, e3};

        Empleado e10 = null;
        Comercial c1;
        Repartidor r1;

        for (Empleado e : empleados) {
            if(e instanceof Comercial){
                c1 = (Comercial)e;
                c1.metodoComercial();
                e10 = c1;
            }
            if(e instanceof Repartidor){
                r1 = (Repartidor)e;
                r1.metodoRepartidor();
            }
        }
        System.out.println();

        // Con Polimorfismo
        Empleado[] empleadosPoli = new Empleado[3];
        empleadosPoli[0] = e1;
        empleadosPoli[1] = e2;
        empleadosPoli[2] = e3;

        for (Empleado e : empleadosPoli) {
            e.metodo();
        }
        System.out.println();

        //Casting de objetos con Objetos de java
        Object[] object = new Object[2];
        String s1 = "String uno";
        Integer i1 = 10;

        object[0] = s1;
        object[1] = i1;

        for (Object o:object){
            if (o instanceof String)
                s1 = (String) o;
            if(o instanceof Integer)
                i1 = (Integer) o;
        }
        System.out.println("Casting de Object a String: "+s1);
        System.out.println("Casting de Object a Integer: "+i1);

    }
}
