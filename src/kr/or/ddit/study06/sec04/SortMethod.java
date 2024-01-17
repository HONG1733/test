package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Collection;

public class SortMethod {
	public static void main(String[] args) {
		SortMethod sm = new SortMethod();
		int[] arr = {3,4,2,1,5};
		Arrays.sort(arr);
		System.out.println(arr);
//		arr = sm.sort(arr, 1);
		System.out.println(sm.toArrayString(arr));
		System.out.println(Arrays.toString(arr));
		
	}
	/*
	 * 리턴타입은 String 파라미터는 배열
	 */
	public String toArrayString(int[] arr) {
	    String result="{";
		for(int i=0; i<arr.length; i++) {
		result+= arr[i];
		if(i== arr.length-1) {
			result+="}";
		}else {
			result+=", ";
		}
//		+",";
	}
		return result;
	}
	
	/*
	 * 파라미터로 int 배열, int sel(1,2)
	 * sel =1 오름차순 정렬
	 * sel =2 내림차순 정렬이 되게 할것.
	 */
	
	public int[] sort(int[] arr, int sel) {
		if(sel == 1) return sortAsc(arr);
		else return sortDesc(arr);
	}
	
	

	/*
	 * int 배열을 파라미터로 받고
	 * 버플 정렬을 통해서 오름차순으로 정렬후
	 * 배열리턴
	 */
	public int[] sortAsc (int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] <arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	/*
	 * int 배열을 파라미터로 받고
	 * 버플 정렬을 통해서 내림차순으로 정렬후
	 * 배열리턴
	 */
	public int[] sortDesc (int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
