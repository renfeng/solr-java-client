package work.fair24.solr;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by renfeng on 8/15/15.
 */
public class SolrDeleteRequest {

	@SerializedName("delete")
	private List<String> delete;

	public List<String> getDelete() {
		return delete;
	}

	public void setDelete(List<String> delete) {
		this.delete = delete;
	}
}
