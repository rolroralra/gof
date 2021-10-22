package test.location;

import test.location.location.Location;

public class Player {
	private int evilPoint = 0; // 0: ��, 1: ��
	private Location currentLocation;
	
	public int getEvilPoint() {
		return evilPoint;
	}

	public void setEvilPoint(int evilPt) {
		evilPoint = evilPt;
		
		System.out.println("플레이어가 " + (evilPoint <= 0 ? "악" : "선") + " 성향이 됩니다." );
	}
	
	public void setCurrentLocation(Location loc) {
		currentLocation = loc;
	}

}
