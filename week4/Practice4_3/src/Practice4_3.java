import java.util.ArrayList;

public class Practice4_3 {

	public static void main(String[] args) {
		ArrayList<String> list;
		list = new ArrayList<>();
		list.add("오렌지");
		list.add("사과");
		list.add("포도");
		
		System.out.println("초기 배열의 리스트: ");
		for(String fruits : list)
			System.out.print(fruits + " ");
		System.out.println("\n배열의 두번째 항목: " + list.get(1));
		System.out.println("자몽이 추가된 배열의 리스트: ");
		list.add("자몽");
		for(String fruits : list)
			System.out.print(fruits + " ");
		System.out.println("\n포도 삭제후 배열 리스트: ");
		list.remove(2);
		for(String fruits : list)
			System.out.print(fruits + " ");
	}

}
