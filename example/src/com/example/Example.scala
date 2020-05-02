package com.example

import cats.effect.Sync

class Example[F[_]: Sync] {
  Sync[F].delay("hello")

  F.delay("hello")
}
