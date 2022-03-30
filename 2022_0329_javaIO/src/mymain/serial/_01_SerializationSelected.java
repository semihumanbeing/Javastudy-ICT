package mymain.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;
import vo.PersonVo2;

public class _01_SerializationSelected {

	public static void main(String[] args) throws Exception {

		PersonVo2 p = new PersonVo2("홍길동", 20, "서울시 마포구 서교동");

		OutputStream os = new FileOutputStream("person2.dat"); // 직렬화 처리객체로 연결
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(p);

		oos.close();
		os.close();

		// 역직렬화 -> 읽기(복원)
		InputStream is = new FileInputStream("person2.dat");
		// 역직렬화 객체로 필터
		ObjectInputStream ois = new ObjectInputStream(is);
		// 파일내용을 읽어와서 복원(역직렬화)
		PersonVo2 p1 = (PersonVo2) ois.readObject();
		System.out.println(p1);

		// 직렬화(열린 역순)

		ois.close();
		is.close();
	}

}
