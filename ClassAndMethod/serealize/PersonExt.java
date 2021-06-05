package serealize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PersonExt implements Externalizable {
    String name;
    String job;

    public PersonExt(){

    }

    public PersonExt(String name, String job){
        this.name = name;
        this.job = job;
    }

    public String toString(){
        return name +", " + job;
    }

    @Override
    public void writeExternal(ObjectOutput obj) throws IOException {
        obj.writeUTF(name);
        obj.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
        name = obj.readUTF();
        job = obj.readUTF();
    }
}
