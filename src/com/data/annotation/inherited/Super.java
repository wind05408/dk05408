package com.data.annotation.inherited;

@DBTable
public class Super{
	private int superPrivateF;
	public int superPublicF;
	
	public Super(){
	}
	
	private int superPrivateM(){
		return 0;
	}
	public int superPubliceM(){
		return 0;
	}
}