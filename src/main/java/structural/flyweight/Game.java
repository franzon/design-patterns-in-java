package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

class Game {
    private final PlayerTypeFactory factory;
    private final List<Player> players = new ArrayList<>();

    public Game(PlayerTypeFactory factory) {
        this.factory = factory;
    }

    void addPlayer(PlayerType playerType) {
        PlayerModel model = factory.getModel(playerType);

        players.add(new Player(model));
    }

    public List<Player> getPlayers() {
        return players;
    }
}
