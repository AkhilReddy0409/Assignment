package Q6;

abstract class Persistence {
    abstract public void persist();
}
class FilePersistence extends Persistence{
    @Override
    public void persist() {
		 System.out.println("SAVED IN FILE");
    	
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public void persist() {
    	System.out.println("SAVED IN DataBase");
    } }


public class Assignment2Q6 {

	public static void main(String[] args) {
		Persistence p= new FilePersistence();
		Persistence p1= new DatabasePersistence();
		FilePersistence f= new FilePersistence();
		DatabasePersistence db= new DatabasePersistence();
		p.persist();
		p1.persist();
		//f.persist();
		//db.persist();
	} }

