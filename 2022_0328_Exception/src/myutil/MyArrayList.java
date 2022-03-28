package myutil;

public class MyArrayList {

	Object[] data;

	// data 배열의 갯수를 구하는 메서드

	public int size() {
		return (data == null) ? 0 : data.length;
	}

	public void add(Object ob) {

		// 기본갯수 +1
		Object[] im = new Object[this.size() + 1];
		// 기존데이터 -> im배열로 옮기기
		for (int i = 0; i < size(); i++) {
			im[i] = data[i];
		}

		// im배열 마지막칸에 추가데이터 넣기
		im[size()] = ob;

		// im 배열 = 기존배열 + 1
		data = im;
	}

	public Object get(int index) throws Exception {

		// 안되는 조건
		if (index < 0 || index >= size()) {
			String message = String.format("사용범위 0~%d ", index);
			throw new Exception(message);
		}
		return data[index];
	}

	public void remove(int index) throws Exception {
		if (index < 0 || index >= size()) {
			String message = String.format("사용범위 0~%d ", index);
			throw new Exception(message);
		}
		// 데이터가 1개만 있을경우
		if (size() == 1) {
			data = null;
			return;
		}

		// 기존 데이터보다 1개 적게 생성
		Object[] im = new Object[size() - 1];

		for (int i = 0; i < im.length; i++) {
			if (i < index) { // 삭제할 index보다 작으면 그대로 복사
				im[i] = data[i];
			} else {
				im[i] = data[i + 1];
			}
			
		}
		data = im;

	}
}
