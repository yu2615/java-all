public class U5_K1{
	public static void main(String[] args){
		TeacherList teacherList = new TeacherList();
		teacherList.setTeacher(new Teacher("t001","��񑾘Y"));
		teacherList.setLaboratory(new Laboratory("A������",50997));
		teacherList.setTeacher(new Teacher("t002","�d��Ԏq"));
		teacherList.setLaboratory(new Laboratory("B������",50998));
		print(teacherList);
	}
	public static void print(TeacherList TeacherList){
		Teacher teacher = TeacherList.getTeacher();
		System.out.println(teacher.getId() + " " + teacher.getName());
		Laboratory laboratory = teacherList.getLaboratory();
		System.out.println(laboratory.getName() + " " + laboratory.getNumber());
	}
}