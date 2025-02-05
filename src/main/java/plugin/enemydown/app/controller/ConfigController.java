package plugin.enemydown.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import plugin.enemydown.app.mapper.data.GameConfig;
import plugin.enemydown.app.mapper.data.SpawnEnemy;
import plugin.enemydown.app.service.ConfigService;

@RestController
public class ConfigController {

  @Autowired
  public ConfigService service;

  @RequestMapping(value = "/configList", method = RequestMethod.GET)
  public List<GameConfig> configList() {
    return service.searchConfigList();
  }

  @RequestMapping(value = "/config", method = RequestMethod.GET)
  public GameConfig config(@RequestParam String difficulty) {
    return service.searchConfig(difficulty);
  }

  @RequestMapping(value = "/spawnEnemyList", method = RequestMethod.GET)
  public List<SpawnEnemy> spawnEnemyList(@RequestParam String difficulty) {
    return service.searchSpawnEnemyList(difficulty);
  }
}
