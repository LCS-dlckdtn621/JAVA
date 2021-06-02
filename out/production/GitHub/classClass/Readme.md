        Class c1 = Class.forName("classClass.Person");
        Person person1 = (Person)c1.newInstance();
        System.out.println(person1);

        Class[] parameterTypes = {String.class};
        Constructor con = c1.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person personLee = (Person)con.newInstance(initargs);
        System.out.println(personLee);

- 서로 다른 메모리에 올려진 프로그램간 호환을 위해서 이런 식의 코딩을 한다.
