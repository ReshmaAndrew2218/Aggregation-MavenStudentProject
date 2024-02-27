package aggregationStudent;

public class StudentAcademicDetails {
	
	private int englishmark;
	private int mathsmark;
	private int total;
	private StudentPersonalDetails spd;
	
	public void setEnglishMark(int englishmark)
	{
		this.englishmark=englishmark;
	}
	public void setMathsMark(int mathsmark)
	{
		this.mathsmark=mathsmark;
	}
	public void setTotal(int total)
	{
		this.total=total;
	}
	public int getEnglishMark()
	{
		return englishmark;
	}
	public int getMathsMark()
	{
		return mathsmark;
	}
	public int getTotal(int englishmark, int mathsmark)
	{
		
		return total=englishmark+mathsmark;
	}
	public void setSpd(StudentPersonalDetails spd)
	{
		this.spd=spd;
	}
	public StudentPersonalDetails getSpd()
	{
		return spd;
	}
	public static void main(String[] args) {
		
		StudentAcademicDetails sad=new StudentAcademicDetails();
		sad.setEnglishMark(50);
		sad.setMathsMark(30);
		sad.setTotal(30+50);
		
		StudentPersonalDetails sp=new StudentPersonalDetails();
		sp.setName("Nihal");
		sp.setAge(18);
		sp.setPlace("Chennai");
		sad.setSpd(sp);
		
		System.out.println(".............Student Personal details.................");
		System.out.println("Student Name is: "+sad.getSpd().getName());
		System.out.println("Student Age is: "+sad.getSpd().getAge());
		System.out.println("Student Place is: "+sad.getSpd().getPlace());
		System.out.println("................Student Academic Details.................");
		System.out.println("English mark: "+sad.getEnglishMark());
		System.out.println("Maths mark: "+sad.getMathsMark());
		System.out.println("Total Mark: "+sad.getTotal(20, 30));
		
		

	}

}
