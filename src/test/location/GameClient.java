package test.location;

import org.junit.jupiter.api.Test;
import test.location.location.Castle;
import test.location.location.Cave;
import test.location.location.Location;
import test.location.location.Town;
import test.location.visitor.PlayerVisitor;
import test.location.visitor.Visitor;

public class GameClient {

	@Test
	public void test_Guild() {
		// 1. 게임 생성
		Game game = new Game();
				
		// 2. 지도 생성
		Location town = new Town();
		Location castle = new Castle();
		Location cave = new Cave();
		
		game.locations.add(town);
		game.locations.add(castle);
		game.locations.add(cave);
		
		// 3. 플레이어 생성
		Player player = new Player();
		
		game.players.add(player);
				
		// 4. 플레이어 지도 방문 Visitor todtjd
		Visitor playerLocationVisitor = new PlayerVisitor(player);
				
		// 플레이어 선/악 성향 세팅
		player.setEvilPoint(0); // 악 성향
		
		town.accept(playerLocationVisitor);
		castle.accept(playerLocationVisitor);
		cave.accept(playerLocationVisitor);		
        
		player.setEvilPoint(1); // 선 성향

		town.accept(playerLocationVisitor);
		castle.accept(playerLocationVisitor);
		cave.accept(playerLocationVisitor);
    }
}
