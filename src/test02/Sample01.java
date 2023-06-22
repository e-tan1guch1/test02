package test02;

import java.util.ArrayList;
import java.util.List;

public class Sample01 {

	public static void main(String[] args) {
		

		List<String> list = new ArrayList<>();
		
		
		list.add("変えたぞー");
		list.add("伊山二度目の変更です");
		list.add("メッセージを表示");
		list.add("荒川孔貴です");
		list.add("届いていますか？");
		list.add("確認できました（谷口）");
		list.add("三人だと結構むずかしそうだ");
		list.add("");
		list.add("餃子");
		list.add("プルする時はマスターのブランチにしてください");
		
		for(String elem : list) {
			System.out.println(elem);
		}
	}

}
