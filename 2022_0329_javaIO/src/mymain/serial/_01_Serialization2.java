package mymain.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _01_Serialization2 {

	public static void main(String[] args) throws Exception {

		
		List<PersonVo> pList = new ArrayList<PersonVo>();
		pList.add(new PersonVo("일길동", 21, "서울시 마포구 서교1동"));
		pList.add(new PersonVo("이길동", 22, "서울시 마포구 서교2동"));
		pList.add(new PersonVo("삼길동", 23, "서울시 마포구 서교3동"));
		pList.add(new PersonVo("사길동", 24, "서울시 마포구 서교4동"));
		pList.add(new PersonVo("오길동", 25, "서울시 마포구 서교55동"));
		
		
		PersonVo[] pArray = { 
				new PersonVo("일길동", 21, "서울시 마포구 서교1동"), new PersonVo("이길동", 22, "서울시 마포구 서교2동"),
				new PersonVo("삼길동", 23, "서울시 마포구 서교3동"), new PersonVo("사길동", 24, "서울시 마포구 서교4동"),
				new PersonVo("오길동", 25, "서울시 마포구 서교5동") };

		OutputStream os = new FileOutputStream("personList.dat"); // 직렬화 처리객체로 연결
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(pList);

		oos.close();
		os.close();

		// 역직렬화 -> 읽기(복원)
		InputStream is = new FileInputStream("personList.dat");
		// 역직렬화 객체로 필터
		ObjectInputStream ois = new ObjectInputStream(is);
		// 파일내용을 읽어와서 복원(역직렬화)
		
		@SuppressWarnings("unchecked")
		List<PersonVo> pList1 = (List<PersonVo>) ois.readObject(); 
		for (PersonVo p : pList1) {
		System.out.println(p); }
		 

		// 직렬화(열린 역순)

		ois.close();
		is.close();

	}

}
