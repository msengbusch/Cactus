package cactus

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
//TODO @EnableCaching
//TODO @EnableAsync
class CactusApplication {

}

object CactusApplication {
  def main(args: Array[String]): Unit = {
    val context = new SpringApplicationBuilder(classOf[CactusApplication])
      .run(args: _*)
  }
}