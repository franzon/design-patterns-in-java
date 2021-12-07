package structural.flyweight;

import java.util.EnumMap;
import java.util.Map;

class PlayerTypeFactory {
    private final Map<PlayerType, PlayerModel> models = new EnumMap<>(PlayerType.class);

    public PlayerModel getModel(PlayerType playerType) {
        if (models.containsKey(playerType))
            return models.get(playerType);

        return createModel(playerType);
    }

    private PlayerModel createModel(PlayerType playerType) {
        PlayerModel model = getPlayerModelByPlayerType(playerType);

        models.put(playerType, model);

        return model;
    }

    private PlayerModel getPlayerModelByPlayerType(PlayerType playerType) {
        return switch (playerType) {
            case TERRORIST -> new TerroristPlayer();
            case COUNTER_TERRORIST -> new CounterTerroristPlayer();
        };
    }
}
