//Rule 14. Serialization (SER)
//Ex: SER11-J. Prevent overwriting of externalizable objects 
public void readExternal(ObjectInput in)
                         throws IOException, ClassNotFoundException {
   // Read instance fields
   this.name = (String) in.readObject();
   this.UID = in.readInt();
   // ...
}
