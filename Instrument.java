 class Instrument{
	public void main(String[] args) {
		Instrument1[] inst=new Instrument1[10];
		for(int i=0;i<10;i++)
		{
			switch(i%3)
			{
			case 0:{
				inst[i]=new piano();break;
			}
			case 1:{
				inst[i]=new flute();break;
			}
			case 2:{
				inst[i]=new guitar();break;
			}
			}
			for(int i1=0;i1<10;i1++)
			{
				System.out.println(i1+1);
				inst[i1].play();
				if(inst[i1] instanceof piano)
				{
					System.out.println("piano");
				}
				if(inst[i1] instanceof flute)
				{
					System.out.println("flute");
				}
				if(inst[i1] instanceof guitar)
				{
					System.out.println("guitar");
				}
			}
		}
	}
    }
  


