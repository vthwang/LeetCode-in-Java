package main

type problems []problem

func (ps *problems) add(p problem) {
	if len(*ps) <= p.ID {
		*ps = append(*ps, make([]problem, p.ID-len(*ps)+1)...)
	}
	(*ps)[p.ID] = p
}

func (ps problems) solutions() problems {
	res := make([]problem, 0, len(ps))
	size := len(ps)
	for i := size - 1; i >= 0; i-- {
		p := ps[i]
		if p.isAvailable() {
			res = append(res, p)
		}
	}
	return res
}

func (ps problems) favorite() problems {
	res := make([]problem, 0, len(ps))
	size := len(ps)
	for i := 0; i < size; i++ {
		p := ps[i]
		if p.IsFavor {
			res = append(res, p)
		}
	}
	return res
}

func (ps problems) table() string {
	res := "| Number | Acceptance | Title | Difficulty | Favorite |\n"
	res += "|:----:|:----:|:----:|:----:|:----:|\n"
	for _, p := range ps {
		res += p.tableLine()
	}
	return res
}

func (ps problems) list() string {
	res := ""
	for _, p := range ps {
		res += p.listLine()
	}
	return res
}
