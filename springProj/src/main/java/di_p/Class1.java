package di_p;

import java.util.Arrays;
import java.util.List;

public class Class1 {
	Student[] std;
	//위 아래 차이를 잘 모르겠음
	/*
	List<Student> stdList;
	

	public List<Student> getStdList() {
		return stdList;
	}

	public void setStdList(List<Student> stdList) {
		this.stdList = stdList;
	}
	*/
	
	public Class1(Student[] std) {
		super();
		this.std = std;
		rankCalc();
	}

	public void rankCalc() {
		
		for(int i=0; i<std.length; i++) {
			int count = 1;
			for(int j=0; j<std.length; j++) {
				if(std[i].getSum() < std[j].getSum()) {
					//int p =std[i].getRank()+1;
					count++;
					std[i].setRank(count);
				}
			}
		}
	}
	@Override
	public String toString() {
		return "Class1 [1반=>\n" + Arrays.toString(std) + "]";
	}
	
}
