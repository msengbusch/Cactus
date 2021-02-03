package cactus.controller

import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RestController}

@RestController
class TestController {

  @GetMapping(value = Array("test/{name}"))
  def test(@PathVariable name: String): String = {
    name + " Hello!";
  }
}
