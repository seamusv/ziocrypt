package ziocrypt

import zio._

object Main extends App {

  import console._

  override def run(args: List[String]): ZIO[Environment, Nothing, Int] =
    (for {
      _ <- putStrLn("Welcome to the Jungle!")
    } yield ())
      .fold(_ => 1, _ => 0)

}
