
public class StudentManager {
	public void ortalamaHesapla(Student student) {
		student.ortalama=(student.vizeSınav*40)/100 + (student.finalSınav*60)/100;
	}
}
