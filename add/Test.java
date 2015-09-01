public interface Test {

	int countTaskAudioOfTeacher(String teacherId);
	
	int countCompleteTask(String teacherId);

	/* ================== */

	int addAgea();

	/*  这是一个分支，不知道是不是可以的  */

   	void releaseQuestionAllotStatus(List<Long> questionids);

	void lockQuestionAllotStatus(List<Long> questionids);

	/*three ===============*/
}