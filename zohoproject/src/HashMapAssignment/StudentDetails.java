package HashMapAssignment;

import java.util.Map.Entry;

public class StudentDetails {

	public void studentdetails() {
		// TODO Auto-generated method stub
	    for(Entry<Long, HashMapStudent> entry : StudentCreation.hashMap.entrySet()) {
	    	System.out.println("regno: "+entry.getKey());
	    	HashMapStudent pojo = entry.getValue();
	    	System.out.println("student name:"+pojo.getName());
	    	System.out.println("student age:"+pojo.getAge());
	    	System.out.println("Student email:"+pojo.getEmail());
	    }
	}

}
