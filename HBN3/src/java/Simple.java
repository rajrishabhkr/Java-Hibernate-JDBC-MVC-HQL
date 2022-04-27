public class Simple implements java.io.Serializable {
    private int simpleId;
	private String simpleName;
	private String simpleInfo;
	public Simple() {
	}
	public Simple(int simpleId) {
		this.simpleId = simpleId;
	}
    public Simple(int simpleId, String simpleName, String simpleInfo) {
		this.simpleId = simpleId;
		this.simpleName = simpleName;
		this.simpleInfo = simpleInfo;
	}
    public int getSimpleId() {
		return this.simpleId;
	}

	public void setSimpleId(int simpleId) {
		this.simpleId = simpleId;
	}

	public String getSimpleName() {
		return this.simpleName;
	}

	public void setSimpleName(String simpleName) {
		this.simpleName = simpleName;
	}

	public String getSimpleInfo() {
		return this.simpleInfo;
	}

	public void setSimpleInfo(String simpleInfo) {
		this.simpleInfo = simpleInfo;
	}

}