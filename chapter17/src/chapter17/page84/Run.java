package chapter17.page84;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// Map 컬렉션 프레임워크진행 hashmap <K,V>
		//Arraylist 값객체 키 자동으로  인덱스 설정
		
		Map<Data, String> hm =  new HashMap<Data, String>();
		Map<Data, String> hsmap = Collections.synchronizedMap(hm);
		
		//add => put
		hm.put(new Data(3), new String("대홍단감자"));
		hm.put(new Data(1), new String("asd"));
		hm.put(new Data(2), new String("asd"));
		System.out.println(hm.toString());
		
		//set => replace
		hm.replace(new Data(1), new String("fasd"));
		System.out.println(hm.toString());
		
		//get
		System.out.printf("%s \n",hm.get(new Data(3)));
		
		//contains() // key //value //값확인
		System.out.printf("hm.contains() =  %s \n",hm.containsKey(new Data(2)));
		System.out.printf("hm.contains() =  %s \n",hm.containsValue(new String("대홍단감자")));
		
		//1.for each : ArrayList , set , (Map->set 변환시 가능)
		 Set<Data> mts = hm.keySet();
		 System.out.println(mts);
		 for (Data data : mts) {
		 //키 객체로 Value객체를 찾을 수 있다.
			String value = hm.get(data);
			System.out.printf("hm.get(%s) =  %s \n",data,value);
		}
		 
		 //2.entryset()=>1번 응용
		 //3.Set<Map.entry<Data, String>> => 향상된 포문을 실행.
		 Set<Map.Entry<Data,String>> entrySet = hm.entrySet();
		 System.out.println(entrySet);
		 for (Entry<Data, String> entry : entrySet) {
			 System.out.println(entry.getKey());
			 System.out.println(entry.getValue());
			
		}
		 //size()
		 System.out.printf("hm.size = %s \n",hm.size());
		 
		 //remove(K)
		 hm.remove(new Data(3));
		 System.out.println(hm);
		 
		 //clear()
		 hm.clear();
		 System.out.println(hm);
		 
		 //isEmty()
		 System.out.printf("hm.isEmty() = %s \n",hm.isEmpty());
	}

}
