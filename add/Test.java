public interface Test {

	int countTaskAudioOfTeacher(String teacherId);
	
	int countCompleteTask(String teacherId);

	/* ================== */

	int addAgea();

	/* 看看这样行不行，这个我也不太清楚的*/
	List<Long> listAllotQuestionId(String teacherId);
}