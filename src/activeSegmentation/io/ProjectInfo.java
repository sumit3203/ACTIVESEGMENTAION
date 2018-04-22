package activeSegmentation.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectInfo {

	private String projectName;
	private String projectType;
	private String projectDescription;
	private String comment="Default Comment";
	private String createdDate;
	private String modifyDate;
	private int classes;
	private String projectPath;
	private String pluginPath;
	private Map<String,String> projectDirectory= new HashMap<String, String>();
	private String trainingStack;
	private String testingStack;
	private List<Map<String,String>> filters= new ArrayList<Map<String,String>>();
	private List<FeatureInfo> featureList= new ArrayList<FeatureInfo>();
	private Map<String,String> learning= new HashMap<String, String>();


	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	public List<Map<String, String>> getFilters() {
		return filters;
	}
	public void setFilters(List<Map<String, String>> filters) {
		this.filters = filters;
	}
	public List<FeatureInfo> getFeatureList() {
		return featureList;
	}
	public void setFeatureList(List<FeatureInfo> featureList) {
		this.featureList = featureList;
	}

	public Map<String, String> getLearning() {
		return learning;
	}
	public void setLearning(Map<String, String> learning) {
		
		this.learning = learning;
	}

	public void addFeature(FeatureInfo featureInfo){

		featureList.add(featureInfo);
	}

	
	public void resetFeatureInfo(){

		featureList.clear();
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getProjectType() {
		return projectType;
	}
	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}
	public String getTrainingStack() {
		return trainingStack;
	}
	public String getProjectPath() {
		return projectPath;
	}
	public void setProjectPath(String projectPath) {
		this.projectPath = projectPath;
	}
	public String getPluginPath() {
		return pluginPath;
	}
	public Map<String, String> getProjectDirectory() {
		return projectDirectory;
	}
	public void setProjectDirectory(Map<String, String> projectDirectory) {
		this.projectDirectory = projectDirectory;
	}
	public void setPluginPath(String pluginPath) {
		this.pluginPath = pluginPath;
	}
	public void setTrainingStack(String trainingStack) {
		this.trainingStack = trainingStack;
	}
	public String getTestingStack() {
		return testingStack;
	}
	public void setTestingStack(String testingStack) {
		this.testingStack = testingStack;
	}
	public int getClasses() {
		return classes;
	}
	public void setClasses(int classes) {
		this.classes = classes;
	}
	




}