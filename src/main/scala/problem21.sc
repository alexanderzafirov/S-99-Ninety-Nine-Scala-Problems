def insertAt[A](s: A, i: Int, l: List[A]): List[A] = l.take(i) ::: s :: l.drop(i)

insertAt('new, 5, List('a, 'b, 'c, 'd))