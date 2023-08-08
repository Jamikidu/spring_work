package di_p.bicycle;

import java.util.Arrays;

public class Bicycle implements BicycleService{

	String biname;
	Wheel[] whe;
	Handle han;
	Basket bas;

	public Bicycle() {
		System.out.println("Bicycle 기본생성자");
	}
	
	public String getBiname() {
		return biname;
	}
	public void setBiname(String biname) {
		this.biname = biname;
	}

	public Wheel[] getWhe() {
		return whe;
	}

	public void setWhe(Wheel[] whe) {
		this.whe = whe;
	}

	public Handle getHan() {
		return han;
	}
	public void setHan(Handle han) {
		this.han = han;
	}
	public Basket getBas() {
		return bas;
	}
	public void setBas(Basket bas) {
		this.bas = bas;
	}

	@Override
	public String toString() {
		String result = "["+ biname +": 바퀴=" + whe.length+"개" + ", " + han + ", " + bas + "]";
		go();
		fix();
		fall();
		return result;
	}

	@Override
	public void go() {
		System.out.println(biname+"가 간다");
	}
	@Override
	public void fix() {
		System.out.println(biname+"를 고친다");
		
	}
	@Override
	public void fall() {
		System.out.println(biname+"가 넘어진다");
		
	}
	
	
	
	
	
}
