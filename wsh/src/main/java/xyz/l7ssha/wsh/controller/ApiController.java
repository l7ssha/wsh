package xyz.l7ssha.wsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.l7ssha.wsh.model.Player;
import xyz.l7ssha.wsh.service.GameService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class ApiController {
    final GameService gameService;

    public ApiController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping(path = {"/", ""}, method = RequestMethod.GET)
    public Map<String, Object> indexAction() {
        var hashmap = new HashMap<String, Object>();

        hashmap.put("version", 1);
        hashmap.put("project", "wsh project");

        return hashmap;
    }

    @RequestMapping(path = "/player", method = RequestMethod.POST)
    public Player playerAction(@RequestBody() Player player) {
        return gameService.saveNewPlayer(player.getName());
    }
}
