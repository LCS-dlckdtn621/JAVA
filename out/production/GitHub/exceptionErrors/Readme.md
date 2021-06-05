    try(FileInputStream fis = new FileInputStream("a.txt")){

    } catch(FileNotFoundException e){
        
    } catch(IOException e){
            
    }

- 이렇게 하면 Resource Close 를 자동으로 해주는 좋은 코딩
- 밑에 처럼 하는거 보다 훨씬 짧고 좋은 코딩

----------
    FileInputStream fis = null;

    try {
       fis = new FileInputStream("a.txt");
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } finally {
        if(fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
                //늘 불리는 경우는 finally로 해결하자
            }
        }
    }
