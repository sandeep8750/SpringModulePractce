package in.ineuron.comp;

import java.util.Set;

public class EnggCourse2 {
	private Set<String> subjects;

	
	public EnggCourse2(Set<String> subjects) {
		super();
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "EnggCourse [subjects=" + subjects + "]";
	}

}
