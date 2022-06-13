
public class Calendar 
{
	int month;
	int day;
	int numberOfDays;
	int currentCount;
	public Calendar(int month, int day, int numberOfDays)
	{
		this.month= month;
		this.day = day;
		this.numberOfDays = numberOfDays;
		this.currentCount = 0;
	}
	
	public String getDates()
	{
		int maxDays;
		if(this.month>12)
		{
			this.month = 1;
		}
		if(numberOfDays != currentCount )
		{
		if (this.month == 1 ||this.month== 3 ||this.month== 5 ||this.month== 7 ||this.month== 8||this.month== 10 ||this.month== 12)
		{
			maxDays = 31;
			if(this.day < maxDays)
			{
				day++;
			}
			else
			{
				month++;
				day = 1;
			}
		}
		if(this.month == 2)
		{
			maxDays = 28;
			if(this.day < maxDays)
			{
				day++;
			}
			else
			{
				month++;
				day = 1;
			}
		}
		if(this.month == 4|| this.month== 6 ||this.month== 9||this.month== 11)
		{
			maxDays = 30;
			if(this.day < maxDays)
			{
				day++;
			}
			else
			{
				month++;
				day = 1;
			}
		}
		currentCount++;
		System.out.println(month + "/" + day);
		getDates();
		}

		return month + "/" + day;
	}
}
