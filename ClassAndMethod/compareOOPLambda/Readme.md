    StringConcat stringConcat = (s1, s2) -> System.out.println(s1 + ", " + s2);
    stringConcat.makeString("Hello", "World");

    StringConcat stringConcat1 = new StringConcat() {
        @Override
        public void makeString(String s1, String s2) {
            
        }
    };

- 이런 식으로 익명클래스가 만들어 지는 것으로 이해하자
