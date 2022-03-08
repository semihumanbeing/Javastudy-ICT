package mymain;

public class _03_For_4 {

	public static void main(String[] args) {
		
		for(int i=65;i<=90;i++) {
			System.out.printf("%c ", i);
		}
		System.out.println();
		
		for(int i='A';i<='Z';i++) {
			System.out.printf("%c ", i);
		}
		System.out.println();
		
		for(int i=0;i<26;i++) {
			System.out.printf("%c ",'A'+i);
		}
		System.out.println();
		
		for(int i='A';i<='Z';i++) {
			System.out.printf("%c", i);
			System.out.printf("%c ", i+32);
		}
		System.out.println();
		
		for(int i=0;i<26;i++) {
			System.out.printf("%c", 'A'+i);
			System.out.printf("%c ", 'A'+i+32);
		}
		System.out.println();
		
		for(int i=0;i<26;i++) {
			if(i%3==2) {
			System.out.printf("%c", 'A'+i);
			System.out.print("-");
			
			} else {
			System.out.printf("%c", 'A'+i);

			}
			}
			
		System.out.println();

	}

}
