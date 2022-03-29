package mymain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class _06_Properties {

	public static void main(String[] args) throws IOException {
		/*
		 * Map & Properties 
		 * 1. 사용 방법이 유사하다.(Key, value) 형태로 객체를 저장함 
		 * 2. Map은 객체를 저장관리할때 주로 사용하고 Properties 는 문자열의 속성을 관리할 때 주로 사용한다.
		 */
		
		// Properties: 속성을 저장관리하는 객체 (DB접속정보)
		Properties prop = new Properties();
		
		// 값을 저장하는 2가지 방법
		prop.put("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc.oracle.this:@localhost:1521:xe");
		prop.setProperty("userName", "scott");
		prop.setProperty("password", "tiger");
		
		// 값 읽어오기
		String driver = prop.getProperty("driver");
		System.out.printf("driver: %s\n",driver);
		
		try {
			// 파일로부터 db접속정보를 읽어오기
			Properties dbProp = new Properties();
			FileReader fr = new FileReader("db.properties");
			dbProp.load(fr);
			
			//각 속성값 읽어오기
			String driver1 = dbProp.getProperty("driver");
			String url = dbProp.getProperty("url");
			String username = dbProp.getProperty("username");
			String password = dbProp.getProperty("password");
			
			System.out.println("파일로부터 읽어온 db정보");
			System.out.printf("driver = %s\n", driver1);
			System.out.printf("url = %s\n", url);
			System.out.printf("username = %s\n", username);
			System.out.printf("password = %s\n", password);
			
			//파일닫기
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
