package test.potion.receiver;

public class Player {
    
	private final String NORMAL = "NORMAL";
	private final String ADDICTED = "ADDICTED";
	
    private int hp;
    private String state;
    
    public Player() {
        this.hp = 50;
        this.state = ADDICTED;
    }
    
    public void tryHeal(int hp) {
    	this.hp += hp;
        System.out.printf("%d 회복하여, 체력이 %d가 되었습니다.%n", hp, this.hp);
    }
    
    public void tryDetox() {
    	if(NORMAL.equals(this.state)) {
    		System.out.println("중독되어있지 않습니다.");
    	}
    	else {
    		System.out.println("해독에 성공하였습니다.");
    		this.state = NORMAL;
    	}
    }
}
