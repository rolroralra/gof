package test.location.visitor;

import test.location.Player;
import test.location.location.Castle;
import test.location.location.Cave;
import test.location.location.Town;

public class PlayerVisitor implements Visitor {
	
	private Player player;
	
	public PlayerVisitor(Player player)
	{
		this.player = player;
	}

	@Override
	public void visit(Town town) {
		System.out.println( "마을 방문 : " + (player.getEvilPoint() <= 0 ? "전투" : "휴식"));
	}

	@Override
	public void visit(Castle castle) {
		System.out.println( "성 방문 : " + (player.getEvilPoint() <= 0 ? "전투" : "휴식"));
	}

	@Override
	public void visit(Cave cave) {
		System.out.println( "소굴 방문 : " + (player.getEvilPoint() <= 0 ? "휴식" : "전투"));
	}

}
