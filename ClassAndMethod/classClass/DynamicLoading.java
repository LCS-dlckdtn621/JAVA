package classClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicLoading {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("java.lang.String");

        Constructor[] cons = c.getConstructors();
        for(Constructor con : cons){
            System.out.println(con);
        }

        Method[] m = c.getMethods();
        for(Method method : m){
            System.out.println(method);
        }

        Class c1 = Class.forName("classClass.Person");
        Person person1 = (Person)c1.newInstance();
        System.out.println(person1);

        Class[] parameterTypes = {String.class};
        Constructor con = c1.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person personLee = (Person)con.newInstance(initargs);
        System.out.println(personLee);

    }
}
