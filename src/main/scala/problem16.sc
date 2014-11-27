def drop[A](i: Int, l: List[A]) = l filter (l.indexOf(_) % 3 != 2)

drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))