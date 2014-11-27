def decode[A](tuples: List[(Int, A)]): List[A] = tuples flatMap {
  t => List.fill(t._1)(t._2)
}

decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))