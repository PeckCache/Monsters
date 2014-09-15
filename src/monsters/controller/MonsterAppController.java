package monsters.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{

	private MonsterView appView;
	private MarshmallowMonster myMonster;

	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmallowMonster("mallow", 2, 0, 2, 6, 1, false);
	}

	public void start()
	{
		appView.displayinformation();
	}

	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}

}
