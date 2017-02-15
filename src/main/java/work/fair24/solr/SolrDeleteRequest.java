package work.fair24.solr;

import com.google.api.client.util.Key;

import java.util.List;

/**
 * Created by renfeng on 8/15/15.
 */
public class SolrDeleteRequest {

	@Key("delete")
	private List<String> delete;

	public List<String> getDelete() {
		return delete;
	}

	public void setDelete(List<String> delete) {
		this.delete = delete;
	}
}
