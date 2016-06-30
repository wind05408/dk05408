package com.data.annotation.inherited;

@DBTable2
public class Sub extends Super{
	private int subPrivateF;
	public int subPublicF;
	
	private Sub(){
	}
	public Sub(int i){
	}
	
	private int subPrivateM(){
		return 0;
	}
	public int subPubliceM(){
		return 0;
	}
}