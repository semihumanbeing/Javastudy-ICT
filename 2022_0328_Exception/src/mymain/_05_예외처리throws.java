package mymain;

import java.util.ArrayList;

import myutil.MyArrayList;

public class _05_예외처리throws {
	
	public static void main(String[] args) throws Exception {
	//ArrayList(동적배열)
	ArrayList list = new ArrayList();
	System.out.printf("list's size = %d", list.size());
	
	list.add(10);
	System.out.printf("list's size = %d", list.size());
	list.add(30);
	System.out.printf("list's size = %d", list.size());
	list.add(20);
	System.out.printf("list's size = %d", list.size());
	
	int n = (int) list.get(1);
	System.out.println(n);
	
	//전체 데이터읽어오기
	for(int i =0;i<list.size();i++) {
		int m = (int) list.get(i);
		System.out.printf("index ->%d : %d\n",i,m);
	}
	list.remove(1);
	System.out.println(list.size());
	//---------------------------------------------------------------
	
	MyArrayList list1 = new MyArrayList();
	System.out.println(list1.size());
	
	list1.add(10);
	System.out.println(list1.size());

	list1.add(20);
	System.out.println(list1.size());

	list1.add(30);
	System.out.println(list1.size());
	
	try {
		//index의 객체정보 얻어오기
		int index = 2;
		int n1 = (int) list1.get(index);
		System.out.println(n1);
		
		System.out.println("삭제전");
		for(int i =0; i<list1.size();i++) {
			int m1 = (int) list1.get(i);
			System.out.printf("index %d -> %d\n", i, m1);
		}
		System.out.println("삭제후");
		index = 1;//삭제
		list1.remove(index);
		
		for(int i =0; i<list1.size();i++) {
			int m1 = (int) list1.get(i);
			System.out.printf("index %d -> %d\n", i, m1);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}
}
