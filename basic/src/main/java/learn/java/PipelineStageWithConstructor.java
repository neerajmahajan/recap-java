package learn.java;

public enum PipelineStageWithConstructor {
	
	TO_BUILD(0),
	ARTEFACT_STORE(3),
	DEPLOY(5,6);
	
	private int stageNo;
	public int getStageNo() {
		return stageNo;
	}
	PipelineStageWithConstructor(int stageNo){
		this.stageNo = stageNo;
	}
	PipelineStageWithConstructor(int stageNo,int dummyArg){
		this.stageNo = stageNo;
	}
	
}
