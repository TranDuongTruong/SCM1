package scm;
//this class manage students' scores 
//with specific subjects such as math, Literature, English, Physics.
public class StudentGrade {
	
	private float  mathGrade;
	private float  literatureGrade;
    private float  englishGrade;
    private float  physicsGrade;
    private float  mediumGrade;
    
    
	public float  getMediumGrade() {
		mediumGrade=mathGrade+literatureGrade+englishGrade+physicsGrade)/4;
		return mediumGrade;
	}

	public void setMediumGrade(int mediumGrade) {
		this.mediumGrade = mediumGrade;
	}

	public float  getMathGrade() {
		
		return mathGrade;
	}

	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}

	public float  getLiteratureGrade() {
		
		return literatureGrade;
	}

	public void setLiteratureGrade(int literatureGrade) {
		this.literatureGrade = literatureGrade;
	}

	public float  getEnglishGrade() {
		
		return englishGrade;
	}

	public void setEnglishGrade(int englishGrade) {
		this.englishGrade = englishGrade;
	}

	public float  getPhysicsGrade() {
		
		return physicsGrade;
	}

	public void setPhysicsGrade(int physicsGrade) {
		this.physicsGrade = physicsGrade;
	}
	public float AverageScore(){
	    return (physicsGrade+englishGrade+literatureGrade+mathGrade)/4;
	}

}