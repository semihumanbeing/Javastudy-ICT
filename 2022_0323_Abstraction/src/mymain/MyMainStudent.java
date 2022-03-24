package mymain;

import myutil.ElementarySchoolStudent;
import myutil.HighSchoolStudent;
import myutil.MiddleSchoolStudent;
import myutil.Student;

public class MyMainStudent {

	static void momSaid(Student[] studentArray) {

		for (int i = 0; i < studentArray.length; i++) {
			Student student = studentArray[i];

			// 다형성(polymorphism): 명령은 같으나 전달받은 객체마다 다른 행동을 하게 하는것
			student.study();
		}

	}

	public static void main(String[] args) {
		Student[] studentArray = { new ElementarySchoolStudent(), new MiddleSchoolStudent(), new HighSchoolStudent() };

		momSaid(studentArray);

	}

}
