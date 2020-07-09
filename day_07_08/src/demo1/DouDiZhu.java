package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DouDiZhu {
	public static void main(String[] args) {
		//1.组合牌
		HashMap<Integer,String> pooker = new HashMap<Integer,String>();
		ArrayList<Integer> pookerNumber = new ArrayList<Integer>();
		String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		String[] colors = {"♠","♥","♣","♦"};
		int index = 2;
		for(String number:numbers) {
			for(String color:colors) {
				pooker.put(index, color+number);
				pookerNumber.add(index);
				index++;
			}
		}
		pooker.put(0, "大王");
		pookerNumber.add(0);
		pooker.put(1, "小王");
		pookerNumber.add(1);
		
		//洗牌
		Collections.shuffle(pookerNumber);
		//发牌
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> bottom = new ArrayList<Integer>();
		for(int i = 0;i<pookerNumber.size();i++) {
			if(i < 3) {
				bottom.add(pookerNumber.get(i));
			}else if(0 == i % 3) {
				player1.add(pookerNumber.get(i));
			}else if(1 == i%3) {
				player2.add(pookerNumber.get(i));
			}else if(2 == i%3) {
				player3.add(pookerNumber.get(i));
			}
		}
		
		//看牌
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		look("王宝强",player1,pooker);
		look("成龙",player2,pooker);
		look("范冰冰",player3,pooker);
	}
	public static void look(String name,ArrayList<Integer > player,HashMap<Integer,String> pooker) {
		System.out.print(name + ": ");
		for(Integer key:player) {
			String value = pooker.get(key);
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
