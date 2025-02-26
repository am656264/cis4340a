//Rule 14. Serialization (SER)
//Ex: SER11-J. Prevent overwriting of externalizable objects 
private final Object lock = new Object();
private boolean initialized = false;
 
public void readExternal(ObjectInput in)
                         throws IOException, ClassNotFoundException {
  synchronized (lock) {
    if (!initialized) {
      // Read instance fields
      this.name = (String) in.readObject();
      this.UID = in.readInt();
      // ... 
      initialized = true;
    } else {
      throw new IllegalStateException();
    }
  }
}
